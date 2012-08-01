// $ANTLR 3.4 D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g 2012-08-01 09:28:02

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARG", "ASSIGN", "DEFAULT", "Digit", "EscapeSequence", "HexDigit", "Identifier", "LINE_COMMENT", "Letter", "OctalEscape", "QualifiedName", "StartString", "StdIn", "StringLiteral", "UnicodeEscape", "WS", "'('", "')'", "'+'", "','", "'.'", "';'", "'='", "'default '", "'|'"
    };

    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int ARG=4;
    public static final int ASSIGN=5;
    public static final int DEFAULT=6;
    public static final int Digit=7;
    public static final int EscapeSequence=8;
    public static final int HexDigit=9;
    public static final int Identifier=10;
    public static final int LINE_COMMENT=11;
    public static final int Letter=12;
    public static final int OctalEscape=13;
    public static final int QualifiedName=14;
    public static final int StartString=15;
    public static final int StdIn=16;
    public static final int StringLiteral=17;
    public static final int UnicodeEscape=18;
    public static final int WS=19;

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

    public final void addVaribleAssignements(final Map<String, String> vars) {
    	this.vars.putAll(vars);
    }



    // $ANTLR start "metaflow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:28:1: metaflow returns [Flow flow] : varDefs flow ;
    public final Flow metaflow() throws RecognitionException {
        Flow flow = null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:29:3: ( varDefs flow )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:30:3: varDefs flow
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:36:1: varDefs : ( varDef )* ;
    public final void varDefs() throws RecognitionException {
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:37:3: ( ( varDef )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:38:3: ( varDef )*
            {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:38:3: ( varDef )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ASSIGN && LA1_0 <= DEFAULT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:38:3: varDef
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:44:1: varDef : ( ^( ASSIGN name= Identifier (e= exp )? ) | ^( DEFAULT name= Identifier (e= exp )? ) );
    public final void varDef() throws RecognitionException {
        CommonTree name=null;
        String e =null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:45:3: ( ^( ASSIGN name= Identifier (e= exp )? ) | ^( DEFAULT name= Identifier (e= exp )? ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ASSIGN) ) {
                alt4=1;
            }
            else if ( (LA4_0==DEFAULT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:46:3: ^( ASSIGN name= Identifier (e= exp )? )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_varDef135); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_varDef139); 

                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:46:29: (e= exp )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==Identifier||LA2_0==StringLiteral||LA2_0==22) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:46:29: e= exp
                            {
                            pushFollow(FOLLOW_exp_in_varDef143);
                            e=exp();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 



                        vars.put((name!=null?name.getText():null), e);
                       

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:52:3: ^( DEFAULT name= Identifier (e= exp )? )
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_varDef162); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_varDef166); 

                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:52:30: (e= exp )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==Identifier||LA3_0==StringLiteral||LA3_0==22) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:52:30: e= exp
                            {
                            pushFollow(FOLLOW_exp_in_varDef170);
                            e=exp();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 



                        if(!vars.containsKey((name!=null?name.getText():null))){
                            vars.put((name!=null?name.getText():null), e);
                            }
                       

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
        return ;
    }
    // $ANTLR end "varDef"



    // $ANTLR start "flow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:61:1: flow : ( StdIn |e= exp ) ( pipe )+ ;
    public final void flow() throws RecognitionException {
        String e =null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:62:3: ( ( StdIn |e= exp ) ( pipe )+ )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:63:3: ( StdIn |e= exp ) ( pipe )+
            {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:63:3: ( StdIn |e= exp )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==StdIn) ) {
                alt5=1;
            }
            else if ( (LA5_0==Identifier||LA5_0==StringLiteral||LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:64:5: StdIn
                    {
                    match(input,StdIn,FOLLOW_StdIn_in_flow201); 


                               flow.setStdInStart();
                              

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:68:7: e= exp
                    {
                    pushFollow(FOLLOW_exp_in_flow224);
                    e=exp();

                    state._fsp--;



                                 flow.setStringStart(e);
                                

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:73:3: ( pipe )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==QualifiedName) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:74:5: pipe
            	    {
            	    pushFollow(FOLLOW_pipe_in_flow253);
            	    pipe();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:78:1: exp returns [String value] : (s= StringLiteral |id= Identifier | ^( '+' e1= exp e2= exp ) );
    public final String exp() throws RecognitionException {
        String value = null;


        CommonTree s=null;
        CommonTree id=null;
        String e1 =null;

        String e2 =null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:79:3: (s= StringLiteral |id= Identifier | ^( '+' e1= exp e2= exp ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt7=1;
                }
                break;
            case Identifier:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:80:3: s= StringLiteral
                    {
                    s=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_exp279); 


                                       value = (s!=null?s.getText():null);
                                      

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:84:5: id= Identifier
                    {
                    id=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_exp308); 


                                       value = vars.get((id!=null?id.getText():null));
                                       if (value == null) {
                                       	throw new MetaFlowException("Variable " + (id!=null?id.getText():null) + " not assigned.");
                                       }
                                      

                    }
                    break;
                case 3 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:92:3: ^( '+' e1= exp e2= exp )
                    {
                    match(input,22,FOLLOW_22_in_exp338); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_exp342);
                    e1=exp();

                    state._fsp--;


                    pushFollow(FOLLOW_exp_in_exp346);
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:99:1: pipe : ^(name= QualifiedName (carg= exp )? (a= arg )* ) ;
    public final void pipe() throws RecognitionException {
        CommonTree name=null;
        String carg =null;

        FlowBuilder.arg_return a =null;



        final Map<String, String> args = new HashMap<String, String>();

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:103:3: ( ^(name= QualifiedName (carg= exp )? (a= arg )* ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:104:3: ^(name= QualifiedName (carg= exp )? (a= arg )* )
            {
            name=(CommonTree)match(input,QualifiedName,FOLLOW_QualifiedName_in_pipe383); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:105:28: (carg= exp )?
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Identifier||LA8_0==StringLiteral||LA8_0==22) ) {
                    alt8=1;
                }
                switch (alt8) {
                    case 1 :
                        // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:105:28: carg= exp
                        {
                        pushFollow(FOLLOW_exp_in_pipe387);
                        carg=exp();

                        state._fsp--;


                        }
                        break;

                }


                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:106:5: (a= arg )*
                loop9:
                do {
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ARG) ) {
                        alt9=1;
                    }


                    switch (alt9) {
                	case 1 :
                	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:107:7: a= arg
                	    {
                	    pushFollow(FOLLOW_arg_in_pipe404);
                	    a=arg();

                	    state._fsp--;



                	                 args.put((a!=null?a.key:null), (a!=null?a.value:null));
                	                

                	    }
                	    break;

                	default :
                	    break loop9;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }



                flow.addElement((name!=null?name.getText():null), args, carg);
               

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:119:1: arg returns [String key, String value] : ^( ARG k= Identifier e= exp ) ;
    public final FlowBuilder.arg_return arg() throws RecognitionException {
        FlowBuilder.arg_return retval = new FlowBuilder.arg_return();
        retval.start = input.LT(1);


        CommonTree k=null;
        String e =null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:120:3: ( ^( ARG k= Identifier e= exp ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:121:3: ^( ARG k= Identifier e= exp )
            {
            match(input,ARG,FOLLOW_ARG_in_arg459); 

            match(input, Token.DOWN, null); 
            k=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_arg463); 

            pushFollow(FOLLOW_exp_in_arg467);
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


 

    public static final BitSet FOLLOW_varDefs_in_metaflow70 = new BitSet(new long[]{0x0000000000430400L});
    public static final BitSet FOLLOW_flow_in_metaflow72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDef_in_varDefs105 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ASSIGN_in_varDef135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_varDef139 = new BitSet(new long[]{0x0000000000420408L});
    public static final BitSet FOLLOW_exp_in_varDef143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFAULT_in_varDef162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_varDef166 = new BitSet(new long[]{0x0000000000420408L});
    public static final BitSet FOLLOW_exp_in_varDef170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StdIn_in_flow201 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_exp_in_flow224 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_pipe_in_flow253 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_StringLiteral_in_exp279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_exp308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_exp338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_exp342 = new BitSet(new long[]{0x0000000000420400L});
    public static final BitSet FOLLOW_exp_in_exp346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QualifiedName_in_pipe383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_pipe387 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_arg_in_pipe404 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_ARG_in_arg459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_arg463 = new BitSet(new long[]{0x0000000000420400L});
    public static final BitSet FOLLOW_exp_in_arg467 = new BitSet(new long[]{0x0000000000000008L});

}