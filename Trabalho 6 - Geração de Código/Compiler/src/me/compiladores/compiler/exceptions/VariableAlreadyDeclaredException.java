package me.compiladores.compiler.exceptions;

import org.antlr.v4.runtime.Token;

public class VariableAlreadyDeclaredException extends CompileException{

	private String varName;
	
	
	public VariableAlreadyDeclaredException(Token varNameToken) {
		super(varNameToken);
		varName = varNameToken.getText();
	}
	
	@Override
	public String getMessage(){
		return line + ":" + column + " variable already defined <" + varName + ">";
		
	}
}
