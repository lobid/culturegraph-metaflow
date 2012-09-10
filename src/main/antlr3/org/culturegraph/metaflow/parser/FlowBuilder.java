// $ANTLR 3.4 D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g 2012-09-10 13:20:15

package org.culturegraph.metaflow.parser;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARG", "ASSIGN", "DEFAULT", "Digit", "EscapeSequence", "HexDigit", "Identifier", "LINE_COMMENT", "Letter", "OctalEscape", "QualifiedName", "SUBFLOW", "StartString", "StdIn", "StringLiteral", "TEE", "UnicodeEscape", "VarRef", "WS", "'('", "')'", "'+'", "','", "'.'", "';'", "'='", "'default '", "'{'", "'|'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
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
    public static final int SUBFLOW=15;
    public static final int StartString=16;
    public static final int StdIn=17;
    public static final int StringLiteral=18;
    public static final int TEE=19;
    public static final int UnicodeEscape=20;
    public static final int VarRef=21;
    public static final int WS=22;

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:30:1: metaflow returns [Flow flow] : varDefs mainflow ;
    public final Flow metaflow() throws RecognitionException {
        Flow flow = null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:31:3: ( varDefs mainflow )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:32:3: varDefs mainflow
            {
            pushFollow(FOLLOW_varDefs_in_metaflow70);
            varDefs();

            state._fsp--;


            pushFollow(FOLLOW_mainflow_in_metaflow72);
            mainflow();

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:38:1: varDefs : ( varDef )* ;
    public final void varDefs() throws RecognitionException {
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:39:3: ( ( varDef )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:40:3: ( varDef )*
            {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:40:3: ( varDef )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ASSIGN && LA1_0 <= DEFAULT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:40:3: varDef
            	    {
            	    pushFollow(FOLLOW_varDef_in_varDefs109);
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:46:1: varDef : ( ^( ASSIGN name= Identifier (e= exp )? ) | ^( DEFAULT name= Identifier (e= exp )? ) );
    public final void varDef() throws RecognitionException {
        CommonTree name=null;
        String e =null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:47:3: ( ^( ASSIGN name= Identifier (e= exp )? ) | ^( DEFAULT name= Identifier (e= exp )? ) )
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
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:48:3: ^( ASSIGN name= Identifier (e= exp )? )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_varDef139); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_varDef143); 

                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:48:29: (e= exp )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==Identifier||LA2_0==StringLiteral||LA2_0==25) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:48:29: e= exp
                            {
                            pushFollow(FOLLOW_exp_in_varDef147);
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
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:54:3: ^( DEFAULT name= Identifier (e= exp )? )
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_varDef166); 

                    match(input, Token.DOWN, null); 
                    name=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_varDef170); 

                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:54:30: (e= exp )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==Identifier||LA3_0==StringLiteral||LA3_0==25) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:54:30: e= exp
                            {
                            pushFollow(FOLLOW_exp_in_varDef174);
                            e=exp();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 



                        if (!vars.containsKey((name!=null?name.getText():null))) {
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



    // $ANTLR start "mainflow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:63:1: mainflow : ( StdIn |e= exp ) flow ;
    public final void mainflow() throws RecognitionException {
        String e =null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:64:3: ( ( StdIn |e= exp ) flow )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:65:3: ( StdIn |e= exp ) flow
            {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:65:3: ( StdIn |e= exp )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==StdIn) ) {
                alt5=1;
            }
            else if ( (LA5_0==Identifier||LA5_0==StringLiteral||LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:66:5: StdIn
                    {
                    match(input,StdIn,FOLLOW_StdIn_in_mainflow205); 


                               flow.setStdInStart();
                              

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:70:7: e= exp
                    {
                    pushFollow(FOLLOW_exp_in_mainflow228);
                    e=exp();

                    state._fsp--;



                                 flow.setStringStart(e);
                                

                    }
                    break;

            }


            pushFollow(FOLLOW_flow_in_mainflow251);
            flow();

            state._fsp--;


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
    // $ANTLR end "mainflow"



    // $ANTLR start "tee"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:78:1: tee : ^( TEE ( ^( SUBFLOW flow ) )+ ) ;
    public final void tee() throws RecognitionException {
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:79:3: ( ^( TEE ( ^( SUBFLOW flow ) )+ ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:80:3: ^( TEE ( ^( SUBFLOW flow ) )+ )
            {
            match(input,TEE,FOLLOW_TEE_in_tee272); 


                     flow.startTee();
                     //System.out.println("start tee");
                    

            match(input, Token.DOWN, null); 
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:86:5: ( ^( SUBFLOW flow ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==SUBFLOW) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:87:7: ^( SUBFLOW flow )
            	    {
            	    match(input,SUBFLOW,FOLLOW_SUBFLOW_in_tee298); 

            	    match(input, Token.DOWN, null); 
            	    pushFollow(FOLLOW_flow_in_tee300);
            	    flow();

            	    state._fsp--;


            	    match(input, Token.UP, null); 



            	            flow.endSubFlow();
            	            // System.out.println("end subflow");
            	           

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


            match(input, Token.UP, null); 



                flow.endTee();
                //System.out.println("end tee");
               

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
    // $ANTLR end "tee"



    // $ANTLR start "flow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:102:1: flow : ( pipe | tee )+ ;
    public final void flow() throws RecognitionException {
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:103:3: ( ( pipe | tee )+ )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:104:3: ( pipe | tee )+
            {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:104:3: ( pipe | tee )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==QualifiedName) ) {
                    alt7=1;
                }
                else if ( (LA7_0==TEE) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:105:5: pipe
            	    {
            	    pushFollow(FOLLOW_pipe_in_flow358);
            	    pipe();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:106:7: tee
            	    {
            	    pushFollow(FOLLOW_tee_in_flow366);
            	    tee();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:110:1: exp returns [String value] : (s= StringLiteral |id= Identifier | ^( '+' e1= exp e2= exp ) );
    public final String exp() throws RecognitionException {
        String value = null;


        CommonTree s=null;
        CommonTree id=null;
        String e1 =null;

        String e2 =null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:111:3: (s= StringLiteral |id= Identifier | ^( '+' e1= exp e2= exp ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt8=1;
                }
                break;
            case Identifier:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:112:3: s= StringLiteral
                    {
                    s=(CommonTree)match(input,StringLiteral,FOLLOW_StringLiteral_in_exp392); 


                                       value = (s!=null?s.getText():null);
                                      

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:116:5: id= Identifier
                    {
                    id=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_exp421); 


                                       value = vars.get((id!=null?id.getText():null));
                                       if (value == null) {
                                       	throw new MetaFlowException("Variable " + (id!=null?id.getText():null) + " not assigned.");
                                       }
                                      

                    }
                    break;
                case 3 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:124:3: ^( '+' e1= exp e2= exp )
                    {
                    match(input,25,FOLLOW_25_in_exp451); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exp_in_exp455);
                    e1=exp();

                    state._fsp--;


                    pushFollow(FOLLOW_exp_in_exp459);
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:131:1: pipe : ^(name= QualifiedName (e= exp )? ( VarRef )? (a= arg )* ) ;
    public final void pipe() throws RecognitionException {
        CommonTree name=null;
        String e =null;

        FlowBuilder.arg_return a =null;



        final Map<String, String> namedArgs = new HashMap<String, String>();
        final List<Object> cArgs = new ArrayList<Object>();

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:136:3: ( ^(name= QualifiedName (e= exp )? ( VarRef )? (a= arg )* ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:137:3: ^(name= QualifiedName (e= exp )? ( VarRef )? (a= arg )* )
            {
            name=(CommonTree)match(input,QualifiedName,FOLLOW_QualifiedName_in_pipe496); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:139:5: (e= exp )?
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Identifier||LA9_0==StringLiteral||LA9_0==25) ) {
                    alt9=1;
                }
                switch (alt9) {
                    case 1 :
                        // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:140:7: e= exp
                        {
                        pushFollow(FOLLOW_exp_in_pipe512);
                        e=exp();

                        state._fsp--;



                                     cArgs.add(e);
                                    

                        }
                        break;

                }


                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:145:5: ( VarRef )?
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==VarRef) ) {
                    alt10=1;
                }
                switch (alt10) {
                    case 1 :
                        // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:146:7: VarRef
                        {
                        match(input,VarRef,FOLLOW_VarRef_in_pipe548); 


                                      cArgs.add(Collections.unmodifiableMap(vars));
                                     

                        }
                        break;

                }


                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:151:5: (a= arg )*
                loop11:
                do {
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ARG) ) {
                        alt11=1;
                    }


                    switch (alt11) {
                	case 1 :
                	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:152:7: a= arg
                	    {
                	    pushFollow(FOLLOW_arg_in_pipe587);
                	    a=arg();

                	    state._fsp--;



                	                 namedArgs.put((a!=null?a.key:null), (a!=null?a.value:null));
                	                

                	    }
                	    break;

                	default :
                	    break loop11;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }



                flow.addElement(flow.createElement((name!=null?name.getText():null), namedArgs, cArgs));
               

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:164:1: arg returns [String key, String value] : ^( ARG k= Identifier e= exp ) ;
    public final FlowBuilder.arg_return arg() throws RecognitionException {
        FlowBuilder.arg_return retval = new FlowBuilder.arg_return();
        retval.start = input.LT(1);


        CommonTree k=null;
        String e =null;


        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:165:3: ( ^( ARG k= Identifier e= exp ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\FlowBuilder.g:166:3: ^( ARG k= Identifier e= exp )
            {
            match(input,ARG,FOLLOW_ARG_in_arg642); 

            match(input, Token.DOWN, null); 
            k=(CommonTree)match(input,Identifier,FOLLOW_Identifier_in_arg646); 

            pushFollow(FOLLOW_exp_in_arg650);
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


 

    public static final BitSet FOLLOW_varDefs_in_metaflow70 = new BitSet(new long[]{0x0000000002060400L});
    public static final BitSet FOLLOW_mainflow_in_metaflow72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDef_in_varDefs109 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ASSIGN_in_varDef139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_varDef143 = new BitSet(new long[]{0x0000000002040408L});
    public static final BitSet FOLLOW_exp_in_varDef147 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFAULT_in_varDef166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_varDef170 = new BitSet(new long[]{0x0000000002040408L});
    public static final BitSet FOLLOW_exp_in_varDef174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StdIn_in_mainflow205 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_exp_in_mainflow228 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_flow_in_mainflow251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEE_in_tee272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBFLOW_in_tee298 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_in_tee300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pipe_in_flow358 = new BitSet(new long[]{0x0000000000084002L});
    public static final BitSet FOLLOW_tee_in_flow366 = new BitSet(new long[]{0x0000000000084002L});
    public static final BitSet FOLLOW_StringLiteral_in_exp392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_exp421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_exp451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_exp455 = new BitSet(new long[]{0x0000000002040400L});
    public static final BitSet FOLLOW_exp_in_exp459 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QualifiedName_in_pipe496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_pipe512 = new BitSet(new long[]{0x0000000000200018L});
    public static final BitSet FOLLOW_VarRef_in_pipe548 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_arg_in_pipe587 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_ARG_in_arg642 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Identifier_in_arg646 = new BitSet(new long[]{0x0000000002040400L});
    public static final BitSet FOLLOW_exp_in_arg650 = new BitSet(new long[]{0x0000000000000008L});

}