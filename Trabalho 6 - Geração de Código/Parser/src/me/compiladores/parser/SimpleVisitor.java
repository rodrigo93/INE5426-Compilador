// Generated from Simple.g4 by ANTLR 4.7
package me.compiladores.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(SimpleParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainStatement}
	 * labeled alternative in {@link SimpleParser#programPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatement(SimpleParser.MainStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code programPartDefinitionMethod}
	 * labeled alternative in {@link SimpleParser#programPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramPartDefinitionMethod(SimpleParser.ProgramPartDefinitionMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(SimpleParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(SimpleParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(SimpleParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code min}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin(SimpleParser.MinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(SimpleParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SimpleParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(SimpleParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SimpleParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(SimpleParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(SimpleParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#methodbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodbody(SimpleParser.MethodbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(SimpleParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(SimpleParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#callList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallList(SimpleParser.CallListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(SimpleParser.VarDeclarationContext ctx);
}