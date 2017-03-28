// Generated from NossaLinguagem.g4 by ANTLR 4.4

    package nossalinguagem.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NossaLinguagemParser}.
 */
public interface NossaLinguagemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code quantumExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterQuantumExpression(@NotNull NossaLinguagemParser.QuantumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quantumExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitQuantumExpression(@NotNull NossaLinguagemParser.QuantumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull NossaLinguagemParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull NossaLinguagemParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectInstantiationExpression(@NotNull NossaLinguagemParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectInstantiationExpression(@NotNull NossaLinguagemParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainMethodDeclaration(@NotNull NossaLinguagemParser.MainMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainMethodDeclaration(@NotNull NossaLinguagemParser.MainMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull NossaLinguagemParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull NossaLinguagemParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#mainClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainClassDeclaration(@NotNull NossaLinguagemParser.MainClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#mainClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainClassDeclaration(@NotNull NossaLinguagemParser.MainClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(@NotNull NossaLinguagemParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(@NotNull NossaLinguagemParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recurStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRecurStatement(@NotNull NossaLinguagemParser.RecurStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recurStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRecurStatement(@NotNull NossaLinguagemParser.RecurStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(@NotNull NossaLinguagemParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(@NotNull NossaLinguagemParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#mainClassBody}.
	 * @param ctx the parse tree
	 */
	void enterMainClassBody(@NotNull NossaLinguagemParser.MainClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#mainClassBody}.
	 * @param ctx the parse tree
	 */
	void exitMainClassBody(@NotNull NossaLinguagemParser.MainClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull NossaLinguagemParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull NossaLinguagemParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull NossaLinguagemParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull NossaLinguagemParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(@NotNull NossaLinguagemParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(@NotNull NossaLinguagemParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull NossaLinguagemParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull NossaLinguagemParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull NossaLinguagemParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull NossaLinguagemParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNestedStatement(@NotNull NossaLinguagemParser.NestedStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNestedStatement(@NotNull NossaLinguagemParser.NestedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#methodArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterMethodArgumentList(@NotNull NossaLinguagemParser.MethodArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#methodArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitMethodArgumentList(@NotNull NossaLinguagemParser.MethodArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull NossaLinguagemParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull NossaLinguagemParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull NossaLinguagemParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull NossaLinguagemParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthExpression(@NotNull NossaLinguagemParser.ArrayLengthExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthExpression(@NotNull NossaLinguagemParser.ArrayLengthExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void enterMainMethod(@NotNull NossaLinguagemParser.MainMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void exitMainMethod(@NotNull NossaLinguagemParser.MainMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull NossaLinguagemParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull NossaLinguagemParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(@NotNull NossaLinguagemParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(@NotNull NossaLinguagemParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtExpression(@NotNull NossaLinguagemParser.LtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtExpression(@NotNull NossaLinguagemParser.LtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#charType}.
	 * @param ctx the parse tree
	 */
	void enterCharType(@NotNull NossaLinguagemParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#charType}.
	 * @param ctx the parse tree
	 */
	void exitCharType(@NotNull NossaLinguagemParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#quantumType}.
	 * @param ctx the parse tree
	 */
	void enterQuantumType(@NotNull NossaLinguagemParser.QuantumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#quantumType}.
	 * @param ctx the parse tree
	 */
	void exitQuantumType(@NotNull NossaLinguagemParser.QuantumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull NossaLinguagemParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull NossaLinguagemParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(@NotNull NossaLinguagemParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(@NotNull NossaLinguagemParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssignStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignStatement(@NotNull NossaLinguagemParser.ArrayAssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssignStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignStatement(@NotNull NossaLinguagemParser.ArrayAssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayInstantiationExpression(@NotNull NossaLinguagemParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayInstantiationExpression(@NotNull NossaLinguagemParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(@NotNull NossaLinguagemParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(@NotNull NossaLinguagemParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#intType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(@NotNull NossaLinguagemParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#intType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(@NotNull NossaLinguagemParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#intArrayType}.
	 * @param ctx the parse tree
	 */
	void enterIntArrayType(@NotNull NossaLinguagemParser.IntArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#intArrayType}.
	 * @param ctx the parse tree
	 */
	void exitIntArrayType(@NotNull NossaLinguagemParser.IntArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull NossaLinguagemParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull NossaLinguagemParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLitExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLitExpression(@NotNull NossaLinguagemParser.BooleanLitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLitExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLitExpression(@NotNull NossaLinguagemParser.BooleanLitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLitExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntLitExpression(@NotNull NossaLinguagemParser.IntLitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLitExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntLitExpression(@NotNull NossaLinguagemParser.IntLitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull NossaLinguagemParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull NossaLinguagemParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull NossaLinguagemParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull NossaLinguagemParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull NossaLinguagemParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull NossaLinguagemParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(@NotNull NossaLinguagemParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(@NotNull NossaLinguagemParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(@NotNull NossaLinguagemParser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(@NotNull NossaLinguagemParser.ArrayAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(@NotNull NossaLinguagemParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(@NotNull NossaLinguagemParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(@NotNull NossaLinguagemParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(@NotNull NossaLinguagemParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(@NotNull NossaLinguagemParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(@NotNull NossaLinguagemParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NossaLinguagemParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull NossaLinguagemParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NossaLinguagemParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull NossaLinguagemParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCharExpression(@NotNull NossaLinguagemParser.CharExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCharExpression(@NotNull NossaLinguagemParser.CharExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegExpression(@NotNull NossaLinguagemParser.NegExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegExpression(@NotNull NossaLinguagemParser.NegExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(@NotNull NossaLinguagemParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(@NotNull NossaLinguagemParser.MulExpressionContext ctx);
}