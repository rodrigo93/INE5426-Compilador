package nossalinguagem.compiler;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import nossalinguagem.parser.*;

public class Main {

	public static void main(String[] args) throws IOException {

		CharStream input = CharStreams.fromFileName("code9.demo");
		NossaLinguagemLexer lexer = new NossaLinguagemLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		NossaLinguagemParser parser = new NossaLinguagemParser(tokens);
		
		ParseTree tree = parser.goal();
		new Visitor().visit(tree);
	}

}
