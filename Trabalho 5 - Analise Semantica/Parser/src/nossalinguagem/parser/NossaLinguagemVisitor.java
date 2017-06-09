// Generated from NossaLinguagem.g4 by ANTLR 4.7
package nossalinguagem.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NossaLinguagemParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NossaLinguagemVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(NossaLinguagemParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#mainClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClassDeclaration(NossaLinguagemParser.MainClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(NossaLinguagemParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#mainClassBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClassBody(NossaLinguagemParser.MainClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#mainMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethod(NossaLinguagemParser.MainMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethodDeclaration(NossaLinguagemParser.MainMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(NossaLinguagemParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(NossaLinguagemParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(NossaLinguagemParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(NossaLinguagemParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(NossaLinguagemParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(NossaLinguagemParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(NossaLinguagemParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(NossaLinguagemParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(NossaLinguagemParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedStatement(NossaLinguagemParser.NestedStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(NossaLinguagemParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(NossaLinguagemParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(NossaLinguagemParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(NossaLinguagemParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(NossaLinguagemParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStatement2}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement2(NossaLinguagemParser.AssignStatement2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStatement3}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement3(NossaLinguagemParser.AssignStatement3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssignStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignStatement(NossaLinguagemParser.ArrayAssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(NossaLinguagemParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement2}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement2(NossaLinguagemParser.ReturnStatement2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code recurStatement}
	 * labeled alternative in {@link NossaLinguagemParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecurStatement(NossaLinguagemParser.RecurStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInstantiationExpression(NossaLinguagemParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInstantiationExpression(NossaLinguagemParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(NossaLinguagemParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpression(NossaLinguagemParser.MethodCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLitExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLitExpression(NossaLinguagemParser.BooleanLitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLitExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLitExpression(NossaLinguagemParser.IntLitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression2}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression2(NossaLinguagemParser.ParenExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpression(NossaLinguagemParser.ArrayAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(NossaLinguagemParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLengthExpression(NossaLinguagemParser.ArrayLengthExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharExpression(NossaLinguagemParser.CharExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExpression(NossaLinguagemParser.NegExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atrExpression}
	 * labeled alternative in {@link NossaLinguagemParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrExpression(NossaLinguagemParser.AtrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link NossaLinguagemParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(NossaLinguagemParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link NossaLinguagemParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpression(NossaLinguagemParser.LtExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link NossaLinguagemParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpression(NossaLinguagemParser.EqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link NossaLinguagemParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(NossaLinguagemParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link NossaLinguagemParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(NossaLinguagemParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltExpression2}
	 * labeled alternative in {@link NossaLinguagemParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpression2(NossaLinguagemParser.LtExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpression2}
	 * labeled alternative in {@link NossaLinguagemParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpression2(NossaLinguagemParser.EqExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression2}
	 * labeled alternative in {@link NossaLinguagemParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression2(NossaLinguagemParser.AndExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression2}
	 * labeled alternative in {@link NossaLinguagemParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression2(NossaLinguagemParser.OrExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link NossaLinguagemParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(NossaLinguagemParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDExpression}
	 * labeled alternative in {@link NossaLinguagemParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDExpression(NossaLinguagemParser.IDExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link NossaLinguagemParser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(NossaLinguagemParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link NossaLinguagemParser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(NossaLinguagemParser.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link NossaLinguagemParser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(NossaLinguagemParser.MulExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpression2}
	 * labeled alternative in {@link NossaLinguagemParser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression2(NossaLinguagemParser.AddExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpression2}
	 * labeled alternative in {@link NossaLinguagemParser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression2(NossaLinguagemParser.SubExpression2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpression2}
	 * labeled alternative in {@link NossaLinguagemParser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression2(NossaLinguagemParser.MulExpression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(NossaLinguagemParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#methodArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodArgumentList(NossaLinguagemParser.MethodArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#intArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArrayType(NossaLinguagemParser.IntArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#charType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(NossaLinguagemParser.CharTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#booleanType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(NossaLinguagemParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#intType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(NossaLinguagemParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NossaLinguagemParser#idType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdType(NossaLinguagemParser.IdTypeContext ctx);
}