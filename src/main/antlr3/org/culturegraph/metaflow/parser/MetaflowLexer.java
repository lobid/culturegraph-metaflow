// $ANTLR 3.4 D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g 2012-07-31 12:40:17

package org.culturegraph.metaflow.parser;
import org.apache.commons.lang.StringEscapeUtils;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MetaflowLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int ARG=4;
    public static final int Digit=5;
    public static final int EscapeSequence=6;
    public static final int HexDigit=7;
    public static final int Identifier=8;
    public static final int LINE_COMMENT=9;
    public static final int Letter=10;
    public static final int OctalEscape=11;
    public static final int QualifiedName=12;
    public static final int StartString=13;
    public static final int StdIn=14;
    public static final int StringLiteral=15;
    public static final int UnicodeEscape=16;
    public static final int WS=17;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MetaflowLexer() {} 
    public MetaflowLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MetaflowLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:12:7: ( '(' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:13:7: ( ')' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:14:7: ( ',' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:15:7: ( '.' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:15:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:16:7: ( ';' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:17:7: ( '=' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:18:7: ( '|' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:18:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "StdIn"
    public final void mStdIn() throws RecognitionException {
        try {
            int _type = StdIn;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:43:3: ( '>' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:44:3: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "StdIn"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:76:3: ( Letter ( Letter | Digit )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:77:3: Letter ( Letter | Digit )*
            {
            mLetter(); 


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:78:3: ( Letter | Digit )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')||(LA1_0 >= '\u00C0' && LA1_0 <= '\u00D6')||(LA1_0 >= '\u00D8' && LA1_0 <= '\u00F6')||(LA1_0 >= '\u00F8' && LA1_0 <= '\u1FFF')||(LA1_0 >= '\u3040' && LA1_0 <= '\u318F')||(LA1_0 >= '\u3300' && LA1_0 <= '\u337F')||(LA1_0 >= '\u3400' && LA1_0 <= '\u3D2D')||(LA1_0 >= '\u4E00' && LA1_0 <= '\u9FFF')||(LA1_0 >= '\uF900' && LA1_0 <= '\uFAFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:
            	    {
            	    if ( input.LA(1)=='$'||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:85:3: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:86:3: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:87:3: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:88:5: EscapeSequence
            	    {
            	    mEscapeSequence(); 


            	    }
            	    break;
            	case 2 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:90:5: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match('\"'); 


                   // strip the quotes from the resulting token and unescape
                   setText(StringEscapeUtils.unescapeJava(getText().substring(1,
                   		getText().length() - 1)));
                  

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:106:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt3=1;
                    }
                    break;
                case 'u':
                    {
                    alt3=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:107:3: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:118:5: UnicodeEscape
                    {
                    mUnicodeEscape(); 


                    }
                    break;
                case 3 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:119:5: OctalEscape
                    {
                    mOctalEscape(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:124:3: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\\') ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1 >= '0' && LA4_1 <= '3')) ) {
                    int LA4_2 = input.LA(3);

                    if ( ((LA4_2 >= '0' && LA4_2 <= '7')) ) {
                        int LA4_4 = input.LA(4);

                        if ( ((LA4_4 >= '0' && LA4_4 <= '7')) ) {
                            alt4=1;
                        }
                        else {
                            alt4=2;
                        }
                    }
                    else {
                        alt4=3;
                    }
                }
                else if ( ((LA4_1 >= '4' && LA4_1 <= '7')) ) {
                    int LA4_3 = input.LA(3);

                    if ( ((LA4_3 >= '0' && LA4_3 <= '7')) ) {
                        alt4=2;
                    }
                    else {
                        alt4=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:125:3: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:126:5: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:127:5: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:132:3: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:133:3: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); 

            match('u'); 

            mHexDigit(); 


            mHexDigit(); 


            mHexDigit(); 


            mHexDigit(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:138:3: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:148:3: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' | '-' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:
            {
            if ( input.LA(1)=='$'||input.LA(1)=='-'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:167:3: ( '0' .. '9' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:171:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:172:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:173:3: (~ ( '\\n' | '\\r' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:177:3: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:177:3: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 


                          System.out.println("comment found");
                          _channel = HIDDEN;
                         

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:185:3: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:186:3: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }



                _channel = HIDDEN;
               

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | StdIn | Identifier | StringLiteral | LINE_COMMENT | WS )
        int alt7=12;
        int LA7_0 = input.LA(1);

        if ( (LA7_0=='(') ) {
            alt7=1;
        }
        else if ( (LA7_0==')') ) {
            alt7=2;
        }
        else if ( (LA7_0==',') ) {
            alt7=3;
        }
        else if ( (LA7_0=='.') ) {
            alt7=4;
        }
        else if ( (LA7_0==';') ) {
            alt7=5;
        }
        else if ( (LA7_0=='=') ) {
            alt7=6;
        }
        else if ( (LA7_0=='|') ) {
            alt7=7;
        }
        else if ( (LA7_0=='>') ) {
            alt7=8;
        }
        else if ( (LA7_0=='$'||LA7_0=='-'||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')||(LA7_0 >= '\u00C0' && LA7_0 <= '\u00D6')||(LA7_0 >= '\u00D8' && LA7_0 <= '\u00F6')||(LA7_0 >= '\u00F8' && LA7_0 <= '\u1FFF')||(LA7_0 >= '\u3040' && LA7_0 <= '\u318F')||(LA7_0 >= '\u3300' && LA7_0 <= '\u337F')||(LA7_0 >= '\u3400' && LA7_0 <= '\u3D2D')||(LA7_0 >= '\u4E00' && LA7_0 <= '\u9FFF')||(LA7_0 >= '\uF900' && LA7_0 <= '\uFAFF')) ) {
            alt7=9;
        }
        else if ( (LA7_0=='\"') ) {
            alt7=10;
        }
        else if ( (LA7_0=='/') ) {
            alt7=11;
        }
        else if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||(LA7_0 >= '\f' && LA7_0 <= '\r')||LA7_0==' ') ) {
            alt7=12;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 7, 0, input);

            throw nvae;

        }
        switch (alt7) {
            case 1 :
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:1:10: T__18
                {
                mT__18(); 


                }
                break;
            case 2 :
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:1:16: T__19
                {
                mT__19(); 


                }
                break;
            case 3 :
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:1:22: T__20
                {
                mT__20(); 


                }
                break;
            case 4 :
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:1:28: T__21
                {
                mT__21(); 


                }
                break;
            case 5 :
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:1:34: T__22
                {
                mT__22(); 


                }
                break;
            case 6 :
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:1:40: T__23
                {
                mT__23(); 


                }
                break;
            case 7 :
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:1:46: T__24
                {
                mT__24(); 


                }
                break;
            case 8 :
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:1:52: StdIn
                {
                mStdIn(); 


                }
                break;
            case 9 :
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:1:58: Identifier
                {
                mIdentifier(); 


                }
                break;
            case 10 :
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:1:69: StringLiteral
                {
                mStringLiteral(); 


                }
                break;
            case 11 :
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:1:83: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;
            case 12 :
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:1:96: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}