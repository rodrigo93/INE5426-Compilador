package me.compiladores.compiler;

import jasmin.ClassFile;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import me.compiladores.compiler.exceptions.VariableAlreadyDeclaredException;
import me.compiladores.compiler.exceptions.UndeclaredVariableException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CompilerTest {

	private Path tempDir;

	@BeforeMethod
	public void createTempDir() throws Exception {
		tempDir = Files.createTempDirectory("compilerTest");
	}

	@AfterMethod
	public void deleteTempDir() {
		deleteRecursive(tempDir.toFile());
	}

	private void deleteRecursive(File file) {
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				deleteRecursive(f);
			}
		}
		if (!file.delete()) {
			throw new Error("Could not delete file <" + file.getName() + ">");
		}

	}

	@Test(dataProvider = "provide_code_expectedTest")
	public void runningCodeOutputsExpectedText(String code, String expectedText)
			throws Exception {
		// execution
		String actualOutput = compileAndRun(code);

		// evaluation
		Assert.assertEquals(actualOutput, expectedText);

	}
	
	@Test(expectedExceptions = UndeclaredVariableException.class,
			expectedExceptionsMessageRegExp = "2:0 undeclared variable <b>")
	public void compilingCode_throwsUndeclaredVariableExcepton_ifVariableIsUndefined() throws Exception{
		// execution
		compileAndRun("int a;" + System.lineSeparator() + "b = 0;");

		//evaluate exception
		
	}
	
	@Test(expectedExceptions = VariableAlreadyDeclaredException.class,
			expectedExceptionsMessageRegExp = "2:4 variable already defined <a>")
	public void compilingCode_throwsDeclaringDefinedVariableExcepton_ifVariableIsAlreadyDeclared() throws Exception{
		// execution
		compileAndRun("int a;"+ System.lineSeparator() + "int a;");

		//evaluate exception
		
	}

	@DataProvider
	public Object[][] provide_code_expectedTest() {
		return new Object[][] {
				{ "println(1+2);", "3" + System.lineSeparator() },
				{ "println(1+3*2-5/5);", "6" + System.lineSeparator() } ,
				{ "int foo; foo = 42; println(foo);", "42" + System.lineSeparator() },
				{ "int foo; foo = 42; println(foo + 2);", "44" + System.lineSeparator() },
				{ "int a; int b; a = 20; b = 40; println(a + b);", "60" + System.lineSeparator() },
				{"int a; int b; int c; a = 2; b = 4; c = 6; println(a+b); println(b*c); println(a+5*b-c/2);", "6" + System.lineSeparator() +
					"24"+ System.lineSeparator() + "19" +  System.lineSeparator() },
				{"int randomNum(){ return 4; }" + System.lineSeparator() + "println(randomNum());", "4" + System.lineSeparator()},
				{"int git(){ int a; a = 4; return a; }" + System.lineSeparator() + "println(git());", "4" + System.lineSeparator()},
				{"int gud(){ int i; i = 5 + 3; return i;}"  + System.lineSeparator() + "int i; i = 0; println(i); println(gud());",
					"0" + System.lineSeparator() + "8" + System.lineSeparator()},
				{"int add(int a, int b){return a+b;} println(add(5,4));", "9" + System.lineSeparator()} 
		};
	}

	private String compileAndRun(String code) throws Exception {
		code = Main.compile(new ANTLRInputStream(code));
		System.out.println(code);
		ClassFile classFile = new ClassFile();
		classFile.readJasmin(new StringReader(code), "", false);
		Path outputPath = tempDir.resolve(classFile.getClassName() + ".class");
		try(OutputStream output = Files.newOutputStream(outputPath)){
			classFile.write(output);
		}
		return runJavaClass(tempDir, classFile.getClassName());

	}

	private String runJavaClass(Path dir, String className) throws Exception{
		Process process = Runtime.getRuntime().exec(new String[]{"java", "-cp", dir.toString(), className});
		try(InputStream in = process.getInputStream()){
			Scanner scanner = new Scanner(in).useDelimiter("\\A");
			if(scanner.hasNext()){
				return scanner.next();
			}
			return "";
		}
	
	}
}
