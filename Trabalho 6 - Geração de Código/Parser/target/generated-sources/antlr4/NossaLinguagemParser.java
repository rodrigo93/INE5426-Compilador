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
		T__39=1, T__38=2, T__37=3, T__36=4, T__35=5, T__34=6, T__33=7, T__32=8, 
		T__31=9, T__30=10, T__29=11, T__28=12, T__27=13, T__26=14, T__25=15, T__24=16, 
		T__23=17, T__22=18, T__21=19, T__20=20, T__19=21, T__18=22, T__17=23, 
		T__16=24, T__15=25, T__14=26, T__13=27, T__12=28, T__11=29, T__10=30, 
		T__9=31, T__8=32, T__7=33, T__6=34, T__5=35, T__4=36, T__3=37, T__2=38, 
		T__1=39, T__0=40, CHAR=41, INT=42, QUANTUM=43, BOOL=44, ID=45, WS=46, 
		COMMENT=47, LINE_COMMENT=48;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'char'", "'new'", "'return'", "'class'", 
		"'||'", "'while'", "';'", "'void'", "'{'", "'&&'", "'='", "'}'", "'extends'", 
		"'if'", "'?'", "'int'", "'('", "'*'", "'this'", "','", "'.'", "'boolean'", 
		"'recur'", "'System.out.println'", "':'", "'['", "'=='", "'<'", "'String'", 
		"']'", "'public'", "'!'", "'static'", "'else'", "'quantum'", "')'", "'+'", 
		"'-'", "CHAR", "INT", "QUANTUM", "BOOL", "ID", "WS", "COMMENT", "LINE_COMMENT"
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
		RULE_quantumType = 25;
	public static final String[] ruleNames = {
		"goal", "mainClassDeclaration", "classDeclaration", "mainClassBody", "mainMethod", 
		"mainMethodDeclaration", "classBody", "fieldDeclaration", "varDeclaration", 
		"methodDeclaration", "methodBody", "formalParameters", "formalParameterList", 
		"formalParameter", "type", "statement", "expression", "booleanExpression", 
		"mathExpression", "functionCall", "methodArgumentList", "intArrayType", 
		"charType", "booleanType", "intType", "quantumType"
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
			while (_la==T__34) {
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
	}

	public final MainClassDeclarationContext mainClassDeclaration() throws RecognitionException {
		MainClassDeclarationContext _localctx = new MainClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(T__34);
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
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(T__34);
			setState(64); match(ID);
			setState(67);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(65); match(T__25);
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
	}

	public final MainClassBodyContext mainClassBody() throws RecognitionException {
		MainClassBodyContext _localctx = new MainClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainClassBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(T__29);
			setState(72); mainMethod();
			setState(73); match(T__26);
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
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public MainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethod; }
	}

	public final MainMethodContext mainMethod() throws RecognitionException {
		MainMethodContext _localctx = new MainMethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); mainMethodDeclaration();
			setState(76); match(T__29);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__32) | (1L << T__29) | (1L << T__24) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0)) {
				{
				{
				setState(77); statement();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83); match(T__26);
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
	}

	public final MainMethodDeclarationContext mainMethodDeclaration() throws RecognitionException {
		MainMethodDeclarationContext _localctx = new MainMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(T__7);
			setState(86); match(T__5);
			setState(87); match(T__30);
			setState(88); match(T__39);
			setState(89); match(T__21);
			setState(90); match(T__9);
			setState(91); match(T__12);
			setState(92); match(T__8);
			setState(93); match(ID);
			setState(94); match(T__2);
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
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(T__29);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97); fieldDeclaration();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__22) | (1L << T__16) | (1L << T__7) | (1L << T__3) | (1L << ID))) != 0)) {
				{
				{
				setState(103); methodDeclaration();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); match(T__26);
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
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	 
		public FieldDeclarationContext() { }
		public void copyFrom(FieldDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldatribuitionIntContext extends FieldDeclarationContext {
		public Token varName;
		public Token value;
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT() { return getToken(NossaLinguagemParser.INT, 0); }
		public FieldatribuitionIntContext(FieldDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class FieldatribuitionBoolContext extends FieldDeclarationContext {
		public Token varName;
		public Token value;
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(NossaLinguagemParser.BOOL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldatribuitionBoolContext(FieldDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class FieldatribuitionCharContext extends FieldDeclarationContext {
		public Token varName;
		public Token value;
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(NossaLinguagemParser.CHAR, 0); }
		public FieldatribuitionCharContext(FieldDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class FieldDeclareContext extends FieldDeclarationContext {
		public Token varName;
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclareContext(FieldDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class FieldatribuitionIDContext extends FieldDeclarationContext {
		public Token varName;
		public Token value;
		public List<TerminalNode> ID() { return getTokens(NossaLinguagemParser.ID); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(NossaLinguagemParser.ID, i);
		}
		public FieldatribuitionIDContext(FieldDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class FieldatribuitionQuantumContext extends FieldDeclarationContext {
		public Token varName;
		public Token value;
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode QUANTUM() { return getToken(NossaLinguagemParser.QUANTUM, 0); }
		public FieldatribuitionQuantumContext(FieldDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDeclaration);
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new FieldDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111); type();
				setState(112); ((FieldDeclareContext)_localctx).varName = match(ID);
				setState(113); match(T__31);
				}
				break;
			case 2:
				_localctx = new FieldatribuitionIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115); type();
				setState(116); ((FieldatribuitionIDContext)_localctx).varName = match(ID);
				setState(117); match(T__27);
				setState(118); ((FieldatribuitionIDContext)_localctx).value = match(ID);
				setState(119); match(T__31);
				}
				break;
			case 3:
				_localctx = new FieldatribuitionIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121); type();
				setState(122); ((FieldatribuitionIntContext)_localctx).varName = match(ID);
				setState(123); match(T__27);
				setState(124); ((FieldatribuitionIntContext)_localctx).value = match(INT);
				setState(125); match(T__31);
				}
				break;
			case 4:
				_localctx = new FieldatribuitionCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(127); type();
				setState(128); ((FieldatribuitionCharContext)_localctx).varName = match(ID);
				setState(129); match(T__27);
				setState(130); ((FieldatribuitionCharContext)_localctx).value = match(CHAR);
				setState(131); match(T__31);
				}
				break;
			case 5:
				_localctx = new FieldatribuitionQuantumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(133); type();
				setState(134); ((FieldatribuitionQuantumContext)_localctx).varName = match(ID);
				setState(135); match(T__27);
				setState(136); ((FieldatribuitionQuantumContext)_localctx).value = match(QUANTUM);
				setState(137); match(T__31);
				}
				break;
			case 6:
				_localctx = new FieldatribuitionBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(139); type();
				setState(140); ((FieldatribuitionBoolContext)_localctx).varName = match(ID);
				setState(141); match(T__27);
				setState(142); ((FieldatribuitionBoolContext)_localctx).value = match(BOOL);
				setState(143); match(T__31);
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
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtribuitionIntContext extends VarDeclarationContext {
		public Token varName;
		public Token value;
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT() { return getToken(NossaLinguagemParser.INT, 0); }
		public AtribuitionIntContext(VarDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class AtribuitionCharContext extends VarDeclarationContext {
		public Token varName;
		public Token value;
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(NossaLinguagemParser.CHAR, 0); }
		public AtribuitionCharContext(VarDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class AtribuitionIDContext extends VarDeclarationContext {
		public Token varName;
		public Token value;
		public List<TerminalNode> ID() { return getTokens(NossaLinguagemParser.ID); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(NossaLinguagemParser.ID, i);
		}
		public AtribuitionIDContext(VarDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class AtribuitionQuantumContext extends VarDeclarationContext {
		public Token varName;
		public Token value;
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode QUANTUM() { return getToken(NossaLinguagemParser.QUANTUM, 0); }
		public AtribuitionQuantumContext(VarDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class DeclarationContext extends VarDeclarationContext {
		public Token varName;
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class AtribuitionBoolContext extends VarDeclarationContext {
		public Token varName;
		public Token value;
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(NossaLinguagemParser.BOOL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AtribuitionBoolContext(VarDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDeclaration);
		try {
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147); type();
				setState(148); ((DeclarationContext)_localctx).varName = match(ID);
				setState(149); match(T__31);
				}
				break;
			case 2:
				_localctx = new AtribuitionIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151); type();
				setState(152); ((AtribuitionIDContext)_localctx).varName = match(ID);
				setState(153); match(T__27);
				setState(154); ((AtribuitionIDContext)_localctx).value = match(ID);
				setState(155); match(T__31);
				}
				break;
			case 3:
				_localctx = new AtribuitionIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(157); type();
				setState(158); ((AtribuitionIntContext)_localctx).varName = match(ID);
				setState(159); match(T__27);
				setState(160); ((AtribuitionIntContext)_localctx).value = match(INT);
				setState(161); match(T__31);
				}
				break;
			case 4:
				_localctx = new AtribuitionCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(163); type();
				setState(164); ((AtribuitionCharContext)_localctx).varName = match(ID);
				setState(165); match(T__27);
				setState(166); ((AtribuitionCharContext)_localctx).value = match(CHAR);
				setState(167); match(T__31);
				}
				break;
			case 5:
				_localctx = new AtribuitionQuantumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(169); type();
				setState(170); ((AtribuitionQuantumContext)_localctx).varName = match(ID);
				setState(171); match(T__27);
				setState(172); ((AtribuitionQuantumContext)_localctx).value = match(QUANTUM);
				setState(173); match(T__31);
				}
				break;
			case 6:
				_localctx = new AtribuitionBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(175); type();
				setState(176); ((AtribuitionBoolContext)_localctx).varName = match(ID);
				setState(177); match(T__27);
				setState(178); ((AtribuitionBoolContext)_localctx).value = match(BOOL);
				setState(179); match(T__31);
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
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(183); match(T__7);
				setState(184); type();
				setState(185); match(ID);
				setState(186); formalParameters();
				}
				break;
			case 2:
				{
				setState(188); type();
				setState(189); match(ID);
				setState(190); formalParameters();
				notifyErrorListeners("method declaration without public");
				}
				break;
			case 3:
				{
				setState(193); match(T__7);
				setState(194); match(ID);
				setState(195); formalParameters();
				notifyErrorListeners("method declaration without return type");
				}
				break;
			case 4:
				{
				setState(198); match(T__7);
				setState(199); type();
				setState(200); formalParameters();
				notifyErrorListeners("method declaration without method name");
				}
				break;
			case 5:
				{
				setState(203); match(T__7);
				setState(204); type();
				setState(205); match(ID);
				notifyErrorListeners("method declaration without argument list");
				}
				break;
			}
			setState(210); methodBody();
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
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(T__29);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(213); varDeclaration();
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219); statement();
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__32) | (1L << T__29) | (1L << T__24) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0) );
			setState(224); match(T__26);
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
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(T__21);
			setState(228);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__22) | (1L << T__16) | (1L << T__3) | (1L << ID))) != 0)) {
				{
				setState(227); formalParameterList();
				}
			}

			setState(230); match(T__2);
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
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); formalParameter();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(233); match(T__18);
				setState(234); formalParameter();
				}
				}
				setState(239);
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
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); type();
			setState(241); match(ID);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243); intArrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244); booleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245); quantumType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246); intType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(247); charType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(248); match(ID);
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
	public static class AssignStatement3Context extends StatementContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public AssignStatement3Context(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AssignStatement2Context extends StatementContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public AssignStatement2Context(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class PrintStatement3Context extends StatementContext {
		public BooleanExpressionContext arg;
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public PrintStatement3Context(StatementContext ctx) { copyFrom(ctx); }
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
	}
	public static class PrintStatement2Context extends StatementContext {
		public MathExpressionContext arg;
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public PrintStatement2Context(StatementContext ctx) { copyFrom(ctx); }
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
	}
	public static class ReturnStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class NestedStatementContext extends StatementContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public NestedStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStatementContext extends StatementContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class PrintStatementContext extends StatementContext {
		public ExpressionContext arg;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStatement2Context extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ReturnStatement2Context(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AssignStatementContext extends StatementContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		int _la;
		try {
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new NestedStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(251); match(T__29);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__32) | (1L << T__29) | (1L << T__24) | (1L << T__15) | (1L << T__14) | (1L << ID))) != 0)) {
					{
					{
					setState(252); statement();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258); match(T__26);
				}
				break;
			case 2:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259); match(T__24);
				setState(260); match(T__21);
				setState(261); booleanExpression();
				setState(262); match(T__2);
				setState(263); statement();
				setState(264); match(T__4);
				setState(265); statement();
				}
				break;
			case 3:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(267); match(T__32);
				setState(268); match(T__21);
				setState(269); booleanExpression();
				setState(270); match(T__2);
				setState(271); statement();
				}
				break;
			case 4:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(273); match(T__14);
				setState(274); match(T__21);
				setState(275); ((PrintStatementContext)_localctx).arg = expression(0);
				setState(276); match(T__2);
				setState(277); match(T__31);
				}
				break;
			case 5:
				_localctx = new PrintStatement2Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(279); match(T__14);
				setState(280); match(T__21);
				setState(281); ((PrintStatement2Context)_localctx).arg = mathExpression();
				setState(282); match(T__2);
				setState(283); match(T__31);
				}
				break;
			case 6:
				_localctx = new PrintStatement3Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(285); match(T__14);
				setState(286); match(T__21);
				setState(287); ((PrintStatement3Context)_localctx).arg = booleanExpression();
				setState(288); match(T__2);
				setState(289); match(T__31);
				}
				break;
			case 7:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(291); match(ID);
				setState(292); match(T__27);
				setState(293); expression(0);
				setState(294); match(T__31);
				}
				break;
			case 8:
				_localctx = new AssignStatement2Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(296); match(ID);
				setState(297); match(T__27);
				setState(298); booleanExpression();
				setState(299); match(T__31);
				}
				break;
			case 9:
				_localctx = new AssignStatement3Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(301); match(ID);
				setState(302); match(T__27);
				setState(303); mathExpression();
				setState(304); match(T__31);
				}
				break;
			case 10:
				_localctx = new ArrayAssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(306); match(ID);
				setState(307); match(T__12);
				setState(308); expression(0);
				setState(309); match(T__8);
				setState(310); match(T__27);
				setState(311); expression(0);
				setState(312); match(T__31);
				}
				break;
			case 11:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(314); match(T__35);
				setState(315); expression(0);
				setState(316); match(T__31);
				}
				break;
			case 12:
				_localctx = new ReturnStatement2Context(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(318); match(T__35);
				setState(319); functionCall();
				setState(320); match(T__31);
				}
				break;
			case 13:
				_localctx = new RecurStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(322); match(T__15);
				setState(323); booleanExpression();
				setState(324); match(T__23);
				setState(325); methodArgumentList();
				setState(326); match(T__13);
				setState(327); expression(0);
				setState(328); match(T__31);
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
	}
	public static class ObjectInstantiationExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public ObjectInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayInstantiationExpressionContext extends ExpressionContext {
		public ExpressionContext right;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInstantiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MethodCallExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public MethodArgumentListContext methodArgumentList() {
			return getRuleContext(MethodArgumentListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanLitExpressionContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(NossaLinguagemParser.BOOL, 0); }
		public BooleanLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IntLitExpressionContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(NossaLinguagemParser.INT, 0); }
		public IntLitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenExpression2Context extends ExpressionContext {
		public ExpressionContext right;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpression2Context(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ThisExpressionContext extends ExpressionContext {
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayLengthExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CharExpressionContext extends ExpressionContext {
		public TerminalNode CHAR() { return getToken(NossaLinguagemParser.CHAR, 0); }
		public CharExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NegExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AtrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AtrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
			setState(355);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new NegExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(333); match(T__0);
				setState(334); expression(11);
				}
				break;
			case 2:
				{
				_localctx = new ArrayInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335); match(T__36);
				setState(336); match(T__22);
				setState(337); match(T__12);
				setState(338); ((ArrayInstantiationExpressionContext)_localctx).right = expression(0);
				setState(339); match(T__8);
				}
				break;
			case 3:
				{
				_localctx = new ObjectInstantiationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341); match(T__36);
				setState(342); match(ID);
				setState(343); match(T__21);
				setState(344); match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new IntLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(345); match(INT);
				}
				break;
			case 5:
				{
				_localctx = new QuantumExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(346); match(QUANTUM);
				}
				break;
			case 6:
				{
				_localctx = new CharExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347); match(CHAR);
				}
				break;
			case 7:
				{
				_localctx = new BooleanLitExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348); match(BOOL);
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(349); match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350); match(T__19);
				}
				break;
			case 10:
				{
				_localctx = new ParenExpression2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351); match(T__21);
				setState(352); ((ParenExpression2Context)_localctx).right = expression(0);
				setState(353); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(372);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new AtrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AtrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(358); match(T__27);
						setState(359); ((AtrExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ArrayAccessExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(360);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(361); match(T__12);
						setState(362); ((ArrayAccessExpressionContext)_localctx).right = expression(0);
						setState(363); match(T__8);
						}
						break;
					case 3:
						{
						_localctx = new ArrayLengthExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ArrayLengthExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(365);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(366); match(T__17);
						setState(367); match(T__38);
						}
						break;
					case 4:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MethodCallExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(368);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(369); match(T__17);
						setState(370); match(ID);
						setState(371); methodArgumentList();
						}
						break;
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LtExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqExpressionContext extends BooleanExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public EqExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AndExpressionContext extends BooleanExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LtExpression2Context extends BooleanExpressionContext {
		public ExpressionContext left;
		public BooleanExpressionContext right;
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LtExpression2Context(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqExpression2Context extends BooleanExpressionContext {
		public ExpressionContext left;
		public BooleanExpressionContext right;
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EqExpression2Context(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IDExpressionContext extends BooleanExpressionContext {
		public Token right;
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public IDExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NestedExpressionContext extends BooleanExpressionContext {
		public BooleanExpressionContext right;
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NestedExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AndExpression2Context extends BooleanExpressionContext {
		public ExpressionContext left;
		public BooleanExpressionContext right;
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AndExpression2Context(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpressionContext extends BooleanExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_booleanExpression);
		try {
			setState(416);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377); match(T__6);
				setState(378); expression(0);
				}
				break;
			case 2:
				_localctx = new LtExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(379); ((LtExpressionContext)_localctx).left = expression(0);
				setState(380); match(T__10);
				setState(381); ((LtExpressionContext)_localctx).right = expression(0);
				}
				break;
			case 3:
				_localctx = new EqExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(383); ((EqExpressionContext)_localctx).left = expression(0);
				setState(384); match(T__11);
				setState(385); ((EqExpressionContext)_localctx).right = expression(0);
				}
				break;
			case 4:
				_localctx = new AndExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(387); ((AndExpressionContext)_localctx).left = expression(0);
				setState(388); match(T__28);
				setState(389); ((AndExpressionContext)_localctx).right = expression(0);
				}
				break;
			case 5:
				_localctx = new AndExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(391); ((AndExpressionContext)_localctx).left = expression(0);
				setState(392); match(T__33);
				setState(393); ((AndExpressionContext)_localctx).right = expression(0);
				}
				break;
			case 6:
				_localctx = new LtExpression2Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(395); ((LtExpression2Context)_localctx).left = expression(0);
				setState(396); match(T__10);
				setState(397); ((LtExpression2Context)_localctx).right = booleanExpression();
				}
				break;
			case 7:
				_localctx = new EqExpression2Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(399); ((EqExpression2Context)_localctx).left = expression(0);
				setState(400); match(T__11);
				setState(401); ((EqExpression2Context)_localctx).right = booleanExpression();
				}
				break;
			case 8:
				_localctx = new AndExpression2Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(403); ((AndExpression2Context)_localctx).left = expression(0);
				setState(404); match(T__28);
				setState(405); ((AndExpression2Context)_localctx).right = booleanExpression();
				}
				break;
			case 9:
				_localctx = new AndExpression2Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(407); ((AndExpression2Context)_localctx).left = expression(0);
				setState(408); match(T__33);
				setState(409); ((AndExpression2Context)_localctx).right = booleanExpression();
				}
				break;
			case 10:
				_localctx = new NestedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(411); match(T__21);
				setState(412); ((NestedExpressionContext)_localctx).right = booleanExpression();
				setState(413); match(T__2);
				}
				break;
			case 11:
				_localctx = new IDExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(415); ((IDExpressionContext)_localctx).right = match(ID);
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
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddExpressionContext(MathExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MulExpression2Context extends MathExpressionContext {
		public ExpressionContext left;
		public MathExpressionContext right;
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MulExpression2Context(MathExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AddExpression2Context extends MathExpressionContext {
		public ExpressionContext left;
		public MathExpressionContext right;
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AddExpression2Context(MathExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SubExpressionContext extends MathExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SubExpressionContext(MathExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MulExpressionContext extends MathExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulExpressionContext(MathExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SubExpression2Context extends MathExpressionContext {
		public ExpressionContext left;
		public MathExpressionContext right;
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubExpression2Context(MathExpressionContext ctx) { copyFrom(ctx); }
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mathExpression);
		try {
			setState(442);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new AddExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(418); ((AddExpressionContext)_localctx).left = expression(0);
				setState(419); match(T__1);
				setState(420); ((AddExpressionContext)_localctx).right = expression(0);
				}
				break;
			case 2:
				_localctx = new SubExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(422); ((SubExpressionContext)_localctx).left = expression(0);
				setState(423); match(T__0);
				setState(424); ((SubExpressionContext)_localctx).right = expression(0);
				}
				break;
			case 3:
				_localctx = new MulExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(426); ((MulExpressionContext)_localctx).left = expression(0);
				setState(427); match(T__20);
				setState(428); ((MulExpressionContext)_localctx).right = expression(0);
				}
				break;
			case 4:
				_localctx = new AddExpression2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(430); ((AddExpression2Context)_localctx).left = expression(0);
				setState(431); match(T__1);
				setState(432); ((AddExpression2Context)_localctx).right = mathExpression();
				}
				break;
			case 5:
				_localctx = new SubExpression2Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(434); ((SubExpression2Context)_localctx).left = expression(0);
				setState(435); match(T__0);
				setState(436); ((SubExpression2Context)_localctx).right = mathExpression();
				}
				break;
			case 6:
				_localctx = new MulExpression2Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(438); ((MulExpression2Context)_localctx).left = expression(0);
				setState(439); match(T__20);
				setState(440); ((MulExpression2Context)_localctx).right = mathExpression();
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
		public Token funcID;
		public MethodArgumentListContext args;
		public TerminalNode ID() { return getToken(NossaLinguagemParser.ID, 0); }
		public MethodArgumentListContext methodArgumentList() {
			return getRuleContext(MethodArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444); ((FunctionCallContext)_localctx).funcID = match(ID);
			setState(445); ((FunctionCallContext)_localctx).args = methodArgumentList();
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
	}

	public final MethodArgumentListContext methodArgumentList() throws RecognitionException {
		MethodArgumentListContext _localctx = new MethodArgumentListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447); match(T__21);
			setState(456);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__21) | (1L << T__19) | (1L << T__0) | (1L << CHAR) | (1L << INT) | (1L << QUANTUM) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				setState(448); expression(0);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(449); match(T__18);
					setState(450); expression(0);
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(458); match(T__2);
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
	}

	public final IntArrayTypeContext intArrayType() throws RecognitionException {
		IntArrayTypeContext _localctx = new IntArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_intArrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); match(T__22);
			setState(461); match(T__12);
			setState(462); match(T__8);
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
	}

	public final CharTypeContext charType() throws RecognitionException {
		CharTypeContext _localctx = new CharTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_charType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); match(T__37);
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
	}

	public final BooleanTypeContext booleanType() throws RecognitionException {
		BooleanTypeContext _localctx = new BooleanTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_booleanType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466); match(T__16);
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
	}

	public final IntTypeContext intType() throws RecognitionException {
		IntTypeContext _localctx = new IntTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_intType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468); match(T__22);
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
	}

	public final QuantumTypeContext quantumType() throws RecognitionException {
		QuantumTypeContext _localctx = new QuantumTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_quantumType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470); match(T__3);
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
		case 0: return precpred(_ctx, 8);
		case 1: return precpred(_ctx, 14);
		case 2: return precpred(_ctx, 13);
		case 3: return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u01db\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\5\4F\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6Q\n\6\f"+
		"\6\16\6T\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\7\be\n\b\f\b\16\bh\13\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0094"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00b8\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00d3\n\13\3\13\3\13\3\f\3\f\7\f\u00d9\n\f\f\f\16\f\u00dc\13\f\3"+
		"\f\6\f\u00df\n\f\r\f\16\f\u00e0\3\f\3\f\3\r\3\r\5\r\u00e7\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\7\16\u00ee\n\16\f\16\16\16\u00f1\13\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fc\n\20\3\21\3\21\7\21\u0100\n"+
		"\21\f\21\16\21\u0103\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u014d\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0166\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0177\n\22\f\22\16"+
		"\22\u017a\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u01a3\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u01bd\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u01c6\n\26\f\26\16"+
		"\26\u01c9\13\26\5\26\u01cb\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\2\3\"\34\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\2\2\u0207\2\66\3\2\2\2\4=\3\2\2\2\6A\3"+
		"\2\2\2\bI\3\2\2\2\nM\3\2\2\2\fW\3\2\2\2\16b\3\2\2\2\20\u0093\3\2\2\2\22"+
		"\u00b7\3\2\2\2\24\u00d2\3\2\2\2\26\u00d6\3\2\2\2\30\u00e4\3\2\2\2\32\u00ea"+
		"\3\2\2\2\34\u00f2\3\2\2\2\36\u00fb\3\2\2\2 \u014c\3\2\2\2\"\u0165\3\2"+
		"\2\2$\u01a2\3\2\2\2&\u01bc\3\2\2\2(\u01be\3\2\2\2*\u01c1\3\2\2\2,\u01ce"+
		"\3\2\2\2.\u01d2\3\2\2\2\60\u01d4\3\2\2\2\62\u01d6\3\2\2\2\64\u01d8\3\2"+
		"\2\2\66:\5\4\3\2\679\5\6\4\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2"+
		";\3\3\2\2\2<:\3\2\2\2=>\7\b\2\2>?\7/\2\2?@\5\b\5\2@\5\3\2\2\2AB\7\b\2"+
		"\2BE\7/\2\2CD\7\21\2\2DF\5\36\20\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\5\16"+
		"\b\2H\7\3\2\2\2IJ\7\r\2\2JK\5\n\6\2KL\7\20\2\2L\t\3\2\2\2MN\5\f\7\2NR"+
		"\7\r\2\2OQ\5 \21\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2T"+
		"R\3\2\2\2UV\7\20\2\2V\13\3\2\2\2WX\7#\2\2XY\7%\2\2YZ\7\f\2\2Z[\7\3\2\2"+
		"[\\\7\25\2\2\\]\7!\2\2]^\7\36\2\2^_\7\"\2\2_`\7/\2\2`a\7(\2\2a\r\3\2\2"+
		"\2bf\7\r\2\2ce\5\20\t\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gl\3\2"+
		"\2\2hf\3\2\2\2ik\5\24\13\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3"+
		"\2\2\2nl\3\2\2\2op\7\20\2\2p\17\3\2\2\2qr\5\36\20\2rs\7/\2\2st\7\13\2"+
		"\2t\u0094\3\2\2\2uv\5\36\20\2vw\7/\2\2wx\7\17\2\2xy\7/\2\2yz\7\13\2\2"+
		"z\u0094\3\2\2\2{|\5\36\20\2|}\7/\2\2}~\7\17\2\2~\177\7,\2\2\177\u0080"+
		"\7\13\2\2\u0080\u0094\3\2\2\2\u0081\u0082\5\36\20\2\u0082\u0083\7/\2\2"+
		"\u0083\u0084\7\17\2\2\u0084\u0085\7+\2\2\u0085\u0086\7\13\2\2\u0086\u0094"+
		"\3\2\2\2\u0087\u0088\5\36\20\2\u0088\u0089\7/\2\2\u0089\u008a\7\17\2\2"+
		"\u008a\u008b\7-\2\2\u008b\u008c\7\13\2\2\u008c\u0094\3\2\2\2\u008d\u008e"+
		"\5\36\20\2\u008e\u008f\7/\2\2\u008f\u0090\7\17\2\2\u0090\u0091\7.\2\2"+
		"\u0091\u0092\7\13\2\2\u0092\u0094\3\2\2\2\u0093q\3\2\2\2\u0093u\3\2\2"+
		"\2\u0093{\3\2\2\2\u0093\u0081\3\2\2\2\u0093\u0087\3\2\2\2\u0093\u008d"+
		"\3\2\2\2\u0094\21\3\2\2\2\u0095\u0096\5\36\20\2\u0096\u0097\7/\2\2\u0097"+
		"\u0098\7\13\2\2\u0098\u00b8\3\2\2\2\u0099\u009a\5\36\20\2\u009a\u009b"+
		"\7/\2\2\u009b\u009c\7\17\2\2\u009c\u009d\7/\2\2\u009d\u009e\7\13\2\2\u009e"+
		"\u00b8\3\2\2\2\u009f\u00a0\5\36\20\2\u00a0\u00a1\7/\2\2\u00a1\u00a2\7"+
		"\17\2\2\u00a2\u00a3\7,\2\2\u00a3\u00a4\7\13\2\2\u00a4\u00b8\3\2\2\2\u00a5"+
		"\u00a6\5\36\20\2\u00a6\u00a7\7/\2\2\u00a7\u00a8\7\17\2\2\u00a8\u00a9\7"+
		"+\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00b8\3\2\2\2\u00ab\u00ac\5\36\20\2\u00ac"+
		"\u00ad\7/\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00af\7-\2\2\u00af\u00b0\7\13"+
		"\2\2\u00b0\u00b8\3\2\2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3\7/\2\2\u00b3"+
		"\u00b4\7\17\2\2\u00b4\u00b5\7.\2\2\u00b5\u00b6\7\13\2\2\u00b6\u00b8\3"+
		"\2\2\2\u00b7\u0095\3\2\2\2\u00b7\u0099\3\2\2\2\u00b7\u009f\3\2\2\2\u00b7"+
		"\u00a5\3\2\2\2\u00b7\u00ab\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b8\23\3\2\2"+
		"\2\u00b9\u00ba\7#\2\2\u00ba\u00bb\5\36\20\2\u00bb\u00bc\7/\2\2\u00bc\u00bd"+
		"\5\30\r\2\u00bd\u00d3\3\2\2\2\u00be\u00bf\5\36\20\2\u00bf\u00c0\7/\2\2"+
		"\u00c0\u00c1\5\30\r\2\u00c1\u00c2\b\13\1\2\u00c2\u00d3\3\2\2\2\u00c3\u00c4"+
		"\7#\2\2\u00c4\u00c5\7/\2\2\u00c5\u00c6\5\30\r\2\u00c6\u00c7\b\13\1\2\u00c7"+
		"\u00d3\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\5\36\20\2\u00ca\u00cb\5"+
		"\30\r\2\u00cb\u00cc\b\13\1\2\u00cc\u00d3\3\2\2\2\u00cd\u00ce\7#\2\2\u00ce"+
		"\u00cf\5\36\20\2\u00cf\u00d0\7/\2\2\u00d0\u00d1\b\13\1\2\u00d1\u00d3\3"+
		"\2\2\2\u00d2\u00b9\3\2\2\2\u00d2\u00be\3\2\2\2\u00d2\u00c3\3\2\2\2\u00d2"+
		"\u00c8\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\5\26"+
		"\f\2\u00d5\25\3\2\2\2\u00d6\u00da\7\r\2\2\u00d7\u00d9\5\22\n\2\u00d8\u00d7"+
		"\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\5 \21\2\u00de\u00dd\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\7\20\2\2\u00e3\27\3\2\2\2\u00e4\u00e6\7\25"+
		"\2\2\u00e5\u00e7\5\32\16\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\7(\2\2\u00e9\31\3\2\2\2\u00ea\u00ef\5\34\17"+
		"\2\u00eb\u00ec\7\30\2\2\u00ec\u00ee\5\34\17\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\33\3\2\2"+
		"\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\5\36\20\2\u00f3\u00f4\7/\2\2\u00f4"+
		"\35\3\2\2\2\u00f5\u00fc\5,\27\2\u00f6\u00fc\5\60\31\2\u00f7\u00fc\5\64"+
		"\33\2\u00f8\u00fc\5\62\32\2\u00f9\u00fc\5.\30\2\u00fa\u00fc\7/\2\2\u00fb"+
		"\u00f5\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\37\3\2\2\2\u00fd\u0101"+
		"\7\r\2\2\u00fe\u0100\5 \21\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0104\u014d\7\20\2\2\u0105\u0106\7\22\2\2\u0106\u0107\7\25\2\2\u0107"+
		"\u0108\5$\23\2\u0108\u0109\7(\2\2\u0109\u010a\5 \21\2\u010a\u010b\7&\2"+
		"\2\u010b\u010c\5 \21\2\u010c\u014d\3\2\2\2\u010d\u010e\7\n\2\2\u010e\u010f"+
		"\7\25\2\2\u010f\u0110\5$\23\2\u0110\u0111\7(\2\2\u0111\u0112\5 \21\2\u0112"+
		"\u014d\3\2\2\2\u0113\u0114\7\34\2\2\u0114\u0115\7\25\2\2\u0115\u0116\5"+
		"\"\22\2\u0116\u0117\7(\2\2\u0117\u0118\7\13\2\2\u0118\u014d\3\2\2\2\u0119"+
		"\u011a\7\34\2\2\u011a\u011b\7\25\2\2\u011b\u011c\5&\24\2\u011c\u011d\7"+
		"(\2\2\u011d\u011e\7\13\2\2\u011e\u014d\3\2\2\2\u011f\u0120\7\34\2\2\u0120"+
		"\u0121\7\25\2\2\u0121\u0122\5$\23\2\u0122\u0123\7(\2\2\u0123\u0124\7\13"+
		"\2\2\u0124\u014d\3\2\2\2\u0125\u0126\7/\2\2\u0126\u0127\7\17\2\2\u0127"+
		"\u0128\5\"\22\2\u0128\u0129\7\13\2\2\u0129\u014d\3\2\2\2\u012a\u012b\7"+
		"/\2\2\u012b\u012c\7\17\2\2\u012c\u012d\5$\23\2\u012d\u012e\7\13\2\2\u012e"+
		"\u014d\3\2\2\2\u012f\u0130\7/\2\2\u0130\u0131\7\17\2\2\u0131\u0132\5&"+
		"\24\2\u0132\u0133\7\13\2\2\u0133\u014d\3\2\2\2\u0134\u0135\7/\2\2\u0135"+
		"\u0136\7\36\2\2\u0136\u0137\5\"\22\2\u0137\u0138\7\"\2\2\u0138\u0139\7"+
		"\17\2\2\u0139\u013a\5\"\22\2\u013a\u013b\7\13\2\2\u013b\u014d\3\2\2\2"+
		"\u013c\u013d\7\7\2\2\u013d\u013e\5\"\22\2\u013e\u013f\7\13\2\2\u013f\u014d"+
		"\3\2\2\2\u0140\u0141\7\7\2\2\u0141\u0142\5(\25\2\u0142\u0143\7\13\2\2"+
		"\u0143\u014d\3\2\2\2\u0144\u0145\7\33\2\2\u0145\u0146\5$\23\2\u0146\u0147"+
		"\7\23\2\2\u0147\u0148\5*\26\2\u0148\u0149\7\35\2\2\u0149\u014a\5\"\22"+
		"\2\u014a\u014b\7\13\2\2\u014b\u014d\3\2\2\2\u014c\u00fd\3\2\2\2\u014c"+
		"\u0105\3\2\2\2\u014c\u010d\3\2\2\2\u014c\u0113\3\2\2\2\u014c\u0119\3\2"+
		"\2\2\u014c\u011f\3\2\2\2\u014c\u0125\3\2\2\2\u014c\u012a\3\2\2\2\u014c"+
		"\u012f\3\2\2\2\u014c\u0134\3\2\2\2\u014c\u013c\3\2\2\2\u014c\u0140\3\2"+
		"\2\2\u014c\u0144\3\2\2\2\u014d!\3\2\2\2\u014e\u014f\b\22\1\2\u014f\u0150"+
		"\7*\2\2\u0150\u0166\5\"\22\r\u0151\u0152\7\6\2\2\u0152\u0153\7\24\2\2"+
		"\u0153\u0154\7\36\2\2\u0154\u0155\5\"\22\2\u0155\u0156\7\"\2\2\u0156\u0166"+
		"\3\2\2\2\u0157\u0158\7\6\2\2\u0158\u0159\7/\2\2\u0159\u015a\7\25\2\2\u015a"+
		"\u0166\7(\2\2\u015b\u0166\7,\2\2\u015c\u0166\7-\2\2\u015d\u0166\7+\2\2"+
		"\u015e\u0166\7.\2\2\u015f\u0166\7/\2\2\u0160\u0166\7\27\2\2\u0161\u0162"+
		"\7\25\2\2\u0162\u0163\5\"\22\2\u0163\u0164\7(\2\2\u0164\u0166\3\2\2\2"+
		"\u0165\u014e\3\2\2\2\u0165\u0151\3\2\2\2\u0165\u0157\3\2\2\2\u0165\u015b"+
		"\3\2\2\2\u0165\u015c\3\2\2\2\u0165\u015d\3\2\2\2\u0165\u015e\3\2\2\2\u0165"+
		"\u015f\3\2\2\2\u0165\u0160\3\2\2\2\u0165\u0161\3\2\2\2\u0166\u0178\3\2"+
		"\2\2\u0167\u0168\f\n\2\2\u0168\u0169\7\17\2\2\u0169\u0177\5\"\22\13\u016a"+
		"\u016b\f\20\2\2\u016b\u016c\7\36\2\2\u016c\u016d\5\"\22\2\u016d\u016e"+
		"\7\"\2\2\u016e\u0177\3\2\2\2\u016f\u0170\f\17\2\2\u0170\u0171\7\31\2\2"+
		"\u0171\u0177\7\4\2\2\u0172\u0173\f\16\2\2\u0173\u0174\7\31\2\2\u0174\u0175"+
		"\7/\2\2\u0175\u0177\5*\26\2\u0176\u0167\3\2\2\2\u0176\u016a\3\2\2\2\u0176"+
		"\u016f\3\2\2\2\u0176\u0172\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179#\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c"+
		"\7$\2\2\u017c\u01a3\5\"\22\2\u017d\u017e\5\"\22\2\u017e\u017f\7 \2\2\u017f"+
		"\u0180\5\"\22\2\u0180\u01a3\3\2\2\2\u0181\u0182\5\"\22\2\u0182\u0183\7"+
		"\37\2\2\u0183\u0184\5\"\22\2\u0184\u01a3\3\2\2\2\u0185\u0186\5\"\22\2"+
		"\u0186\u0187\7\16\2\2\u0187\u0188\5\"\22\2\u0188\u01a3\3\2\2\2\u0189\u018a"+
		"\5\"\22\2\u018a\u018b\7\t\2\2\u018b\u018c\5\"\22\2\u018c\u01a3\3\2\2\2"+
		"\u018d\u018e\5\"\22\2\u018e\u018f\7 \2\2\u018f\u0190\5$\23\2\u0190\u01a3"+
		"\3\2\2\2\u0191\u0192\5\"\22\2\u0192\u0193\7\37\2\2\u0193\u0194\5$\23\2"+
		"\u0194\u01a3\3\2\2\2\u0195\u0196\5\"\22\2\u0196\u0197\7\16\2\2\u0197\u0198"+
		"\5$\23\2\u0198\u01a3\3\2\2\2\u0199\u019a\5\"\22\2\u019a\u019b\7\t\2\2"+
		"\u019b\u019c\5$\23\2\u019c\u01a3\3\2\2\2\u019d\u019e\7\25\2\2\u019e\u019f"+
		"\5$\23\2\u019f\u01a0\7(\2\2\u01a0\u01a3\3\2\2\2\u01a1\u01a3\7/\2\2\u01a2"+
		"\u017b\3\2\2\2\u01a2\u017d\3\2\2\2\u01a2\u0181\3\2\2\2\u01a2\u0185\3\2"+
		"\2\2\u01a2\u0189\3\2\2\2\u01a2\u018d\3\2\2\2\u01a2\u0191\3\2\2\2\u01a2"+
		"\u0195\3\2\2\2\u01a2\u0199\3\2\2\2\u01a2\u019d\3\2\2\2\u01a2\u01a1\3\2"+
		"\2\2\u01a3%\3\2\2\2\u01a4\u01a5\5\"\22\2\u01a5\u01a6\7)\2\2\u01a6\u01a7"+
		"\5\"\22\2\u01a7\u01bd\3\2\2\2\u01a8\u01a9\5\"\22\2\u01a9\u01aa\7*\2\2"+
		"\u01aa\u01ab\5\"\22\2\u01ab\u01bd\3\2\2\2\u01ac\u01ad\5\"\22\2\u01ad\u01ae"+
		"\7\26\2\2\u01ae\u01af\5\"\22\2\u01af\u01bd\3\2\2\2\u01b0\u01b1\5\"\22"+
		"\2\u01b1\u01b2\7)\2\2\u01b2\u01b3\5&\24\2\u01b3\u01bd\3\2\2\2\u01b4\u01b5"+
		"\5\"\22\2\u01b5\u01b6\7*\2\2\u01b6\u01b7\5&\24\2\u01b7\u01bd\3\2\2\2\u01b8"+
		"\u01b9\5\"\22\2\u01b9\u01ba\7\26\2\2\u01ba\u01bb\5&\24\2\u01bb\u01bd\3"+
		"\2\2\2\u01bc\u01a4\3\2\2\2\u01bc\u01a8\3\2\2\2\u01bc\u01ac\3\2\2\2\u01bc"+
		"\u01b0\3\2\2\2\u01bc\u01b4\3\2\2\2\u01bc\u01b8\3\2\2\2\u01bd\'\3\2\2\2"+
		"\u01be\u01bf\7/\2\2\u01bf\u01c0\5*\26\2\u01c0)\3\2\2\2\u01c1\u01ca\7\25"+
		"\2\2\u01c2\u01c7\5\"\22\2\u01c3\u01c4\7\30\2\2\u01c4\u01c6\5\"\22\2\u01c5"+
		"\u01c3\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01c2\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\7(\2\2\u01cd+\3\2\2\2\u01ce"+
		"\u01cf\7\24\2\2\u01cf\u01d0\7\36\2\2\u01d0\u01d1\7\"\2\2\u01d1-\3\2\2"+
		"\2\u01d2\u01d3\7\5\2\2\u01d3/\3\2\2\2\u01d4\u01d5\7\32\2\2\u01d5\61\3"+
		"\2\2\2\u01d6\u01d7\7\24\2\2\u01d7\63\3\2\2\2\u01d8\u01d9\7\'\2\2\u01d9"+
		"\65\3\2\2\2\30:ERfl\u0093\u00b7\u00d2\u00da\u00e0\u00e6\u00ef\u00fb\u0101"+
		"\u014c\u0165\u0176\u0178\u01a2\u01bc\u01c7\u01ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}