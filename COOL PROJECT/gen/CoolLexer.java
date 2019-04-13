// Generated from C:/Users/Khaled/Desktop/CompilersSemesterProject/COOL PROJECT/src\CoolLexer.g4 by ANTLR 4.7.2
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
		WS=1, INVALID=2, SEMICOLON=3, DARROW=4, LPAREN=5, RPAREN=6, COMMA=7, PLUS=8, 
		MINUS=9, STAR=10, SLASH=11, TILDE=12, LT=13, LE=14, EQUALS=15, LBRACE=16, 
		RBRACE=17, DOT=18, ASSIGN=19, ATSYM=20, COLON=21, CASE=22, ESAC=23, IF=24, 
		FI=25, WHILE=26, THEN=27, ELSE=28, LOOP=29, POOL=30, CLASS=31, IN=32, 
		INHERITS=33, OF=34, LET=35, NEW=36, ISVOID=37, NOT=38, BOOL_CONST=39, 
		INT_CONST=40, TYPEID=41, OBJECTID=42, STRING=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "INVALID", "SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COMMA", 
			"PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LT", "LE", "EQUALS", "LBRACE", 
			"RBRACE", "DOT", "ASSIGN", "ATSYM", "COLON", "CASE", "ESAC", "IF", "FI", 
			"WHILE", "THEN", "ELSE", "LOOP", "POOL", "CLASS", "IN", "INHERITS", "OF", 
			"LET", "NEW", "ISVOID", "NOT", "SYMBOL", "DIGIT", "LLETTER", "ULETTER", 
			"LETTER", "TRUE", "FALSE", "BOOL_CONST", "INT_CONST", "TYPEID", "OBJECTID", 
			"STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "';'", "'=>'", "'('", "')'", "','", "'+'", "'-'", "'*'", 
			"'/'", "'~'", "'<'", "'<='", "'='", "'{'", "'}'", "'.'", "'<-'", "'@'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "INVALID", "SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COMMA", 
			"PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LT", "LE", "EQUALS", "LBRACE", 
			"RBRACE", "DOT", "ASSIGN", "ATSYM", "COLON", "CASE", "ESAC", "IF", "FI", 
			"WHILE", "THEN", "ELSE", "LOOP", "POOL", "CLASS", "IN", "INHERITS", "OF", 
			"LET", "NEW", "ISVOID", "NOT", "BOOL_CONST", "INT_CONST", "TYPEID", "OBJECTID", 
			"STRING"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0123\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\5/\u00ff\n/\3\60"+
		"\6\60\u0102\n\60\r\60\16\60\u0103\3\61\3\61\3\61\3\61\7\61\u010a\n\61"+
		"\f\61\16\61\u010d\13\61\3\62\3\62\3\62\3\62\7\62\u0113\n\62\f\62\16\62"+
		"\u0116\13\62\3\63\3\63\3\63\3\63\3\63\7\63\u011d\n\63\f\63\16\63\u0120"+
		"\13\63\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S\2U\2W\2Y\2[\2])_*a"+
		"+c,e-\3\2\26\5\2\13\f\17\17\"\"\4\2EEee\4\2CCcc\4\2UUuu\4\2GGgg\4\2KK"+
		"kk\4\2HHhh\4\2YYyy\4\2JJjj\4\2NNnn\4\2VVvv\4\2PPpp\4\2QQqq\4\2RRrr\4\2"+
		"TTtt\4\2XXxx\4\2FFff\4\2C\\c|\4\2WWww\4\2$$))\2\u0127\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\3g\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\to\3\2\2\2\13r\3\2\2\2\rt\3\2\2"+
		"\2\17v\3\2\2\2\21x\3\2\2\2\23z\3\2\2\2\25|\3\2\2\2\27~\3\2\2\2\31\u0080"+
		"\3\2\2\2\33\u0082\3\2\2\2\35\u0084\3\2\2\2\37\u0087\3\2\2\2!\u0089\3\2"+
		"\2\2#\u008b\3\2\2\2%\u008d\3\2\2\2\'\u008f\3\2\2\2)\u0092\3\2\2\2+\u0094"+
		"\3\2\2\2-\u0096\3\2\2\2/\u009b\3\2\2\2\61\u00a0\3\2\2\2\63\u00a3\3\2\2"+
		"\2\65\u00a6\3\2\2\2\67\u00ac\3\2\2\29\u00b1\3\2\2\2;\u00b6\3\2\2\2=\u00bb"+
		"\3\2\2\2?\u00c0\3\2\2\2A\u00c6\3\2\2\2C\u00c9\3\2\2\2E\u00d1\3\2\2\2G"+
		"\u00d4\3\2\2\2I\u00d8\3\2\2\2K\u00dc\3\2\2\2M\u00e3\3\2\2\2O\u00e7\3\2"+
		"\2\2Q\u00e9\3\2\2\2S\u00eb\3\2\2\2U\u00ed\3\2\2\2W\u00ef\3\2\2\2Y\u00f1"+
		"\3\2\2\2[\u00f6\3\2\2\2]\u00fe\3\2\2\2_\u0101\3\2\2\2a\u0105\3\2\2\2c"+
		"\u010e\3\2\2\2e\u0117\3\2\2\2gh\t\2\2\2hi\3\2\2\2ij\b\2\2\2j\4\3\2\2\2"+
		"kl\13\2\2\2l\6\3\2\2\2mn\7=\2\2n\b\3\2\2\2op\7?\2\2pq\7@\2\2q\n\3\2\2"+
		"\2rs\7*\2\2s\f\3\2\2\2tu\7+\2\2u\16\3\2\2\2vw\7.\2\2w\20\3\2\2\2xy\7-"+
		"\2\2y\22\3\2\2\2z{\7/\2\2{\24\3\2\2\2|}\7,\2\2}\26\3\2\2\2~\177\7\61\2"+
		"\2\177\30\3\2\2\2\u0080\u0081\7\u0080\2\2\u0081\32\3\2\2\2\u0082\u0083"+
		"\7>\2\2\u0083\34\3\2\2\2\u0084\u0085\7>\2\2\u0085\u0086\7?\2\2\u0086\36"+
		"\3\2\2\2\u0087\u0088\7?\2\2\u0088 \3\2\2\2\u0089\u008a\7}\2\2\u008a\""+
		"\3\2\2\2\u008b\u008c\7\177\2\2\u008c$\3\2\2\2\u008d\u008e\7\60\2\2\u008e"+
		"&\3\2\2\2\u008f\u0090\7>\2\2\u0090\u0091\7/\2\2\u0091(\3\2\2\2\u0092\u0093"+
		"\7B\2\2\u0093*\3\2\2\2\u0094\u0095\7<\2\2\u0095,\3\2\2\2\u0096\u0097\t"+
		"\3\2\2\u0097\u0098\t\4\2\2\u0098\u0099\t\5\2\2\u0099\u009a\t\6\2\2\u009a"+
		".\3\2\2\2\u009b\u009c\t\6\2\2\u009c\u009d\t\5\2\2\u009d\u009e\t\4\2\2"+
		"\u009e\u009f\t\3\2\2\u009f\60\3\2\2\2\u00a0\u00a1\t\7\2\2\u00a1\u00a2"+
		"\t\b\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\t\b\2\2\u00a4\u00a5\t\7\2\2\u00a5"+
		"\64\3\2\2\2\u00a6\u00a7\t\t\2\2\u00a7\u00a8\t\n\2\2\u00a8\u00a9\t\7\2"+
		"\2\u00a9\u00aa\t\13\2\2\u00aa\u00ab\t\6\2\2\u00ab\66\3\2\2\2\u00ac\u00ad"+
		"\t\f\2\2\u00ad\u00ae\t\n\2\2\u00ae\u00af\t\6\2\2\u00af\u00b0\t\r\2\2\u00b0"+
		"8\3\2\2\2\u00b1\u00b2\t\6\2\2\u00b2\u00b3\t\13\2\2\u00b3\u00b4\t\5\2\2"+
		"\u00b4\u00b5\t\6\2\2\u00b5:\3\2\2\2\u00b6\u00b7\t\13\2\2\u00b7\u00b8\t"+
		"\16\2\2\u00b8\u00b9\t\16\2\2\u00b9\u00ba\t\17\2\2\u00ba<\3\2\2\2\u00bb"+
		"\u00bc\t\17\2\2\u00bc\u00bd\t\16\2\2\u00bd\u00be\t\16\2\2\u00be\u00bf"+
		"\t\13\2\2\u00bf>\3\2\2\2\u00c0\u00c1\t\3\2\2\u00c1\u00c2\t\13\2\2\u00c2"+
		"\u00c3\t\4\2\2\u00c3\u00c4\t\5\2\2\u00c4\u00c5\t\5\2\2\u00c5@\3\2\2\2"+
		"\u00c6\u00c7\t\7\2\2\u00c7\u00c8\t\r\2\2\u00c8B\3\2\2\2\u00c9\u00ca\t"+
		"\7\2\2\u00ca\u00cb\t\n\2\2\u00cb\u00cc\t\6\2\2\u00cc\u00cd\t\20\2\2\u00cd"+
		"\u00ce\t\7\2\2\u00ce\u00cf\t\f\2\2\u00cf\u00d0\t\5\2\2\u00d0D\3\2\2\2"+
		"\u00d1\u00d2\t\16\2\2\u00d2\u00d3\t\b\2\2\u00d3F\3\2\2\2\u00d4\u00d5\t"+
		"\13\2\2\u00d5\u00d6\t\6\2\2\u00d6\u00d7\t\f\2\2\u00d7H\3\2\2\2\u00d8\u00d9"+
		"\t\r\2\2\u00d9\u00da\t\6\2\2\u00da\u00db\t\t\2\2\u00dbJ\3\2\2\2\u00dc"+
		"\u00dd\t\7\2\2\u00dd\u00de\t\5\2\2\u00de\u00df\t\21\2\2\u00df\u00e0\t"+
		"\16\2\2\u00e0\u00e1\t\7\2\2\u00e1\u00e2\t\22\2\2\u00e2L\3\2\2\2\u00e3"+
		"\u00e4\t\r\2\2\u00e4\u00e5\t\16\2\2\u00e5\u00e6\t\f\2\2\u00e6N\3\2\2\2"+
		"\u00e7\u00e8\7#\2\2\u00e8P\3\2\2\2\u00e9\u00ea\4\62;\2\u00eaR\3\2\2\2"+
		"\u00eb\u00ec\4c|\2\u00ecT\3\2\2\2\u00ed\u00ee\4C\\\2\u00eeV\3\2\2\2\u00ef"+
		"\u00f0\t\23\2\2\u00f0X\3\2\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\t\20\2\2"+
		"\u00f3\u00f4\t\24\2\2\u00f4\u00f5\t\6\2\2\u00f5Z\3\2\2\2\u00f6\u00f7\7"+
		"h\2\2\u00f7\u00f8\t\4\2\2\u00f8\u00f9\t\13\2\2\u00f9\u00fa\t\5\2\2\u00fa"+
		"\u00fb\t\6\2\2\u00fb\\\3\2\2\2\u00fc\u00ff\5Y-\2\u00fd\u00ff\5[.\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff^\3\2\2\2\u0100\u0102\5Q)\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104`\3\2\2\2\u0105\u010b\5U+\2\u0106\u010a\7a\2\2\u0107\u010a\5"+
		"W,\2\u0108\u010a\5Q)\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"b\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0114\5S*\2\u010f\u0113\7a\2\2\u0110"+
		"\u0113\5W,\2\u0111\u0113\5Q)\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2"+
		"\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115d\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011e\t\25\2\2\u0118"+
		"\u011d\7a\2\2\u0119\u011d\5W,\2\u011a\u011d\5Q)\2\u011b\u011d\5O(\2\u011c"+
		"\u0118\3\2\2\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2"+
		"\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\t\25\2\2\u0122f\3\2\2\2"+
		"\13\2\u00fe\u0103\u0109\u010b\u0112\u0114\u011c\u011e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}