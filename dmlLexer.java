// Generated from dml.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		WORD=32, ALPHA=33, DIGIT=34, EQUAL=35, NOTEQUAL=36, GREATERTHAN=37, LESSTHAN=38, 
		GREATERTHANOREQUAL=39, LESSTHANOREQUAL=40, WS=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "WORD", "ALPHA", 
		"DIGIT", "EQUAL", "NOTEQUAL", "GREATERTHAN", "LESSTHAN", "GREATERTHANOREQUAL", 
		"LESSTHANOREQUAL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' <- '", "';'", "'('", "')'", "'select'", "' || '", "' && '", "'project'", 
		"','", "'rename'", "'+'", "'-'", "'*'", "'&'", "'OPEN'", "'CLOSE'", "'WRITE'", 
		"'EXIT'", "'SHOW'", "'CREATE TABLE'", "'PRIMARY KEY'", "'UPDATE'", "'SET'", 
		"'='", "'WHERE'", "'INSERT INTO'", "'VALUES FROM'", "'VALUES FROM RELATION'", 
		"'DELETE FROM'", "'VARCHAR'", "'INTEGER'", null, null, null, "'=='", "'!='", 
		"'>'", "'<'", "'<='", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "WORD", "ALPHA", "DIGIT", 
		"EQUAL", "NOTEQUAL", "GREATERTHAN", "LESSTHAN", "GREATERTHANOREQUAL", 
		"LESSTHANOREQUAL", "WS"
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


	public dmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u013d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3!\3!\6!\u011d\n!\r!\16!\u011e\3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\6*\u0138\n*\r*\16*\u0139"+
		"\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\6\3\2$$\3\2c|\3\2\62;\5\2\13"+
		"\f\17\17\"\"\u013e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\3U\3\2\2\2\5Z\3\2\2\2\7\\\3\2\2\2\t^\3\2\2\2\13`\3\2\2"+
		"\2\rg\3\2\2\2\17l\3\2\2\2\21q\3\2\2\2\23y\3\2\2\2\25{\3\2\2\2\27\u0082"+
		"\3\2\2\2\31\u0084\3\2\2\2\33\u0086\3\2\2\2\35\u0088\3\2\2\2\37\u008a\3"+
		"\2\2\2!\u008f\3\2\2\2#\u0095\3\2\2\2%\u009b\3\2\2\2\'\u00a0\3\2\2\2)\u00a5"+
		"\3\2\2\2+\u00b2\3\2\2\2-\u00be\3\2\2\2/\u00c5\3\2\2\2\61\u00c9\3\2\2\2"+
		"\63\u00cb\3\2\2\2\65\u00d1\3\2\2\2\67\u00dd\3\2\2\29\u00e9\3\2\2\2;\u00fe"+
		"\3\2\2\2=\u010a\3\2\2\2?\u0112\3\2\2\2A\u011a\3\2\2\2C\u0122\3\2\2\2E"+
		"\u0124\3\2\2\2G\u0126\3\2\2\2I\u0129\3\2\2\2K\u012c\3\2\2\2M\u012e\3\2"+
		"\2\2O\u0130\3\2\2\2Q\u0133\3\2\2\2S\u0137\3\2\2\2UV\7\"\2\2VW\7>\2\2W"+
		"X\7/\2\2XY\7\"\2\2Y\4\3\2\2\2Z[\7=\2\2[\6\3\2\2\2\\]\7*\2\2]\b\3\2\2\2"+
		"^_\7+\2\2_\n\3\2\2\2`a\7u\2\2ab\7g\2\2bc\7n\2\2cd\7g\2\2de\7e\2\2ef\7"+
		"v\2\2f\f\3\2\2\2gh\7\"\2\2hi\7~\2\2ij\7~\2\2jk\7\"\2\2k\16\3\2\2\2lm\7"+
		"\"\2\2mn\7(\2\2no\7(\2\2op\7\"\2\2p\20\3\2\2\2qr\7r\2\2rs\7t\2\2st\7q"+
		"\2\2tu\7l\2\2uv\7g\2\2vw\7e\2\2wx\7v\2\2x\22\3\2\2\2yz\7.\2\2z\24\3\2"+
		"\2\2{|\7t\2\2|}\7g\2\2}~\7p\2\2~\177\7c\2\2\177\u0080\7o\2\2\u0080\u0081"+
		"\7g\2\2\u0081\26\3\2\2\2\u0082\u0083\7-\2\2\u0083\30\3\2\2\2\u0084\u0085"+
		"\7/\2\2\u0085\32\3\2\2\2\u0086\u0087\7,\2\2\u0087\34\3\2\2\2\u0088\u0089"+
		"\7(\2\2\u0089\36\3\2\2\2\u008a\u008b\7Q\2\2\u008b\u008c\7R\2\2\u008c\u008d"+
		"\7G\2\2\u008d\u008e\7P\2\2\u008e \3\2\2\2\u008f\u0090\7E\2\2\u0090\u0091"+
		"\7N\2\2\u0091\u0092\7Q\2\2\u0092\u0093\7U\2\2\u0093\u0094\7G\2\2\u0094"+
		"\"\3\2\2\2\u0095\u0096\7Y\2\2\u0096\u0097\7T\2\2\u0097\u0098\7K\2\2\u0098"+
		"\u0099\7V\2\2\u0099\u009a\7G\2\2\u009a$\3\2\2\2\u009b\u009c\7G\2\2\u009c"+
		"\u009d\7Z\2\2\u009d\u009e\7K\2\2\u009e\u009f\7V\2\2\u009f&\3\2\2\2\u00a0"+
		"\u00a1\7U\2\2\u00a1\u00a2\7J\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a4\7Y\2\2"+
		"\u00a4(\3\2\2\2\u00a5\u00a6\7E\2\2\u00a6\u00a7\7T\2\2\u00a7\u00a8\7G\2"+
		"\2\u00a8\u00a9\7C\2\2\u00a9\u00aa\7V\2\2\u00aa\u00ab\7G\2\2\u00ab\u00ac"+
		"\7\"\2\2\u00ac\u00ad\7V\2\2\u00ad\u00ae\7C\2\2\u00ae\u00af\7D\2\2\u00af"+
		"\u00b0\7N\2\2\u00b0\u00b1\7G\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7R\2\2\u00b3"+
		"\u00b4\7T\2\2\u00b4\u00b5\7K\2\2\u00b5\u00b6\7O\2\2\u00b6\u00b7\7C\2\2"+
		"\u00b7\u00b8\7T\2\2\u00b8\u00b9\7[\2\2\u00b9\u00ba\7\"\2\2\u00ba\u00bb"+
		"\7M\2\2\u00bb\u00bc\7G\2\2\u00bc\u00bd\7[\2\2\u00bd,\3\2\2\2\u00be\u00bf"+
		"\7W\2\2\u00bf\u00c0\7R\2\2\u00c0\u00c1\7F\2\2\u00c1\u00c2\7C\2\2\u00c2"+
		"\u00c3\7V\2\2\u00c3\u00c4\7G\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7U\2\2\u00c6"+
		"\u00c7\7G\2\2\u00c7\u00c8\7V\2\2\u00c8\60\3\2\2\2\u00c9\u00ca\7?\2\2\u00ca"+
		"\62\3\2\2\2\u00cb\u00cc\7Y\2\2\u00cc\u00cd\7J\2\2\u00cd\u00ce\7G\2\2\u00ce"+
		"\u00cf\7T\2\2\u00cf\u00d0\7G\2\2\u00d0\64\3\2\2\2\u00d1\u00d2\7K\2\2\u00d2"+
		"\u00d3\7P\2\2\u00d3\u00d4\7U\2\2\u00d4\u00d5\7G\2\2\u00d5\u00d6\7T\2\2"+
		"\u00d6\u00d7\7V\2\2\u00d7\u00d8\7\"\2\2\u00d8\u00d9\7K\2\2\u00d9\u00da"+
		"\7P\2\2\u00da\u00db\7V\2\2\u00db\u00dc\7Q\2\2\u00dc\66\3\2\2\2\u00dd\u00de"+
		"\7X\2\2\u00de\u00df\7C\2\2\u00df\u00e0\7N\2\2\u00e0\u00e1\7W\2\2\u00e1"+
		"\u00e2\7G\2\2\u00e2\u00e3\7U\2\2\u00e3\u00e4\7\"\2\2\u00e4\u00e5\7H\2"+
		"\2\u00e5\u00e6\7T\2\2\u00e6\u00e7\7Q\2\2\u00e7\u00e8\7O\2\2\u00e88\3\2"+
		"\2\2\u00e9\u00ea\7X\2\2\u00ea\u00eb\7C\2\2\u00eb\u00ec\7N\2\2\u00ec\u00ed"+
		"\7W\2\2\u00ed\u00ee\7G\2\2\u00ee\u00ef\7U\2\2\u00ef\u00f0\7\"\2\2\u00f0"+
		"\u00f1\7H\2\2\u00f1\u00f2\7T\2\2\u00f2\u00f3\7Q\2\2\u00f3\u00f4\7O\2\2"+
		"\u00f4\u00f5\7\"\2\2\u00f5\u00f6\7T\2\2\u00f6\u00f7\7G\2\2\u00f7\u00f8"+
		"\7N\2\2\u00f8\u00f9\7C\2\2\u00f9\u00fa\7V\2\2\u00fa\u00fb\7K\2\2\u00fb"+
		"\u00fc\7Q\2\2\u00fc\u00fd\7P\2\2\u00fd:\3\2\2\2\u00fe\u00ff\7F\2\2\u00ff"+
		"\u0100\7G\2\2\u0100\u0101\7N\2\2\u0101\u0102\7G\2\2\u0102\u0103\7V\2\2"+
		"\u0103\u0104\7G\2\2\u0104\u0105\7\"\2\2\u0105\u0106\7H\2\2\u0106\u0107"+
		"\7T\2\2\u0107\u0108\7Q\2\2\u0108\u0109\7O\2\2\u0109<\3\2\2\2\u010a\u010b"+
		"\7X\2\2\u010b\u010c\7C\2\2\u010c\u010d\7T\2\2\u010d\u010e\7E\2\2\u010e"+
		"\u010f\7J\2\2\u010f\u0110\7C\2\2\u0110\u0111\7T\2\2\u0111>\3\2\2\2\u0112"+
		"\u0113\7K\2\2\u0113\u0114\7P\2\2\u0114\u0115\7V\2\2\u0115\u0116\7G\2\2"+
		"\u0116\u0117\7I\2\2\u0117\u0118\7G\2\2\u0118\u0119\7T\2\2\u0119@\3\2\2"+
		"\2\u011a\u011c\7$\2\2\u011b\u011d\n\2\2\2\u011c\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\7$\2\2\u0121B\3\2\2\2\u0122\u0123\t\3\2\2\u0123D\3\2\2\2\u0124"+
		"\u0125\t\4\2\2\u0125F\3\2\2\2\u0126\u0127\7?\2\2\u0127\u0128\7?\2\2\u0128"+
		"H\3\2\2\2\u0129\u012a\7#\2\2\u012a\u012b\7?\2\2\u012bJ\3\2\2\2\u012c\u012d"+
		"\7@\2\2\u012dL\3\2\2\2\u012e\u012f\7>\2\2\u012fN\3\2\2\2\u0130\u0131\7"+
		">\2\2\u0131\u0132\7?\2\2\u0132P\3\2\2\2\u0133\u0134\7@\2\2\u0134\u0135"+
		"\7?\2\2\u0135R\3\2\2\2\u0136\u0138\t\5\2\2\u0137\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\b*\2\2\u013cT\3\2\2\2\5\2\u011e\u0139\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}