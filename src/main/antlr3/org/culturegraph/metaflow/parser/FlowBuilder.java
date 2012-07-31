// $ANTLR 3.4 D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g 2012-07-31 12:40:18

package org.culturegraph.metaflow.parser;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import org.culturegraph.metaflow.Flow;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FlowBuilder extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARG", "Digit", "EscapeSequence", "HexDigit", "Identifier", "LINE_COMMENT", "Letter", "OctalEscape", "QualifiedName", "StartString", "StdIn", "StringLiteral", "UnicodeEscape", "WS", "'('", "')'", "','", "'.'", "';'", "'='", "'|'"
    };

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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public FlowBuilder(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public FlowBuilder(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return FlowBuilder.tokenNames; }
    public String getGrammarFileName() { return "D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g"; }


    Flow flow = new Flow();



    // $ANTLR start "metaflow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:22:1: metaflow returns [Flow flow] : flow ;
    public final Flow metaflow() throws RecognitionException {
        Flow flow = null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:23:3: ( flow )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:24:3: flow
            {
            pushFollow(FOLLOW_flow_in_metaflow70);
            flow();

            state._fsp--;



                     flow = this.flow;
                      System.out.println("found flow");
                     

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return flow;
    }
    // $ANTLR end "metaflow"



    // $ANTLR start "flow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:31:1: flow : ( StdIn |sl= StringLiteral ) ( pipe )+ ;
    public final void flow() throws RecognitionException {
        CommonTree sl=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:32:3: ( ( StdIn |sl= StringLiteral ) ( pipe )+ )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:33:3: ( StdIn |sl= StringLiteral ) ( pipe )+
            {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:33:3: ( StdIn |sl= StringLiteral )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==StdIn) ) {
                alt1=1;
            }
            else if ( (LA1_0==StringLiteral) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:34:5: StdIn
                    {
                    match(input,StdIn,FOLLOW_StdIn_in_flow103); 


                               flow.setStdInStart();
                              

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:38:7: sl= StringLiteral
                    {
                    sl=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_flow126); 


                                            flow.setStringStart((sl!=null?sl.getText():null));
                                            System.out.println("start with "+(sl!=null?sl.getText():null));
                                           

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:44:3: ( pipe )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==QualifiedName) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:45:5: pipe
            	    {
            	    pushFollow(FOLLOW_pipe_in_flow166);
            	    pipe();

            	    state._fsp--;


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "flow"



    // $ANTLR start "pipe"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:49:1: pipe : ^(name= QualifiedName (carg= StringLiteral )? (a= arg )* ) ;
    public final void pipe() throws RecognitionException {
        CommonTree name=null;
        CommonTree carg=null;
        FlowBuilder.arg_return a =null;



        final Map<String, String> args = new HashMap<String, String>();

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:53:3: ( ^(name= QualifiedName (carg= StringLiteral )? (a= arg )* ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:54:3: ^(name= QualifiedName (carg= StringLiteral )? (a= arg )* )
            {
            name=(CommonTree)match(input,QualifiedName,FOLLOW_QualifiedName_in_pipe199); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:55:28: (carg= StringLiteral )?
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==StringLiteral) ) {
                    alt3=1;
                }
                switch (alt3) {
                    case 1 :
                        // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:55:28: carg= StringLiteral
                        {
                        carg=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_pipe203); 

                        }
                        break;

                }


                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:56:5: (a= arg )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==ARG) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:57:7: a= arg
                	    {
                	    pushFollow(FOLLOW_arg_in_pipe220);
                	    a=arg();

                	    state._fsp--;



                	                 args.put((a!=null?a.key:null), (a!=null?a.value:null));
                	                

                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }



                flow.addElement((name!=null?name.getText():null), args, (carg!=null?carg.getText():null));
                 System.out.println("created "+(name!=null?name.getText():null));
               

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pipe"


    public static class arg_return extends TreeRuleReturnScope {
        public String key;
        public String value;
    };


    // $ANTLR start "arg"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:70:1: arg returns [String key, String value] : ^( ARG k= Identifier v= StringLiteral ) ;
    public final FlowBuilder.arg_return arg() throws RecognitionException {
        FlowBuilder.arg_return retval = new FlowBuilder.arg_return();
        retval.start = input.LT(1);


        CommonTree k=null;
        CommonTree v=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:71:3: ( ^( ARG k= Identifier v= StringLiteral ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:72:3: ^( ARG k= Identifier v= StringLiteral )
            {
            match(input,ARG,FOLLOW_ARG_in_arg275); 

            match(input, Token.DOWN, null); 
            k=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_arg279); 

            v=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_arg283); 

            match(input, Token.UP, null); 



                retval.key = (k!=null?k.getText():null);
                retval.value = (v!=null?v.getText():null);
               

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arg"

    // Delegated rules


 

    public static final BitSet FOLLOW_flow_in_metaflow70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StdIn_in_flow103 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_StringLiteral_in_flow126 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_pipe_in_flow166 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_QualifiedName_in_pipe199 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_StringLiteral_in_pipe203 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_arg_in_pipe220 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_ARG_in_arg275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_arg279 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_StringLiteral_in_arg283 = new BitSet(new long[]{0x0000000000000008L});

}