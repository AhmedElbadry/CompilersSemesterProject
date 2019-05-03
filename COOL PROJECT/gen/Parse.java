// Generated from C:/Users/Ahmed/Desktop/CompilersSemesterProject/COOL PROJECT/grammar\Parse.g4 by ANTLR 4.7.2

	import java.util.List;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Parse extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, CASE_ARROW=2, LPAREN=3, RPAREN=4, COMMA=5, ADD=6, MINUS=7, 
		MULTIPLY=8, DIVISION=9, TILDE=10, LESS_THAN=11, LESS_EQUAL=12, EQUAL=13, 
		LBRACE=14, RBRACE=15, DOT=16, ASSIGNMENT=17, ATSYM=18, COLON=19, CASE=20, 
		ESAC=21, IF=22, FI=23, WHILE=24, THEN=25, ELSE=26, LOOP=27, POOL=28, CLASS=29, 
		IN=30, INHERITS=31, OF=32, LET=33, NEW=34, ISVOID=35, NOT=36, BOOL_CONST=37, 
		INT=38, TYPEID=39, OBJECTID=40, STRING=41, WS=42, INVALID=43;
	public static final int
		RULE_program = 0, RULE_programBlocks = 1, RULE_classDefine = 2, RULE_featureList = 3, 
		RULE_feature = 4, RULE_method = 5, RULE_decl = 6, RULE_formalList = 7, 
		RULE_formal = 8, RULE_expression = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programBlocks", "classDefine", "featureList", "feature", 
			"method", "decl", "formalList", "formal", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'=>'", "'('", "')'", "','", "'+'", "'-'", "'*'", "'/'", 
			"'~'", "'<'", "'<='", "'='", "'{'", "'}'", "'.'", "'<-'", "'@'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "CASE_ARROW", "LPAREN", "RPAREN", "COMMA", "ADD", 
			"MINUS", "MULTIPLY", "DIVISION", "TILDE", "LESS_THAN", "LESS_EQUAL", 
			"EQUAL", "LBRACE", "RBRACE", "DOT", "ASSIGNMENT", "ATSYM", "COLON", "CASE", 
			"ESAC", "IF", "FI", "WHILE", "THEN", "ELSE", "LOOP", "POOL", "CLASS", 
			"IN", "INHERITS", "OF", "LET", "NEW", "ISVOID", "NOT", "BOOL_CONST", 
			"INT", "TYPEID", "OBJECTID", "STRING", "WS", "INVALID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Parse.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parse(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public AST.program value;
		public ProgramBlocksContext pb;
		public TerminalNode EOF() { return getToken(Parse.EOF, 0); }
		public ProgramBlocksContext programBlocks() {
			return getRuleContext(ProgramBlocksContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((ProgramContext)_localctx).pb = programBlocks();
			setState(21);
			match(EOF);

					((ProgramContext)_localctx).value =  new AST.program(((ProgramContext)_localctx).pb.value, ((ProgramContext)_localctx).pb.value.get(0).lineNo);
				
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

	public static class ProgramBlocksContext extends ParserRuleContext {
		public ArrayList<AST.class_> value;
		public ProgramBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBlocks; }
	 
		public ProgramBlocksContext() { }
		public void copyFrom(ProgramBlocksContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ClassesContext extends ProgramBlocksContext {
		public ClassDefineContext c;
		public List<TerminalNode> SEMICOLON() { return getTokens(Parse.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parse.SEMICOLON, i);
		}
		public List<ClassDefineContext> classDefine() {
			return getRuleContexts(ClassDefineContext.class);
		}
		public ClassDefineContext classDefine(int i) {
			return getRuleContext(ClassDefineContext.class,i);
		}
		public ClassesContext(ProgramBlocksContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterClasses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitClasses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitClasses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramBlocksContext programBlocks() throws RecognitionException {
		ProgramBlocksContext _localctx = new ProgramBlocksContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBlocks);

		    	((ProgramBlocksContext)_localctx).value =  new ArrayList<AST.class_>();
		    
		int _la;
		try {
			_localctx = new ClassesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				((ClassesContext)_localctx).c = classDefine();
				setState(25);
				match(SEMICOLON);
				_localctx.value.add(((ClassesContext)_localctx).c.value);
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
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

	public static class ClassDefineContext extends ParserRuleContext {
		public AST.class_ value;
		public Token c;
		public Token n;
		public FeatureListContext fl;
		public Token p;
		public TerminalNode LBRACE() { return getToken(Parse.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parse.RBRACE, 0); }
		public TerminalNode CLASS() { return getToken(Parse.CLASS, 0); }
		public List<TerminalNode> TYPEID() { return getTokens(Parse.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(Parse.TYPEID, i);
		}
		public FeatureListContext featureList() {
			return getRuleContext(FeatureListContext.class,0);
		}
		public TerminalNode INHERITS() { return getToken(Parse.INHERITS, 0); }
		public ClassDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterClassDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitClassDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitClassDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefineContext classDefine() throws RecognitionException {
		ClassDefineContext _localctx = new ClassDefineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDefine);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				((ClassDefineContext)_localctx).c = match(CLASS);
				setState(33);
				((ClassDefineContext)_localctx).n = match(TYPEID);
				setState(34);
				match(LBRACE);
				setState(35);
				((ClassDefineContext)_localctx).fl = featureList();
				setState(36);
				match(RBRACE);

				        ((ClassDefineContext)_localctx).value =  new AST.class_(((ClassDefineContext)_localctx).n.getText(), "no_inherirts", ((ClassDefineContext)_localctx).fl.value, ((ClassDefineContext)_localctx).c.getLine());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				((ClassDefineContext)_localctx).c = match(CLASS);
				setState(40);
				((ClassDefineContext)_localctx).n = match(TYPEID);
				setState(41);
				match(INHERITS);
				setState(42);
				((ClassDefineContext)_localctx).p = match(TYPEID);
				setState(43);
				match(LBRACE);
				setState(44);
				((ClassDefineContext)_localctx).fl = featureList();
				setState(45);
				match(RBRACE);

				        ((ClassDefineContext)_localctx).value =  new AST.class_(((ClassDefineContext)_localctx).n.getText(), ((ClassDefineContext)_localctx).p.getText(), ((ClassDefineContext)_localctx).fl.value, ((ClassDefineContext)_localctx).c.getLine());
				    
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

	public static class FeatureListContext extends ParserRuleContext {
		public ArrayList<AST.feature> value;
		public FeatureContext f;
		public List<TerminalNode> SEMICOLON() { return getTokens(Parse.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parse.SEMICOLON, i);
		}
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public FeatureListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterFeatureList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitFeatureList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitFeatureList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureListContext featureList() throws RecognitionException {
		FeatureListContext _localctx = new FeatureListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_featureList);

		    	((FeatureListContext)_localctx).value =  new ArrayList<AST.feature>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJECTID) {
				{
				{
				setState(50);
				((FeatureListContext)_localctx).f = feature();
				setState(51);
				match(SEMICOLON);
				_localctx.value.add(((FeatureListContext)_localctx).f.value);
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

	public static class FeatureContext extends ParserRuleContext {
		public AST.feature value;
		public MethodContext m;
		public DeclContext d;
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_feature);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				((FeatureContext)_localctx).m = method();

				        ((FeatureContext)_localctx).value =  ((FeatureContext)_localctx).m.value;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				((FeatureContext)_localctx).d = decl();

				        ((FeatureContext)_localctx).value =  ((FeatureContext)_localctx).d.value;
				    
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

	public static class MethodContext extends ParserRuleContext {
		public AST.method value;
		public Token n;
		public Token rt;
		public FormalListContext fl;
		public TerminalNode LPAREN() { return getToken(Parse.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parse.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(Parse.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(Parse.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parse.RBRACE, 0); }
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode TYPEID() { return getToken(Parse.TYPEID, 0); }
		public FormalListContext formalList() {
			return getRuleContext(FormalListContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				((MethodContext)_localctx).n = match(OBJECTID);
				setState(68);
				match(LPAREN);
				setState(69);
				match(RPAREN);
				setState(70);
				match(COLON);
				setState(71);
				((MethodContext)_localctx).rt = match(TYPEID);
				setState(72);
				match(LBRACE);
				setState(73);
				expression(0);
				setState(74);
				match(RBRACE);

				        ((MethodContext)_localctx).value =  new AST.method(((MethodContext)_localctx).n.getText(), ((MethodContext)_localctx).rt.getText(), new ArrayList<AST.formal>(), ((MethodContext)_localctx).n.getLine());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((MethodContext)_localctx).n = match(OBJECTID);
				setState(78);
				match(LPAREN);
				setState(79);
				((MethodContext)_localctx).fl = formalList();
				setState(80);
				match(RPAREN);
				setState(81);
				match(COLON);
				setState(82);
				((MethodContext)_localctx).rt = match(TYPEID);
				setState(83);
				match(LBRACE);
				setState(84);
				expression(0);
				setState(85);
				match(RBRACE);

				        ((MethodContext)_localctx).value =  new AST.method(((MethodContext)_localctx).n.getText(), ((MethodContext)_localctx).rt.getText(), ((MethodContext)_localctx).fl.value, ((MethodContext)_localctx).n.getLine());
				    
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

	public static class DeclContext extends ParserRuleContext {
		public AST.decl value;
		public Token n;
		public Token t;
		public TerminalNode COLON() { return getToken(Parse.COLON, 0); }
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode TYPEID() { return getToken(Parse.TYPEID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(Parse.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				((DeclContext)_localctx).n = match(OBJECTID);
				setState(91);
				match(COLON);
				setState(92);
				((DeclContext)_localctx).t = match(TYPEID);

				        ((DeclContext)_localctx).value =  new AST.decl(((DeclContext)_localctx).n.getText(), ((DeclContext)_localctx).t.getText(), ((DeclContext)_localctx).n.getLine());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				((DeclContext)_localctx).n = match(OBJECTID);
				setState(95);
				match(COLON);
				setState(96);
				((DeclContext)_localctx).t = match(TYPEID);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(97);
					match(ASSIGNMENT);
					setState(98);
					expression(0);
					}
				}


				        ((DeclContext)_localctx).value =  new AST.decl(((DeclContext)_localctx).n.getText(), ((DeclContext)_localctx).t.getText(), ((DeclContext)_localctx).n.getLine());
				    
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

	public static class FormalListContext extends ParserRuleContext {
		public ArrayList<AST.formal> value;
		public FormalContext f;
		public FormalContext fi;
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parse.COMMA, i);
		}
		public FormalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterFormalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitFormalList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitFormalList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formalList);

		    	((FormalListContext)_localctx).value =  new ArrayList<AST.formal>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((FormalListContext)_localctx).f = formal();
			_localctx.value.add(((FormalListContext)_localctx).f.value);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(106);
				match(COMMA);
				setState(107);
				((FormalListContext)_localctx).fi = formal();
				_localctx.value.add(((FormalListContext)_localctx).fi.value);
				}
				}
				setState(114);
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

	public static class FormalContext extends ParserRuleContext {
		public AST.formal value;
		public Token n;
		public Token t;
		public TerminalNode COLON() { return getToken(Parse.COLON, 0); }
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode TYPEID() { return getToken(Parse.TYPEID, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((FormalContext)_localctx).n = match(OBJECTID);
			setState(116);
			match(COLON);
			setState(117);
			((FormalContext)_localctx).t = match(TYPEID);

			        ((FormalContext)_localctx).value =  new AST.formal(((FormalContext)_localctx).n.getText(), ((FormalContext)_localctx).t.getText());
			    
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
	public static class DivisionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVISION() { return getToken(Parse.DIVISION, 0); }
		public DivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Parse.ADD, 0); }
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(Parse.MINUS, 0); }
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(Parse.MULTIPLY, 0); }
		public MultiplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(Parse.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IntContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(121);
			match(INT);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(124);
						match(MULTIPLY);
						setState(125);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(127);
						match(DIVISION);
						setState(128);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(130);
						match(ADD);
						setState(131);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(133);
						match(MINUS);
						setState(134);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u008f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\37\n\3\r\3\16\3 \3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\5\3\5"+
		"\3\5\3\5\7\59\n\5\f\5\16\5<\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6D\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bf\n\b\3\b\5"+
		"\bi\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tq\n\t\f\t\16\tt\13\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d\13\13\3\13\2\3\24\f\2\4\6"+
		"\b\n\f\16\20\22\24\2\2\2\u0090\2\26\3\2\2\2\4\36\3\2\2\2\6\62\3\2\2\2"+
		"\b:\3\2\2\2\nC\3\2\2\2\fZ\3\2\2\2\16h\3\2\2\2\20j\3\2\2\2\22u\3\2\2\2"+
		"\24z\3\2\2\2\26\27\5\4\3\2\27\30\7\2\2\3\30\31\b\2\1\2\31\3\3\2\2\2\32"+
		"\33\5\6\4\2\33\34\7\3\2\2\34\35\b\3\1\2\35\37\3\2\2\2\36\32\3\2\2\2\37"+
		" \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\"#\7\37\2\2#$\7)\2\2$%\7\20"+
		"\2\2%&\5\b\5\2&\'\7\21\2\2\'(\b\4\1\2(\63\3\2\2\2)*\7\37\2\2*+\7)\2\2"+
		"+,\7!\2\2,-\7)\2\2-.\7\20\2\2./\5\b\5\2/\60\7\21\2\2\60\61\b\4\1\2\61"+
		"\63\3\2\2\2\62\"\3\2\2\2\62)\3\2\2\2\63\7\3\2\2\2\64\65\5\n\6\2\65\66"+
		"\7\3\2\2\66\67\b\5\1\2\679\3\2\2\28\64\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3"+
		"\2\2\2;\t\3\2\2\2<:\3\2\2\2=>\5\f\7\2>?\b\6\1\2?D\3\2\2\2@A\5\16\b\2A"+
		"B\b\6\1\2BD\3\2\2\2C=\3\2\2\2C@\3\2\2\2D\13\3\2\2\2EF\7*\2\2FG\7\5\2\2"+
		"GH\7\6\2\2HI\7\25\2\2IJ\7)\2\2JK\7\20\2\2KL\5\24\13\2LM\7\21\2\2MN\b\7"+
		"\1\2N[\3\2\2\2OP\7*\2\2PQ\7\5\2\2QR\5\20\t\2RS\7\6\2\2ST\7\25\2\2TU\7"+
		")\2\2UV\7\20\2\2VW\5\24\13\2WX\7\21\2\2XY\b\7\1\2Y[\3\2\2\2ZE\3\2\2\2"+
		"ZO\3\2\2\2[\r\3\2\2\2\\]\7*\2\2]^\7\25\2\2^_\7)\2\2_i\b\b\1\2`a\7*\2\2"+
		"ab\7\25\2\2be\7)\2\2cd\7\23\2\2df\5\24\13\2ec\3\2\2\2ef\3\2\2\2fg\3\2"+
		"\2\2gi\b\b\1\2h\\\3\2\2\2h`\3\2\2\2i\17\3\2\2\2jk\5\22\n\2kr\b\t\1\2l"+
		"m\7\7\2\2mn\5\22\n\2no\b\t\1\2oq\3\2\2\2pl\3\2\2\2qt\3\2\2\2rp\3\2\2\2"+
		"rs\3\2\2\2s\21\3\2\2\2tr\3\2\2\2uv\7*\2\2vw\7\25\2\2wx\7)\2\2xy\b\n\1"+
		"\2y\23\3\2\2\2z{\b\13\1\2{|\7(\2\2|\u008b\3\2\2\2}~\f\7\2\2~\177\7\n\2"+
		"\2\177\u008a\5\24\13\b\u0080\u0081\f\6\2\2\u0081\u0082\7\13\2\2\u0082"+
		"\u008a\5\24\13\7\u0083\u0084\f\5\2\2\u0084\u0085\7\b\2\2\u0085\u008a\5"+
		"\24\13\6\u0086\u0087\f\4\2\2\u0087\u0088\7\t\2\2\u0088\u008a\5\24\13\5"+
		"\u0089}\3\2\2\2\u0089\u0080\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0086\3"+
		"\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\25\3\2\2\2\u008d\u008b\3\2\2\2\f \62:CZehr\u0089\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}