// Generated from C:/Users/WanTEd/IdeaProjects/COOL PROJECT/src\CoolLexer.g4 by ANTLR 4.7.2
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
		OBJECTID=40;
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
			"ISVOID", "NOT", "DIGIT", "LLETTER", "ULETTER", "LETTER", "TRUE", "FALSE", 
			"BOOL_CONST", "INT_CONST", "TYPEID", "OBJECTID"
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
			"ISVOID", "NOT", "BOOL_CONST", "INT_CONST", "TYPEID", "OBJECTID"
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
	public String getGrammarFileName() { return "CoolLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0107\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\5,\u00ef\n,"+
		"\3-\6-\u00f2\n-\r-\16-\u00f3\3.\3.\3.\3.\7.\u00fa\n.\f.\16.\u00fd\13."+
		"\3/\3/\3/\3/\7/\u0103\n/\f/\16/\u0106\13/\2\2\60\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2"+
		"O\2Q\2S\2U\2W\'Y([)]*\3\2\24\4\2EEee\4\2CCcc\4\2UUuu\4\2GGgg\4\2KKkk\4"+
		"\2HHhh\4\2YYyy\4\2JJjj\4\2NNnn\4\2VVvv\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTt"+
		"t\4\2XXxx\4\2FFff\4\2C\\c|\4\2WWww\2\u0108\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7d\3\2\2\2\tf\3\2"+
		"\2\2\13h\3\2\2\2\rj\3\2\2\2\17l\3\2\2\2\21n\3\2\2\2\23p\3\2\2\2\25r\3"+
		"\2\2\2\27t\3\2\2\2\31v\3\2\2\2\33y\3\2\2\2\35{\3\2\2\2\37}\3\2\2\2!\177"+
		"\3\2\2\2#\u0081\3\2\2\2%\u0084\3\2\2\2\'\u0086\3\2\2\2)\u0088\3\2\2\2"+
		"+\u008d\3\2\2\2-\u0092\3\2\2\2/\u0095\3\2\2\2\61\u0098\3\2\2\2\63\u009e"+
		"\3\2\2\2\65\u00a3\3\2\2\2\67\u00a8\3\2\2\29\u00ad\3\2\2\2;\u00b2\3\2\2"+
		"\2=\u00b8\3\2\2\2?\u00bb\3\2\2\2A\u00c3\3\2\2\2C\u00c6\3\2\2\2E\u00ca"+
		"\3\2\2\2G\u00ce\3\2\2\2I\u00d5\3\2\2\2K\u00d9\3\2\2\2M\u00db\3\2\2\2O"+
		"\u00dd\3\2\2\2Q\u00df\3\2\2\2S\u00e1\3\2\2\2U\u00e6\3\2\2\2W\u00ee\3\2"+
		"\2\2Y\u00f1\3\2\2\2[\u00f5\3\2\2\2]\u00fe\3\2\2\2_`\7=\2\2`\4\3\2\2\2"+
		"ab\7?\2\2bc\7@\2\2c\6\3\2\2\2de\7*\2\2e\b\3\2\2\2fg\7+\2\2g\n\3\2\2\2"+
		"hi\7.\2\2i\f\3\2\2\2jk\7-\2\2k\16\3\2\2\2lm\7/\2\2m\20\3\2\2\2no\7,\2"+
		"\2o\22\3\2\2\2pq\7\61\2\2q\24\3\2\2\2rs\7\u0080\2\2s\26\3\2\2\2tu\7>\2"+
		"\2u\30\3\2\2\2vw\7>\2\2wx\7?\2\2x\32\3\2\2\2yz\7?\2\2z\34\3\2\2\2{|\7"+
		"}\2\2|\36\3\2\2\2}~\7\177\2\2~ \3\2\2\2\177\u0080\7\60\2\2\u0080\"\3\2"+
		"\2\2\u0081\u0082\7>\2\2\u0082\u0083\7/\2\2\u0083$\3\2\2\2\u0084\u0085"+
		"\7B\2\2\u0085&\3\2\2\2\u0086\u0087\7<\2\2\u0087(\3\2\2\2\u0088\u0089\t"+
		"\2\2\2\u0089\u008a\t\3\2\2\u008a\u008b\t\4\2\2\u008b\u008c\t\5\2\2\u008c"+
		"*\3\2\2\2\u008d\u008e\t\5\2\2\u008e\u008f\t\4\2\2\u008f\u0090\t\3\2\2"+
		"\u0090\u0091\t\2\2\2\u0091,\3\2\2\2\u0092\u0093\t\6\2\2\u0093\u0094\t"+
		"\7\2\2\u0094.\3\2\2\2\u0095\u0096\t\7\2\2\u0096\u0097\t\6\2\2\u0097\60"+
		"\3\2\2\2\u0098\u0099\t\b\2\2\u0099\u009a\t\t\2\2\u009a\u009b\t\6\2\2\u009b"+
		"\u009c\t\n\2\2\u009c\u009d\t\5\2\2\u009d\62\3\2\2\2\u009e\u009f\t\13\2"+
		"\2\u009f\u00a0\t\t\2\2\u00a0\u00a1\t\5\2\2\u00a1\u00a2\t\f\2\2\u00a2\64"+
		"\3\2\2\2\u00a3\u00a4\t\5\2\2\u00a4\u00a5\t\n\2\2\u00a5\u00a6\t\4\2\2\u00a6"+
		"\u00a7\t\5\2\2\u00a7\66\3\2\2\2\u00a8\u00a9\t\n\2\2\u00a9\u00aa\t\r\2"+
		"\2\u00aa\u00ab\t\r\2\2\u00ab\u00ac\t\16\2\2\u00ac8\3\2\2\2\u00ad\u00ae"+
		"\t\16\2\2\u00ae\u00af\t\r\2\2\u00af\u00b0\t\r\2\2\u00b0\u00b1\t\n\2\2"+
		"\u00b1:\3\2\2\2\u00b2\u00b3\t\2\2\2\u00b3\u00b4\t\n\2\2\u00b4\u00b5\t"+
		"\3\2\2\u00b5\u00b6\t\4\2\2\u00b6\u00b7\t\4\2\2\u00b7<\3\2\2\2\u00b8\u00b9"+
		"\t\6\2\2\u00b9\u00ba\t\f\2\2\u00ba>\3\2\2\2\u00bb\u00bc\t\6\2\2\u00bc"+
		"\u00bd\t\t\2\2\u00bd\u00be\t\5\2\2\u00be\u00bf\t\17\2\2\u00bf\u00c0\t"+
		"\6\2\2\u00c0\u00c1\t\13\2\2\u00c1\u00c2\t\4\2\2\u00c2@\3\2\2\2\u00c3\u00c4"+
		"\t\r\2\2\u00c4\u00c5\t\7\2\2\u00c5B\3\2\2\2\u00c6\u00c7\t\n\2\2\u00c7"+
		"\u00c8\t\5\2\2\u00c8\u00c9\t\13\2\2\u00c9D\3\2\2\2\u00ca\u00cb\t\f\2\2"+
		"\u00cb\u00cc\t\5\2\2\u00cc\u00cd\t\b\2\2\u00cdF\3\2\2\2\u00ce\u00cf\t"+
		"\6\2\2\u00cf\u00d0\t\4\2\2\u00d0\u00d1\t\20\2\2\u00d1\u00d2\t\r\2\2\u00d2"+
		"\u00d3\t\6\2\2\u00d3\u00d4\t\21\2\2\u00d4H\3\2\2\2\u00d5\u00d6\t\f\2\2"+
		"\u00d6\u00d7\t\r\2\2\u00d7\u00d8\t\13\2\2\u00d8J\3\2\2\2\u00d9\u00da\4"+
		"\62;\2\u00daL\3\2\2\2\u00db\u00dc\4c|\2\u00dcN\3\2\2\2\u00dd\u00de\4C"+
		"\\\2\u00deP\3\2\2\2\u00df\u00e0\t\22\2\2\u00e0R\3\2\2\2\u00e1\u00e2\7"+
		"v\2\2\u00e2\u00e3\t\17\2\2\u00e3\u00e4\t\23\2\2\u00e4\u00e5\t\5\2\2\u00e5"+
		"T\3\2\2\2\u00e6\u00e7\7h\2\2\u00e7\u00e8\t\3\2\2\u00e8\u00e9\t\n\2\2\u00e9"+
		"\u00ea\t\4\2\2\u00ea\u00eb\t\5\2\2\u00ebV\3\2\2\2\u00ec\u00ef\5S*\2\u00ed"+
		"\u00ef\5U+\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00efX\3\2\2\2\u00f0"+
		"\u00f2\5K&\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2"+
		"\2\u00f3\u00f4\3\2\2\2\u00f4Z\3\2\2\2\u00f5\u00fb\5O(\2\u00f6\u00fa\7"+
		"a\2\2\u00f7\u00fa\5Q)\2\u00f8\u00fa\5K&\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\\\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0104\5M\'\2"+
		"\u00ff\u0103\7a\2\2\u0100\u0103\5Q)\2\u0101\u0103\5K&\2\u0102\u00ff\3"+
		"\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105^\3\2\2\2\u0106\u0104\3\2\2\2"+
		"\t\2\u00ee\u00f3\u00f9\u00fb\u0102\u0104\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}