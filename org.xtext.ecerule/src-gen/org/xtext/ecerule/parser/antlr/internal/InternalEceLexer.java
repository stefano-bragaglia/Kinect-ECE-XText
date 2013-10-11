package org.xtext.ecerule.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEceLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalEceLexer() {;} 
    public InternalEceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:11:7: ( 'on' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:11:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:12:7: ( ';' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:13:7: ( '(' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:14:7: ( ',' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:15:7: ( ')' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:16:7: ( 'set' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:16:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:17:7: ( 'expect' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:17:9: 'expect'
            {
            match("expect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:18:7: ( 'if' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:18:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:19:7: ( 'before' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:19:9: 'before'
            {
            match("before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:20:7: ( 'meets' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:20:9: 'meets'
            {
            match("meets"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:21:7: ( 'overlaps' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:21:9: 'overlaps'
            {
            match("overlaps"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:22:7: ( 'starts' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:22:9: 'starts'
            {
            match("starts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:23:7: ( 'finishes' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:23:9: 'finishes'
            {
            match("finishes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:24:7: ( 'during' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:24:9: 'during'
            {
            match("during"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:25:7: ( 'to' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:25:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:26:7: ( 'in' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:26:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:27:7: ( 'OR' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:27:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:28:7: ( 'AND' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:28:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:29:7: ( '==' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:29:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:30:7: ( '!=' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:30:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:31:7: ( '>=' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:31:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:32:7: ( '<=' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:32:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:33:7: ( '>' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:33:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:34:7: ( '<' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:34:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:35:7: ( '+' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:35:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:36:7: ( '-' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:36:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:37:7: ( '*' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:37:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:38:7: ( '/' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:38:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:39:7: ( '%' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:39:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:40:7: ( '^' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:40:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:41:7: ( '!' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:41:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:42:7: ( 'true' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:42:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:43:7: ( 'false' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:43:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:44:7: ( '[' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:44:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:45:7: ( ']' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:45:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1775:12: ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1775:14: ( '0' .. '9' )* '.' ( '0' .. '9' )+
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1775:14: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1775:15: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('.'); 
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1775:30: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1775:31: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1777:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1777:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1777:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1777:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1777:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1779:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1779:12: ( '0' .. '9' )+
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1779:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1779:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1781:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1781:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1781:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1781:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1781:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1781:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1781:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1781:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1781:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1781:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1781:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1783:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1783:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1783:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1783:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1785:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1785:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1785:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1785:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1785:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1785:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1785:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1785:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1787:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1787:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1787:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1789:16: ( . )
            // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1789:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=43;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:220: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 37 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:231: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:239: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:248: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:260: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:276: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:292: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // ../org.xtext.ecerule/src-gen/org/xtext/ecerule/parser/antlr/internal/InternalEce.g:1:300: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\45\4\uffff\12\45\1\42\1\72\1\74\1\76\3\uffff\1\104\1"+
        "\uffff\1\106\2\uffff\1\111\1\42\1\uffff\2\42\2\uffff\1\116\1\45"+
        "\5\uffff\3\45\1\123\1\124\5\45\1\132\1\45\1\134\1\45\22\uffff\1"+
        "\111\4\uffff\1\45\1\137\2\45\2\uffff\5\45\1\uffff\1\45\1\uffff\1"+
        "\150\1\45\1\uffff\7\45\1\161\1\uffff\4\45\1\166\1\45\1\170\1\45"+
        "\1\uffff\1\45\1\173\1\174\1\175\1\uffff\1\45\1\uffff\1\177\1\45"+
        "\3\uffff\1\45\1\uffff\1\u0082\1\u0083\2\uffff";
    static final String DFA14_eofS =
        "\u0084\uffff";
    static final String DFA14_minS =
        "\1\0\1\156\4\uffff\1\145\1\170\1\146\2\145\1\141\1\165\1\157\1"+
        "\122\1\116\4\75\3\uffff\1\52\1\uffff\1\101\2\uffff\1\56\1\60\1\uffff"+
        "\2\0\2\uffff\1\60\1\145\5\uffff\1\164\1\141\1\160\2\60\1\146\1\145"+
        "\1\156\1\154\1\162\1\60\1\165\1\60\1\104\22\uffff\1\56\4\uffff\1"+
        "\162\1\60\1\162\1\145\2\uffff\1\157\1\164\1\151\1\163\1\151\1\uffff"+
        "\1\145\1\uffff\1\60\1\154\1\uffff\1\164\1\143\1\162\2\163\1\145"+
        "\1\156\1\60\1\uffff\1\141\1\163\1\164\1\145\1\60\1\150\1\60\1\147"+
        "\1\uffff\1\160\3\60\1\uffff\1\145\1\uffff\1\60\1\163\3\uffff\1\163"+
        "\1\uffff\2\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\166\4\uffff\1\164\1\170\1\156\2\145\1\151\1\165\1\162"+
        "\1\122\1\116\4\75\3\uffff\1\57\1\uffff\1\172\2\uffff\2\71\1\uffff"+
        "\2\uffff\2\uffff\1\172\1\145\5\uffff\1\164\1\141\1\160\2\172\1\146"+
        "\1\145\1\156\1\154\1\162\1\172\1\165\1\172\1\104\22\uffff\1\71\4"+
        "\uffff\1\162\1\172\1\162\1\145\2\uffff\1\157\1\164\1\151\1\163\1"+
        "\151\1\uffff\1\145\1\uffff\1\172\1\154\1\uffff\1\164\1\143\1\162"+
        "\2\163\1\145\1\156\1\172\1\uffff\1\141\1\163\1\164\1\145\1\172\1"+
        "\150\1\172\1\147\1\uffff\1\160\3\172\1\uffff\1\145\1\uffff\1\172"+
        "\1\163\3\uffff\1\163\1\uffff\2\172\2\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\16\uffff\1\31\1\32\1\33\1\uffff\1\35\1"+
        "\uffff\1\42\1\43\2\uffff\1\45\2\uffff\1\52\1\53\2\uffff\1\45\1\2"+
        "\1\3\1\4\1\5\16\uffff\1\23\1\24\1\37\1\25\1\27\1\26\1\30\1\31\1"+
        "\32\1\33\1\50\1\51\1\34\1\35\1\36\1\42\1\43\1\46\1\uffff\1\44\1"+
        "\47\1\52\1\1\4\uffff\1\10\1\20\5\uffff\1\17\1\uffff\1\21\2\uffff"+
        "\1\6\10\uffff\1\22\10\uffff\1\40\4\uffff\1\12\1\uffff\1\41\2\uffff"+
        "\1\14\1\7\1\11\1\uffff\1\16\2\uffff\1\13\1\15";
    static final String DFA14_specialS =
        "\1\2\36\uffff\1\0\1\1\143\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\21\1\37\2\42\1\30\1\42\1"+
            "\40\1\3\1\5\1\26\1\24\1\4\1\25\1\35\1\27\12\34\1\42\1\2\1\23"+
            "\1\20\1\22\2\42\1\17\15\36\1\16\13\36\1\32\1\42\1\33\1\31\1"+
            "\36\1\42\1\36\1\11\1\36\1\14\1\7\1\13\2\36\1\10\3\36\1\12\1"+
            "\36\1\1\3\36\1\6\1\15\6\36\uff85\42",
            "\1\43\7\uffff\1\44",
            "",
            "",
            "",
            "",
            "\1\52\16\uffff\1\53",
            "\1\54",
            "\1\55\7\uffff\1\56",
            "\1\57",
            "\1\60",
            "\1\62\7\uffff\1\61",
            "\1\63",
            "\1\64\2\uffff\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\73",
            "\1\75",
            "",
            "",
            "",
            "\1\102\4\uffff\1\103",
            "",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\113\1\uffff\12\112",
            "\12\113",
            "",
            "\0\114",
            "\0\114",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\117",
            "",
            "",
            "",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\133",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\135",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113\1\uffff\12\112",
            "",
            "",
            "",
            "",
            "\1\136",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\140",
            "\1\141",
            "",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\167",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\171",
            "",
            "\1\172",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\176",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0080",
            "",
            "",
            "",
            "\1\u0081",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_31 = input.LA(1);

                        s = -1;
                        if ( ((LA14_31>='\u0000' && LA14_31<='\uFFFF')) ) {s = 76;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_32 = input.LA(1);

                        s = -1;
                        if ( ((LA14_32>='\u0000' && LA14_32<='\uFFFF')) ) {s = 76;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='o') ) {s = 1;}

                        else if ( (LA14_0==';') ) {s = 2;}

                        else if ( (LA14_0=='(') ) {s = 3;}

                        else if ( (LA14_0==',') ) {s = 4;}

                        else if ( (LA14_0==')') ) {s = 5;}

                        else if ( (LA14_0=='s') ) {s = 6;}

                        else if ( (LA14_0=='e') ) {s = 7;}

                        else if ( (LA14_0=='i') ) {s = 8;}

                        else if ( (LA14_0=='b') ) {s = 9;}

                        else if ( (LA14_0=='m') ) {s = 10;}

                        else if ( (LA14_0=='f') ) {s = 11;}

                        else if ( (LA14_0=='d') ) {s = 12;}

                        else if ( (LA14_0=='t') ) {s = 13;}

                        else if ( (LA14_0=='O') ) {s = 14;}

                        else if ( (LA14_0=='A') ) {s = 15;}

                        else if ( (LA14_0=='=') ) {s = 16;}

                        else if ( (LA14_0=='!') ) {s = 17;}

                        else if ( (LA14_0=='>') ) {s = 18;}

                        else if ( (LA14_0=='<') ) {s = 19;}

                        else if ( (LA14_0=='+') ) {s = 20;}

                        else if ( (LA14_0=='-') ) {s = 21;}

                        else if ( (LA14_0=='*') ) {s = 22;}

                        else if ( (LA14_0=='/') ) {s = 23;}

                        else if ( (LA14_0=='%') ) {s = 24;}

                        else if ( (LA14_0=='^') ) {s = 25;}

                        else if ( (LA14_0=='[') ) {s = 26;}

                        else if ( (LA14_0==']') ) {s = 27;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 28;}

                        else if ( (LA14_0=='.') ) {s = 29;}

                        else if ( ((LA14_0>='B' && LA14_0<='N')||(LA14_0>='P' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='a'||LA14_0=='c'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='l')||LA14_0=='n'||(LA14_0>='p' && LA14_0<='r')||(LA14_0>='u' && LA14_0<='z')) ) {s = 30;}

                        else if ( (LA14_0=='\"') ) {s = 31;}

                        else if ( (LA14_0=='\'') ) {s = 32;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 33;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='$')||LA14_0=='&'||LA14_0==':'||(LA14_0>='?' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}