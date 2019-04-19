// Generated from C:/Users/Ahmed/Desktop/CompilersSemesterProject/COOL PROJECT/src\Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, DARROW=2, LPAREN=3, RPAREN=4, COMMA=5, PLUS=6, MINUS=7, STAR=8, 
		SLASH=9, TILDE=10, LT=11, LE=12, EQUALS=13, LBRACE=14, RBRACE=15, DOT=16, 
		ASSIGN=17, ATSYM=18, COLON=19, CASE=20, ESAC=21, IF=22, FI=23, WHILE=24, 
		THEN=25, ELSE=26, LOOP=27, POOL=28, CLASS=29, IN=30, INHERITS=31, OF=32, 
		LET=33, NEW=34, ISVOID=35, NOT=36, BOOL_CONST=37, INT_CONST=38, TYPEID=39, 
		OBJECTID=40, STRING=41, WS=42, INVALID=43;
	public static final int
		RULE_expr = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr"
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
			null, "SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COMMA", "PLUS", "MINUS", 
			"STAR", "SLASH", "TILDE", "LT", "LE", "EQUALS", "LBRACE", "RBRACE", "DOT", 
			"ASSIGN", "ATSYM", "COLON", "CASE", "ESAC", "IF", "FI", "WHILE", "THEN", 
			"ELSE", "LOOP", "POOL", "CLASS", "IN", "INHERITS", "OF", "LET", "NEW", 
			"ISVOID", "NOT", "BOOL_CONST", "INT_CONST", "TYPEID", "OBJECTID", "STRING", 
			"WS", "INVALID"
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
	public String getGrammarFileName() { return "Cool.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprContext extends ParserRuleContext {
		public Token OBJECTID;
		public TerminalNode TYPEID() { return getToken(CoolParser.TYPEID, 0); }
		public List<TerminalNode> INT_CONST() { return getTokens(CoolParser.INT_CONST); }
		public TerminalNode INT_CONST(int i) {
			return getToken(CoolParser.INT_CONST, i);
		}
		public TerminalNode SEMICOLON() { return getToken(CoolParser.SEMICOLON, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(TYPEID);
			setState(4); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3);
					((ExprContext)_localctx).OBJECTID = match(INT_CONST);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(6); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(8);
			match(INT_CONST);
			setState(9);
			match(SEMICOLON);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\16\4\2\t\2\3\2\3"+
		"\2\6\2\7\n\2\r\2\16\2\b\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\r\2\4\3\2\2\2\4"+
		"\6\7)\2\2\5\7\7(\2\2\6\5\3\2\2\2\7\b\3\2\2\2\b\6\3\2\2\2\b\t\3\2\2\2\t"+
		"\n\3\2\2\2\n\13\7(\2\2\13\f\7\3\2\2\f\3\3\2\2\2\3\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}