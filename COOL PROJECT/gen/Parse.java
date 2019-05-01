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
		RULE_program = 0, RULE_programBlocks = 1, RULE_classDefine = 2, RULE_feature = 3, 
		RULE_formal = 4, RULE_expression = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programBlocks", "classDefine", "feature", "formal", "expression"
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
			setState(12);
			((ProgramContext)_localctx).pb = programBlocks();

					((ProgramContext)_localctx).value =  new AST.program();
				
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
		public ProgramBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBlocks; }
	 
		public ProgramBlocksContext() { }
		public void copyFrom(ProgramBlocksContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassesContext extends ProgramBlocksContext {
		public List<ClassDefineContext> classDefine() {
			return getRuleContexts(ClassDefineContext.class);
		}
		public ClassDefineContext classDefine(int i) {
			return getRuleContext(ClassDefineContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parse.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parse.SEMICOLON, i);
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
	public static class EofContext extends ProgramBlocksContext {
		public TerminalNode EOF() { return getToken(Parse.EOF, 0); }
		public EofContext(ProgramBlocksContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramBlocksContext programBlocks() throws RecognitionException {
		ProgramBlocksContext _localctx = new ProgramBlocksContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBlocks);
		int _la;
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				_localctx = new ClassesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(15);
					classDefine();
					setState(16);
					match(SEMICOLON);
					}
					}
					setState(20); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CLASS );
				}
				break;
			case EOF:
				_localctx = new EofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode CLASS() { return getToken(Parse.CLASS, 0); }
		public List<TerminalNode> TYPEID() { return getTokens(Parse.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(Parse.TYPEID, i);
		}
		public TerminalNode LBRACE() { return getToken(Parse.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parse.RBRACE, 0); }
		public TerminalNode INHERITS() { return getToken(Parse.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parse.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parse.SEMICOLON, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(CLASS);
			setState(26);
			match(TYPEID);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(27);
				match(INHERITS);
				setState(28);
				match(TYPEID);
				}
			}

			setState(31);
			match(LBRACE);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJECTID) {
				{
				{
				setState(32);
				feature();
				setState(33);
				match(SEMICOLON);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(RBRACE);
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
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodContext extends FeatureContext {
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode LPAREN() { return getToken(Parse.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parse.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(Parse.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(Parse.TYPEID, 0); }
		public TerminalNode LBRACE() { return getToken(Parse.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parse.RBRACE, 0); }
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
		public MethodContext(FeatureContext ctx) { copyFrom(ctx); }
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
	public static class PropertyContext extends FeatureContext {
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode COLON() { return getToken(Parse.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(Parse.TYPEID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(Parse.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_feature);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new MethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(OBJECTID);
				setState(43);
				match(LPAREN);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OBJECTID) {
					{
					{
					setState(44);
					formal();
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(45);
						match(COMMA);
						setState(46);
						formal();
						}
						}
						setState(51);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				match(RPAREN);
				setState(58);
				match(COLON);
				setState(59);
				match(TYPEID);
				setState(60);
				match(LBRACE);
				setState(61);
				expression(0);
				setState(62);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new PropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(OBJECTID);
				setState(65);
				match(COLON);
				setState(66);
				match(TYPEID);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(67);
					match(ASSIGNMENT);
					setState(68);
					expression(0);
					}
				}

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

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode COLON() { return getToken(Parse.COLON, 0); }
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
		enterRule(_localctx, 8, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(OBJECTID);
			setState(74);
			match(COLON);
			setState(75);
			match(TYPEID);
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
	public static class LetInContext extends ExpressionContext {
		public TerminalNode LET() { return getToken(Parse.LET, 0); }
		public List<TerminalNode> OBJECTID() { return getTokens(Parse.OBJECTID); }
		public TerminalNode OBJECTID(int i) {
			return getToken(Parse.OBJECTID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Parse.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parse.COLON, i);
		}
		public List<TerminalNode> TYPEID() { return getTokens(Parse.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(Parse.TYPEID, i);
		}
		public TerminalNode IN() { return getToken(Parse.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ASSIGNMENT() { return getTokens(Parse.ASSIGNMENT); }
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(Parse.ASSIGNMENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parse.COMMA, i);
		}
		public LetInContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterLetIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitLetIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitLetIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(Parse.NEW, 0); }
		public TerminalNode TYPEID() { return getToken(Parse.TYPEID, 0); }
		public NewContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(Parse.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parse.RPAREN, 0); }
		public ParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitParentheses(this);
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
	public static class TrueOrFlaseContext extends ExpressionContext {
		public TerminalNode BOOL_CONST() { return getToken(Parse.BOOL_CONST, 0); }
		public TrueOrFlaseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterTrueOrFlase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitTrueOrFlase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitTrueOrFlase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(Parse.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsvoidContext extends ExpressionContext {
		public TerminalNode ISVOID() { return getToken(Parse.ISVOID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IsvoidContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterIsvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitIsvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitIsvoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends ExpressionContext {
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(Parse.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ExpressionContext {
		public TerminalNode WHILE() { return getToken(Parse.WHILE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(Parse.LOOP, 0); }
		public TerminalNode POOL() { return getToken(Parse.POOL, 0); }
		public WhileContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitWhile(this);
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
	public static class EqualContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(Parse.EQUAL, 0); }
		public EqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(Parse.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegativeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNotContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(Parse.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoolNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterBoolNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitBoolNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitBoolNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(Parse.LESS_THAN, 0); }
		public LessThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends ExpressionContext {
		public TerminalNode LBRACE() { return getToken(Parse.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parse.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parse.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parse.SEMICOLON, i);
		}
		public BlockContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpressionContext {
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public IdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_EQUAL() { return getToken(Parse.LESS_EQUAL, 0); }
		public LessEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitLessEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitLessEqual(this);
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
	public static class IfContext extends ExpressionContext {
		public TerminalNode IF() { return getToken(Parse.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(Parse.THEN, 0); }
		public TerminalNode ELSE() { return getToken(Parse.ELSE, 0); }
		public TerminalNode FI() { return getToken(Parse.FI, 0); }
		public IfContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseContext extends ExpressionContext {
		public TerminalNode CASE() { return getToken(Parse.CASE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OF() { return getToken(Parse.OF, 0); }
		public TerminalNode ESAC() { return getToken(Parse.ESAC, 0); }
		public List<TerminalNode> OBJECTID() { return getTokens(Parse.OBJECTID); }
		public TerminalNode OBJECTID(int i) {
			return getToken(Parse.OBJECTID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Parse.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parse.COLON, i);
		}
		public List<TerminalNode> TYPEID() { return getTokens(Parse.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(Parse.TYPEID, i);
		}
		public List<TerminalNode> CASE_ARROW() { return getTokens(Parse.CASE_ARROW); }
		public TerminalNode CASE_ARROW(int i) {
			return getToken(Parse.CASE_ARROW, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parse.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parse.SEMICOLON, i);
		}
		public CaseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OwnMethodCallContext extends ExpressionContext {
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode LPAREN() { return getToken(Parse.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parse.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parse.COMMA, i);
		}
		public OwnMethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterOwnMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitOwnMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitOwnMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(Parse.DOT, 0); }
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode LPAREN() { return getToken(Parse.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parse.RPAREN, 0); }
		public TerminalNode ATSYM() { return getToken(Parse.ATSYM, 0); }
		public TerminalNode TYPEID() { return getToken(Parse.TYPEID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parse.COMMA, i);
		}
		public MethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitMethodCall(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new OwnMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(78);
				match(OBJECTID);
				setState(79);
				match(LPAREN);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << LBRACE) | (1L << CASE) | (1L << IF) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << BOOL_CONST) | (1L << INT) | (1L << OBJECTID) | (1L << STRING))) != 0)) {
					{
					{
					setState(80);
					expression(0);
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(81);
						match(COMMA);
						setState(82);
						expression(0);
						}
						}
						setState(87);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(IF);
				setState(95);
				expression(0);
				setState(96);
				match(THEN);
				setState(97);
				expression(0);
				setState(98);
				match(ELSE);
				setState(99);
				expression(0);
				setState(100);
				match(FI);
				}
				break;
			case 3:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(WHILE);
				setState(103);
				expression(0);
				setState(104);
				match(LOOP);
				setState(105);
				expression(0);
				setState(106);
				match(POOL);
				}
				break;
			case 4:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(LBRACE);
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(109);
					expression(0);
					setState(110);
					match(SEMICOLON);
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << LBRACE) | (1L << CASE) | (1L << IF) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << BOOL_CONST) | (1L << INT) | (1L << OBJECTID) | (1L << STRING))) != 0) );
				setState(116);
				match(RBRACE);
				}
				break;
			case 5:
				{
				_localctx = new LetInContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(LET);
				setState(119);
				match(OBJECTID);
				setState(120);
				match(COLON);
				setState(121);
				match(TYPEID);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(122);
					match(ASSIGNMENT);
					setState(123);
					expression(0);
					}
				}

				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(126);
					match(COMMA);
					setState(127);
					match(OBJECTID);
					setState(128);
					match(COLON);
					setState(129);
					match(TYPEID);
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGNMENT) {
						{
						setState(130);
						match(ASSIGNMENT);
						setState(131);
						expression(0);
						}
					}

					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(IN);
				setState(140);
				expression(19);
				}
				break;
			case 6:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(CASE);
				setState(142);
				expression(0);
				setState(143);
				match(OF);
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(144);
					match(OBJECTID);
					setState(145);
					match(COLON);
					setState(146);
					match(TYPEID);
					setState(147);
					match(CASE_ARROW);
					setState(148);
					expression(0);
					setState(149);
					match(SEMICOLON);
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OBJECTID );
				setState(155);
				match(ESAC);
				}
				break;
			case 7:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(NEW);
				setState(158);
				match(TYPEID);
				}
				break;
			case 8:
				{
				_localctx = new NegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(MINUS);
				setState(160);
				expression(16);
				}
				break;
			case 9:
				{
				_localctx = new IsvoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(ISVOID);
				setState(162);
				expression(15);
				}
				break;
			case 10:
				{
				_localctx = new BoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(NOT);
				setState(164);
				expression(7);
				}
				break;
			case 11:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(LPAREN);
				setState(166);
				expression(0);
				setState(167);
				match(RPAREN);
				}
				break;
			case 12:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(OBJECTID);
				}
				break;
			case 13:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(INT);
				}
				break;
			case 14:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(STRING);
				}
				break;
			case 15:
				{
				_localctx = new TrueOrFlaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(BOOL_CONST);
				}
				break;
			case 16:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(OBJECTID);
				setState(174);
				match(ASSIGNMENT);
				setState(175);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(179);
						match(MULTIPLY);
						setState(180);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(182);
						match(DIVISION);
						setState(183);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(185);
						match(ADD);
						setState(186);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(188);
						match(MINUS);
						setState(189);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new LessThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(191);
						match(LESS_THAN);
						setState(192);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new LessEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(194);
						match(LESS_EQUAL);
						setState(195);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new EqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(197);
						match(EQUAL);
						setState(198);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new MethodCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(202);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ATSYM) {
							{
							setState(200);
							match(ATSYM);
							setState(201);
							match(TYPEID);
							}
						}

						setState(204);
						match(DOT);
						setState(205);
						match(OBJECTID);
						setState(206);
						match(LPAREN);
						setState(217);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << LBRACE) | (1L << CASE) | (1L << IF) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << BOOL_CONST) | (1L << INT) | (1L << OBJECTID) | (1L << STRING))) != 0)) {
							{
							{
							setState(207);
							expression(0);
							setState(212);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(208);
								match(COMMA);
								setState(209);
								expression(0);
								}
								}
								setState(214);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							setState(219);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(220);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 24);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00e5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\6\3\25"+
		"\n\3\r\3\16\3\26\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\5\4 \n\4\3\4\3\4\3\4\3"+
		"\4\7\4&\n\4\f\4\16\4)\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\62\n\5\f\5"+
		"\16\5\65\13\5\7\5\67\n\5\f\5\16\5:\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5H\n\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7V\n\7\f\7\16\7Y\13\7\7\7[\n\7\f\7\16\7^\13\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7s\n\7"+
		"\r\7\16\7t\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\177\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u0087\n\7\7\7\u0089\n\7\f\7\16\7\u008c\13\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u009a\n\7\r\7\16\7\u009b\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u00b3\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00cd\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u00d5\n\7\f\7\16\7\u00d8\13\7\7\7\u00da\n\7\f\7\16"+
		"\7\u00dd\13\7\3\7\7\7\u00e0\n\7\f\7\16\7\u00e3\13\7\3\7\2\3\f\b\2\4\6"+
		"\b\n\f\2\2\2\u0107\2\16\3\2\2\2\4\31\3\2\2\2\6\33\3\2\2\2\bI\3\2\2\2\n"+
		"K\3\2\2\2\f\u00b2\3\2\2\2\16\17\5\4\3\2\17\20\b\2\1\2\20\3\3\2\2\2\21"+
		"\22\5\6\4\2\22\23\7\3\2\2\23\25\3\2\2\2\24\21\3\2\2\2\25\26\3\2\2\2\26"+
		"\24\3\2\2\2\26\27\3\2\2\2\27\32\3\2\2\2\30\32\7\2\2\3\31\24\3\2\2\2\31"+
		"\30\3\2\2\2\32\5\3\2\2\2\33\34\7\37\2\2\34\37\7)\2\2\35\36\7!\2\2\36 "+
		"\7)\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\'\7\20\2\2\"#\5\b\5\2#$\7"+
		"\3\2\2$&\3\2\2\2%\"\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2"+
		")\'\3\2\2\2*+\7\21\2\2+\7\3\2\2\2,-\7*\2\2-8\7\5\2\2.\63\5\n\6\2/\60\7"+
		"\7\2\2\60\62\5\n\6\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2"+
		"\2\2\64\67\3\2\2\2\65\63\3\2\2\2\66.\3\2\2\2\67:\3\2\2\28\66\3\2\2\28"+
		"9\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\6\2\2<=\7\25\2\2=>\7)\2\2>?\7\20\2\2"+
		"?@\5\f\7\2@A\7\21\2\2AJ\3\2\2\2BC\7*\2\2CD\7\25\2\2DG\7)\2\2EF\7\23\2"+
		"\2FH\5\f\7\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2I,\3\2\2\2IB\3\2\2\2J\t\3\2"+
		"\2\2KL\7*\2\2LM\7\25\2\2MN\7)\2\2N\13\3\2\2\2OP\b\7\1\2PQ\7*\2\2Q\\\7"+
		"\5\2\2RW\5\f\7\2ST\7\7\2\2TV\5\f\7\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3"+
		"\2\2\2X[\3\2\2\2YW\3\2\2\2ZR\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]"+
		"_\3\2\2\2^\\\3\2\2\2_\u00b3\7\6\2\2`a\7\30\2\2ab\5\f\7\2bc\7\33\2\2cd"+
		"\5\f\7\2de\7\34\2\2ef\5\f\7\2fg\7\31\2\2g\u00b3\3\2\2\2hi\7\32\2\2ij\5"+
		"\f\7\2jk\7\35\2\2kl\5\f\7\2lm\7\36\2\2m\u00b3\3\2\2\2nr\7\20\2\2op\5\f"+
		"\7\2pq\7\3\2\2qs\3\2\2\2ro\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2"+
		"\2\2vw\7\21\2\2w\u00b3\3\2\2\2xy\7#\2\2yz\7*\2\2z{\7\25\2\2{~\7)\2\2|"+
		"}\7\23\2\2}\177\5\f\7\2~|\3\2\2\2~\177\3\2\2\2\177\u008a\3\2\2\2\u0080"+
		"\u0081\7\7\2\2\u0081\u0082\7*\2\2\u0082\u0083\7\25\2\2\u0083\u0086\7)"+
		"\2\2\u0084\u0085\7\23\2\2\u0085\u0087\5\f\7\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0080\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7 \2\2\u008e\u00b3\5\f\7\25\u008f\u0090\7\26"+
		"\2\2\u0090\u0091\5\f\7\2\u0091\u0099\7\"\2\2\u0092\u0093\7*\2\2\u0093"+
		"\u0094\7\25\2\2\u0094\u0095\7)\2\2\u0095\u0096\7\4\2\2\u0096\u0097\5\f"+
		"\7\2\u0097\u0098\7\3\2\2\u0098\u009a\3\2\2\2\u0099\u0092\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\7\27\2\2\u009e\u00b3\3\2\2\2\u009f\u00a0\7$\2\2\u00a0"+
		"\u00b3\7)\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00b3\5\f\7\22\u00a3\u00a4\7%"+
		"\2\2\u00a4\u00b3\5\f\7\21\u00a5\u00a6\7&\2\2\u00a6\u00b3\5\f\7\t\u00a7"+
		"\u00a8\7\5\2\2\u00a8\u00a9\5\f\7\2\u00a9\u00aa\7\6\2\2\u00aa\u00b3\3\2"+
		"\2\2\u00ab\u00b3\7*\2\2\u00ac\u00b3\7(\2\2\u00ad\u00b3\7+\2\2\u00ae\u00b3"+
		"\7\'\2\2\u00af\u00b0\7*\2\2\u00b0\u00b1\7\23\2\2\u00b1\u00b3\5\f\7\3\u00b2"+
		"O\3\2\2\2\u00b2`\3\2\2\2\u00b2h\3\2\2\2\u00b2n\3\2\2\2\u00b2x\3\2\2\2"+
		"\u00b2\u008f\3\2\2\2\u00b2\u009f\3\2\2\2\u00b2\u00a1\3\2\2\2\u00b2\u00a3"+
		"\3\2\2\2\u00b2\u00a5\3\2\2\2\u00b2\u00a7\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2"+
		"\u00ac\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2"+
		"\2\2\u00b3\u00e1\3\2\2\2\u00b4\u00b5\f\20\2\2\u00b5\u00b6\7\n\2\2\u00b6"+
		"\u00e0\5\f\7\21\u00b7\u00b8\f\17\2\2\u00b8\u00b9\7\13\2\2\u00b9\u00e0"+
		"\5\f\7\20\u00ba\u00bb\f\16\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00e0\5\f\7\17"+
		"\u00bd\u00be\f\r\2\2\u00be\u00bf\7\t\2\2\u00bf\u00e0\5\f\7\16\u00c0\u00c1"+
		"\f\f\2\2\u00c1\u00c2\7\r\2\2\u00c2\u00e0\5\f\7\r\u00c3\u00c4\f\13\2\2"+
		"\u00c4\u00c5\7\16\2\2\u00c5\u00e0\5\f\7\f\u00c6\u00c7\f\n\2\2\u00c7\u00c8"+
		"\7\17\2\2\u00c8\u00e0\5\f\7\13\u00c9\u00cc\f\32\2\2\u00ca\u00cb\7\24\2"+
		"\2\u00cb\u00cd\7)\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\7\22\2\2\u00cf\u00d0\7*\2\2\u00d0\u00db\7\5\2\2\u00d1"+
		"\u00d6\5\f\7\2\u00d2\u00d3\7\7\2\2\u00d3\u00d5\5\f\7\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00d1\3\2\2\2\u00da\u00dd\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00e0\7\6\2\2\u00df\u00b4\3\2\2\2\u00df\u00b7\3\2"+
		"\2\2\u00df\u00ba\3\2\2\2\u00df\u00bd\3\2\2\2\u00df\u00c0\3\2\2\2\u00df"+
		"\u00c3\3\2\2\2\u00df\u00c6\3\2\2\2\u00df\u00c9\3\2\2\2\u00e0\u00e3\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\r\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\27\26\31\37\'\638GIW\\t~\u0086\u008a\u009b\u00b2\u00cc\u00d6"+
		"\u00db\u00df\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}