package me.compiladores.compiler;

import me.compiladores.compiler.exceptions.*;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import me.compiladores.parser.SimpleBaseVisitor;
import me.compiladores.parser.SimpleParser.AddContext;
import me.compiladores.parser.SimpleParser.AssignmentContext;
import me.compiladores.parser.SimpleParser.DivContext;
import me.compiladores.parser.SimpleParser.FunctionCallContext;
import me.compiladores.parser.SimpleParser.MainStatementContext;
import me.compiladores.parser.SimpleParser.MethodCallContext;
import me.compiladores.parser.SimpleParser.MethodDeclarationContext;
import me.compiladores.parser.SimpleParser.MethodbodyContext;
import me.compiladores.parser.SimpleParser.MinContext;
import me.compiladores.parser.SimpleParser.MulContext;
import me.compiladores.parser.SimpleParser.NumContext;
import me.compiladores.parser.SimpleParser.PrintlnContext;
import me.compiladores.parser.SimpleParser.StatementListContext;
import me.compiladores.parser.SimpleParser.TargetContext;
import me.compiladores.parser.SimpleParser.VarContext;
import me.compiladores.parser.SimpleParser.VarDeclarationContext;

public class MySimpleVisitor extends SimpleBaseVisitor<String> {

	private Map<String, Integer> variables = new HashMap<>();
	
	
	@Override
	public String visitTarget(TargetContext ctx) {
		String mainCode = "";
		String functions = "";
		for(int i = 0; i < ctx.getChildCount(); i++){
			ParseTree child = ctx.getChild(i);
			String instruction = visit(child);
			if(child instanceof MainStatementContext){
				mainCode += instruction + System.lineSeparator();
			} else {
				functions += instruction + System.lineSeparator();
			}
			
		}
		return functions + System.lineSeparator() + ".method public static main([Ljava/lang/String;)V"
				+ System.lineSeparator() + "	.limit stack 100"
				+ System.lineSeparator() + "	.limit locals 100"
				+ System.lineSeparator() + mainCode
				+ System.lineSeparator() + "return" + System.lineSeparator()
				+ ".end method";
	}

	@Override
	public String visitNum(NumContext ctx) {
		return "ldc " + ctx.getText();
	}

	@Override
	public String visitAdd(AddContext ctx) {
		return visitChildren(ctx) + System.lineSeparator() + "iadd";
	}

	public String visitMul(MulContext ctx) {
		return visitChildren(ctx) + System.lineSeparator() + "imul";
	}

	public String visitMin(MinContext ctx) {
		return visitChildren(ctx) + System.lineSeparator() + "isub";
	}

	public String visitDiv(DivContext ctx) {
		return visitChildren(ctx) + System.lineSeparator() + "idiv";
	}

	@Override
	public String visitPrintln(PrintlnContext ctx) {
		return "getstatic java/lang/System/out Ljava/io/PrintStream;"
				+ System.lineSeparator() + visitChildren(ctx)
				+ System.lineSeparator()
				+"invokevirtual java/io/PrintStream/println(I)V";
	}

	@Override
	public String visitVarDeclaration(VarDeclarationContext ctx) {
		if(variables.containsKey(ctx.varname.getText())){
			throw new VariableAlreadyDeclaredException(ctx.varname);
		}
		variables.put(ctx.varname.getText(), variables.size());
		return "";
	}
	
	@Override
	public String visitAssignment(AssignmentContext ctx) {
		
		return visit(ctx.exp) + System.lineSeparator() + 
				"istore " + checkVarIndex(ctx.varname);
	}
	
	@Override
	public String visitFunctionCall(FunctionCallContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunctionCall(ctx);
	}
	
	@Override
	public String visitMethodbody(MethodbodyContext ctx) {
		String statements = visit(ctx.body);
		return (statements == null? "" : statements + System.lineSeparator()) +
				visit(ctx.ret) + System.lineSeparator() +
				"ireturn" + System.lineSeparator();
	}
	
	@Override
	public String visitMethodCall(MethodCallContext ctx) {
		String params = "";
		params += stringRepeat("I",ctx.params.expr.size());
		String ins = visit(ctx.params);
		
		return  (ins == null ? "" : ins) + System.lineSeparator() 
				+"invokestatic HelloWorld/" + ctx.methodname.getText() + "(" + params + ")I";
	}
	
	@Override
	public String visitMethodDeclaration(MethodDeclarationContext ctx) {
		Map<String, Integer> oldV = variables;
		variables = new HashMap<String, Integer>();
		
		visit(ctx.vars);
		String params = stringRepeat("I", ctx.vars.declarations.size());
		
		String r =  ".method public static " + ctx.methodname.getText() + "(" + params + ")I" + System.lineSeparator()
				+ ".limit locals 100" + System.lineSeparator()
				+ ".limit stack 100" + System.lineSeparator()
				+ visit(ctx.body) 
				+ ".end method";
		
		variables = oldV;
		return r;
	}
	
	private String stringRepeat(String string, int size) {
		String ret = "";
		for(int i = 0; i < size; i++){
			ret += "I";
		}
		return ret;
	}

	@Override
	public String visitVar(VarContext ctx) {
		return "iload " + checkVarIndex(ctx.var);
	}
	
	private int checkVarIndex(Token varToken){
		Integer index = variables.get(varToken.getText());
		if(index == null){
			throw new UndeclaredVariableException(varToken);
		}
		return index;
	}
	
	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		if (aggregate == null) {
			return nextResult;
		}
		if (nextResult == null) {
			return aggregate;
		}
		return "" + aggregate + System.lineSeparator() + nextResult;
	}
}
