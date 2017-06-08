package me.compiladores.compiler;

import jasmin.ClassFile;

import java.io.File;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

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

	@DataProvider
	public Object[][] provide_code_expectedTest() {
		return new Object[][] {
				{ "println(1+2);", "3" + System.lineSeparator() },
				{ "println(1+3*2-5/5);", "6" + System.lineSeparator() } ,
				{ "int foo; foo = 42; println(foo);", "42" + System.lineSeparator() },
				{ "int foo; foo = 42; println(foo + 2);", "44" + System.lineSeparator() },
				{ "int a; int b; a = 20; b = 40; println(a + b);", "60" + System.lineSeparator() }
		
		};
	}

	private String compileAndRun(String code) throws Exception {
		code = Main.compile(new ANTLRInputStream(code));
		ClassFile classFile = new ClassFile();
		classFile.readJasmin(new StringReader(code), "", false);
		Path outputPath = tempDir.resolve(classFile.getClassName() + ".class");
		classFile.write(Files.newOutputStream(outputPath));
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
