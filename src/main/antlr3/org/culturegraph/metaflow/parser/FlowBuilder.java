// $ANTLR 3.4 D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g 2012-07-31 16:59:36

package org.culturegraph.metaflow.parser;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import org.culturegraph.metaflow.Flow;
import org.culturegraph.metaflow.MetaFlowException;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FlowBuilder extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARG", "DEF", "Digit", "EscapeSequence", "HexDigit", "Identifier", "LINE_COMMENT", "Letter", "OctalEscape", "QualifiedName", "StartString", "StdIn", "StringLiteral", "UnicodeEscape", "WS", "'('", "')'", "'+'", "','", "'.'", "';'", "'='", "'def '", "'|'"
    };

    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int ARG=4;
    public static final int DEF=5;
    public static final int Digit=6;
    public static final int EscapeSequence=7;
    public static final int HexDigit=8;
    public static final int Identifier=9;
    public static final int LINE_COMMENT=10;
    public static final int Letter=11;
    public static final int OctalEscape=12;
    public static final int QualifiedName=13;
    public static final int StartString=14;
    public static final int StdIn=15;
    public static final int StringLiteral=16;
    public static final int UnicodeEscape=17;
    public static final int WS=18;

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
    Map<String, String> vars = new HashMap<String, String>();



    // $ANTLR start "metaflow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:24:1: metaflow returns [Flow flow] : varDefs flow ;
    public final Flow metaflow() throws RecognitionException {
        Flow flow = null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:25:3: ( varDefs flow )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:26:3: varDefs flow
            {
            pushFollow(FOLLOW_varDefs_in_metaflow70);
            varDefs();

            state._fsp--;


            pushFollow(FOLLOW_flow_in_metaflow72);
            flow();

            state._fsp--;



                            flow = this.flow;
                           

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



    // $ANTLR start "varDefs"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:32:1: varDefs : ( varDef )* ;
    public final void varDefs() throws RecognitionException {
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:33:3: ( ( varDef )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:34:3: ( varDef )*
            {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:34:3: ( varDef )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DEF) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:34:3: varDef
            	    {
            	    pushFollow(FOLLOW_varDef_in_varDefs105);
            	    varDef();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "varDefs"



    // $ANTLR start "varDef"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:40:1: varDef : ^( DEF name= Identifier (e= exp )? ) ;
    public final void varDef() throws RecognitionException {
        CommonTree name=null;
        String e =null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:41:3: ( ^( DEF name= Identifier (e= exp )? ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:42:3: ^( DEF name= Identifier (e= exp )? )
            {
            match(input,DEF,FOLLOW_DEF_in_varDef135); 

            match(input, Token.DOWN, null); 
            name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_varDef139); 

            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:42:26: (e= exp )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Identifier||LA2_0==StringLiteral||LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:42:26: e= exp
                    {
                    pushFollow(FOLLOW_exp_in_varDef143);
                    e=exp();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 



                vars.put((name!=null?name.getText():null), e);
                
                //System.out.println("put " + (name!=null?name.getText():null) + "=" + $value.text);
               

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
    // $ANTLR end "varDef"



    // $ANTLR start "flow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:51:1: flow : ( StdIn |e= exp ) ( pipe )+ ;
    public final void flow() throws RecognitionException {
        String e =null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:52:3: ( ( StdIn |e= exp ) ( pipe )+ )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:53:3: ( StdIn |e= exp ) ( pipe )+
            {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:53:3: ( StdIn |e= exp )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==StdIn) ) {
                alt3=1;
            }
            else if ( (LA3_0==Identifier||LA3_0==StringLiteral||LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:54:5: StdIn
                    {
                    match(input,StdIn,FOLLOW_StdIn_in_flow174); 


                               flow.setStdInStart();
                              

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:58:7: e= exp
                    {
                    pushFollow(FOLLOW_exp_in_flow197);
                    e=exp();

                    state._fsp--;



                                 flow.setStringStart(e);
                                

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:63:3: ( pipe )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==QualifiedName) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:64:5: pipe
            	    {
            	    pushFollow(FOLLOW_pipe_in_flow226);
            	    pipe();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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



    // $ANTLR start "exp"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:68:1: exp returns [String value] : (s= StringLiteral |id= Identifier | ^( '+' e1= exp e2= exp ) );
    public final String exp() throws RecognitionException {
        String value = null;


        CommonTree s=null;
        CommonTree id=null;
        String e1 =null;

        String e2 =null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:69:3: (s= StringLiteral |id= Identifier | ^( '+' e1= exp e2= exp ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt5=1;
                }
                break;
            case Identifier:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:70:3: s= StringLiteral
                    {
                    s=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_exp252); 


                                       value = (s!=null?s.getText():null);
                                      

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:74:5: id= Identifier
                    {
                    id=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_exp281); 


                                       value = vars.get((id!=null?id.getText():null));
                                       if (value == null) {
                                       	throw new MetaFlowException("Variable " + (id!=null?id.getText():null) + " not assigned.");
                                       }
                                      

                    }
                    break;
                case 3 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:82:3: ^( '+' e1= exp e2= exp )
                    {
                    match(input,21,FOLLOW_21_in_exp311); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_exp315);
                    e1=exp();

                    state._fsp--;


                    pushFollow(FOLLOW_exp_in_exp319);
                    e2=exp();

                    state._fsp--;


                    match(input, Token.UP, null); 



                        value = e1 + e2;
                       

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "exp"



    // $ANTLR start "pipe"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:89:1: pipe : ^(name= QualifiedName (carg= exp )? (a= arg )* ) ;
    public final void pipe() throws RecognitionException {
        CommonTree name=null;
        String carg =null;

        FlowBuilder.arg_return a =null;



        final Map<String, String> args = new HashMap<String, String>();

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:93:3: ( ^(name= QualifiedName (carg= exp )? (a= arg )* ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:94:3: ^(name= QualifiedName (carg= exp )? (a= arg )* )
            {
            name=(CommonTree)match(input,QualifiedName,FOLLOW_QualifiedName_in_pipe356); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:95:28: (carg= exp )?
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Identifier||LA6_0==StringLiteral||LA6_0==21) ) {
                    alt6=1;
                }
                switch (alt6) {
                    case 1 :
                        // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:95:28: carg= exp
                        {
                        pushFollow(FOLLOW_exp_in_pipe360);
                        carg=exp();

                        state._fsp--;


                        }
                        break;

                }


                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:96:5: (a= arg )*
                loop7:
                do {
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==ARG) ) {
                        alt7=1;
                    }


                    switch (alt7) {
                	case 1 :
                	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:97:7: a= arg
                	    {
                	    pushFollow(FOLLOW_arg_in_pipe377);
                	    a=arg();

                	    state._fsp--;



                	                 args.put((a!=null?a.key:null), (a!=null?a.value:null));
                	                

                	    }
                	    break;

                	default :
                	    break loop7;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }



                flow.addElement((name!=null?name.getText():null), args, carg);
                //System.out.println("created "+(name!=null?name.getText():null));
               

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:110:1: arg returns [String key, String value] : ^( ARG k= Identifier e= exp ) ;
    public final FlowBuilder.arg_return arg() throws RecognitionException {
        FlowBuilder.arg_return retval = new FlowBuilder.arg_return();
        retval.start = input.LT(1);


        CommonTree k=null;
        String e =null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:111:3: ( ^( ARG k= Identifier e= exp ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:112:3: ^( ARG k= Identifier e= exp )
            {
            match(input,ARG,FOLLOW_ARG_in_arg432); 

            match(input, Token.DOWN, null); 
            k=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_arg436); 

            pushFollow(FOLLOW_exp_in_arg440);
            e=exp();

            state._fsp--;


            match(input, Token.UP, null); 



                retval.key = (k!=null?k.getText():null);
                retval.value = e;
               

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


 

    public static final BitSet FOLLOW_varDefs_in_metaflow70 = new BitSet(new long[]{0x0000000000218200L});
    public static final BitSet FOLLOW_flow_in_metaflow72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDef_in_varDefs105 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_DEF_in_varDef135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_varDef139 = new BitSet(new long[]{0x0000000000210208L});
    public static final BitSet FOLLOW_exp_in_varDef143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StdIn_in_flow174 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_exp_in_flow197 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_pipe_in_flow226 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_StringLiteral_in_exp252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_exp281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_exp311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_exp315 = new BitSet(new long[]{0x0000000000210200L});
    public static final BitSet FOLLOW_exp_in_exp319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QualifiedName_in_pipe356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_pipe360 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_arg_in_pipe377 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_ARG_in_arg432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_arg436 = new BitSet(new long[]{0x0000000000210200L});
    public static final BitSet FOLLOW_exp_in_arg440 = new BitSet(new long[]{0x0000000000000008L});

}