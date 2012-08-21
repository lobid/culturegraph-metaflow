// $ANTLR 3.4 D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g 2012-08-16 16:12:19

package org.culturegraph.metaflow.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MetaflowParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARG", "ASSIGN", "DEFAULT", "Digit", "EscapeSequence", "HexDigit", "Identifier", "LINE_COMMENT", "Letter", "OctalEscape", "QualifiedName", "SUBFLOW", "StartString", "StdIn", "StringLiteral", "TEE", "UnicodeEscape", "WS", "'('", "')'", "'+'", "','", "'.'", "';'", "'='", "'default '", "'{'", "'|'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__22=22;
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
    public static final int WS=21;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MetaflowParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MetaflowParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MetaflowParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g"; }


    public static class metaflow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metaflow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:28:1: metaflow : ( varDef )* mainflow ;
    public final MetaflowParser.metaflow_return metaflow() throws RecognitionException {
        MetaflowParser.metaflow_return retval = new MetaflowParser.metaflow_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MetaflowParser.varDef_return varDef1 =null;

        MetaflowParser.mainflow_return mainflow2 =null;



        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:29:3: ( ( varDef )* mainflow )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:30:3: ( varDef )* mainflow
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:30:3: ( varDef )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Identifier) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==28) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:30:3: varDef
            	    {
            	    pushFollow(FOLLOW_varDef_in_metaflow111);
            	    varDef1=varDef();

            	    state._fsp--;

            	    adaptor.addChild(root_0, varDef1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_mainflow_in_metaflow114);
            mainflow2=mainflow();

            state._fsp--;

            adaptor.addChild(root_0, mainflow2.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "metaflow"


    public static class varDef_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDef"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:36:1: varDef : ( 'default ' i= Identifier '=' exp ';' -> ^( DEFAULT Identifier exp ) |i= Identifier '=' exp ';' -> ^( ASSIGN Identifier exp ) );
    public final MetaflowParser.varDef_return varDef() throws RecognitionException {
        MetaflowParser.varDef_return retval = new MetaflowParser.varDef_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token i=null;
        Token string_literal3=null;
        Token char_literal4=null;
        Token char_literal6=null;
        Token char_literal7=null;
        Token char_literal9=null;
        MetaflowParser.exp_return exp5 =null;

        MetaflowParser.exp_return exp8 =null;


        CommonTree i_tree=null;
        CommonTree string_literal3_tree=null;
        CommonTree char_literal4_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree char_literal9_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:37:3: ( 'default ' i= Identifier '=' exp ';' -> ^( DEFAULT Identifier exp ) |i= Identifier '=' exp ';' -> ^( ASSIGN Identifier exp ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==Identifier) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:38:3: 'default ' i= Identifier '=' exp ';'
                    {
                    string_literal3=(Token)match(input,29,FOLLOW_29_in_varDef138);  
                    stream_29.add(string_literal3);


                    i=(Token)match(input,Identifier,FOLLOW_Identifier_in_varDef142);  
                    stream_Identifier.add(i);


                    char_literal4=(Token)match(input,28,FOLLOW_28_in_varDef144);  
                    stream_28.add(char_literal4);


                    pushFollow(FOLLOW_exp_in_varDef146);
                    exp5=exp();

                    state._fsp--;

                    stream_exp.add(exp5.getTree());

                    char_literal6=(Token)match(input,27,FOLLOW_27_in_varDef148);  
                    stream_27.add(char_literal6);


                    // AST REWRITE
                    // elements: exp, Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 39:5: -> ^( DEFAULT Identifier exp )
                    {
                        // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:40:7: ^( DEFAULT Identifier exp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(DEFAULT, "DEFAULT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Identifier.nextNode()
                        );

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:41:5: i= Identifier '=' exp ';'
                    {
                    i=(Token)match(input,Identifier,FOLLOW_Identifier_in_varDef176);  
                    stream_Identifier.add(i);


                    char_literal7=(Token)match(input,28,FOLLOW_28_in_varDef178);  
                    stream_28.add(char_literal7);


                    pushFollow(FOLLOW_exp_in_varDef180);
                    exp8=exp();

                    state._fsp--;

                    stream_exp.add(exp8.getTree());

                    char_literal9=(Token)match(input,27,FOLLOW_27_in_varDef182);  
                    stream_27.add(char_literal9);


                    // AST REWRITE
                    // elements: exp, Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 42:5: -> ^( ASSIGN Identifier exp )
                    {
                        // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:43:7: ^( ASSIGN Identifier exp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ASSIGN, "ASSIGN")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_Identifier.nextNode()
                        );

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varDef"


    public static class mainflow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mainflow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:46:1: mainflow : ( StdIn | exp ) '|' ! flow ';' !;
    public final MetaflowParser.mainflow_return mainflow() throws RecognitionException {
        MetaflowParser.mainflow_return retval = new MetaflowParser.mainflow_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token StdIn10=null;
        Token char_literal12=null;
        Token char_literal14=null;
        MetaflowParser.exp_return exp11 =null;

        MetaflowParser.flow_return flow13 =null;


        CommonTree StdIn10_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree char_literal14_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:47:3: ( ( StdIn | exp ) '|' ! flow ';' !)
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:48:3: ( StdIn | exp ) '|' ! flow ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:48:3: ( StdIn | exp )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==StdIn) ) {
                alt3=1;
            }
            else if ( (LA3_0==Identifier||LA3_0==StringLiteral) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:49:5: StdIn
                    {
                    StdIn10=(Token)match(input,StdIn,FOLLOW_StdIn_in_mainflow223); 
                    StdIn10_tree = 
                    (CommonTree)adaptor.create(StdIn10)
                    ;
                    adaptor.addChild(root_0, StdIn10_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:50:7: exp
                    {
                    pushFollow(FOLLOW_exp_in_mainflow231);
                    exp11=exp();

                    state._fsp--;

                    adaptor.addChild(root_0, exp11.getTree());

                    }
                    break;

            }


            char_literal12=(Token)match(input,31,FOLLOW_31_in_mainflow239); 

            pushFollow(FOLLOW_flow_in_mainflow242);
            flow13=flow();

            state._fsp--;

            adaptor.addChild(root_0, flow13.getTree());

            char_literal14=(Token)match(input,27,FOLLOW_27_in_mainflow244); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mainflow"


    public static class tee_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tee"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:55:1: tee : ( '{' flow '}' )+ -> ^( TEE ( ^( SUBFLOW flow ) )+ ) ;
    public final MetaflowParser.tee_return tee() throws RecognitionException {
        MetaflowParser.tee_return retval = new MetaflowParser.tee_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal15=null;
        Token char_literal17=null;
        MetaflowParser.flow_return flow16 =null;


        CommonTree char_literal15_tree=null;
        CommonTree char_literal17_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_flow=new RewriteRuleSubtreeStream(adaptor,"rule flow");
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:56:3: ( ( '{' flow '}' )+ -> ^( TEE ( ^( SUBFLOW flow ) )+ ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:57:3: ( '{' flow '}' )+
            {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:57:3: ( '{' flow '}' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:57:4: '{' flow '}'
            	    {
            	    char_literal15=(Token)match(input,30,FOLLOW_30_in_tee261);  
            	    stream_30.add(char_literal15);


            	    pushFollow(FOLLOW_flow_in_tee263);
            	    flow16=flow();

            	    state._fsp--;

            	    stream_flow.add(flow16.getTree());

            	    char_literal17=(Token)match(input,32,FOLLOW_32_in_tee265);  
            	    stream_32.add(char_literal17);


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


            // AST REWRITE
            // elements: flow
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 58:5: -> ^( TEE ( ^( SUBFLOW flow ) )+ )
            {
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:59:7: ^( TEE ( ^( SUBFLOW flow ) )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TEE, "TEE")
                , root_1);

                if ( !(stream_flow.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_flow.hasNext() ) {
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:61:9: ^( SUBFLOW flow )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(SUBFLOW, "SUBFLOW")
                    , root_2);

                    adaptor.addChild(root_2, stream_flow.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_flow.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tee"


    public static class flow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:65:1: flow : ( pipe | tee ) ( '|' ! ( pipe | tee ) )* ;
    public final MetaflowParser.flow_return flow() throws RecognitionException {
        MetaflowParser.flow_return retval = new MetaflowParser.flow_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal20=null;
        MetaflowParser.pipe_return pipe18 =null;

        MetaflowParser.tee_return tee19 =null;

        MetaflowParser.pipe_return pipe21 =null;

        MetaflowParser.tee_return tee22 =null;


        CommonTree char_literal20_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:66:3: ( ( pipe | tee ) ( '|' ! ( pipe | tee ) )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:67:3: ( pipe | tee ) ( '|' ! ( pipe | tee ) )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:67:3: ( pipe | tee )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Identifier) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:68:5: pipe
                    {
                    pushFollow(FOLLOW_pipe_in_flow336);
                    pipe18=pipe();

                    state._fsp--;

                    adaptor.addChild(root_0, pipe18.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:69:7: tee
                    {
                    pushFollow(FOLLOW_tee_in_flow344);
                    tee19=tee();

                    state._fsp--;

                    adaptor.addChild(root_0, tee19.getTree());

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:71:3: ( '|' ! ( pipe | tee ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:72:5: '|' ! ( pipe | tee )
            	    {
            	    char_literal20=(Token)match(input,31,FOLLOW_31_in_flow358); 

            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:73:5: ( pipe | tee )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==Identifier) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==30) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:74:7: pipe
            	            {
            	            pushFollow(FOLLOW_pipe_in_flow373);
            	            pipe21=pipe();

            	            state._fsp--;

            	            adaptor.addChild(root_0, pipe21.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:75:9: tee
            	            {
            	            pushFollow(FOLLOW_tee_in_flow383);
            	            tee22=tee();

            	            state._fsp--;

            	            adaptor.addChild(root_0, tee22.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "flow"


    public static class pipe_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pipe"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:85:1: pipe : qualifiedName ( '(' pipeArgs ')' )? -> ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* ) ;
    public final MetaflowParser.pipe_return pipe() throws RecognitionException {
        MetaflowParser.pipe_return retval = new MetaflowParser.pipe_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal24=null;
        Token char_literal26=null;
        MetaflowParser.qualifiedName_return qualifiedName23 =null;

        MetaflowParser.pipeArgs_return pipeArgs25 =null;


        CommonTree char_literal24_tree=null;
        CommonTree char_literal26_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_qualifiedName=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedName");
        RewriteRuleSubtreeStream stream_pipeArgs=new RewriteRuleSubtreeStream(adaptor,"rule pipeArgs");
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:86:3: ( qualifiedName ( '(' pipeArgs ')' )? -> ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:87:3: qualifiedName ( '(' pipeArgs ')' )?
            {
            pushFollow(FOLLOW_qualifiedName_in_pipe424);
            qualifiedName23=qualifiedName();

            state._fsp--;

            stream_qualifiedName.add(qualifiedName23.getTree());

            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:87:17: ( '(' pipeArgs ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:87:18: '(' pipeArgs ')'
                    {
                    char_literal24=(Token)match(input,22,FOLLOW_22_in_pipe427);  
                    stream_22.add(char_literal24);


                    pushFollow(FOLLOW_pipeArgs_in_pipe429);
                    pipeArgs25=pipeArgs();

                    state._fsp--;

                    stream_pipeArgs.add(pipeArgs25.getTree());

                    char_literal26=(Token)match(input,23,FOLLOW_23_in_pipe431);  
                    stream_23.add(char_literal26);


                    }
                    break;

            }


            // AST REWRITE
            // elements: pipeArgs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 88:5: -> ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* )
            {
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:89:7: ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(QualifiedName, (qualifiedName23!=null?input.toString(qualifiedName23.start,qualifiedName23.stop):null))
                , root_1);

                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:89:44: ( pipeArgs )*
                while ( stream_pipeArgs.hasNext() ) {
                    adaptor.addChild(root_1, stream_pipeArgs.nextTree());

                }
                stream_pipeArgs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pipe"


    public static class exp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exp"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:92:1: exp : atom ( '+' ^ atom )* ;
    public final MetaflowParser.exp_return exp() throws RecognitionException {
        MetaflowParser.exp_return retval = new MetaflowParser.exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal28=null;
        MetaflowParser.atom_return atom27 =null;

        MetaflowParser.atom_return atom29 =null;


        CommonTree char_literal28_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:93:3: ( atom ( '+' ^ atom )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:94:3: atom ( '+' ^ atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_exp468);
            atom27=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom27.getTree());

            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:94:8: ( '+' ^ atom )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:94:9: '+' ^ atom
            	    {
            	    char_literal28=(Token)match(input,24,FOLLOW_24_in_exp471); 
            	    char_literal28_tree = 
            	    (CommonTree)adaptor.create(char_literal28)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal28_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_exp474);
            	    atom29=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom29.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exp"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:97:1: atom : ( StringLiteral | Identifier );
    public final MetaflowParser.atom_return atom() throws RecognitionException {
        MetaflowParser.atom_return retval = new MetaflowParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set30=null;

        CommonTree set30_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:98:3: ( StringLiteral | Identifier )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set30=(Token)input.LT(1);

            if ( input.LA(1)==Identifier||input.LA(1)==StringLiteral ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set30)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class pipeArgs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pipeArgs"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:103:1: pipeArgs : ( exp | namedArg ) ( ',' ! namedArg )* ;
    public final MetaflowParser.pipeArgs_return pipeArgs() throws RecognitionException {
        MetaflowParser.pipeArgs_return retval = new MetaflowParser.pipeArgs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal33=null;
        MetaflowParser.exp_return exp31 =null;

        MetaflowParser.namedArg_return namedArg32 =null;

        MetaflowParser.namedArg_return namedArg34 =null;


        CommonTree char_literal33_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:104:3: ( ( exp | namedArg ) ( ',' ! namedArg )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:105:3: ( exp | namedArg ) ( ',' ! namedArg )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:105:3: ( exp | namedArg )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Identifier) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==28) ) {
                    alt10=2;
                }
                else if ( ((LA10_1 >= 23 && LA10_1 <= 25)) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA10_0==StringLiteral) ) {
                alt10=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:106:5: exp
                    {
                    pushFollow(FOLLOW_exp_in_pipeArgs518);
                    exp31=exp();

                    state._fsp--;

                    adaptor.addChild(root_0, exp31.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:107:7: namedArg
                    {
                    pushFollow(FOLLOW_namedArg_in_pipeArgs526);
                    namedArg32=namedArg();

                    state._fsp--;

                    adaptor.addChild(root_0, namedArg32.getTree());

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:109:3: ( ',' ! namedArg )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:109:4: ',' ! namedArg
            	    {
            	    char_literal33=(Token)match(input,25,FOLLOW_25_in_pipeArgs535); 

            	    pushFollow(FOLLOW_namedArg_in_pipeArgs538);
            	    namedArg34=namedArg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, namedArg34.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pipeArgs"


    public static class namedArg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namedArg"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:112:1: namedArg : Identifier '=' exp -> ^( ARG Identifier exp ) ;
    public final MetaflowParser.namedArg_return namedArg() throws RecognitionException {
        MetaflowParser.namedArg_return retval = new MetaflowParser.namedArg_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Identifier35=null;
        Token char_literal36=null;
        MetaflowParser.exp_return exp37 =null;


        CommonTree Identifier35_tree=null;
        CommonTree char_literal36_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:113:3: ( Identifier '=' exp -> ^( ARG Identifier exp ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:114:3: Identifier '=' exp
            {
            Identifier35=(Token)match(input,Identifier,FOLLOW_Identifier_in_namedArg555);  
            stream_Identifier.add(Identifier35);


            char_literal36=(Token)match(input,28,FOLLOW_28_in_namedArg557);  
            stream_28.add(char_literal36);


            pushFollow(FOLLOW_exp_in_namedArg559);
            exp37=exp();

            state._fsp--;

            stream_exp.add(exp37.getTree());

            // AST REWRITE
            // elements: exp, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 115:5: -> ^( ARG Identifier exp )
            {
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:116:7: ^( ARG Identifier exp )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ARG, "ARG")
                , root_1);

                adaptor.addChild(root_1, 
                stream_Identifier.nextNode()
                );

                adaptor.addChild(root_1, stream_exp.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namedArg"


    public static class qualifiedName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qualifiedName"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:119:1: qualifiedName : Identifier ( '.' Identifier )* ;
    public final MetaflowParser.qualifiedName_return qualifiedName() throws RecognitionException {
        MetaflowParser.qualifiedName_return retval = new MetaflowParser.qualifiedName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Identifier38=null;
        Token char_literal39=null;
        Token Identifier40=null;

        CommonTree Identifier38_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree Identifier40_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:120:3: ( Identifier ( '.' Identifier )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:121:3: Identifier ( '.' Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();


            Identifier38=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName594); 
            Identifier38_tree = 
            (CommonTree)adaptor.create(Identifier38)
            ;
            adaptor.addChild(root_0, Identifier38_tree);


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:121:14: ( '.' Identifier )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:121:15: '.' Identifier
            	    {
            	    char_literal39=(Token)match(input,26,FOLLOW_26_in_qualifiedName597); 
            	    char_literal39_tree = 
            	    (CommonTree)adaptor.create(char_literal39)
            	    ;
            	    adaptor.addChild(root_0, char_literal39_tree);


            	    Identifier40=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName599); 
            	    Identifier40_tree = 
            	    (CommonTree)adaptor.create(Identifier40)
            	    ;
            	    adaptor.addChild(root_0, Identifier40_tree);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "qualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_varDef_in_metaflow111 = new BitSet(new long[]{0x0000000020060400L});
    public static final BitSet FOLLOW_mainflow_in_metaflow114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_varDef138 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_varDef142 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_varDef144 = new BitSet(new long[]{0x0000000000040400L});
    public static final BitSet FOLLOW_exp_in_varDef146 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_varDef148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varDef176 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_varDef178 = new BitSet(new long[]{0x0000000000040400L});
    public static final BitSet FOLLOW_exp_in_varDef180 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_varDef182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StdIn_in_mainflow223 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_exp_in_mainflow231 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_mainflow239 = new BitSet(new long[]{0x0000000040000400L});
    public static final BitSet FOLLOW_flow_in_mainflow242 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_mainflow244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_tee261 = new BitSet(new long[]{0x0000000040000400L});
    public static final BitSet FOLLOW_flow_in_tee263 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_tee265 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_pipe_in_flow336 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_tee_in_flow344 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_flow358 = new BitSet(new long[]{0x0000000040000400L});
    public static final BitSet FOLLOW_pipe_in_flow373 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_tee_in_flow383 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_qualifiedName_in_pipe424 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_pipe427 = new BitSet(new long[]{0x0000000000040400L});
    public static final BitSet FOLLOW_pipeArgs_in_pipe429 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_pipe431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_exp468 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_exp471 = new BitSet(new long[]{0x0000000000040400L});
    public static final BitSet FOLLOW_atom_in_exp474 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_exp_in_pipeArgs518 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs526 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_pipeArgs535 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs538 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_Identifier_in_namedArg555 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_namedArg557 = new BitSet(new long[]{0x0000000000040400L});
    public static final BitSet FOLLOW_exp_in_namedArg559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName594 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_qualifiedName597 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName599 = new BitSet(new long[]{0x0000000004000002L});

}