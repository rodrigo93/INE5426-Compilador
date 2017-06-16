package me.compiladores.compiler;

import me.compiladores.parser.SimpleLexer;
import me.compiladores.parser.SimpleParser;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args) throws Exception {

		ANTLRInputStream stream = new ANTLRFileStream("code.demo");
		System.out.println(compile(stream));
	}

	public static String compile(ANTLRInputStream input) {
		// NossaLinguagemLexer lexer = new NossaLinguagemLexer(stream);
		SimpleLexer lexer = new SimpleLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// NossaLinguagemParser parser = new NossaLinguagemParser(tokens);
		SimpleParser parser = new SimpleParser(tokens);

		ParseTree tree = parser.target();

		return (createJasminFile(new MySimpleVisitor().visit(tree)));

	}

	public static String createJasminFile(String instructions) {
		return ".class public HelloWorld" + System.lineSeparator()
				+ ".super java/lang/Object" + System.lineSeparator()
				+ instructions;
	}
}
