// Generated from NossaLinguagem.g4 by ANTLR 4.4

    package nossalinguagem.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NossaLinguagemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__37=1, T__36=2, T__35=3, T__34=4, T__33=5, T__32=6, T__31=7, T__30=8, 
		T__29=9, T__28=10, T__27=11, T__26=12, T__25=13, T__24=14, T__23=15, T__22=16, 
		T__21=17, T__20=18, T__19=19, T__18=20, T__17=21, T__16=22, T__15=23, 
		T__14=24, T__13=25, T__12=26, T__11=27, T__10=28, T__9=29, T__8=30, T__7=31, 
		T__6=32, T__5=33, T__4=34, T__3=35, T__2=36, T__1=37, T__0=38, CHAR=39, 
		INT=40, QUANTUM=41, BOOL=42, ID=43, WS=44, COMMENT=45, LINE_COMMENT=46;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'char'", "'new'", "'return'", "'class'", 
		"'while'", "';'", "'void'", "'{'", "'&&'", "'='", "'}'", "'extends'", 
		"'if'", "'?'", "'int'", "'('", "'*'", "'this'", "','", "'.'", "'boolean'", 
		"'recur'", "'System.out.println'", "':'", "'['", "'<'", "'String'", "']'", 
		"'public'", "'!'", "'static'", "'else'", "'quantum'", "')'", "'+'", "'-'", 
		"CHAR", "INT", "QUANTUM", "BOOL", "ID", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_goal = 0, RULE_mainClassDeclaration = 1, RULE_classDeclaration = 2, 
		RULE_mainClassBody = 3, RULE_mainMethod = 4, RULE_mainMethodDeclaration = 5, 
		RULE_classBody = 6, RULE_fieldDeclaration = 7, RULE_varDeclaration = 8, 
		RULE_methodDeclaration = 9, RULE_methodBody = 10, RULE_formalParameters = 11, 
		RULE_formalParameterList = 12, RULE_formalParameter = 13, RULE_type = 14, 
		RULE_statement = 15, RULE_expression = 16, RULE_methodArgumentList = 17, 
		RULE_intArrayType = 18, RULE_charType = 19, RULE_booleanType = 20, RULE_intType = 21, 
		RULE_quantumType = 22;
	public static final String[] ruleNames = {
		"goal", "mainClassDeclaration", "classDeclaration", "mainClassBody", "mainMethod", 
		"mainMethodDeclaration", "classBody", "fieldDeclaration", "varDeclaration", 
		"methodDeclaration", "methodBody", "formalParameters", "formalParameterList", 
		"formalParameter", "type", "statement", "expression", "methodArgumentList", 
		"intArrayType", "charType", "booleanType", "intType", "quantumType"
	};

	@Override
	public String getGrammarFileName() { return "NossaLinguagem.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NossaLinguagemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public MainClassDeclarationContext mainClassDeclaration() {
			return getRuleContext(MainClassDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); mainClassDeclaration();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(47); classDeclaration();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public MainClassBodyContext mainClassBody() {
			return getRuleContext(MainClassBodyContext.class,0);
		}
		public MainClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterMainClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitMainClassDeclaration(this);
		}
	}

	public final MainClassDeclarationContext mainClassDeclaration() throws RecognitionException {
		MainClassDeclarationContext _localctx = new MainClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(T__32);
			setState(54); match(ID);
			setState(55); mainClassBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(T__32);
			setState(58); match(ID);
			setState(61);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(59); match(T__24);
				setState(60); type();
				}
			}

			setState(63); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassBodyContext extends ParserRuleContext {
		public MainMethodContext mainMethod() {
			return getRuleContext(MainMethodContext.class,0);
		}
		public MainClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClassBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterMainClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitMainClassBody(this);
		}
	}

	public final MainClassBodyContext mainClassBody() throws RecognitionException {
		MainClassBodyContext _localctx = new MainClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainClassBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(T__28);
			setState(66); mainMethod();
			setState(67); match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainMethodContext extends ParserRuleContext {
		public MainMethodDeclarationContext mainMethodDeclaration() {
			return getRuleContext(MainMethodDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterMainMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitMainMethod(this);
		}
	}

	public final MainMethodContext mainMethod() throws RecognitionException {
		MainMethodContext _localctx = new MainMethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); mainMethodDeclaration();
			setState(70); match(T__28);
			setState(71); statement();
			setState(72); match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public MainMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterMainMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitMainMethodDeclaration(this);
		}
	}

	public final MainMethodDeclarationContext mainMethodDeclaration() throws RecognitionException {
		MainMethodDeclarationContext _localctx = new MainMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(T__7);
			setState(75); match(T__5);
			setState(76); match(T__29);
			setState(77); match(T__37);
			setState(78); match(T__20);
			setState(79); match(T__9);
			setState(80); match(T__11);
			setState(81); match(T__8);
			setState(82); match(ID);
			setState(83); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(T__28);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86); fieldDeclaration();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__21) | (1L << T__15) | (1L << T__7) | (1L << T__3) | (1L << ID))) != 0)) {
				{
				{
				setState(92); methodDeclaration();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98); match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); type();
			setState(101); match(ID);
			setState(102); match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); type();
			setState(105); match(ID);
			setState(106); match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(108); match(T__7);
				setState(109); type();
				setState(110); match(ID);
				setState(111); formalParameters();
				}
				break;
			case 2:
				{
				setState(113); type();
				setState(114); match(ID);
				setState(115); formalParameters();
				notifyErrorListeners("method declaration without public");
				}
				break;
			case 3:
				{
				setState(118); match(T__7);
				setState(119); match(ID);
				setState(120); formalParameters();
				notifyErrorListeners("method declaration without return type");
				}
				break;
			case 4:
				{
				setState(123); match(T__7);
				setState(124); type();
				setState(125); formalParameters();
				notifyErrorListeners("method declaration without method name");
				}
				break;
			case 5:
				{
				setState(128); match(T__7);
				setState(129); type();
				setState(130); match(ID);
				notifyErrorListeners("method declaration without argument list");
				}
				break;
			}
			setState(135); methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(T__28);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138); varDeclaration();
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144); statement();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__31) | (1L << T__28) | (1L << T__23) | (1L << T__14) | (1L << T__13) | (1L << ID))) != 0) );
			setState(149); match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(T__20);
			setState(153);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__21) | (1L << T__15) | (1L << T__3) | (1L << ID))) != 0)) {
				{
				setState(152); formalParameterList();
				}
			}

			setState(155); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); formalParameter();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(158); match(T__17);
				setState(159); formalParameter();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); type();
			setState(166); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public IntTypeContext intType() {
			return getRuleContext(IntTypeContext.class,0);
		}
		public IntArrayTypeContext intArrayType() {
			return getRuleContext(IntArrayTypeContext.class,0);
		}
		public CharTypeContext charType() {
			return getRuleContext(CharTypeContext.class,0);
		}
		public BooleanTypeContext booleanType() {
			return getRuleContext(BooleanTypeContext.class,0);
		}
		public QuantumTypeContext quantumType() {
			return getRuleContext(QuantumTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168); intArrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); booleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170); quantumType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171); intType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172); charType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173); match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitWhileStatement(this);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitPrintStatement(this);
		}
	}
	public static class ArrayAssignStatementContext extends StatementContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayAssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterArrayAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitArrayAssignStatement(this);
		}
	}
	public static class IfElseStatementContext extends StatementContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfElseStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitIfElseStatement(this);
		}
	}
	public static class AssignStatementContext extends StatementContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitAssignStatement(this);
		}
	}
	public static class RecurStatementContext extends StatementContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MethodArgumentListContext methodArgumentList() {
			return getRuleContext(MethodArgumentListContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public RecurStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterRecurStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitRecurStatement(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitReturnStatement(this);
		}
	}
	public static class NestedStatementContext extends StatementContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public NestedStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterNestedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitNestedStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		int _la;
		try {
			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new NestedStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176); match(T__28);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__31) | (1L << T__28) | (1L << T__23) | (1L << T__14) | (1L << T__13) | (1L << ID))) != 0)) {
					{
					{
					setState(177); statement();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183); match(T__25);
				}
				break;
			case 2:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184); match(T__23);
				setState(185); match(T__20);
				setState(186); expression(0);
				setState(187); match(T__2);
				setState(188); statement();
				setState(189); match(T__4);
				setState(190); statement();
				}
				break;
			case 3:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(192); match(T__31);
				setState(193); match(T__20);
				setState(194); expression(0);
				setState(195); match(T__2);
				setState(196); statement();
				}
				break;
			case 4:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(198); match(T__13);
				setState(199); match(T__20);
				setState(200); expression(0);
				setState(201); match(T__2);
				setState(202); match(T__30);
				}
				break;
			case 5:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(204); match(ID);
				setState(205); match(T__26);
				setState(206); expression(0);
				setState(207); match(T__30);
				}
				break;
			case 6:
				_localctx = new ArrayAssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(209); match(ID);
				setState(210); match(T__11);
				setState(211); expression(0);
				setState(212); match(T__8);
				setState(213); match(T__26);
				setState(214); expression(0);
				setState(215); match(T__30);
				}
				break;
			case 7:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(217); match(T__33);
				setState(218); expression(0);
				setState(219); match(T__30);
				}
				break;
			case 8:
				_localctx = new RecurStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(221); match(T__14);
				setState(222); expression(0);
				setState(223); match(T__22);
				setState(224); methodArgumentList();
				setState(225); match(T__12);
				setState(226); expression(0);
				setState(227); match(T__30);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LtExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LtExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterLtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitLtExpression(this);
		}
	}
	public static class QuantumExpressionContext extends ExpressionContext {
		public TerminalNode QUANTUM() { return getToken(NossaLinguagemParser.QUANTUM, 0); }
		public QuantumExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterQuantumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitQuantumExpression(this);
		}
	}
	public static class ObjectInstantiationExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public ObjectInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterObjectInstantiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitObjectInstantiationExpression(this);
		}
	}
	public static class ArrayInstantiationExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterArrayInstantiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitArrayInstantiationExpression(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitIdentifierExpression(this);
		}
	}
	public static class MethodCallExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public MethodArgumentListContext methodArgumentList() {
			return getRuleContext(MethodArgumentListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitMethodCallExpression(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitNotExpression(this);
		}
	}
	public static class BooleanLitExpressionContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(NossaLinguagemParser.BOOL, 0); }
		public BooleanLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterBooleanLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitBooleanLitExpression(this);
		}
	}
	public static class ParenExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitParenExpression(this);
		}
	}
	public static class IntLitExpressionContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(NossaLinguagemParser.INT, 0); }
		public IntLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterIntLitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitIntLitExpression(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitAndExpression(this);
		}
	}
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitArrayAccessExpression(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitAddExpression(this);
		}
	}
	public static class ThisExpressionContext extends ExpressionContext {
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitThisExpression(this);
		}
	}
	public static class ArrayLengthExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterArrayLengthExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitArrayLengthExpression(this);
		}
	}
	public static class CharExpressionContext extends ExpressionContext {
		public TerminalNode CHAR() { return getToken(NossaLinguagemParser.CHAR, 0); }
		public CharExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterCharExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitCharExpression(this);
		}
	}
	public static class NegExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterNegExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitNegExpression(this);
		}
	}
	public static class SubExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitSubExpression(this);
		}
	}
	public static class MulExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitMulExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new NegExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(232); match(T__0);
				setState(233); expression(16);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234); match(T__6);
				setState(235); expression(15);
				}
				break;
			case 3:
				{
				_localctx = new ArrayInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236); match(T__34);
				setState(237); match(T__21);
				setState(238); match(T__11);
				setState(239); expression(0);
				setState(240); match(T__8);
				}
				break;
			case 4:
				{
				_localctx = new ObjectInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242); match(T__34);
				setState(243); match(ID);
				setState(244); match(T__20);
				setState(245); match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new IntLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246); match(INT);
				}
				break;
			case 6:
				{
				_localctx = new QuantumExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247); match(QUANTUM);
				}
				break;
			case 7:
				{
				_localctx = new CharExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248); match(CHAR);
				}
				break;
			case 8:
				{
				_localctx = new BooleanLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249); match(BOOL);
				}
				break;
			case 9:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250); match(ID);
				}
				break;
			case 10:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251); match(T__18);
				}
				break;
			case 11:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252); match(T__20);
				setState(253); expression(0);
				setState(254); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(259); match(T__1);
						setState(260); expression(13);
						}
						break;
					case 2:
						{
						_localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(262); match(T__0);
						setState(263); expression(12);
						}
						break;
					case 3:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(264);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(265); match(T__19);
						setState(266); expression(11);
						}
						break;
					case 4:
						{
						_localctx = new LtExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(268); match(T__10);
						setState(269); expression(10);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(271); match(T__27);
						setState(272); expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(274); match(T__11);
						setState(275); expression(0);
						setState(276); match(T__8);
						}
						break;
					case 7:
						{
						_localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(279); match(T__16);
						setState(280); match(T__36);
						}
						break;
					case 8:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(282); match(T__16);
						setState(283); match(ID);
						setState(284); methodArgumentList();
						}
						break;
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MethodArgumentListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MethodArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterMethodArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitMethodArgumentList(this);
		}
	}

	public final MethodArgumentListContext methodArgumentList() throws RecognitionException {
		MethodArgumentListContext _localctx = new MethodArgumentListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(T__20);
			setState(299);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__20) | (1L << T__18) | (1L << T__6) | (1L << T__0) | (1L << CHAR) | (1L << INT) | (1L << QUANTUM) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				setState(291); expression(0);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(292); match(T__17);
					setState(293); expression(0);
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(301); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntArrayTypeContext extends ParserRuleContext {
		public IntArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterIntArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitIntArrayType(this);
		}
	}

	public final IntArrayTypeContext intArrayType() throws RecognitionException {
		IntArrayTypeContext _localctx = new IntArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_intArrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); match(T__21);
			setState(304); match(T__11);
			setState(305); match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharTypeContext extends ParserRuleContext {
		public CharTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitCharType(this);
		}
	}

	public final CharTypeContext charType() throws RecognitionException {
		CharTypeContext _localctx = new CharTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_charType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); match(T__35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanTypeContext extends ParserRuleContext {
		public BooleanTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitBooleanType(this);
		}
	}

	public final BooleanTypeContext booleanType() throws RecognitionException {
		BooleanTypeContext _localctx = new BooleanTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntTypeContext extends ParserRuleContext {
		public IntTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitIntType(this);
		}
	}

	public final IntTypeContext intType() throws RecognitionException {
		IntTypeContext _localctx = new IntTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_intType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumTypeContext extends ParserRuleContext {
		public QuantumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterQuantumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitQuantumType(this);
		}
	}

	public final QuantumTypeContext quantumType() throws RecognitionException {
		QuantumTypeContext _localctx = new QuantumTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_quantumType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 12);
		case 1: return precpred(_ctx, 11);
		case 2: return precpred(_ctx, 10);
		case 3: return precpred(_ctx, 9);
		case 4: return precpred(_ctx, 8);
		case 5: return precpred(_ctx, 19);
		case 6: return precpred(_ctx, 18);
		case 7: return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u013e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\7"+
		"\2\63\n\2\f\2\16\2\66\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4@\n\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\b\7\b`\n\b\f\b\16\b"+
		"c\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0088\n\13\3\13\3\13\3\f\3\f\7\f\u008e"+
		"\n\f\f\f\16\f\u0091\13\f\3\f\6\f\u0094\n\f\r\f\16\f\u0095\3\f\3\f\3\r"+
		"\3\r\5\r\u009c\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u00a3\n\16\f\16\16\16\u00a6"+
		"\13\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b1\n\20\3"+
		"\21\3\21\7\21\u00b5\n\21\f\21\16\21\u00b8\13\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u00e8\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0103\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u0120\n\22\f\22\16\22\u0123\13\22\3\23\3\23\3\23\3\23"+
		"\7\23\u0129\n\23\f\23\16\23\u012c\13\23\5\23\u012e\n\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\2\3\"\31"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\u0153\2\60\3\2\2"+
		"\2\4\67\3\2\2\2\6;\3\2\2\2\bC\3\2\2\2\nG\3\2\2\2\fL\3\2\2\2\16W\3\2\2"+
		"\2\20f\3\2\2\2\22j\3\2\2\2\24\u0087\3\2\2\2\26\u008b\3\2\2\2\30\u0099"+
		"\3\2\2\2\32\u009f\3\2\2\2\34\u00a7\3\2\2\2\36\u00b0\3\2\2\2 \u00e7\3\2"+
		"\2\2\"\u0102\3\2\2\2$\u0124\3\2\2\2&\u0131\3\2\2\2(\u0135\3\2\2\2*\u0137"+
		"\3\2\2\2,\u0139\3\2\2\2.\u013b\3\2\2\2\60\64\5\4\3\2\61\63\5\6\4\2\62"+
		"\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\3\3\2\2\2\66"+
		"\64\3\2\2\2\678\7\b\2\289\7-\2\29:\5\b\5\2:\5\3\2\2\2;<\7\b\2\2<?\7-\2"+
		"\2=>\7\20\2\2>@\5\36\20\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\5\16\b\2B\7"+
		"\3\2\2\2CD\7\f\2\2DE\5\n\6\2EF\7\17\2\2F\t\3\2\2\2GH\5\f\7\2HI\7\f\2\2"+
		"IJ\5 \21\2JK\7\17\2\2K\13\3\2\2\2LM\7!\2\2MN\7#\2\2NO\7\13\2\2OP\7\3\2"+
		"\2PQ\7\24\2\2QR\7\37\2\2RS\7\35\2\2ST\7 \2\2TU\7-\2\2UV\7&\2\2V\r\3\2"+
		"\2\2W[\7\f\2\2XZ\5\20\t\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\a"+
		"\3\2\2\2][\3\2\2\2^`\5\24\13\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2"+
		"bd\3\2\2\2ca\3\2\2\2de\7\17\2\2e\17\3\2\2\2fg\5\36\20\2gh\7-\2\2hi\7\n"+
		"\2\2i\21\3\2\2\2jk\5\36\20\2kl\7-\2\2lm\7\n\2\2m\23\3\2\2\2no\7!\2\2o"+
		"p\5\36\20\2pq\7-\2\2qr\5\30\r\2r\u0088\3\2\2\2st\5\36\20\2tu\7-\2\2uv"+
		"\5\30\r\2vw\b\13\1\2w\u0088\3\2\2\2xy\7!\2\2yz\7-\2\2z{\5\30\r\2{|\b\13"+
		"\1\2|\u0088\3\2\2\2}~\7!\2\2~\177\5\36\20\2\177\u0080\5\30\r\2\u0080\u0081"+
		"\b\13\1\2\u0081\u0088\3\2\2\2\u0082\u0083\7!\2\2\u0083\u0084\5\36\20\2"+
		"\u0084\u0085\7-\2\2\u0085\u0086\b\13\1\2\u0086\u0088\3\2\2\2\u0087n\3"+
		"\2\2\2\u0087s\3\2\2\2\u0087x\3\2\2\2\u0087}\3\2\2\2\u0087\u0082\3\2\2"+
		"\2\u0088\u0089\3\2\2\2\u0089\u008a\5\26\f\2\u008a\25\3\2\2\2\u008b\u008f"+
		"\7\f\2\2\u008c\u008e\5\22\n\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2"+
		"\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0092\u0094\5 \21\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\17"+
		"\2\2\u0098\27\3\2\2\2\u0099\u009b\7\24\2\2\u009a\u009c\5\32\16\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7&"+
		"\2\2\u009e\31\3\2\2\2\u009f\u00a4\5\34\17\2\u00a0\u00a1\7\27\2\2\u00a1"+
		"\u00a3\5\34\17\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\33\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\5\36\20\2\u00a8\u00a9\7-\2\2\u00a9\35\3\2\2\2\u00aa\u00b1\5&\24"+
		"\2\u00ab\u00b1\5*\26\2\u00ac\u00b1\5.\30\2\u00ad\u00b1\5,\27\2\u00ae\u00b1"+
		"\5(\25\2\u00af\u00b1\7-\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0"+
		"\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2"+
		"\2\2\u00b1\37\3\2\2\2\u00b2\u00b6\7\f\2\2\u00b3\u00b5\5 \21\2\u00b4\u00b3"+
		"\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00e8\7\17\2\2\u00ba\u00bb\7"+
		"\21\2\2\u00bb\u00bc\7\24\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\7&\2\2\u00be"+
		"\u00bf\5 \21\2\u00bf\u00c0\7$\2\2\u00c0\u00c1\5 \21\2\u00c1\u00e8\3\2"+
		"\2\2\u00c2\u00c3\7\t\2\2\u00c3\u00c4\7\24\2\2\u00c4\u00c5\5\"\22\2\u00c5"+
		"\u00c6\7&\2\2\u00c6\u00c7\5 \21\2\u00c7\u00e8\3\2\2\2\u00c8\u00c9\7\33"+
		"\2\2\u00c9\u00ca\7\24\2\2\u00ca\u00cb\5\"\22\2\u00cb\u00cc\7&\2\2\u00cc"+
		"\u00cd\7\n\2\2\u00cd\u00e8\3\2\2\2\u00ce\u00cf\7-\2\2\u00cf\u00d0\7\16"+
		"\2\2\u00d0\u00d1\5\"\22\2\u00d1\u00d2\7\n\2\2\u00d2\u00e8\3\2\2\2\u00d3"+
		"\u00d4\7-\2\2\u00d4\u00d5\7\35\2\2\u00d5\u00d6\5\"\22\2\u00d6\u00d7\7"+
		" \2\2\u00d7\u00d8\7\16\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da\7\n\2\2\u00da"+
		"\u00e8\3\2\2\2\u00db\u00dc\7\7\2\2\u00dc\u00dd\5\"\22\2\u00dd\u00de\7"+
		"\n\2\2\u00de\u00e8\3\2\2\2\u00df\u00e0\7\32\2\2\u00e0\u00e1\5\"\22\2\u00e1"+
		"\u00e2\7\22\2\2\u00e2\u00e3\5$\23\2\u00e3\u00e4\7\34\2\2\u00e4\u00e5\5"+
		"\"\22\2\u00e5\u00e6\7\n\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00b2\3\2\2\2\u00e7"+
		"\u00ba\3\2\2\2\u00e7\u00c2\3\2\2\2\u00e7\u00c8\3\2\2\2\u00e7\u00ce\3\2"+
		"\2\2\u00e7\u00d3\3\2\2\2\u00e7\u00db\3\2\2\2\u00e7\u00df\3\2\2\2\u00e8"+
		"!\3\2\2\2\u00e9\u00ea\b\22\1\2\u00ea\u00eb\7(\2\2\u00eb\u0103\5\"\22\22"+
		"\u00ec\u00ed\7\"\2\2\u00ed\u0103\5\"\22\21\u00ee\u00ef\7\6\2\2\u00ef\u00f0"+
		"\7\23\2\2\u00f0\u00f1\7\35\2\2\u00f1\u00f2\5\"\22\2\u00f2\u00f3\7 \2\2"+
		"\u00f3\u0103\3\2\2\2\u00f4\u00f5\7\6\2\2\u00f5\u00f6\7-\2\2\u00f6\u00f7"+
		"\7\24\2\2\u00f7\u0103\7&\2\2\u00f8\u0103\7*\2\2\u00f9\u0103\7+\2\2\u00fa"+
		"\u0103\7)\2\2\u00fb\u0103\7,\2\2\u00fc\u0103\7-\2\2\u00fd\u0103\7\26\2"+
		"\2\u00fe\u00ff\7\24\2\2\u00ff\u0100\5\"\22\2\u0100\u0101\7&\2\2\u0101"+
		"\u0103\3\2\2\2\u0102\u00e9\3\2\2\2\u0102\u00ec\3\2\2\2\u0102\u00ee\3\2"+
		"\2\2\u0102\u00f4\3\2\2\2\u0102\u00f8\3\2\2\2\u0102\u00f9\3\2\2\2\u0102"+
		"\u00fa\3\2\2\2\u0102\u00fb\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00fd\3\2"+
		"\2\2\u0102\u00fe\3\2\2\2\u0103\u0121\3\2\2\2\u0104\u0105\f\16\2\2\u0105"+
		"\u0106\7\'\2\2\u0106\u0120\5\"\22\17\u0107\u0108\f\r\2\2\u0108\u0109\7"+
		"(\2\2\u0109\u0120\5\"\22\16\u010a\u010b\f\f\2\2\u010b\u010c\7\25\2\2\u010c"+
		"\u0120\5\"\22\r\u010d\u010e\f\13\2\2\u010e\u010f\7\36\2\2\u010f\u0120"+
		"\5\"\22\f\u0110\u0111\f\n\2\2\u0111\u0112\7\r\2\2\u0112\u0120\5\"\22\13"+
		"\u0113\u0114\f\25\2\2\u0114\u0115\7\35\2\2\u0115\u0116\5\"\22\2\u0116"+
		"\u0117\7 \2\2\u0117\u0120\3\2\2\2\u0118\u0119\f\24\2\2\u0119\u011a\7\30"+
		"\2\2\u011a\u0120\7\4\2\2\u011b\u011c\f\23\2\2\u011c\u011d\7\30\2\2\u011d"+
		"\u011e\7-\2\2\u011e\u0120\5$\23\2\u011f\u0104\3\2\2\2\u011f\u0107\3\2"+
		"\2\2\u011f\u010a\3\2\2\2\u011f\u010d\3\2\2\2\u011f\u0110\3\2\2\2\u011f"+
		"\u0113\3\2\2\2\u011f\u0118\3\2\2\2\u011f\u011b\3\2\2\2\u0120\u0123\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122#\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0124\u012d\7\24\2\2\u0125\u012a\5\"\22\2\u0126\u0127\7\27\2"+
		"\2\u0127\u0129\5\"\22\2\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012d\u0125\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\7&\2\2\u0130%\3\2\2\2\u0131\u0132\7\23\2\2\u0132\u0133\7\35\2\2"+
		"\u0133\u0134\7 \2\2\u0134\'\3\2\2\2\u0135\u0136\7\5\2\2\u0136)\3\2\2\2"+
		"\u0137\u0138\7\31\2\2\u0138+\3\2\2\2\u0139\u013a\7\23\2\2\u013a-\3\2\2"+
		"\2\u013b\u013c\7%\2\2\u013c/\3\2\2\2\23\64?[a\u0087\u008f\u0095\u009b"+
		"\u00a4\u00b0\u00b6\u00e7\u0102\u011f\u0121\u012a\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}