// Generated from NossaLinguagem.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, CHAR=41, INT=42, QUANTUM=43, BOOL=44, ID=45, WS=46, 
		COMMENT=47, LINE_COMMENT=48;
	public static final int
		RULE_goal = 0, RULE_mainClassDeclaration = 1, RULE_classDeclaration = 2, 
		RULE_mainClassBody = 3, RULE_mainMethod = 4, RULE_mainMethodDeclaration = 5, 
		RULE_classBody = 6, RULE_fieldDeclaration = 7, RULE_varDeclaration = 8, 
		RULE_methodDeclaration = 9, RULE_methodBody = 10, RULE_formalParameters = 11, 
		RULE_formalParameterList = 12, RULE_formalParameter = 13, RULE_type = 14, 
		RULE_statement = 15, RULE_expression = 16, RULE_booleanExpression = 17, 
		RULE_mathExpression = 18, RULE_functionCall = 19, RULE_methodArgumentList = 20, 
		RULE_intArrayType = 21, RULE_charType = 22, RULE_booleanType = 23, RULE_intType = 24, 
		RULE_quantumType = 25;
	public static final String[] ruleNames = {
		"goal", "mainClassDeclaration", "classDeclaration", "mainClassBody", "mainMethod", 
		"mainMethodDeclaration", "classBody", "fieldDeclaration", "varDeclaration", 
		"methodDeclaration", "methodBody", "formalParameters", "formalParameterList", 
		"formalParameter", "type", "statement", "expression", "booleanExpression", 
		"mathExpression", "functionCall", "methodArgumentList", "intArrayType", 
		"charType", "booleanType", "intType", "quantumType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'extends'", "'{'", "'}'", "'public'", "'static'", "'void'", 
		"'main'", "'('", "'String'", "'['", "']'", "')'", "';'", "'='", "','", 
		"'if'", "'else'", "'while'", "'System.out.println'", "'return'", "'recur'", 
		"'?'", "':'", "'.'", "'length'", "'-'", "'new'", "'int'", "'this'", "'!'", 
		"'<'", "'=='", "'&&'", "'||'", "'+'", "'*'", "'char'", "'boolean'", "'quantum'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "CHAR", "INT", "QUANTUM", "BOOL", "ID", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "NossaLinguagem.g4"; }

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
		public MainClassDeclarationContext mainClassDeclaration() {
			return getRuleContext(MainClassDeclarationContext.class,0);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
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
			setState(52);
			mainClassDeclaration();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(53);
				classDeclaration();
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
			setState(59);
			match(T__0);
			setState(60);
			match(ID);
			setState(61);
			mainClassBody();
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
			setState(63);
			match(T__0);
			setState(64);
			match(ID);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(65);
				match(T__1);
				setState(66);
				type();
				}
			}

			setState(69);
			classBody();
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
			setState(71);
			match(T__2);
			setState(72);
			mainMethod();
			setState(73);
			match(T__3);
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
			setState(75);
			mainMethodDeclaration();
			setState(76);
			match(T__2);
			setState(77);
			statement();
			setState(78);
			match(T__3);
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
			setState(80);
			match(T__4);
			setState(81);
			match(T__5);
			setState(82);
			match(T__6);
			setState(83);
			match(T__7);
			setState(84);
			match(T__8);
			setState(85);
			match(T__9);
			setState(86);
			match(T__10);
			setState(87);
			match(T__11);
			setState(88);
			match(ID);
			setState(89);
			match(T__12);
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
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
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
			setState(91);
			match(T__2);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					fieldDeclaration();
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__28) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << ID))) != 0)) {
				{
				{
				setState(98);
				methodDeclaration();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__3);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(NossaLinguagemParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NossaLinguagemParser.ID, i);
		}
		public TerminalNode INT() { return getToken(NossaLinguagemParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(NossaLinguagemParser.CHAR, 0); }
		public TerminalNode QUANTUM() { return getToken(NossaLinguagemParser.QUANTUM, 0); }
		public TerminalNode BOOL() { return getToken(NossaLinguagemParser.BOOL, 0); }
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
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				type();
				setState(107);
				match(ID);
				setState(108);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				type();
				setState(111);
				match(ID);
				setState(112);
				match(T__14);
				setState(113);
				match(ID);
				setState(114);
				match(T__13);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				type();
				setState(117);
				match(ID);
				setState(118);
				match(T__14);
				setState(119);
				match(INT);
				setState(120);
				match(T__13);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				type();
				setState(123);
				match(ID);
				setState(124);
				match(T__14);
				setState(125);
				match(CHAR);
				setState(126);
				match(T__13);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				type();
				setState(129);
				match(ID);
				setState(130);
				match(T__14);
				setState(131);
				match(QUANTUM);
				setState(132);
				match(T__13);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				type();
				setState(135);
				match(ID);
				setState(136);
				match(T__14);
				setState(137);
				match(BOOL);
				setState(138);
				match(T__13);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(NossaLinguagemParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NossaLinguagemParser.ID, i);
		}
		public TerminalNode INT() { return getToken(NossaLinguagemParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(NossaLinguagemParser.CHAR, 0); }
		public TerminalNode QUANTUM() { return getToken(NossaLinguagemParser.QUANTUM, 0); }
		public TerminalNode BOOL() { return getToken(NossaLinguagemParser.BOOL, 0); }
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				type();
				setState(143);
				match(ID);
				setState(144);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				type();
				setState(147);
				match(ID);
				setState(148);
				match(T__14);
				setState(149);
				match(ID);
				setState(150);
				match(T__13);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				type();
				setState(153);
				match(ID);
				setState(154);
				match(T__14);
				setState(155);
				match(INT);
				setState(156);
				match(T__13);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				type();
				setState(159);
				match(ID);
				setState(160);
				match(T__14);
				setState(161);
				match(CHAR);
				setState(162);
				match(T__13);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				type();
				setState(165);
				match(ID);
				setState(166);
				match(T__14);
				setState(167);
				match(QUANTUM);
				setState(168);
				match(T__13);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				type();
				setState(171);
				match(ID);
				setState(172);
				match(T__14);
				setState(173);
				match(BOOL);
				setState(174);
				match(T__13);
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
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
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
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(178);
				match(T__4);
				setState(179);
				type();
				setState(180);
				match(ID);
				setState(181);
				formalParameters();
				}
				break;
			case 2:
				{
				setState(183);
				type();
				setState(184);
				match(ID);
				setState(185);
				formalParameters();
				notifyErrorListeners("method declaration without public");
				}
				break;
			case 3:
				{
				setState(188);
				match(T__4);
				setState(189);
				match(ID);
				setState(190);
				formalParameters();
				notifyErrorListeners("method declaration without return type");
				}
				break;
			case 4:
				{
				setState(193);
				match(T__4);
				setState(194);
				type();
				setState(195);
				formalParameters();
				notifyErrorListeners("method declaration without method name");
				}
				break;
			case 5:
				{
				setState(198);
				match(T__4);
				setState(199);
				type();
				setState(200);
				match(ID);
				notifyErrorListeners("method declaration without argument list");
				}
				break;
			}
			setState(205);
			methodBody();
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
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(207);
			match(T__2);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					varDeclaration();
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				statement();
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0) );
			setState(219);
			match(T__3);
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
			setState(221);
			match(T__8);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << ID))) != 0)) {
				{
				setState(222);
				formalParameterList();
				}
			}

			setState(225);
			match(T__12);
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
			setState(227);
			formalParameter();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(228);
				match(T__15);
				setState(229);
				formalParameter();
				}
				}
				setState(234);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
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
			setState(235);
			type();
			setState(236);
			match(ID);
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
		public IntArrayTypeContext intArrayType() {
			return getRuleContext(IntArrayTypeContext.class,0);
		}
		public BooleanTypeContext booleanType() {
			return getRuleContext(BooleanTypeContext.class,0);
		}
		public QuantumTypeContext quantumType() {
			return getRuleContext(QuantumTypeContext.class,0);
		}
		public IntTypeContext intType() {
			return getRuleContext(IntTypeContext.class,0);
		}
		public CharTypeContext charType() {
			return getRuleContext(CharTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				intArrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				booleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				quantumType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				intType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				charType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				match(ID);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new NestedStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T__2);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
					{
					{
					setState(247);
					statement();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(T__16);
				setState(255);
				match(T__8);
				setState(256);
				booleanExpression();
				setState(257);
				match(T__12);
				setState(258);
				statement();
				setState(259);
				match(T__17);
				setState(260);
				statement();
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(T__16);
				setState(263);
				match(T__8);
				setState(264);
				booleanExpression();
				setState(265);
				match(T__12);
				setState(266);
				statement();
				}
				break;
			case 4:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(T__18);
				setState(269);
				match(T__8);
				setState(270);
				booleanExpression();
				setState(271);
				match(T__12);
				setState(272);
				statement();
				}
				break;
			case 5:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				match(T__19);
				setState(275);
				match(T__8);
				setState(276);
				expression(0);
				setState(277);
				match(T__12);
				setState(278);
				match(T__13);
				}
				break;
			case 6:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(280);
				match(ID);
				setState(281);
				match(T__14);
				setState(282);
				expression(0);
				setState(283);
				match(T__13);
				}
				break;
			case 7:
				_localctx = new AssignStatement2Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				match(ID);
				setState(286);
				match(T__14);
				setState(287);
				booleanExpression();
				setState(288);
				match(T__13);
				}
				break;
			case 8:
				_localctx = new AssignStatement3Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(290);
				match(ID);
				setState(291);
				match(T__14);
				setState(292);
				mathExpression();
				setState(293);
				match(T__13);
				}
				break;
			case 9:
				_localctx = new ArrayAssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(295);
				match(ID);
				setState(296);
				match(T__10);
				setState(297);
				expression(0);
				setState(298);
				match(T__11);
				setState(299);
				match(T__14);
				setState(300);
				expression(0);
				setState(301);
				match(T__13);
				}
				break;
			case 10:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(303);
				match(T__20);
				setState(304);
				expression(0);
				setState(305);
				match(T__13);
				}
				break;
			case 11:
				_localctx = new ReturnStatement2Context(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(307);
				match(T__20);
				setState(308);
				functionCall();
				setState(309);
				match(T__13);
				}
				break;
			case 12:
				_localctx = new RecurStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(311);
				match(T__21);
				setState(312);
				booleanExpression();
				setState(313);
				match(T__22);
				setState(314);
				methodArgumentList();
				setState(315);
				match(T__23);
				setState(316);
				expression(0);
				setState(317);
				match(T__13);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public MethodArgumentListContext methodArgumentList() {
			return getRuleContext(MethodArgumentListContext.class,0);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new NegExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(322);
				match(T__26);
				setState(323);
				expression(11);
				}
				break;
			case 2:
				{
				_localctx = new ArrayInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324);
				match(T__27);
				setState(325);
				match(T__28);
				setState(326);
				match(T__10);
				setState(327);
				expression(0);
				setState(328);
				match(T__11);
				}
				break;
			case 3:
				{
				_localctx = new ObjectInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(330);
				match(T__27);
				setState(331);
				match(ID);
				setState(332);
				match(T__8);
				setState(333);
				match(T__12);
				}
				break;
			case 4:
				{
				_localctx = new IntLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new QuantumExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335);
				match(QUANTUM);
				}
				break;
			case 6:
				{
				_localctx = new CharExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				match(CHAR);
				}
				break;
			case 7:
				{
				_localctx = new BooleanLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				match(BOOL);
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(339);
				match(T__29);
				}
				break;
			case 10:
				{
				_localctx = new ParenExpression2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				match(T__8);
				setState(341);
				expression(0);
				setState(342);
				match(T__12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new AtrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(346);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(347);
						match(T__14);
						setState(348);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(349);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(350);
						match(T__10);
						setState(351);
						expression(0);
						setState(352);
						match(T__11);
						}
						break;
					case 3:
						{
						_localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(354);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(355);
						match(T__24);
						setState(356);
						match(T__25);
						}
						break;
					case 4:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(358);
						match(T__24);
						setState(359);
						match(ID);
						setState(360);
						methodArgumentList();
						}
						break;
					}
					} 
				}
				setState(365);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
	public static class EqExpressionContext extends BooleanExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
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

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_booleanExpression);
		try {
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(T__30);
				setState(367);
				expression(0);
				}
				break;
			case 2:
				_localctx = new LtExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				expression(0);
				setState(369);
				match(T__31);
				setState(370);
				expression(0);
				}
				break;
			case 3:
				_localctx = new EqExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				expression(0);
				setState(373);
				match(T__32);
				setState(374);
				expression(0);
				}
				break;
			case 4:
				_localctx = new AndExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				expression(0);
				setState(377);
				match(T__33);
				setState(378);
				expression(0);
				}
				break;
			case 5:
				_localctx = new AndExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				expression(0);
				setState(381);
				match(T__34);
				setState(382);
				expression(0);
				}
				break;
			case 6:
				_localctx = new LtExpression2Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(384);
				expression(0);
				setState(385);
				match(T__31);
				setState(386);
				booleanExpression();
				}
				break;
			case 7:
				_localctx = new EqExpression2Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(388);
				expression(0);
				setState(389);
				match(T__32);
				setState(390);
				booleanExpression();
				}
				break;
			case 8:
				_localctx = new AndExpression2Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(392);
				expression(0);
				setState(393);
				match(T__33);
				setState(394);
				booleanExpression();
				}
				break;
			case 9:
				_localctx = new AndExpression2Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(396);
				expression(0);
				setState(397);
				match(T__34);
				setState(398);
				booleanExpression();
				}
				break;
			case 10:
				_localctx = new ParenExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(400);
				match(T__8);
				setState(401);
				booleanExpression();
				setState(402);
				match(T__12);
				}
				break;
			case 11:
				_localctx = new IDExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(404);
				match(ID);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
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
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new AddExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				expression(0);
				setState(408);
				match(T__35);
				setState(409);
				expression(0);
				}
				break;
			case 2:
				_localctx = new SubExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				expression(0);
				setState(412);
				match(T__26);
				setState(413);
				expression(0);
				}
				break;
			case 3:
				_localctx = new MulExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				expression(0);
				setState(416);
				match(T__36);
				setState(417);
				expression(0);
				}
				break;
			case 4:
				_localctx = new AddExpression2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				expression(0);
				setState(420);
				match(T__35);
				setState(421);
				mathExpression();
				}
				break;
			case 5:
				_localctx = new SubExpression2Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(423);
				expression(0);
				setState(424);
				match(T__26);
				setState(425);
				mathExpression();
				}
				break;
			case 6:
				_localctx = new MulExpression2Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(427);
				expression(0);
				setState(428);
				match(T__36);
				setState(429);
				mathExpression();
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
			setState(433);
			match(ID);
			setState(434);
			methodArgumentList();
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			setState(436);
			match(T__8);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << CHAR) | (1L << INT) | (1L << QUANTUM) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				setState(437);
				expression(0);
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(438);
					match(T__15);
					setState(439);
					expression(0);
					}
					}
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(447);
			match(T__12);
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
			setState(449);
			match(T__28);
			setState(450);
			match(T__10);
			setState(451);
			match(T__11);
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
			setState(453);
			match(T__37);
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
			setState(455);
			match(T__38);
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
			setState(457);
			match(T__28);
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
		enterRule(_localctx, 50, RULE_quantumType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(T__39);
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
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u01d0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\5\4F\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b`\n\b\f\b\16\bc"+
		"\13\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b3\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ce\n\13\3\13"+
		"\3\13\3\f\3\f\7\f\u00d4\n\f\f\f\16\f\u00d7\13\f\3\f\6\f\u00da\n\f\r\f"+
		"\16\f\u00db\3\f\3\f\3\r\3\r\5\r\u00e2\n\r\3\r\3\r\3\16\3\16\3\16\7\16"+
		"\u00e9\n\16\f\16\16\16\u00ec\13\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00f7\n\20\3\21\3\21\7\21\u00fb\n\21\f\21\16\21\u00fe"+
		"\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0142\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u015b\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u016c\n\22\f\22\16\22\u016f\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0198\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u01b2\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26"+
		"\u01bb\n\26\f\26\16\26\u01be\13\26\5\26\u01c0\n\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\2\3\"\34\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\2\2\u01fa\2\66\3"+
		"\2\2\2\4=\3\2\2\2\6A\3\2\2\2\bI\3\2\2\2\nM\3\2\2\2\fR\3\2\2\2\16]\3\2"+
		"\2\2\20\u008e\3\2\2\2\22\u00b2\3\2\2\2\24\u00cd\3\2\2\2\26\u00d1\3\2\2"+
		"\2\30\u00df\3\2\2\2\32\u00e5\3\2\2\2\34\u00ed\3\2\2\2\36\u00f6\3\2\2\2"+
		" \u0141\3\2\2\2\"\u015a\3\2\2\2$\u0197\3\2\2\2&\u01b1\3\2\2\2(\u01b3\3"+
		"\2\2\2*\u01b6\3\2\2\2,\u01c3\3\2\2\2.\u01c7\3\2\2\2\60\u01c9\3\2\2\2\62"+
		"\u01cb\3\2\2\2\64\u01cd\3\2\2\2\66:\5\4\3\2\679\5\6\4\28\67\3\2\2\29<"+
		"\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\3\3\2\2\2<:\3\2\2\2=>\7\3\2\2>?\7/\2\2?"+
		"@\5\b\5\2@\5\3\2\2\2AB\7\3\2\2BE\7/\2\2CD\7\4\2\2DF\5\36\20\2EC\3\2\2"+
		"\2EF\3\2\2\2FG\3\2\2\2GH\5\16\b\2H\7\3\2\2\2IJ\7\5\2\2JK\5\n\6\2KL\7\6"+
		"\2\2L\t\3\2\2\2MN\5\f\7\2NO\7\5\2\2OP\5 \21\2PQ\7\6\2\2Q\13\3\2\2\2RS"+
		"\7\7\2\2ST\7\b\2\2TU\7\t\2\2UV\7\n\2\2VW\7\13\2\2WX\7\f\2\2XY\7\r\2\2"+
		"YZ\7\16\2\2Z[\7/\2\2[\\\7\17\2\2\\\r\3\2\2\2]a\7\5\2\2^`\5\20\t\2_^\3"+
		"\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\5\24\13\2e"+
		"d\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\6\2\2"+
		"k\17\3\2\2\2lm\5\36\20\2mn\7/\2\2no\7\20\2\2o\u008f\3\2\2\2pq\5\36\20"+
		"\2qr\7/\2\2rs\7\21\2\2st\7/\2\2tu\7\20\2\2u\u008f\3\2\2\2vw\5\36\20\2"+
		"wx\7/\2\2xy\7\21\2\2yz\7,\2\2z{\7\20\2\2{\u008f\3\2\2\2|}\5\36\20\2}~"+
		"\7/\2\2~\177\7\21\2\2\177\u0080\7+\2\2\u0080\u0081\7\20\2\2\u0081\u008f"+
		"\3\2\2\2\u0082\u0083\5\36\20\2\u0083\u0084\7/\2\2\u0084\u0085\7\21\2\2"+
		"\u0085\u0086\7-\2\2\u0086\u0087\7\20\2\2\u0087\u008f\3\2\2\2\u0088\u0089"+
		"\5\36\20\2\u0089\u008a\7/\2\2\u008a\u008b\7\21\2\2\u008b\u008c\7.\2\2"+
		"\u008c\u008d\7\20\2\2\u008d\u008f\3\2\2\2\u008el\3\2\2\2\u008ep\3\2\2"+
		"\2\u008ev\3\2\2\2\u008e|\3\2\2\2\u008e\u0082\3\2\2\2\u008e\u0088\3\2\2"+
		"\2\u008f\21\3\2\2\2\u0090\u0091\5\36\20\2\u0091\u0092\7/\2\2\u0092\u0093"+
		"\7\20\2\2\u0093\u00b3\3\2\2\2\u0094\u0095\5\36\20\2\u0095\u0096\7/\2\2"+
		"\u0096\u0097\7\21\2\2\u0097\u0098\7/\2\2\u0098\u0099\7\20\2\2\u0099\u00b3"+
		"\3\2\2\2\u009a\u009b\5\36\20\2\u009b\u009c\7/\2\2\u009c\u009d\7\21\2\2"+
		"\u009d\u009e\7,\2\2\u009e\u009f\7\20\2\2\u009f\u00b3\3\2\2\2\u00a0\u00a1"+
		"\5\36\20\2\u00a1\u00a2\7/\2\2\u00a2\u00a3\7\21\2\2\u00a3\u00a4\7+\2\2"+
		"\u00a4\u00a5\7\20\2\2\u00a5\u00b3\3\2\2\2\u00a6\u00a7\5\36\20\2\u00a7"+
		"\u00a8\7/\2\2\u00a8\u00a9\7\21\2\2\u00a9\u00aa\7-\2\2\u00aa\u00ab\7\20"+
		"\2\2\u00ab\u00b3\3\2\2\2\u00ac\u00ad\5\36\20\2\u00ad\u00ae\7/\2\2\u00ae"+
		"\u00af\7\21\2\2\u00af\u00b0\7.\2\2\u00b0\u00b1\7\20\2\2\u00b1\u00b3\3"+
		"\2\2\2\u00b2\u0090\3\2\2\2\u00b2\u0094\3\2\2\2\u00b2\u009a\3\2\2\2\u00b2"+
		"\u00a0\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b3\23\3\2\2"+
		"\2\u00b4\u00b5\7\7\2\2\u00b5\u00b6\5\36\20\2\u00b6\u00b7\7/\2\2\u00b7"+
		"\u00b8\5\30\r\2\u00b8\u00ce\3\2\2\2\u00b9\u00ba\5\36\20\2\u00ba\u00bb"+
		"\7/\2\2\u00bb\u00bc\5\30\r\2\u00bc\u00bd\b\13\1\2\u00bd\u00ce\3\2\2\2"+
		"\u00be\u00bf\7\7\2\2\u00bf\u00c0\7/\2\2\u00c0\u00c1\5\30\r\2\u00c1\u00c2"+
		"\b\13\1\2\u00c2\u00ce\3\2\2\2\u00c3\u00c4\7\7\2\2\u00c4\u00c5\5\36\20"+
		"\2\u00c5\u00c6\5\30\r\2\u00c6\u00c7\b\13\1\2\u00c7\u00ce\3\2\2\2\u00c8"+
		"\u00c9\7\7\2\2\u00c9\u00ca\5\36\20\2\u00ca\u00cb\7/\2\2\u00cb\u00cc\b"+
		"\13\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00b4\3\2\2\2\u00cd\u00b9\3\2\2\2\u00cd"+
		"\u00be\3\2\2\2\u00cd\u00c3\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\5\26\f\2\u00d0\25\3\2\2\2\u00d1\u00d5\7\5\2\2\u00d2\u00d4"+
		"\5\22\n\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2"+
		"\u00d5\u00d6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da"+
		"\5 \21\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\6\2\2\u00de\27\3\2\2"+
		"\2\u00df\u00e1\7\13\2\2\u00e0\u00e2\5\32\16\2\u00e1\u00e0\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\17\2\2\u00e4\31\3\2\2"+
		"\2\u00e5\u00ea\5\34\17\2\u00e6\u00e7\7\22\2\2\u00e7\u00e9\5\34\17\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\33\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\5\36\20\2\u00ee"+
		"\u00ef\7/\2\2\u00ef\35\3\2\2\2\u00f0\u00f7\5,\27\2\u00f1\u00f7\5\60\31"+
		"\2\u00f2\u00f7\5\64\33\2\u00f3\u00f7\5\62\32\2\u00f4\u00f7\5.\30\2\u00f5"+
		"\u00f7\7/\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f2\3\2"+
		"\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\37\3\2\2\2\u00f8\u00fc\7\5\2\2\u00f9\u00fb\5 \21\2\u00fa\u00f9\3\2\2"+
		"\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0142\7\6\2\2\u0100\u0101\7\23\2\2"+
		"\u0101\u0102\7\13\2\2\u0102\u0103\5$\23\2\u0103\u0104\7\17\2\2\u0104\u0105"+
		"\5 \21\2\u0105\u0106\7\24\2\2\u0106\u0107\5 \21\2\u0107\u0142\3\2\2\2"+
		"\u0108\u0109\7\23\2\2\u0109\u010a\7\13\2\2\u010a\u010b\5$\23\2\u010b\u010c"+
		"\7\17\2\2\u010c\u010d\5 \21\2\u010d\u0142\3\2\2\2\u010e\u010f\7\25\2\2"+
		"\u010f\u0110\7\13\2\2\u0110\u0111\5$\23\2\u0111\u0112\7\17\2\2\u0112\u0113"+
		"\5 \21\2\u0113\u0142\3\2\2\2\u0114\u0115\7\26\2\2\u0115\u0116\7\13\2\2"+
		"\u0116\u0117\5\"\22\2\u0117\u0118\7\17\2\2\u0118\u0119\7\20\2\2\u0119"+
		"\u0142\3\2\2\2\u011a\u011b\7/\2\2\u011b\u011c\7\21\2\2\u011c\u011d\5\""+
		"\22\2\u011d\u011e\7\20\2\2\u011e\u0142\3\2\2\2\u011f\u0120\7/\2\2\u0120"+
		"\u0121\7\21\2\2\u0121\u0122\5$\23\2\u0122\u0123\7\20\2\2\u0123\u0142\3"+
		"\2\2\2\u0124\u0125\7/\2\2\u0125\u0126\7\21\2\2\u0126\u0127\5&\24\2\u0127"+
		"\u0128\7\20\2\2\u0128\u0142\3\2\2\2\u0129\u012a\7/\2\2\u012a\u012b\7\r"+
		"\2\2\u012b\u012c\5\"\22\2\u012c\u012d\7\16\2\2\u012d\u012e\7\21\2\2\u012e"+
		"\u012f\5\"\22\2\u012f\u0130\7\20\2\2\u0130\u0142\3\2\2\2\u0131\u0132\7"+
		"\27\2\2\u0132\u0133\5\"\22\2\u0133\u0134\7\20\2\2\u0134\u0142\3\2\2\2"+
		"\u0135\u0136\7\27\2\2\u0136\u0137\5(\25\2\u0137\u0138\7\20\2\2\u0138\u0142"+
		"\3\2\2\2\u0139\u013a\7\30\2\2\u013a\u013b\5$\23\2\u013b\u013c\7\31\2\2"+
		"\u013c\u013d\5*\26\2\u013d\u013e\7\32\2\2\u013e\u013f\5\"\22\2\u013f\u0140"+
		"\7\20\2\2\u0140\u0142\3\2\2\2\u0141\u00f8\3\2\2\2\u0141\u0100\3\2\2\2"+
		"\u0141\u0108\3\2\2\2\u0141\u010e\3\2\2\2\u0141\u0114\3\2\2\2\u0141\u011a"+
		"\3\2\2\2\u0141\u011f\3\2\2\2\u0141\u0124\3\2\2\2\u0141\u0129\3\2\2\2\u0141"+
		"\u0131\3\2\2\2\u0141\u0135\3\2\2\2\u0141\u0139\3\2\2\2\u0142!\3\2\2\2"+
		"\u0143\u0144\b\22\1\2\u0144\u0145\7\35\2\2\u0145\u015b\5\"\22\r\u0146"+
		"\u0147\7\36\2\2\u0147\u0148\7\37\2\2\u0148\u0149\7\r\2\2\u0149\u014a\5"+
		"\"\22\2\u014a\u014b\7\16\2\2\u014b\u015b\3\2\2\2\u014c\u014d\7\36\2\2"+
		"\u014d\u014e\7/\2\2\u014e\u014f\7\13\2\2\u014f\u015b\7\17\2\2\u0150\u015b"+
		"\7,\2\2\u0151\u015b\7-\2\2\u0152\u015b\7+\2\2\u0153\u015b\7.\2\2\u0154"+
		"\u015b\7/\2\2\u0155\u015b\7 \2\2\u0156\u0157\7\13\2\2\u0157\u0158\5\""+
		"\22\2\u0158\u0159\7\17\2\2\u0159\u015b\3\2\2\2\u015a\u0143\3\2\2\2\u015a"+
		"\u0146\3\2\2\2\u015a\u014c\3\2\2\2\u015a\u0150\3\2\2\2\u015a\u0151\3\2"+
		"\2\2\u015a\u0152\3\2\2\2\u015a\u0153\3\2\2\2\u015a\u0154\3\2\2\2\u015a"+
		"\u0155\3\2\2\2\u015a\u0156\3\2\2\2\u015b\u016d\3\2\2\2\u015c\u015d\f\n"+
		"\2\2\u015d\u015e\7\21\2\2\u015e\u016c\5\"\22\13\u015f\u0160\f\20\2\2\u0160"+
		"\u0161\7\r\2\2\u0161\u0162\5\"\22\2\u0162\u0163\7\16\2\2\u0163\u016c\3"+
		"\2\2\2\u0164\u0165\f\17\2\2\u0165\u0166\7\33\2\2\u0166\u016c\7\34\2\2"+
		"\u0167\u0168\f\16\2\2\u0168\u0169\7\33\2\2\u0169\u016a\7/\2\2\u016a\u016c"+
		"\5*\26\2\u016b\u015c\3\2\2\2\u016b\u015f\3\2\2\2\u016b\u0164\3\2\2\2\u016b"+
		"\u0167\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e#\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7!\2\2\u0171\u0198"+
		"\5\"\22\2\u0172\u0173\5\"\22\2\u0173\u0174\7\"\2\2\u0174\u0175\5\"\22"+
		"\2\u0175\u0198\3\2\2\2\u0176\u0177\5\"\22\2\u0177\u0178\7#\2\2\u0178\u0179"+
		"\5\"\22\2\u0179\u0198\3\2\2\2\u017a\u017b\5\"\22\2\u017b\u017c\7$\2\2"+
		"\u017c\u017d\5\"\22\2\u017d\u0198\3\2\2\2\u017e\u017f\5\"\22\2\u017f\u0180"+
		"\7%\2\2\u0180\u0181\5\"\22\2\u0181\u0198\3\2\2\2\u0182\u0183\5\"\22\2"+
		"\u0183\u0184\7\"\2\2\u0184\u0185\5$\23\2\u0185\u0198\3\2\2\2\u0186\u0187"+
		"\5\"\22\2\u0187\u0188\7#\2\2\u0188\u0189\5$\23\2\u0189\u0198\3\2\2\2\u018a"+
		"\u018b\5\"\22\2\u018b\u018c\7$\2\2\u018c\u018d\5$\23\2\u018d\u0198\3\2"+
		"\2\2\u018e\u018f\5\"\22\2\u018f\u0190\7%\2\2\u0190\u0191\5$\23\2\u0191"+
		"\u0198\3\2\2\2\u0192\u0193\7\13\2\2\u0193\u0194\5$\23\2\u0194\u0195\7"+
		"\17\2\2\u0195\u0198\3\2\2\2\u0196\u0198\7/\2\2\u0197\u0170\3\2\2\2\u0197"+
		"\u0172\3\2\2\2\u0197\u0176\3\2\2\2\u0197\u017a\3\2\2\2\u0197\u017e\3\2"+
		"\2\2\u0197\u0182\3\2\2\2\u0197\u0186\3\2\2\2\u0197\u018a\3\2\2\2\u0197"+
		"\u018e\3\2\2\2\u0197\u0192\3\2\2\2\u0197\u0196\3\2\2\2\u0198%\3\2\2\2"+
		"\u0199\u019a\5\"\22\2\u019a\u019b\7&\2\2\u019b\u019c\5\"\22\2\u019c\u01b2"+
		"\3\2\2\2\u019d\u019e\5\"\22\2\u019e\u019f\7\35\2\2\u019f\u01a0\5\"\22"+
		"\2\u01a0\u01b2\3\2\2\2\u01a1\u01a2\5\"\22\2\u01a2\u01a3\7\'\2\2\u01a3"+
		"\u01a4\5\"\22\2\u01a4\u01b2\3\2\2\2\u01a5\u01a6\5\"\22\2\u01a6\u01a7\7"+
		"&\2\2\u01a7\u01a8\5&\24\2\u01a8\u01b2\3\2\2\2\u01a9\u01aa\5\"\22\2\u01aa"+
		"\u01ab\7\35\2\2\u01ab\u01ac\5&\24\2\u01ac\u01b2\3\2\2\2\u01ad\u01ae\5"+
		"\"\22\2\u01ae\u01af\7\'\2\2\u01af\u01b0\5&\24\2\u01b0\u01b2\3\2\2\2\u01b1"+
		"\u0199\3\2\2\2\u01b1\u019d\3\2\2\2\u01b1\u01a1\3\2\2\2\u01b1\u01a5\3\2"+
		"\2\2\u01b1\u01a9\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b2\'\3\2\2\2\u01b3\u01b4"+
		"\7/\2\2\u01b4\u01b5\5*\26\2\u01b5)\3\2\2\2\u01b6\u01bf\7\13\2\2\u01b7"+
		"\u01bc\5\"\22\2\u01b8\u01b9\7\22\2\2\u01b9\u01bb\5\"\22\2\u01ba\u01b8"+
		"\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01b7\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\7\17\2\2\u01c2+\3\2\2\2\u01c3\u01c4"+
		"\7\37\2\2\u01c4\u01c5\7\r\2\2\u01c5\u01c6\7\16\2\2\u01c6-\3\2\2\2\u01c7"+
		"\u01c8\7(\2\2\u01c8/\3\2\2\2\u01c9\u01ca\7)\2\2\u01ca\61\3\2\2\2\u01cb"+
		"\u01cc\7\37\2\2\u01cc\63\3\2\2\2\u01cd\u01ce\7*\2\2\u01ce\65\3\2\2\2\27"+
		":Eag\u008e\u00b2\u00cd\u00d5\u00db\u00e1\u00ea\u00f6\u00fc\u0141\u015a"+
		"\u016b\u016d\u0197\u01b1\u01bc\u01bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}