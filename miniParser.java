// Generated from miniParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CAP_LETTER=1, LETTER=2, CAP_LETTER_IND=3, ALWAYS_CONTRACTION=4, COMMA=5, 
		PERIOD=6, ROW4=7, LOW=8, ROW6=9, ROW7=10, ALT=11, COMMENT=12, SPACE=13, 
		NEWLINE=14;
	public static final int
		RULE_text = 0, RULE_line = 1, RULE_space = 2, RULE_letter = 3, RULE_newline = 4, 
		RULE_capLetter = 5, RULE_sign = 6, RULE_capInd = 7, RULE_capSign = 8, 
		RULE_comma = 9, RULE_period = 10, RULE_word = 11, RULE_unknown = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"text", "line", "space", "letter", "newline", "capLetter", "sign", "capInd", 
			"capSign", "comma", "period", "word", "unknown"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'1'", "'4'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CAP_LETTER", "LETTER", "CAP_LETTER_IND", "ALWAYS_CONTRACTION", 
			"COMMA", "PERIOD", "ROW4", "LOW", "ROW6", "ROW7", "ALT", "COMMENT", "SPACE", 
			"NEWLINE"
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
	public String getGrammarFileName() { return "miniParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TextContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				line();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CAP_LETTER) | (1L << LETTER) | (1L << CAP_LETTER_IND) | (1L << ALWAYS_CONTRACTION) | (1L << COMMA) | (1L << PERIOD) | (1L << ROW4) | (1L << LOW) | (1L << ROW6) | (1L << ROW7) | (1L << ALT) | (1L << SPACE) | (1L << NEWLINE))) != 0) );
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

	public static class LineContext extends ParserRuleContext {
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<UnknownContext> unknown() {
			return getRuleContexts(UnknownContext.class);
		}
		public UnknownContext unknown(int i) {
			return getRuleContext(UnknownContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			int _alt;
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(31);
					space();
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				newline();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(38);
						space();
						}
						} 
					}
					setState(43);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(44);
					word();
					}
					break;
				case 2:
					{
					setState(45);
					unknown();
					}
					break;
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(48);
						space();
						setState(52);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(49);
								space();
								}
								} 
							}
							setState(54);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
						}
						setState(57);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(55);
							word();
							}
							break;
						case 2:
							{
							setState(56);
							unknown();
							}
							break;
						}
						}
						} 
					}
					setState(63);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(64);
					space();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				newline();
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

	public static class SpaceContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(miniParser.SPACE, 0); }
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).exitSpace(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(SPACE);
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

	public static class LetterContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(miniParser.LETTER, 0); }
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).exitLetter(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_letter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(LETTER);
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

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(miniParser.NEWLINE, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).exitNewline(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(NEWLINE);
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

	public static class CapLetterContext extends ParserRuleContext {
		public TerminalNode CAP_LETTER() { return getToken(miniParser.CAP_LETTER, 0); }
		public CapLetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capLetter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).enterCapLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).exitCapLetter(this);
		}
	}

	public final CapLetterContext capLetter() throws RecognitionException {
		CapLetterContext _localctx = new CapLetterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_capLetter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(CAP_LETTER);
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode ALWAYS_CONTRACTION() { return getToken(miniParser.ALWAYS_CONTRACTION, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ALWAYS_CONTRACTION);
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

	public static class CapIndContext extends ParserRuleContext {
		public TerminalNode CAP_LETTER_IND() { return getToken(miniParser.CAP_LETTER_IND, 0); }
		public CapIndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capInd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).enterCapInd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).exitCapInd(this);
		}
	}

	public final CapIndContext capInd() throws RecognitionException {
		CapIndContext _localctx = new CapIndContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_capInd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(CAP_LETTER_IND);
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

	public static class CapSignContext extends ParserRuleContext {
		public CapIndContext capInd() {
			return getRuleContext(CapIndContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public CapSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).enterCapSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).exitCapSign(this);
		}
	}

	public final CapSignContext capSign() throws RecognitionException {
		CapSignContext _localctx = new CapSignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_capSign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			capInd();
			setState(87);
			sign();
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

	public static class CommaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(miniParser.COMMA, 0); }
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).exitComma(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(COMMA);
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

	public static class PeriodContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(miniParser.PERIOD, 0); }
		public PeriodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_period; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).enterPeriod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).exitPeriod(this);
		}
	}

	public final PeriodContext period() throws RecognitionException {
		PeriodContext _localctx = new PeriodContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_period);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(PERIOD);
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

	public static class WordContext extends ParserRuleContext {
		public CapLetterContext capLetter() {
			return getRuleContext(CapLetterContext.class,0);
		}
		public CapSignContext capSign() {
			return getRuleContext(CapSignContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public PeriodContext period() {
			return getRuleContext(PeriodContext.class,0);
		}
		public List<LetterContext> letter() {
			return getRuleContexts(LetterContext.class);
		}
		public LetterContext letter(int i) {
			return getRuleContext(LetterContext.class,i);
		}
		public List<SignContext> sign() {
			return getRuleContexts(SignContext.class);
		}
		public SignContext sign(int i) {
			return getRuleContext(SignContext.class,i);
		}
		public List<UnknownContext> unknown() {
			return getRuleContexts(UnknownContext.class);
		}
		public UnknownContext unknown(int i) {
			return getRuleContext(UnknownContext.class,i);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAP_LETTER:
				{
				setState(93);
				capLetter();
				}
				break;
			case CAP_LETTER_IND:
				{
				setState(94);
				capSign();
				}
				break;
			case LETTER:
			case ALWAYS_CONTRACTION:
			case COMMA:
			case PERIOD:
			case ROW4:
			case LOW:
			case ROW6:
			case ROW7:
			case ALT:
			case SPACE:
			case NEWLINE:
				break;
			default:
				break;
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER) | (1L << ALWAYS_CONTRACTION) | (1L << ROW4) | (1L << LOW) | (1L << ROW6) | (1L << ROW7) | (1L << ALT))) != 0)) {
				{
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(100);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTER:
						{
						setState(97);
						letter();
						}
						break;
					case ALWAYS_CONTRACTION:
						{
						setState(98);
						sign();
						}
						break;
					case ROW4:
					case LOW:
					case ROW6:
					case ROW7:
					case ALT:
						{
						setState(99);
						unknown();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER) | (1L << ALWAYS_CONTRACTION) | (1L << ROW4) | (1L << LOW) | (1L << ROW6) | (1L << ROW7) | (1L << ALT))) != 0) );
				}
			}

			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				{
				setState(106);
				comma();
				}
				break;
			case PERIOD:
				{
				setState(107);
				period();
				}
				break;
			case SPACE:
			case NEWLINE:
				break;
			default:
				break;
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

	public static class UnknownContext extends ParserRuleContext {
		public List<TerminalNode> ROW4() { return getTokens(miniParser.ROW4); }
		public TerminalNode ROW4(int i) {
			return getToken(miniParser.ROW4, i);
		}
		public List<TerminalNode> LOW() { return getTokens(miniParser.LOW); }
		public TerminalNode LOW(int i) {
			return getToken(miniParser.LOW, i);
		}
		public List<TerminalNode> ROW6() { return getTokens(miniParser.ROW6); }
		public TerminalNode ROW6(int i) {
			return getToken(miniParser.ROW6, i);
		}
		public List<TerminalNode> ROW7() { return getTokens(miniParser.ROW7); }
		public TerminalNode ROW7(int i) {
			return getToken(miniParser.ROW7, i);
		}
		public List<TerminalNode> ALT() { return getTokens(miniParser.ALT); }
		public TerminalNode ALT(int i) {
			return getToken(miniParser.ALT, i);
		}
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).enterUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniParserListener ) ((miniParserListener)listener).exitUnknown(this);
		}
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unknown);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(110);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROW4) | (1L << LOW) | (1L << ROW6) | (1L << ROW7) | (1L << ALT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(113); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20v\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\5\3\61\n\3\3\3\3\3\7"+
		"\3\65\n\3\f\3\16\38\13\3\3\3\3\3\5\3<\n\3\7\3>\n\3\f\3\16\3A\13\3\3\3"+
		"\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\5\rb\n\r\3"+
		"\r\3\r\3\r\6\rg\n\r\r\r\16\rh\5\rk\n\r\3\r\3\r\5\ro\n\r\3\16\6\16r\n\16"+
		"\r\16\16\16s\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\t\r"+
		"\2z\2\35\3\2\2\2\4J\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\fR\3\2\2"+
		"\2\16T\3\2\2\2\20V\3\2\2\2\22X\3\2\2\2\24[\3\2\2\2\26]\3\2\2\2\30a\3\2"+
		"\2\2\32q\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2"+
		"\2\37 \3\2\2\2 \3\3\2\2\2!#\5\6\4\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%"+
		"\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'K\5\n\6\2(*\5\6\4\2)(\3\2\2\2*-\3\2\2\2"+
		"+)\3\2\2\2+,\3\2\2\2,\60\3\2\2\2-+\3\2\2\2.\61\5\30\r\2/\61\5\32\16\2"+
		"\60.\3\2\2\2\60/\3\2\2\2\61?\3\2\2\2\62\66\5\6\4\2\63\65\5\6\4\2\64\63"+
		"\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67;\3\2\2\28\66\3\2\2"+
		"\29<\5\30\r\2:<\5\32\16\2;9\3\2\2\2;:\3\2\2\2<>\3\2\2\2=\62\3\2\2\2>A"+
		"\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A?\3\2\2\2BD\5\6\4\2CB\3\2\2\2D"+
		"G\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\5\n\6\2IK\3\2\2\2"+
		"J$\3\2\2\2J+\3\2\2\2K\5\3\2\2\2LM\7\17\2\2M\7\3\2\2\2NO\7\4\2\2O\t\3\2"+
		"\2\2PQ\7\20\2\2Q\13\3\2\2\2RS\7\3\2\2S\r\3\2\2\2TU\7\6\2\2U\17\3\2\2\2"+
		"VW\7\5\2\2W\21\3\2\2\2XY\5\20\t\2YZ\5\16\b\2Z\23\3\2\2\2[\\\7\7\2\2\\"+
		"\25\3\2\2\2]^\7\b\2\2^\27\3\2\2\2_b\5\f\7\2`b\5\22\n\2a_\3\2\2\2a`\3\2"+
		"\2\2ab\3\2\2\2bj\3\2\2\2cg\5\b\5\2dg\5\16\b\2eg\5\32\16\2fc\3\2\2\2fd"+
		"\3\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jf\3\2\2\2j"+
		"k\3\2\2\2kn\3\2\2\2lo\5\24\13\2mo\5\26\f\2nl\3\2\2\2nm\3\2\2\2no\3\2\2"+
		"\2o\31\3\2\2\2pr\t\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\33\3"+
		"\2\2\2\21\37$+\60\66;?EJafhjns";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}