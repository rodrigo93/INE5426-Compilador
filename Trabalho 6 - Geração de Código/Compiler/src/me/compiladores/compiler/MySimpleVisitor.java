package me.compiladores.compiler;

import java.util.HashMap;
import java.util.Map;

import me.compiladores.parser.SimpleBaseVisitor;
import me.compiladores.parser.SimpleParser.AddContext;
import me.compiladores.parser.SimpleParser.AssignmentContext;
import me.compiladores.parser.SimpleParser.DivContext;
import me.compiladores.parser.SimpleParser.MinContext;
import me.compiladores.parser.SimpleParser.MulContext;
import me.compiladores.parser.SimpleParser.NumContext;
import me.compiladores.parser.SimpleParser.PrintlnContext;
import me.compiladores.parser.SimpleParser.TargetContext;
import me.compiladores.parser.SimpleParser.VarContext;
import me.compiladores.parser.SimpleParser.VarDeclarationContext;

public class MySimpleVisitor extends SimpleBaseVisitor<String> {

	private Map<String, Integer> variables = new HashMap<>();
	
	
	@Override
	public String visitTarget(TargetContext ctx) {
		return visitChildren(ctx);
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
		variables.put(ctx.varname.getText(), variables.size());
		return "";
	}
	
	@Override
	public String visitAssignment(AssignmentContext ctx) {
		if(!variables.containsKey(ctx.varname.getText())){
			throw ctx.exception;
		}
		
		return visit(ctx.exp) + System.lineSeparator() + 
				"istore " + variables.get(ctx.varname.getText());
	}
	
	@Override
	public String visitVar(VarContext ctx) {
		return "iload " + variables.get(ctx.getText());
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
