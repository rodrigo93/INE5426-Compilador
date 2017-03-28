package nossalinguagem.antlr;

import java.util.List;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class AnalisadorLexico {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Digita o código no console, CTRL + Z para dar EOF.
		ANTLRInputStream input = new ANTLRInputStream( System.in);
	    
		NossaLinguagemLexer lexer = new NossaLinguagemLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		String text = tokens.getText();
		int numberOfTokens = tokens.getNumberOfOnChannelTokens();
		System.out.println("Number of Tokens: " + numberOfTokens);
		List<Token> ListOfTokens = tokens.getTokens();
		
		for(Token token: ListOfTokens ){
			System.out.println(token.getText());
		}
	}

}
