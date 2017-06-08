package me.compiladores.compiler;

import me.compiladores.parser.NossaLinguagemBaseVisitor;
import me.compiladores.parser.NossaLinguagemParser.AddExpression2Context;
import me.compiladores.parser.NossaLinguagemParser.AddExpressionContext;
import me.compiladores.parser.NossaLinguagemParser.GoalContext;
import me.compiladores.parser.NossaLinguagemParser.IntLitExpressionContext;
import me.compiladores.parser.NossaLinguagemParser.MainClassBodyContext;
import me.compiladores.parser.NossaLinguagemParser.MainClassDeclarationContext;
import me.compiladores.parser.NossaLinguagemParser.MainMethodContext;
import me.compiladores.parser.NossaLinguagemParser.MainMethodDeclarationContext;
import me.compiladores.parser.NossaLinguagemParser.PrintStatement2Context;
import me.compiladores.parser.NossaLinguagemParser.PrintStatement3Context;
import me.compiladores.parser.NossaLinguagemParser.PrintStatementContext;

public class MyVisitor extends NossaLinguagemBaseVisitor<String> {

	@Override
	public String visitGoal(GoalContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitMainClassDeclaration(MainClassDeclarationContext ctx) {
		return "mainClassDeclaration" + visitChildren(ctx);
	}

	@Override
	public String visitMainClassBody(MainClassBodyContext ctx) {
		return "MainClassBody" + visitChildren(ctx);
	}

	@Override
	public String visitMainMethod(MainMethodContext ctx) {
		return "MainMethod" + visitChildren(ctx);
	}

	@Override
	public String visitMainMethodDeclaration(MainMethodDeclarationContext ctx) {
		return "MainMethodDeclaration" + visitChildren(ctx);
	}

	@Override
	public String visitPrintStatement(PrintStatementContext ctx) {
		return "getstatic java/lang/System/out Ljava/io/PrintStream;"
				+ visit(ctx.arg) + System.lineSeparator()
				+ "invokevirtual java/io/PrintStream/println(I)V";
	}

	@Override
	public String visitPrintStatement2(PrintStatement2Context ctx) {
		return "getstatic java/lang/System/out Ljava/io/PrintStream;"
				+ visit(ctx.arg) + System.lineSeparator()
				+ "invokevirtual java/io/PrintStream/println(I)V";
	}

	@Override
	public String visitPrintStatement3(PrintStatement3Context ctx) {
		return "getstatic java/lang/System/out Ljava/io/PrintStream;"
				+ visit(ctx.arg) + System.lineSeparator()
				+ "invokevirtual java/io/PrintStream/println(I)V";
	}

	@Override
	public String visitIntLitExpression(IntLitExpressionContext ctx) {
		return "ldc " + ctx.getText();
	}

	@Override
	public String visitAddExpression(AddExpressionContext ctx) {
		return visitChildren(ctx) + System.lineSeparator() + System.lineSeparator() + "iadd";
	}

	@Override
	public String visitAddExpression2(AddExpression2Context ctx) {
		return visitChildren(ctx) + System.lineSeparator() + System.lineSeparator() + "iadd";
	}

	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		return "" + aggregate + System.lineSeparator() + nextResult;
	}
}
