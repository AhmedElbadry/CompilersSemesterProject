// Generated from C:/Users/Ahmed/Desktop/CompilersSemesterProject/COOL PROJECT/src\Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COMMA", "PLUS", "MINUS", 
			"STAR", "SLASH", "TILDE", "LT", "LE", "EQUALS", "LBRACE", "RBRACE", "DOT", 
			"ASSIGN", "ATSYM", "COLON", "CASE", "ESAC", "IF", "FI", "WHILE", "THEN", 
			"ELSE", "LOOP", "POOL", "CLASS", "IN", "INHERITS", "OF", "LET", "NEW", 
			"ISVOID", "NOT", "SYMBOL", "DIGIT", "LLETTER", "ULETTER", "LETTER", "TRUE", 
			"FALSE", "BOOL_CONST", "INT_CONST", "TYPEID", "OBJECTID", "STRING", "WS", 
			"INVALID"
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


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cool.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0120\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#"+
		"\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\5-\u00f9\n-\3.\6.\u00fc\n.\r.\16.\u00fd"+
		"\3/\3/\3/\3/\7/\u0104\n/\f/\16/\u0107\13/\3\60\3\60\3\60\3\60\7\60\u010d"+
		"\n\60\f\60\16\60\u0110\13\60\3\61\3\61\7\61\u0114\n\61\f\61\16\61\u0117"+
		"\13\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\2M\2O\2Q\2S\2U\2W\2Y\'[(])_*a+c,e-\3\2\26\4\2EEee\4\2CCcc\4\2UUuu\4\2"+
		"GGgg\4\2KKkk\4\2HHhh\4\2YYyy\4\2JJjj\4\2NNnn\4\2VVvv\4\2PPpp\4\2QQqq\4"+
		"\2RRrr\4\2TTtt\4\2XXxx\4\2FFff\4\2C\\c|\4\2WWww\3\2$$\5\2\13\f\17\17\""+
		"\"\2\u0121\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a"+
		"\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7l\3\2\2\2\tn\3\2"+
		"\2\2\13p\3\2\2\2\rr\3\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23x\3\2\2\2\25z\3"+
		"\2\2\2\27|\3\2\2\2\31~\3\2\2\2\33\u0081\3\2\2\2\35\u0083\3\2\2\2\37\u0085"+
		"\3\2\2\2!\u0087\3\2\2\2#\u0089\3\2\2\2%\u008c\3\2\2\2\'\u008e\3\2\2\2"+
		")\u0090\3\2\2\2+\u0095\3\2\2\2-\u009a\3\2\2\2/\u009d\3\2\2\2\61\u00a0"+
		"\3\2\2\2\63\u00a6\3\2\2\2\65\u00ab\3\2\2\2\67\u00b0\3\2\2\29\u00b5\3\2"+
		"\2\2;\u00ba\3\2\2\2=\u00c0\3\2\2\2?\u00c3\3\2\2\2A\u00cb\3\2\2\2C\u00ce"+
		"\3\2\2\2E\u00d2\3\2\2\2G\u00d6\3\2\2\2I\u00dd\3\2\2\2K\u00e1\3\2\2\2M"+
		"\u00e3\3\2\2\2O\u00e5\3\2\2\2Q\u00e7\3\2\2\2S\u00e9\3\2\2\2U\u00eb\3\2"+
		"\2\2W\u00f0\3\2\2\2Y\u00f8\3\2\2\2[\u00fb\3\2\2\2]\u00ff\3\2\2\2_\u0108"+
		"\3\2\2\2a\u0111\3\2\2\2c\u011a\3\2\2\2e\u011e\3\2\2\2gh\7=\2\2h\4\3\2"+
		"\2\2ij\7?\2\2jk\7@\2\2k\6\3\2\2\2lm\7*\2\2m\b\3\2\2\2no\7+\2\2o\n\3\2"+
		"\2\2pq\7.\2\2q\f\3\2\2\2rs\7-\2\2s\16\3\2\2\2tu\7/\2\2u\20\3\2\2\2vw\7"+
		",\2\2w\22\3\2\2\2xy\7\61\2\2y\24\3\2\2\2z{\7\u0080\2\2{\26\3\2\2\2|}\7"+
		">\2\2}\30\3\2\2\2~\177\7>\2\2\177\u0080\7?\2\2\u0080\32\3\2\2\2\u0081"+
		"\u0082\7?\2\2\u0082\34\3\2\2\2\u0083\u0084\7}\2\2\u0084\36\3\2\2\2\u0085"+
		"\u0086\7\177\2\2\u0086 \3\2\2\2\u0087\u0088\7\60\2\2\u0088\"\3\2\2\2\u0089"+
		"\u008a\7>\2\2\u008a\u008b\7/\2\2\u008b$\3\2\2\2\u008c\u008d\7B\2\2\u008d"+
		"&\3\2\2\2\u008e\u008f\7<\2\2\u008f(\3\2\2\2\u0090\u0091\t\2\2\2\u0091"+
		"\u0092\t\3\2\2\u0092\u0093\t\4\2\2\u0093\u0094\t\5\2\2\u0094*\3\2\2\2"+
		"\u0095\u0096\t\5\2\2\u0096\u0097\t\4\2\2\u0097\u0098\t\3\2\2\u0098\u0099"+
		"\t\2\2\2\u0099,\3\2\2\2\u009a\u009b\t\6\2\2\u009b\u009c\t\7\2\2\u009c"+
		".\3\2\2\2\u009d\u009e\t\7\2\2\u009e\u009f\t\6\2\2\u009f\60\3\2\2\2\u00a0"+
		"\u00a1\t\b\2\2\u00a1\u00a2\t\t\2\2\u00a2\u00a3\t\6\2\2\u00a3\u00a4\t\n"+
		"\2\2\u00a4\u00a5\t\5\2\2\u00a5\62\3\2\2\2\u00a6\u00a7\t\13\2\2\u00a7\u00a8"+
		"\t\t\2\2\u00a8\u00a9\t\5\2\2\u00a9\u00aa\t\f\2\2\u00aa\64\3\2\2\2\u00ab"+
		"\u00ac\t\5\2\2\u00ac\u00ad\t\n\2\2\u00ad\u00ae\t\4\2\2\u00ae\u00af\t\5"+
		"\2\2\u00af\66\3\2\2\2\u00b0\u00b1\t\n\2\2\u00b1\u00b2\t\r\2\2\u00b2\u00b3"+
		"\t\r\2\2\u00b3\u00b4\t\16\2\2\u00b48\3\2\2\2\u00b5\u00b6\t\16\2\2\u00b6"+
		"\u00b7\t\r\2\2\u00b7\u00b8\t\r\2\2\u00b8\u00b9\t\n\2\2\u00b9:\3\2\2\2"+
		"\u00ba\u00bb\t\2\2\2\u00bb\u00bc\t\n\2\2\u00bc\u00bd\t\3\2\2\u00bd\u00be"+
		"\t\4\2\2\u00be\u00bf\t\4\2\2\u00bf<\3\2\2\2\u00c0\u00c1\t\6\2\2\u00c1"+
		"\u00c2\t\f\2\2\u00c2>\3\2\2\2\u00c3\u00c4\t\6\2\2\u00c4\u00c5\t\t\2\2"+
		"\u00c5\u00c6\t\5\2\2\u00c6\u00c7\t\17\2\2\u00c7\u00c8\t\6\2\2\u00c8\u00c9"+
		"\t\13\2\2\u00c9\u00ca\t\4\2\2\u00ca@\3\2\2\2\u00cb\u00cc\t\r\2\2\u00cc"+
		"\u00cd\t\7\2\2\u00cdB\3\2\2\2\u00ce\u00cf\t\n\2\2\u00cf\u00d0\t\5\2\2"+
		"\u00d0\u00d1\t\13\2\2\u00d1D\3\2\2\2\u00d2\u00d3\t\f\2\2\u00d3\u00d4\t"+
		"\5\2\2\u00d4\u00d5\t\b\2\2\u00d5F\3\2\2\2\u00d6\u00d7\t\6\2\2\u00d7\u00d8"+
		"\t\4\2\2\u00d8\u00d9\t\20\2\2\u00d9\u00da\t\r\2\2\u00da\u00db\t\6\2\2"+
		"\u00db\u00dc\t\21\2\2\u00dcH\3\2\2\2\u00dd\u00de\t\f\2\2\u00de\u00df\t"+
		"\r\2\2\u00df\u00e0\t\13\2\2\u00e0J\3\2\2\2\u00e1\u00e2\7#\2\2\u00e2L\3"+
		"\2\2\2\u00e3\u00e4\4\62;\2\u00e4N\3\2\2\2\u00e5\u00e6\4c|\2\u00e6P\3\2"+
		"\2\2\u00e7\u00e8\4C\\\2\u00e8R\3\2\2\2\u00e9\u00ea\t\22\2\2\u00eaT\3\2"+
		"\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\t\17\2\2\u00ed\u00ee\t\23\2\2\u00ee"+
		"\u00ef\t\5\2\2\u00efV\3\2\2\2\u00f0\u00f1\7h\2\2\u00f1\u00f2\t\3\2\2\u00f2"+
		"\u00f3\t\n\2\2\u00f3\u00f4\t\4\2\2\u00f4\u00f5\t\5\2\2\u00f5X\3\2\2\2"+
		"\u00f6\u00f9\5U+\2\u00f7\u00f9\5W,\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3"+
		"\2\2\2\u00f9Z\3\2\2\2\u00fa\u00fc\5M\'\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\\\3\2\2\2\u00ff"+
		"\u0105\5Q)\2\u0100\u0104\7a\2\2\u0101\u0104\5S*\2\u0102\u0104\5M\'\2\u0103"+
		"\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106^\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0108\u010e\5O(\2\u0109\u010d\7a\2\2\u010a\u010d\5S*\2\u010b"+
		"\u010d\5M\'\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2"+
		"\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"`\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0115\7$\2\2\u0112\u0114\n\24\2\2"+
		"\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7$\2\2\u0119"+
		"b\3\2\2\2\u011a\u011b\t\25\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b\62\2"+
		"\2\u011dd\3\2\2\2\u011e\u011f\13\2\2\2\u011ff\3\2\2\2\n\2\u00f8\u00fd"+
		"\u0103\u0105\u010c\u010e\u0115\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}