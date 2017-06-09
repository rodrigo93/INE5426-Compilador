package nossalinguagem.compiler;

import java.lang.reflect.Array;
import java.util.List;

import nossalinguagem.parser.NossaLinguagemBaseVisitor;
import nossalinguagem.parser.NossaLinguagemParser.AddExpression2Context;
import nossalinguagem.parser.NossaLinguagemParser.AddExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.AndExpression2Context;
import nossalinguagem.parser.NossaLinguagemParser.AndExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.ArrayAssignStatementContext;
import nossalinguagem.parser.NossaLinguagemParser.ArrayInstantiationExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.AssignStatement2Context;
import nossalinguagem.parser.NossaLinguagemParser.AssignStatement3Context;
import nossalinguagem.parser.NossaLinguagemParser.AssignStatementContext;
import nossalinguagem.parser.NossaLinguagemParser.BooleanLitExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.BooleanTypeContext;
import nossalinguagem.parser.NossaLinguagemParser.CharExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.CharTypeContext;
import nossalinguagem.parser.NossaLinguagemParser.ClassDeclarationContext;
import nossalinguagem.parser.NossaLinguagemParser.EqExpression2Context;
import nossalinguagem.parser.NossaLinguagemParser.EqExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.ExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.FieldDeclarationContext;
import nossalinguagem.parser.NossaLinguagemParser.FormalParameterContext;
import nossalinguagem.parser.NossaLinguagemParser.GoalContext;
import nossalinguagem.parser.NossaLinguagemParser.IdTypeContext;
import nossalinguagem.parser.NossaLinguagemParser.IdentifierExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.IntArrayTypeContext;
import nossalinguagem.parser.NossaLinguagemParser.IntLitExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.IntTypeContext;
import nossalinguagem.parser.NossaLinguagemParser.LtExpression2Context;
import nossalinguagem.parser.NossaLinguagemParser.LtExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.MethodCallExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.MethodDeclarationContext;
import nossalinguagem.parser.NossaLinguagemParser.MulExpression2Context;
import nossalinguagem.parser.NossaLinguagemParser.MulExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.NotExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.OrExpression2Context;
import nossalinguagem.parser.NossaLinguagemParser.OrExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.ParenExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.ReturnStatementContext;
import nossalinguagem.parser.NossaLinguagemParser.StatementContext;
import nossalinguagem.parser.NossaLinguagemParser.SubExpression2Context;
import nossalinguagem.parser.NossaLinguagemParser.SubExpressionContext;
import nossalinguagem.parser.NossaLinguagemParser.VarDeclarationContext;

public class Visitor extends NossaLinguagemBaseVisitor<Value>{
	private Scope scope = new Scope();
	
	@Override
	public Value visitGoal(GoalContext ctx) {
		List<ClassDeclarationContext> listClassCtx = ctx.classDeclaration();
		
		for(ClassDeclarationContext classctx: listClassCtx){
			scope = new Scope(scope);
			this.visit(classctx);
			scope = scope.parent();
		}
		
		return null;
	}
	
	/**
	 * Declarations
	 */
	@Override
	public Value visitClassDeclaration(ClassDeclarationContext ctx) {
		String className = ctx.ID().getText();
		scope = new Scope(scope);
		
		// Visit field declaration variables
		List<FieldDeclarationContext> listFieldCtx = ctx.classBody().fieldDeclaration();
		for(FieldDeclarationContext fieldctx: listFieldCtx){
			this.visit(fieldctx);
		}
		
		// Save on symbol table methods names
		List<MethodDeclarationContext> listMethodCtx = ctx.classBody().methodDeclaration();
		for(MethodDeclarationContext methodctx: listMethodCtx){
			String id = methodctx.ID().getText();
			Value v = this.visit(methodctx.type());
			// if the method has arguments, save those too
			if(methodctx.formalParameters().formalParameterList() != null){
				List<FormalParameterContext> listOfParametersCtx = methodctx.formalParameters().formalParameterList().formalParameter();
				for(FormalParameterContext parameterCtx: listOfParametersCtx){
					Value vParam = this.visit(parameterCtx.type());
					v.addArgument(vParam);
				}
			}
			scope.assign(id, v);
		}
		
		// Visit method declarations
		for(MethodDeclarationContext methodctx: listMethodCtx){
			this.visit(methodctx);
		}
		scope = scope.parent();
		
		return null;
	}
	
	@Override
	public Value visitFieldDeclaration(FieldDeclarationContext ctx) {
		String id = ctx.ID(0).getText();
		
		Value v = this.visit(ctx.type());
		scope.assign(id, v);
		
		return v;
	}
	
	@Override
	public Value visitVarDeclaration(VarDeclarationContext ctx) {
		String id = ctx.ID(0).getText();
		
		Value v = this.visit(ctx.type());
		scope.assign(id, v);
		
		return null;
	}
	
	@Override
	public Value visitMethodDeclaration(MethodDeclarationContext ctx) {		
		scope = new Scope(scope);
		
		// Save parameters on the symbol table
		if(ctx.formalParameters().formalParameterList() != null){
			List<FormalParameterContext> listOfParametersCtx = ctx.formalParameters().formalParameterList().formalParameter();
			for(FormalParameterContext parameterCtx: listOfParametersCtx){
				String id = parameterCtx.ID().getText();
				Value v = this.visit(parameterCtx.type());
				scope.assign(id, v);
			}
		}
		
		// Visit variable declarations
		List<VarDeclarationContext> listVarCtx = ctx.methodBody().varDeclaration();
		for(VarDeclarationContext varCtx: listVarCtx){
			this.visit(varCtx);
		}
		
		// Visit statements
		List<StatementContext> listStatementContext = ctx.methodBody().statement();
		for(StatementContext stctx : listStatementContext){
			this.visit(stctx);
		}
		
		// Get return value
		Value returnValue = scope.resolve("return");
		scope = scope.parent();
		
		// Get return value declared on the method
		Value valueOfDeclaration = this.visit(ctx.type());
		
		if(returnValue != null){
			// Verify if the method declarations type is the same of the return.
			if(!valueOfDeclaration.typeEquals(returnValue)){
				throw new RuntimeException("return value doesn't match method declaration");
			}
		}else{
			throw new RuntimeException("method expecting return"); 
		}

		return returnValue;
	}
	
	/**
	 * Statements
	 */
	@Override
	public Value visitAssignStatement(AssignStatementContext ctx) {
		String id = ctx.ID().getText();
		
		// Check if variable was declared
		if(scope.resolve(id) == null)
			throw new RuntimeException("no such variable: " + id);
		
		
		// Test to see if the type of variable declared is the same being assigned.
		Value valueOfDeclaration = scope.resolve(id);
		
		Value valueOfAssignment = this.visit(ctx.expression());
		if(!valueOfAssignment.typeEquals(valueOfDeclaration)){
			throw new RuntimeException("incorrect assignment type");
		}
		
		Value v = scope.resolve(id);
		v.setValue(valueOfAssignment);
		
		return super.visitAssignStatement(ctx);
	}
	
	@Override
	public Value visitAssignStatement2(AssignStatement2Context ctx) {
		String id = ctx.ID().getText();
		
		// Check if variable was declared
		if(scope.resolve(id) == null)
			throw new RuntimeException("no such variable: " + id);
		
		
		// Test to see if the type of variable declared is the same being assigned.
		Value valueOfDeclaration = scope.resolve(id);
		Value valueOfAssignment = this.visit(ctx.booleanExpression());
				
		if(!valueOfAssignment.typeEquals(valueOfDeclaration)){
			throw new RuntimeException("incorrect assignment type");
		}
		
		// Save result of the expression on the variable declared
		Value v = scope.resolve(id);
		v.setValue(valueOfAssignment);
		
		return super.visitAssignStatement2(ctx);
	}
	
	@Override
	public Value visitAssignStatement3(AssignStatement3Context ctx) {
		String id = ctx.ID().getText();
		
		// Check if variable was declared
		if(scope.resolve(id) == null){
			throw new RuntimeException("no such variable: " + id);
		}
		
		// Test to see if the type of variable declared is the same being assigned.
		Value valueOfDeclaration = scope.resolve(id);
		Value valueOfAssignment = this.visit(ctx.mathExpression());
				
		if(!valueOfAssignment.typeEquals(valueOfDeclaration)){
			throw new RuntimeException("incorrect assignment type");
		}
		
		Value v = scope.resolve(id);
		v.setValue(valueOfAssignment);
		
		return super.visitAssignStatement3(ctx);
	}

	@Override
	public Value visitReturnStatement(ReturnStatementContext ctx) {
		Value valueReturn = this.visit(ctx.expression());
		scope.assign("return", valueReturn);
		return valueReturn;
	}
	
	@Override
	public Value visitArrayAssignStatement(ArrayAssignStatementContext ctx) {
		Value intArray = scope.resolve(ctx.ID().getText());
		int lengthDeclared = intArray.asIntArray().length;
		Value valueLength = this.visit(ctx.expression(0));
		int lengthUsed = valueLength.asNumber();
		
		if(lengthUsed > lengthDeclared - 1)
			throw new RuntimeException("array index out of bounds");
		
		return super.visitArrayAssignStatement(ctx);
	}
	
	/**
	 * Expressions
	 */
	
	@Override
	public Value visitBooleanLitExpression(BooleanLitExpressionContext ctx) {
		return new Value(Boolean.valueOf(ctx.getText()));
	}
	
	@Override
	public Value visitCharExpression(CharExpressionContext ctx) {
		return new Value(Character.valueOf(ctx.getText().charAt(0)));
	}
	
	@Override
	public Value visitIntLitExpression(IntLitExpressionContext ctx) {
		return new Value(Integer.valueOf(ctx.getText()));
	}
	
	@Override
	public Value visitIdentifierExpression(IdentifierExpressionContext ctx) {
		String id = ctx.getText();
		Value v = scope.resolve(id);
		return v;
	}
	
	@Override
	public Value visitMethodCallExpression(MethodCallExpressionContext ctx) {
		String id = ctx.ID().getText();
		Value v = scope.resolve(id);
		List<ExpressionContext> listOfArguments = ctx.methodArgumentList().expression();
		
		// Check if the number of arguments is correct.
		if(listOfArguments.size() != v.getNumberOfArguments()){
			throw new RuntimeException("incorrect number of arguments");
		}
		
		// Check if the type of arguments is correct.
		for(ExpressionContext expctx: listOfArguments){
			Value argument = this.visit(expctx);
			if(!v.typeEquals(argument)){
				throw new RuntimeException("invalid type of argument");
			}
		}
		return v;
	}
	
	@Override
	public Value visitArrayInstantiationExpression(ArrayInstantiationExpressionContext ctx) {
		Value v = this.visit(ctx.expression());
		if(!v.isNumber()) 
			throw new RuntimeException("invalid type of argument");
		
		return new Value(Array.newInstance(Integer.class, v.asNumber()));
	}
	
	/**
	 * Math Expressions
	 */
	@Override
	public Value visitAddExpression(AddExpressionContext ctx) {
		Value v1 = this.visit(ctx.expression(0));
		Value v2 = this.visit(ctx.expression(1));
		
		if(!v1.isNumber() || !v2.isNumber()){
			throw new RuntimeException("illegal expression sum values type");
		}
		return new Value(Integer.valueOf(v1.asNumber() - v2.asNumber()));
	}
	
	@Override
	public Value visitSubExpression(SubExpressionContext ctx) {
		Value v1 = this.visit(ctx.expression(0));
		Value v2 = this.visit(ctx.expression(1));
		
		if(!v1.isNumber() || !v2.isNumber()){
			throw new RuntimeException("illegal expression subtraction value type");
		}
		return new Value(Integer.valueOf(v1.asNumber() - v2.asNumber()));
	}
	
	@Override
	public Value visitMulExpression(MulExpressionContext ctx) {
		Value v1 = this.visit(ctx.expression(0));
		Value v2 = this.visit(ctx.expression(1));
		
		if(!v1.isNumber() || !v2.isNumber()){
			throw new RuntimeException("illegal expression multiplication values type");
		}
		return new Value(Integer.valueOf(v1.asNumber() * v2.asNumber()));
	}
	
	@Override
	public Value visitAddExpression2(AddExpression2Context ctx) {
		Value v1 = this.visit(ctx.expression());
		Value v2 = this.visit(ctx.mathExpression());
		
		if(!v1.isNumber() || !v2.isNumber()){
			throw new RuntimeException("illegal expression sum values type");
		}
		return new Value(Integer.valueOf(v1.asNumber() + v2.asNumber()));
	}
	
	@Override
	public Value visitSubExpression2(SubExpression2Context ctx) {
		Value v1 = this.visit(ctx.expression());
		Value v2 = this.visit(ctx.mathExpression());
		
		if(!v1.isNumber() || !v2.isNumber()){
			throw new RuntimeException("illegal expression subtraction values type");
		}
		return new Value(Integer.valueOf(v1.asNumber() - v2.asNumber()));
	}
	
	@Override
	public Value visitMulExpression2(MulExpression2Context ctx) {
		Value v1 = this.visit(ctx.expression());
		Value v2 = this.visit(ctx.mathExpression());
		
		if(!v1.isNumber() || !v2.isNumber()){
			throw new RuntimeException("illegal expression multiplication values type");
		}
		return new Value(Integer.valueOf(v1.asNumber() * v2.asNumber()));
	}
	
	/**
	 * Boolean Expressions
	 */
	@Override
	public Value visitNotExpression(NotExpressionContext ctx) {
		Value v  = this.visit(ctx.expression());
		if(!v.isBoolean()) 
			throw new RuntimeException("illegal NOT expression isn't boolean");
		
		return new Value(Boolean.valueOf(!v.asBoolean()));
	}
	
	@Override
	public Value visitLtExpression(LtExpressionContext ctx) {
		Value v1 = this.visit(ctx.expression(0));
		Value v2 = this.visit(ctx.expression(1));
		
		if(!v1.isNumber() || !v2.isNumber()){
			throw new RuntimeException("illegal 'less than' expression"); 
		}
		return new Value(Boolean.valueOf(v1.asNumber() < v2.asNumber()));
	}
	
	@Override
	public Value visitEqExpression(EqExpressionContext ctx) {
		Value v1 = this.visit(ctx.expression(0));
		Value v2 = this.visit(ctx.expression(1));
		
		if(!v1.typeEquals(v2)){
			throw new RuntimeException("illegal expression equality between different classes"); 
		}
		
		if(v1.isBoolean())
			return new Value(Boolean.valueOf(v1.asBoolean() == v2.asBoolean()));
		else if(v1.isChar()){
			return new Value(Boolean.valueOf(v1.asChar() == v2.asChar()));
		}
		else{
			return new Value(Boolean.valueOf(v1.asNumber() == v2.asNumber()));
		}
	}
	
	@Override
	public Value visitAndExpression(AndExpressionContext ctx) {
		Value v1 = this.visit(ctx.expression(0));
		Value v2 = this.visit(ctx.expression(1));
		
		if(!v1.isBoolean() || !v1.isBoolean())
			throw new RuntimeException("illegal expression 'AND' between invalid classes");

		return new Value(Boolean.valueOf(v1.asBoolean() && v2.asBoolean()));
	}
	
	@Override
	public Value visitOrExpression(OrExpressionContext ctx) {
		Value v1 = this.visit(ctx.expression(0));
		Value v2 = this.visit(ctx.expression(1));
		
		if(!v1.isBoolean() || !v2.isBoolean())
			throw new RuntimeException("illegal expression 'OR' between invalid classes");

		return new Value(Boolean.valueOf(v1.asBoolean() || v2.asBoolean()));
	}
	
	@Override
	public Value visitLtExpression2(LtExpression2Context ctx) {
		Value v1 = this.visit(ctx.expression());
		Value v2 = this.visit(ctx.booleanExpression());
		
		if(!v1.isNumber() || !v2.isNumber()){
			throw new RuntimeException("illegal 'less than' expression"); 
		}
		return new Value(Boolean.valueOf(v1.asNumber() < v2.asNumber()));
	}
	
	@Override
	public Value visitEqExpression2(EqExpression2Context ctx) {
		Value v1 = this.visit(ctx.expression());
		Value v2 = this.visit(ctx.booleanExpression());
		
		if(!v1.typeEquals(v2)){
			throw new RuntimeException("illegal expression equality between different classes"); 
		}
		
		if(v1.isBoolean())
			return new Value(Boolean.valueOf(v1.asBoolean() == v2.asBoolean()));
		else if(v1.isChar()){
			return new Value(Boolean.valueOf(v1.asChar() == v2.asChar()));
		}
		else{
			return new Value(Boolean.valueOf(v1.asNumber() == v2.asNumber()));
		}
	}
	
	@Override
	public Value visitAndExpression2(AndExpression2Context ctx) {
		Value v1 = this.visit(ctx.expression());
		Value v2 = this.visit(ctx.booleanExpression());
		
		if(!v1.isBoolean() || !v2.isBoolean())
			throw new RuntimeException("illegal expression 'AND' between invalid classes");

		return new Value(Boolean.valueOf(v1.asBoolean() && v2.asBoolean()));
	}
	
	@Override
	public Value visitOrExpression2(OrExpression2Context ctx) {
		Value v1 = this.visit(ctx.expression());
		Value v2 = this.visit(ctx.booleanExpression());
		
		if(!v1.isBoolean() || !v2.isBoolean())
			throw new RuntimeException("illegal expression 'OR' between invalid classes");

		return new Value(Boolean.valueOf(v1.asBoolean() || v2.asBoolean()));
	}
	
	@Override
	public Value visitParenExpression(ParenExpressionContext ctx) {
		Value v =  this.visit(ctx.booleanExpression());
		return v;
	}
	
	/**
	 * Type
	 */
	@Override
	public Value visitIntType(IntTypeContext ctx) {
		return new Value(Integer.valueOf(0));
	}
	
	@Override
	public Value visitBooleanType(BooleanTypeContext ctx) {
		return new Value(Boolean.valueOf(true));
	}
	
	@Override
	public Value visitCharType(CharTypeContext ctx) {
		return new Value(Character.valueOf(' '));
	}
	
	@Override
	public Value visitIntArrayType(IntArrayTypeContext ctx) {
		return new Value(Array.newInstance(Integer.class, 0));
	}
	
	@Override
	public Value visitIdType(IdTypeContext ctx) {
		String id = ctx.ID().getText();
		return new Value(String.valueOf(id));
	}
}
