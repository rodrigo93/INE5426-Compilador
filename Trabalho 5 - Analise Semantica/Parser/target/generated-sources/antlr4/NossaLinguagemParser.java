// Generated from NossaLinguagem.g4 by ANTLR 4.4
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
		T__38=1, T__37=2, T__36=3, T__35=4, T__34=5, T__33=6, T__32=7, T__31=8, 
		T__30=9, T__29=10, T__28=11, T__27=12, T__26=13, T__25=14, T__24=15, T__23=16, 
		T__22=17, T__21=18, T__20=19, T__19=20, T__18=21, T__17=22, T__16=23, 
		T__15=24, T__14=25, T__13=26, T__12=27, T__11=28, T__10=29, T__9=30, T__8=31, 
		T__7=32, T__6=33, T__5=34, T__4=35, T__3=36, T__2=37, T__1=38, T__0=39, 
		CHAR=40, INT=41, BOOL=42, ID=43, WS=44, COMMENT=45, LINE_COMMENT=46;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'char'", "'new'", "'return'", "'class'", 
		"'||'", "'while'", "';'", "'void'", "'{'", "'&&'", "'='", "'}'", "'extends'", 
		"'if'", "'?'", "'int'", "'('", "'*'", "'this'", "','", "'.'", "'boolean'", 
		"'recur'", "'System.out.println'", "':'", "'['", "'=='", "'<'", "'String'", 
		"']'", "'public'", "'!'", "'static'", "'else'", "')'", "'+'", "'-'", "CHAR", 
		"INT", "BOOL", "ID", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_goal = 0, RULE_mainClassDeclaration = 1, RULE_classDeclaration = 2, 
		RULE_mainClassBody = 3, RULE_mainMethod = 4, RULE_mainMethodDeclaration = 5, 
		RULE_classBody = 6, RULE_fieldDeclaration = 7, RULE_varDeclaration = 8, 
		RULE_methodDeclaration = 9, RULE_methodBody = 10, RULE_formalParameters = 11, 
		RULE_formalParameterList = 12, RULE_formalParameter = 13, RULE_type = 14, 
		RULE_statement = 15, RULE_expression = 16, RULE_booleanExpression = 17, 
		RULE_mathExpression = 18, RULE_functionCall = 19, RULE_methodArgumentList = 20, 
		RULE_intArrayType = 21, RULE_charType = 22, RULE_booleanType = 23, RULE_intType = 24, 
		RULE_idType = 25;
	public static final String[] ruleNames = {
		"goal", "mainClassDeclaration", "classDeclaration", "mainClassBody", "mainMethod", 
		"mainMethodDeclaration", "classBody", "fieldDeclaration", "varDeclaration", 
		"methodDeclaration", "methodBody", "formalParameters", "formalParameterList", 
		"formalParameter", "type", "statement", "expression", "booleanExpression", 
		"mathExpression", "functionCall", "methodArgumentList", "intArrayType", 
		"charType", "booleanType", "intType", "idType"
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
			setState(52); mainClassDeclaration();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(53); classDeclaration();
				}
				}
				setState(58);
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
			setState(59); match(T__33);
			setState(60); match(ID);
			setState(61); mainClassBody();
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
			setState(63); match(T__33);
			setState(64); match(ID);
			setState(67);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(65); match(T__24);
				setState(66); type();
				}
			}

			setState(69); classBody();
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
			setState(71); match(T__28);
			setState(72); mainMethod();
			setState(73); match(T__25);
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
			setState(75); mainMethodDeclaration();
			setState(76); match(T__28);
			setState(77); statement();
			setState(78); match(T__25);
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
			setState(80); match(T__6);
			setState(81); match(T__4);
			setState(82); match(T__29);
			setState(83); match(T__38);
			setState(84); match(T__20);
			setState(85); match(T__8);
			setState(86); match(T__11);
			setState(87); match(T__7);
			setState(88); match(ID);
			setState(89); match(T__2);
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
			setState(91); match(T__28);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92); fieldDeclaration();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__21) | (1L << T__15) | (1L << T__6) | (1L << ID))) != 0)) {
				{
				{
				setState(98); methodDeclaration();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104); match(T__25);
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
		public List<TerminalNode> ID() { return getTokens(NossaLinguagemParser.ID); }
		public TerminalNode BOOL() { return getToken(NossaLinguagemParser.BOOL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(NossaLinguagemParser.ID, i);
		}
		public TerminalNode CHAR() { return getToken(NossaLinguagemParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(NossaLinguagemParser.INT, 0); }
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
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); type();
				setState(107); match(ID);
				setState(108); match(T__30);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); type();
				setState(111); match(ID);
				setState(112); match(T__26);
				setState(113); match(ID);
				setState(114); match(T__30);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116); type();
				setState(117); match(ID);
				setState(118); match(T__26);
				setState(119); match(INT);
				setState(120); match(T__30);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122); type();
				setState(123); match(ID);
				setState(124); match(T__26);
				setState(125); match(CHAR);
				setState(126); match(T__30);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128); type();
				setState(129); match(ID);
				setState(130); match(T__26);
				setState(131); match(BOOL);
				setState(132); match(T__30);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(NossaLinguagemParser.ID); }
		public TerminalNode BOOL() { return getToken(NossaLinguagemParser.BOOL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(NossaLinguagemParser.ID, i);
		}
		public TerminalNode CHAR() { return getToken(NossaLinguagemParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(NossaLinguagemParser.INT, 0); }
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
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136); type();
				setState(137); match(ID);
				setState(138); match(T__30);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); type();
				setState(141); match(ID);
				setState(142); match(T__26);
				setState(143); match(ID);
				setState(144); match(T__30);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); type();
				setState(147); match(ID);
				setState(148); match(T__26);
				setState(149); match(INT);
				setState(150); match(T__30);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152); type();
				setState(153); match(ID);
				setState(154); match(T__26);
				setState(155); match(CHAR);
				setState(156); match(T__30);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158); type();
				setState(159); match(ID);
				setState(160); match(T__26);
				setState(161); match(BOOL);
				setState(162); match(T__30);
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
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(166); match(T__6);
				setState(167); type();
				setState(168); match(ID);
				setState(169); formalParameters();
				}
				break;
			case 2:
				{
				setState(171); type();
				setState(172); match(ID);
				setState(173); formalParameters();
				notifyErrorListeners("method declaration without public");
				}
				break;
			case 3:
				{
				setState(176); match(T__6);
				setState(177); match(ID);
				setState(178); formalParameters();
				notifyErrorListeners("method declaration without return type");
				}
				break;
			case 4:
				{
				setState(181); match(T__6);
				setState(182); type();
				setState(183); formalParameters();
				notifyErrorListeners("method declaration without method name");
				}
				break;
			case 5:
				{
				setState(186); match(T__6);
				setState(187); type();
				setState(188); match(ID);
				notifyErrorListeners("method declaration without argument list");
				}
				break;
			}
			setState(193); methodBody();
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
			setState(195); match(T__28);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196); varDeclaration();
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202); statement();
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__31) | (1L << T__28) | (1L << T__23) | (1L << T__14) | (1L << T__13) | (1L << ID))) != 0) );
			setState(207); match(T__25);
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
			setState(209); match(T__20);
			setState(211);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__21) | (1L << T__15) | (1L << ID))) != 0)) {
				{
				setState(210); formalParameterList();
				}
			}

			setState(213); match(T__2);
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
			setState(215); formalParameter();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(216); match(T__17);
				setState(217); formalParameter();
				}
				}
				setState(222);
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
			setState(223); type();
			setState(224); match(ID);
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
		public IntTypeContext intType() {
			return getRuleContext(IntTypeContext.class,0);
		}
		public IntArrayTypeContext intArrayType() {
			return getRuleContext(IntArrayTypeContext.class,0);
		}
		public CharTypeContext charType() {
			return getRuleContext(CharTypeContext.class,0);
		}
		public IdTypeContext idType() {
			return getRuleContext(IdTypeContext.class,0);
		}
		public BooleanTypeContext booleanType() {
			return getRuleContext(BooleanTypeContext.class,0);
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
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226); intArrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227); booleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228); intType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229); charType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230); idType();
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
	public static class AssignStatement3Context extends StatementContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public AssignStatement3Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterAssignStatement3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitAssignStatement3(this);
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
	public static class AssignStatement2Context extends StatementContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public AssignStatement2Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterAssignStatement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitAssignStatement2(this);
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
	public static class ReturnStatement2Context extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ReturnStatement2Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterReturnStatement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitReturnStatement2(this);
		}
	}
	public static class IfElseStatementContext extends StatementContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MethodArgumentListContext methodArgumentList() {
			return getRuleContext(MethodArgumentListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
	public static class IfStatementContext extends StatementContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitIfStatement(this);
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
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new NestedStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233); match(T__28);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__31) | (1L << T__28) | (1L << T__23) | (1L << T__14) | (1L << T__13) | (1L << ID))) != 0)) {
					{
					{
					setState(234); statement();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240); match(T__25);
				}
				break;
			case 2:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241); match(T__23);
				setState(242); match(T__20);
				setState(243); booleanExpression();
				setState(244); match(T__2);
				setState(245); statement();
				setState(246); match(T__3);
				setState(247); statement();
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(249); match(T__23);
				setState(250); match(T__20);
				setState(251); booleanExpression();
				setState(252); match(T__2);
				setState(253); statement();
				}
				break;
			case 4:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(255); match(T__31);
				setState(256); match(T__20);
				setState(257); booleanExpression();
				setState(258); match(T__2);
				setState(259); statement();
				}
				break;
			case 5:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(261); match(T__13);
				setState(262); match(T__20);
				setState(263); expression(0);
				setState(264); match(T__2);
				setState(265); match(T__30);
				}
				break;
			case 6:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(267); match(ID);
				setState(268); match(T__26);
				setState(269); expression(0);
				setState(270); match(T__30);
				}
				break;
			case 7:
				_localctx = new AssignStatement2Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(272); match(ID);
				setState(273); match(T__26);
				setState(274); booleanExpression();
				setState(275); match(T__30);
				}
				break;
			case 8:
				_localctx = new AssignStatement3Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(277); match(ID);
				setState(278); match(T__26);
				setState(279); mathExpression();
				setState(280); match(T__30);
				}
				break;
			case 9:
				_localctx = new ArrayAssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(282); match(ID);
				setState(283); match(T__11);
				setState(284); expression(0);
				setState(285); match(T__7);
				setState(286); match(T__26);
				setState(287); expression(0);
				setState(288); match(T__30);
				}
				break;
			case 10:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(290); match(T__34);
				setState(291); expression(0);
				setState(292); match(T__30);
				}
				break;
			case 11:
				_localctx = new ReturnStatement2Context(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(294); match(T__34);
				setState(295); functionCall();
				setState(296); match(T__30);
				}
				break;
			case 12:
				_localctx = new RecurStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(298); match(T__14);
				setState(299); booleanExpression();
				setState(300); match(T__22);
				setState(301); methodArgumentList();
				setState(302); match(T__12);
				setState(303); expression(0);
				setState(304); match(T__30);
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
	public static class ParenExpression2Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpression2Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterParenExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitParenExpression2(this);
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
	public static class AtrExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AtrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterAtrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitAtrExpression(this);
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
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new NegExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(309); match(T__0);
				setState(310); expression(10);
				}
				break;
			case 2:
				{
				_localctx = new ArrayInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(311); match(T__35);
				setState(312); match(T__21);
				setState(313); match(T__11);
				setState(314); expression(0);
				setState(315); match(T__7);
				}
				break;
			case 3:
				{
				_localctx = new ObjectInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317); match(T__35);
				setState(318); match(ID);
				setState(319); match(T__20);
				setState(320); match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new IntLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321); match(INT);
				}
				break;
			case 5:
				{
				_localctx = new CharExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322); match(CHAR);
				}
				break;
			case 6:
				{
				_localctx = new BooleanLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323); match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324); match(ID);
				}
				break;
			case 8:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(325); match(T__18);
				}
				break;
			case 9:
				{
				_localctx = new ParenExpression2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326); match(T__20);
				setState(327); expression(0);
				setState(328); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(347);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new AtrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(332);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(333); match(T__26);
						setState(334); expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(335);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(336); match(T__11);
						setState(337); expression(0);
						setState(338); match(T__7);
						}
						break;
					case 3:
						{
						_localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(340);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(341); match(T__16);
						setState(342); match(T__37);
						}
						break;
					case 4:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(343);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(344); match(T__16);
						setState(345); match(ID);
						setState(346); methodArgumentList();
						}
						break;
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LtExpressionContext extends BooleanExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LtExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterLtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitLtExpression(this);
		}
	}
	public static class OrExpressionContext extends BooleanExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitOrExpression(this);
		}
	}
	public static class EqExpressionContext extends BooleanExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public EqExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitEqExpression(this);
		}
	}
	public static class AndExpressionContext extends BooleanExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitAndExpression(this);
		}
	}
	public static class LtExpression2Context extends BooleanExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LtExpression2Context(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterLtExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitLtExpression2(this);
		}
	}
	public static class EqExpression2Context extends BooleanExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EqExpression2Context(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterEqExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitEqExpression2(this);
		}
	}
	public static class IDExpressionContext extends BooleanExpressionContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public IDExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterIDExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitIDExpression(this);
		}
	}
	public static class AndExpression2Context extends BooleanExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AndExpression2Context(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterAndExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitAndExpression2(this);
		}
	}
	public static class NotExpressionContext extends BooleanExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitNotExpression(this);
		}
	}
	public static class ParenExpressionContext extends BooleanExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ParenExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitParenExpression(this);
		}
	}
	public static class OrExpression2Context extends BooleanExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrExpression2Context(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterOrExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitOrExpression2(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_booleanExpression);
		try {
			setState(391);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(352); match(T__5);
				setState(353); expression(0);
				}
				break;
			case 2:
				_localctx = new LtExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(354); expression(0);
				setState(355); match(T__9);
				setState(356); expression(0);
				}
				break;
			case 3:
				_localctx = new EqExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(358); expression(0);
				setState(359); match(T__10);
				setState(360); expression(0);
				}
				break;
			case 4:
				_localctx = new AndExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(362); expression(0);
				setState(363); match(T__27);
				setState(364); expression(0);
				}
				break;
			case 5:
				_localctx = new OrExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(366); expression(0);
				setState(367); match(T__32);
				setState(368); expression(0);
				}
				break;
			case 6:
				_localctx = new LtExpression2Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(370); expression(0);
				setState(371); match(T__9);
				setState(372); booleanExpression();
				}
				break;
			case 7:
				_localctx = new EqExpression2Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(374); expression(0);
				setState(375); match(T__10);
				setState(376); booleanExpression();
				}
				break;
			case 8:
				_localctx = new AndExpression2Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(378); expression(0);
				setState(379); match(T__27);
				setState(380); booleanExpression();
				}
				break;
			case 9:
				_localctx = new OrExpression2Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(382); expression(0);
				setState(383); match(T__32);
				setState(384); booleanExpression();
				}
				break;
			case 10:
				_localctx = new ParenExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(386); match(T__20);
				setState(387); booleanExpression();
				setState(388); match(T__2);
				}
				break;
			case 11:
				_localctx = new IDExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(390); match(ID);
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

	public static class MathExpressionContext extends ParserRuleContext {
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
	 
		public MathExpressionContext() { }
		public void copyFrom(MathExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddExpressionContext extends MathExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddExpressionContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitAddExpression(this);
		}
	}
	public static class MulExpression2Context extends MathExpressionContext {
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MulExpression2Context(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterMulExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitMulExpression2(this);
		}
	}
	public static class AddExpression2Context extends MathExpressionContext {
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AddExpression2Context(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterAddExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitAddExpression2(this);
		}
	}
	public static class SubExpressionContext extends MathExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SubExpressionContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitSubExpression(this);
		}
	}
	public static class MulExpressionContext extends MathExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulExpressionContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitMulExpression(this);
		}
	}
	public static class SubExpression2Context extends MathExpressionContext {
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubExpression2Context(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterSubExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitSubExpression2(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mathExpression);
		try {
			setState(417);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new AddExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(393); expression(0);
				setState(394); match(T__1);
				setState(395); expression(0);
				}
				break;
			case 2:
				_localctx = new SubExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(397); expression(0);
				setState(398); match(T__0);
				setState(399); expression(0);
				}
				break;
			case 3:
				_localctx = new MulExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(401); expression(0);
				setState(402); match(T__19);
				setState(403); expression(0);
				}
				break;
			case 4:
				_localctx = new AddExpression2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(405); expression(0);
				setState(406); match(T__1);
				setState(407); mathExpression();
				}
				break;
			case 5:
				_localctx = new SubExpression2Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(409); expression(0);
				setState(410); match(T__0);
				setState(411); mathExpression();
				}
				break;
			case 6:
				_localctx = new MulExpression2Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(413); expression(0);
				setState(414); match(T__19);
				setState(415); mathExpression();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public MethodArgumentListContext methodArgumentList() {
			return getRuleContext(MethodArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); match(ID);
			setState(420); methodArgumentList();
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
		enterRule(_localctx, 40, RULE_methodArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); match(T__20);
			setState(431);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__20) | (1L << T__18) | (1L << T__0) | (1L << CHAR) | (1L << INT) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				setState(423); expression(0);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(424); match(T__17);
					setState(425); expression(0);
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(433); match(T__2);
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
		enterRule(_localctx, 42, RULE_intArrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(T__21);
			setState(436); match(T__11);
			setState(437); match(T__7);
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
		enterRule(_localctx, 44, RULE_charType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); match(T__36);
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
		enterRule(_localctx, 46, RULE_booleanType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441); match(T__15);
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
		enterRule(_localctx, 48, RULE_intType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443); match(T__21);
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

	public static class IdTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public IdTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).enterIdType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NossaLinguagemListener ) ((NossaLinguagemListener)listener).exitIdType(this);
		}
	}

	public final IdTypeContext idType() throws RecognitionException {
		IdTypeContext _localctx = new IdTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_idType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); match(ID);
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
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 13);
		case 2: return precpred(_ctx, 12);
		case 3: return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u01c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\5\4F\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b`\n\b\f\b\16\bc"+
		"\13\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0089\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00a7\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00c2\n\13\3\13\3\13\3\f\3\f\7\f\u00c8\n\f\f\f\16\f\u00cb\13\f\3"+
		"\f\6\f\u00ce\n\f\r\f\16\f\u00cf\3\f\3\f\3\r\3\r\5\r\u00d6\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\7\16\u00dd\n\16\f\16\16\16\u00e0\13\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00ea\n\20\3\21\3\21\7\21\u00ee\n\21\f"+
		"\21\16\21\u00f1\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0135\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014d\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u015e\n\22\f\22\16\22\u0161\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u018a\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u01a4\n\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\7\26\u01ad\n\26\f\26\16\26\u01b0\13\26\5\26\u01b2\n\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\2\3"+
		"\"\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\2\u01e8"+
		"\2\66\3\2\2\2\4=\3\2\2\2\6A\3\2\2\2\bI\3\2\2\2\nM\3\2\2\2\fR\3\2\2\2\16"+
		"]\3\2\2\2\20\u0088\3\2\2\2\22\u00a6\3\2\2\2\24\u00c1\3\2\2\2\26\u00c5"+
		"\3\2\2\2\30\u00d3\3\2\2\2\32\u00d9\3\2\2\2\34\u00e1\3\2\2\2\36\u00e9\3"+
		"\2\2\2 \u0134\3\2\2\2\"\u014c\3\2\2\2$\u0189\3\2\2\2&\u01a3\3\2\2\2(\u01a5"+
		"\3\2\2\2*\u01a8\3\2\2\2,\u01b5\3\2\2\2.\u01b9\3\2\2\2\60\u01bb\3\2\2\2"+
		"\62\u01bd\3\2\2\2\64\u01bf\3\2\2\2\66:\5\4\3\2\679\5\6\4\28\67\3\2\2\2"+
		"9<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\3\3\2\2\2<:\3\2\2\2=>\7\b\2\2>?\7-\2\2"+
		"?@\5\b\5\2@\5\3\2\2\2AB\7\b\2\2BE\7-\2\2CD\7\21\2\2DF\5\36\20\2EC\3\2"+
		"\2\2EF\3\2\2\2FG\3\2\2\2GH\5\16\b\2H\7\3\2\2\2IJ\7\r\2\2JK\5\n\6\2KL\7"+
		"\20\2\2L\t\3\2\2\2MN\5\f\7\2NO\7\r\2\2OP\5 \21\2PQ\7\20\2\2Q\13\3\2\2"+
		"\2RS\7#\2\2ST\7%\2\2TU\7\f\2\2UV\7\3\2\2VW\7\25\2\2WX\7!\2\2XY\7\36\2"+
		"\2YZ\7\"\2\2Z[\7-\2\2[\\\7\'\2\2\\\r\3\2\2\2]a\7\r\2\2^`\5\20\t\2_^\3"+
		"\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\5\24\13\2e"+
		"d\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\20\2\2"+
		"k\17\3\2\2\2lm\5\36\20\2mn\7-\2\2no\7\13\2\2o\u0089\3\2\2\2pq\5\36\20"+
		"\2qr\7-\2\2rs\7\17\2\2st\7-\2\2tu\7\13\2\2u\u0089\3\2\2\2vw\5\36\20\2"+
		"wx\7-\2\2xy\7\17\2\2yz\7+\2\2z{\7\13\2\2{\u0089\3\2\2\2|}\5\36\20\2}~"+
		"\7-\2\2~\177\7\17\2\2\177\u0080\7*\2\2\u0080\u0081\7\13\2\2\u0081\u0089"+
		"\3\2\2\2\u0082\u0083\5\36\20\2\u0083\u0084\7-\2\2\u0084\u0085\7\17\2\2"+
		"\u0085\u0086\7,\2\2\u0086\u0087\7\13\2\2\u0087\u0089\3\2\2\2\u0088l\3"+
		"\2\2\2\u0088p\3\2\2\2\u0088v\3\2\2\2\u0088|\3\2\2\2\u0088\u0082\3\2\2"+
		"\2\u0089\21\3\2\2\2\u008a\u008b\5\36\20\2\u008b\u008c\7-\2\2\u008c\u008d"+
		"\7\13\2\2\u008d\u00a7\3\2\2\2\u008e\u008f\5\36\20\2\u008f\u0090\7-\2\2"+
		"\u0090\u0091\7\17\2\2\u0091\u0092\7-\2\2\u0092\u0093\7\13\2\2\u0093\u00a7"+
		"\3\2\2\2\u0094\u0095\5\36\20\2\u0095\u0096\7-\2\2\u0096\u0097\7\17\2\2"+
		"\u0097\u0098\7+\2\2\u0098\u0099\7\13\2\2\u0099\u00a7\3\2\2\2\u009a\u009b"+
		"\5\36\20\2\u009b\u009c\7-\2\2\u009c\u009d\7\17\2\2\u009d\u009e\7*\2\2"+
		"\u009e\u009f\7\13\2\2\u009f\u00a7\3\2\2\2\u00a0\u00a1\5\36\20\2\u00a1"+
		"\u00a2\7-\2\2\u00a2\u00a3\7\17\2\2\u00a3\u00a4\7,\2\2\u00a4\u00a5\7\13"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u008a\3\2\2\2\u00a6\u008e\3\2\2\2\u00a6"+
		"\u0094\3\2\2\2\u00a6\u009a\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a7\23\3\2\2"+
		"\2\u00a8\u00a9\7#\2\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\7-\2\2\u00ab\u00ac"+
		"\5\30\r\2\u00ac\u00c2\3\2\2\2\u00ad\u00ae\5\36\20\2\u00ae\u00af\7-\2\2"+
		"\u00af\u00b0\5\30\r\2\u00b0\u00b1\b\13\1\2\u00b1\u00c2\3\2\2\2\u00b2\u00b3"+
		"\7#\2\2\u00b3\u00b4\7-\2\2\u00b4\u00b5\5\30\r\2\u00b5\u00b6\b\13\1\2\u00b6"+
		"\u00c2\3\2\2\2\u00b7\u00b8\7#\2\2\u00b8\u00b9\5\36\20\2\u00b9\u00ba\5"+
		"\30\r\2\u00ba\u00bb\b\13\1\2\u00bb\u00c2\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd"+
		"\u00be\5\36\20\2\u00be\u00bf\7-\2\2\u00bf\u00c0\b\13\1\2\u00c0\u00c2\3"+
		"\2\2\2\u00c1\u00a8\3\2\2\2\u00c1\u00ad\3\2\2\2\u00c1\u00b2\3\2\2\2\u00c1"+
		"\u00b7\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\5\26"+
		"\f\2\u00c4\25\3\2\2\2\u00c5\u00c9\7\r\2\2\u00c6\u00c8\5\22\n\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\5 \21\2\u00cd\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\7\20\2\2\u00d2\27\3\2\2\2\u00d3\u00d5\7\25"+
		"\2\2\u00d4\u00d6\5\32\16\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\7\'\2\2\u00d8\31\3\2\2\2\u00d9\u00de\5\34\17"+
		"\2\u00da\u00db\7\30\2\2\u00db\u00dd\5\34\17\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\33\3\2\2"+
		"\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\5\36\20\2\u00e2\u00e3\7-\2\2\u00e3"+
		"\35\3\2\2\2\u00e4\u00ea\5,\27\2\u00e5\u00ea\5\60\31\2\u00e6\u00ea\5\62"+
		"\32\2\u00e7\u00ea\5.\30\2\u00e8\u00ea\5\64\33\2\u00e9\u00e4\3\2\2\2\u00e9"+
		"\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2"+
		"\2\2\u00ea\37\3\2\2\2\u00eb\u00ef\7\r\2\2\u00ec\u00ee\5 \21\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u0135\7\20\2\2\u00f3\u00f4\7"+
		"\22\2\2\u00f4\u00f5\7\25\2\2\u00f5\u00f6\5$\23\2\u00f6\u00f7\7\'\2\2\u00f7"+
		"\u00f8\5 \21\2\u00f8\u00f9\7&\2\2\u00f9\u00fa\5 \21\2\u00fa\u0135\3\2"+
		"\2\2\u00fb\u00fc\7\22\2\2\u00fc\u00fd\7\25\2\2\u00fd\u00fe\5$\23\2\u00fe"+
		"\u00ff\7\'\2\2\u00ff\u0100\5 \21\2\u0100\u0135\3\2\2\2\u0101\u0102\7\n"+
		"\2\2\u0102\u0103\7\25\2\2\u0103\u0104\5$\23\2\u0104\u0105\7\'\2\2\u0105"+
		"\u0106\5 \21\2\u0106\u0135\3\2\2\2\u0107\u0108\7\34\2\2\u0108\u0109\7"+
		"\25\2\2\u0109\u010a\5\"\22\2\u010a\u010b\7\'\2\2\u010b\u010c\7\13\2\2"+
		"\u010c\u0135\3\2\2\2\u010d\u010e\7-\2\2\u010e\u010f\7\17\2\2\u010f\u0110"+
		"\5\"\22\2\u0110\u0111\7\13\2\2\u0111\u0135\3\2\2\2\u0112\u0113\7-\2\2"+
		"\u0113\u0114\7\17\2\2\u0114\u0115\5$\23\2\u0115\u0116\7\13\2\2\u0116\u0135"+
		"\3\2\2\2\u0117\u0118\7-\2\2\u0118\u0119\7\17\2\2\u0119\u011a\5&\24\2\u011a"+
		"\u011b\7\13\2\2\u011b\u0135\3\2\2\2\u011c\u011d\7-\2\2\u011d\u011e\7\36"+
		"\2\2\u011e\u011f\5\"\22\2\u011f\u0120\7\"\2\2\u0120\u0121\7\17\2\2\u0121"+
		"\u0122\5\"\22\2\u0122\u0123\7\13\2\2\u0123\u0135\3\2\2\2\u0124\u0125\7"+
		"\7\2\2\u0125\u0126\5\"\22\2\u0126\u0127\7\13\2\2\u0127\u0135\3\2\2\2\u0128"+
		"\u0129\7\7\2\2\u0129\u012a\5(\25\2\u012a\u012b\7\13\2\2\u012b\u0135\3"+
		"\2\2\2\u012c\u012d\7\33\2\2\u012d\u012e\5$\23\2\u012e\u012f\7\23\2\2\u012f"+
		"\u0130\5*\26\2\u0130\u0131\7\35\2\2\u0131\u0132\5\"\22\2\u0132\u0133\7"+
		"\13\2\2\u0133\u0135\3\2\2\2\u0134\u00eb\3\2\2\2\u0134\u00f3\3\2\2\2\u0134"+
		"\u00fb\3\2\2\2\u0134\u0101\3\2\2\2\u0134\u0107\3\2\2\2\u0134\u010d\3\2"+
		"\2\2\u0134\u0112\3\2\2\2\u0134\u0117\3\2\2\2\u0134\u011c\3\2\2\2\u0134"+
		"\u0124\3\2\2\2\u0134\u0128\3\2\2\2\u0134\u012c\3\2\2\2\u0135!\3\2\2\2"+
		"\u0136\u0137\b\22\1\2\u0137\u0138\7)\2\2\u0138\u014d\5\"\22\f\u0139\u013a"+
		"\7\6\2\2\u013a\u013b\7\24\2\2\u013b\u013c\7\36\2\2\u013c\u013d\5\"\22"+
		"\2\u013d\u013e\7\"\2\2\u013e\u014d\3\2\2\2\u013f\u0140\7\6\2\2\u0140\u0141"+
		"\7-\2\2\u0141\u0142\7\25\2\2\u0142\u014d\7\'\2\2\u0143\u014d\7+\2\2\u0144"+
		"\u014d\7*\2\2\u0145\u014d\7,\2\2\u0146\u014d\7-\2\2\u0147\u014d\7\27\2"+
		"\2\u0148\u0149\7\25\2\2\u0149\u014a\5\"\22\2\u014a\u014b\7\'\2\2\u014b"+
		"\u014d\3\2\2\2\u014c\u0136\3\2\2\2\u014c\u0139\3\2\2\2\u014c\u013f\3\2"+
		"\2\2\u014c\u0143\3\2\2\2\u014c\u0144\3\2\2\2\u014c\u0145\3\2\2\2\u014c"+
		"\u0146\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u0148\3\2\2\2\u014d\u015f\3\2"+
		"\2\2\u014e\u014f\f\t\2\2\u014f\u0150\7\17\2\2\u0150\u015e\5\"\22\n\u0151"+
		"\u0152\f\17\2\2\u0152\u0153\7\36\2\2\u0153\u0154\5\"\22\2\u0154\u0155"+
		"\7\"\2\2\u0155\u015e\3\2\2\2\u0156\u0157\f\16\2\2\u0157\u0158\7\31\2\2"+
		"\u0158\u015e\7\4\2\2\u0159\u015a\f\r\2\2\u015a\u015b\7\31\2\2\u015b\u015c"+
		"\7-\2\2\u015c\u015e\5*\26\2\u015d\u014e\3\2\2\2\u015d\u0151\3\2\2\2\u015d"+
		"\u0156\3\2\2\2\u015d\u0159\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160#\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163"+
		"\7$\2\2\u0163\u018a\5\"\22\2\u0164\u0165\5\"\22\2\u0165\u0166\7 \2\2\u0166"+
		"\u0167\5\"\22\2\u0167\u018a\3\2\2\2\u0168\u0169\5\"\22\2\u0169\u016a\7"+
		"\37\2\2\u016a\u016b\5\"\22\2\u016b\u018a\3\2\2\2\u016c\u016d\5\"\22\2"+
		"\u016d\u016e\7\16\2\2\u016e\u016f\5\"\22\2\u016f\u018a\3\2\2\2\u0170\u0171"+
		"\5\"\22\2\u0171\u0172\7\t\2\2\u0172\u0173\5\"\22\2\u0173\u018a\3\2\2\2"+
		"\u0174\u0175\5\"\22\2\u0175\u0176\7 \2\2\u0176\u0177\5$\23\2\u0177\u018a"+
		"\3\2\2\2\u0178\u0179\5\"\22\2\u0179\u017a\7\37\2\2\u017a\u017b\5$\23\2"+
		"\u017b\u018a\3\2\2\2\u017c\u017d\5\"\22\2\u017d\u017e\7\16\2\2\u017e\u017f"+
		"\5$\23\2\u017f\u018a\3\2\2\2\u0180\u0181\5\"\22\2\u0181\u0182\7\t\2\2"+
		"\u0182\u0183\5$\23\2\u0183\u018a\3\2\2\2\u0184\u0185\7\25\2\2\u0185\u0186"+
		"\5$\23\2\u0186\u0187\7\'\2\2\u0187\u018a\3\2\2\2\u0188\u018a\7-\2\2\u0189"+
		"\u0162\3\2\2\2\u0189\u0164\3\2\2\2\u0189\u0168\3\2\2\2\u0189\u016c\3\2"+
		"\2\2\u0189\u0170\3\2\2\2\u0189\u0174\3\2\2\2\u0189\u0178\3\2\2\2\u0189"+
		"\u017c\3\2\2\2\u0189\u0180\3\2\2\2\u0189\u0184\3\2\2\2\u0189\u0188\3\2"+
		"\2\2\u018a%\3\2\2\2\u018b\u018c\5\"\22\2\u018c\u018d\7(\2\2\u018d\u018e"+
		"\5\"\22\2\u018e\u01a4\3\2\2\2\u018f\u0190\5\"\22\2\u0190\u0191\7)\2\2"+
		"\u0191\u0192\5\"\22\2\u0192\u01a4\3\2\2\2\u0193\u0194\5\"\22\2\u0194\u0195"+
		"\7\26\2\2\u0195\u0196\5\"\22\2\u0196\u01a4\3\2\2\2\u0197\u0198\5\"\22"+
		"\2\u0198\u0199\7(\2\2\u0199\u019a\5&\24\2\u019a\u01a4\3\2\2\2\u019b\u019c"+
		"\5\"\22\2\u019c\u019d\7)\2\2\u019d\u019e\5&\24\2\u019e\u01a4\3\2\2\2\u019f"+
		"\u01a0\5\"\22\2\u01a0\u01a1\7\26\2\2\u01a1\u01a2\5&\24\2\u01a2\u01a4\3"+
		"\2\2\2\u01a3\u018b\3\2\2\2\u01a3\u018f\3\2\2\2\u01a3\u0193\3\2\2\2\u01a3"+
		"\u0197\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019f\3\2\2\2\u01a4\'\3\2\2\2"+
		"\u01a5\u01a6\7-\2\2\u01a6\u01a7\5*\26\2\u01a7)\3\2\2\2\u01a8\u01b1\7\25"+
		"\2\2\u01a9\u01ae\5\"\22\2\u01aa\u01ab\7\30\2\2\u01ab\u01ad\5\"\22\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01a9\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\7\'\2\2\u01b4+\3\2\2\2"+
		"\u01b5\u01b6\7\24\2\2\u01b6\u01b7\7\36\2\2\u01b7\u01b8\7\"\2\2\u01b8-"+
		"\3\2\2\2\u01b9\u01ba\7\5\2\2\u01ba/\3\2\2\2\u01bb\u01bc\7\32\2\2\u01bc"+
		"\61\3\2\2\2\u01bd\u01be\7\24\2\2\u01be\63\3\2\2\2\u01bf\u01c0\7-\2\2\u01c0"+
		"\65\3\2\2\2\27:Eag\u0088\u00a6\u00c1\u00c9\u00cf\u00d5\u00de\u00e9\u00ef"+
		"\u0134\u014c\u015d\u015f\u0189\u01a3\u01ae\u01b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}