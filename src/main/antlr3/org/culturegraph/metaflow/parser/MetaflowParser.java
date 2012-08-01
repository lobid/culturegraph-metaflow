// $ANTLR 3.4 D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g 2012-08-01 09:28:01

package org.culturegraph.metaflow.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MetaflowParser extends Parser {
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:26:1: metaflow : ( varDef )* flow ;
    public final MetaflowParser.metaflow_return metaflow() throws RecognitionException {
        MetaflowParser.metaflow_return retval = new MetaflowParser.metaflow_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MetaflowParser.varDef_return varDef1 =null;

        MetaflowParser.flow_return flow2 =null;



        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:27:3: ( ( varDef )* flow )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:28:3: ( varDef )* flow
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:28:3: ( varDef )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Identifier) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==26) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:28:3: varDef
            	    {
            	    pushFollow(FOLLOW_varDef_in_metaflow101);
            	    varDef1=varDef();

            	    state._fsp--;

            	    adaptor.addChild(root_0, varDef1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_flow_in_metaflow104);
            flow2=flow();

            state._fsp--;

            adaptor.addChild(root_0, flow2.getTree());

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:31:1: varDef : ( 'default ' i= Identifier '=' exp ';' -> ^( DEFAULT Identifier exp ) |i= Identifier '=' exp ';' -> ^( ASSIGN Identifier exp ) );
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
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:32:3: ( 'default ' i= Identifier '=' exp ';' -> ^( DEFAULT Identifier exp ) |i= Identifier '=' exp ';' -> ^( ASSIGN Identifier exp ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
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
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:33:3: 'default ' i= Identifier '=' exp ';'
                    {
                    string_literal3=(Token)match(input,27,FOLLOW_27_in_varDef119);  
                    stream_27.add(string_literal3);


                    i=(Token)match(input,Identifier,FOLLOW_Identifier_in_varDef123);  
                    stream_Identifier.add(i);


                    char_literal4=(Token)match(input,26,FOLLOW_26_in_varDef125);  
                    stream_26.add(char_literal4);


                    pushFollow(FOLLOW_exp_in_varDef127);
                    exp5=exp();

                    state._fsp--;

                    stream_exp.add(exp5.getTree());

                    char_literal6=(Token)match(input,25,FOLLOW_25_in_varDef129);  
                    stream_25.add(char_literal6);


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
                    // 34:5: -> ^( DEFAULT Identifier exp )
                    {
                        // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:7: ^( DEFAULT Identifier exp )
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
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:36:8: i= Identifier '=' exp ';'
                    {
                    i=(Token)match(input,Identifier,FOLLOW_Identifier_in_varDef160);  
                    stream_Identifier.add(i);


                    char_literal7=(Token)match(input,26,FOLLOW_26_in_varDef162);  
                    stream_26.add(char_literal7);


                    pushFollow(FOLLOW_exp_in_varDef164);
                    exp8=exp();

                    state._fsp--;

                    stream_exp.add(exp8.getTree());

                    char_literal9=(Token)match(input,25,FOLLOW_25_in_varDef166);  
                    stream_25.add(char_literal9);


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
                    // 37:5: -> ^( ASSIGN Identifier exp )
                    {
                        // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:38:7: ^( ASSIGN Identifier exp )
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


    public static class flow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:42:1: flow : ( StdIn | exp ) ( '|' ! pipe )+ ';' !;
    public final MetaflowParser.flow_return flow() throws RecognitionException {
        MetaflowParser.flow_return retval = new MetaflowParser.flow_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token StdIn10=null;
        Token char_literal12=null;
        Token char_literal14=null;
        MetaflowParser.exp_return exp11 =null;

        MetaflowParser.pipe_return pipe13 =null;


        CommonTree StdIn10_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree char_literal14_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:43:3: ( ( StdIn | exp ) ( '|' ! pipe )+ ';' !)
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:44:3: ( StdIn | exp ) ( '|' ! pipe )+ ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:44:3: ( StdIn | exp )
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
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:45:5: StdIn
                    {
                    StdIn10=(Token)match(input,StdIn,FOLLOW_StdIn_in_flow208); 
                    StdIn10_tree = 
                    (CommonTree)adaptor.create(StdIn10)
                    ;
                    adaptor.addChild(root_0, StdIn10_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:46:7: exp
                    {
                    pushFollow(FOLLOW_exp_in_flow216);
                    exp11=exp();

                    state._fsp--;

                    adaptor.addChild(root_0, exp11.getTree());

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:48:3: ( '|' ! pipe )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:48:4: '|' ! pipe
            	    {
            	    char_literal12=(Token)match(input,28,FOLLOW_28_in_flow225); 

            	    pushFollow(FOLLOW_pipe_in_flow228);
            	    pipe13=pipe();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pipe13.getTree());

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


            char_literal14=(Token)match(input,25,FOLLOW_25_in_flow232); 

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:56:1: pipe : qualifiedName ( '(' pipeArgs ')' )? -> ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* ) ;
    public final MetaflowParser.pipe_return pipe() throws RecognitionException {
        MetaflowParser.pipe_return retval = new MetaflowParser.pipe_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal16=null;
        Token char_literal18=null;
        MetaflowParser.qualifiedName_return qualifiedName15 =null;

        MetaflowParser.pipeArgs_return pipeArgs17 =null;


        CommonTree char_literal16_tree=null;
        CommonTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleSubtreeStream stream_qualifiedName=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedName");
        RewriteRuleSubtreeStream stream_pipeArgs=new RewriteRuleSubtreeStream(adaptor,"rule pipeArgs");
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:57:3: ( qualifiedName ( '(' pipeArgs ')' )? -> ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:58:3: qualifiedName ( '(' pipeArgs ')' )?
            {
            pushFollow(FOLLOW_qualifiedName_in_pipe263);
            qualifiedName15=qualifiedName();

            state._fsp--;

            stream_qualifiedName.add(qualifiedName15.getTree());

            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:58:17: ( '(' pipeArgs ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:58:18: '(' pipeArgs ')'
                    {
                    char_literal16=(Token)match(input,20,FOLLOW_20_in_pipe266);  
                    stream_20.add(char_literal16);


                    pushFollow(FOLLOW_pipeArgs_in_pipe268);
                    pipeArgs17=pipeArgs();

                    state._fsp--;

                    stream_pipeArgs.add(pipeArgs17.getTree());

                    char_literal18=(Token)match(input,21,FOLLOW_21_in_pipe270);  
                    stream_21.add(char_literal18);


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
            // 59:5: -> ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* )
            {
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:60:7: ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(QualifiedName, (qualifiedName15!=null?input.toString(qualifiedName15.start,qualifiedName15.stop):null))
                , root_1);

                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:60:44: ( pipeArgs )*
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:63:1: exp : atom ( '+' ^ atom )* ;
    public final MetaflowParser.exp_return exp() throws RecognitionException {
        MetaflowParser.exp_return retval = new MetaflowParser.exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal20=null;
        MetaflowParser.atom_return atom19 =null;

        MetaflowParser.atom_return atom21 =null;


        CommonTree char_literal20_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:64:3: ( atom ( '+' ^ atom )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:65:3: atom ( '+' ^ atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_exp307);
            atom19=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom19.getTree());

            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:65:8: ( '+' ^ atom )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:65:9: '+' ^ atom
            	    {
            	    char_literal20=(Token)match(input,22,FOLLOW_22_in_exp310); 
            	    char_literal20_tree = 
            	    (CommonTree)adaptor.create(char_literal20)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal20_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_exp313);
            	    atom21=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom21.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:69:1: atom : ( StringLiteral | Identifier );
    public final MetaflowParser.atom_return atom() throws RecognitionException {
        MetaflowParser.atom_return retval = new MetaflowParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set22=null;

        CommonTree set22_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:70:3: ( StringLiteral | Identifier )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set22=(Token)input.LT(1);

            if ( input.LA(1)==Identifier||input.LA(1)==StringLiteral ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set22)
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:75:1: pipeArgs : ( exp | namedArg ) ( ',' ! namedArg )* ;
    public final MetaflowParser.pipeArgs_return pipeArgs() throws RecognitionException {
        MetaflowParser.pipeArgs_return retval = new MetaflowParser.pipeArgs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal25=null;
        MetaflowParser.exp_return exp23 =null;

        MetaflowParser.namedArg_return namedArg24 =null;

        MetaflowParser.namedArg_return namedArg26 =null;


        CommonTree char_literal25_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:76:3: ( ( exp | namedArg ) ( ',' ! namedArg )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:77:3: ( exp | namedArg ) ( ',' ! namedArg )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:77:3: ( exp | namedArg )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Identifier) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==26) ) {
                    alt7=2;
                }
                else if ( ((LA7_1 >= 21 && LA7_1 <= 23)) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA7_0==StringLiteral) ) {
                alt7=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:78:5: exp
                    {
                    pushFollow(FOLLOW_exp_in_pipeArgs358);
                    exp23=exp();

                    state._fsp--;

                    adaptor.addChild(root_0, exp23.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:79:7: namedArg
                    {
                    pushFollow(FOLLOW_namedArg_in_pipeArgs366);
                    namedArg24=namedArg();

                    state._fsp--;

                    adaptor.addChild(root_0, namedArg24.getTree());

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:81:3: ( ',' ! namedArg )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:81:4: ',' ! namedArg
            	    {
            	    char_literal25=(Token)match(input,23,FOLLOW_23_in_pipeArgs375); 

            	    pushFollow(FOLLOW_namedArg_in_pipeArgs378);
            	    namedArg26=namedArg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, namedArg26.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:84:1: namedArg : Identifier '=' exp -> ^( ARG Identifier exp ) ;
    public final MetaflowParser.namedArg_return namedArg() throws RecognitionException {
        MetaflowParser.namedArg_return retval = new MetaflowParser.namedArg_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Identifier27=null;
        Token char_literal28=null;
        MetaflowParser.exp_return exp29 =null;


        CommonTree Identifier27_tree=null;
        CommonTree char_literal28_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:85:3: ( Identifier '=' exp -> ^( ARG Identifier exp ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:86:3: Identifier '=' exp
            {
            Identifier27=(Token)match(input,Identifier,FOLLOW_Identifier_in_namedArg395);  
            stream_Identifier.add(Identifier27);


            char_literal28=(Token)match(input,26,FOLLOW_26_in_namedArg397);  
            stream_26.add(char_literal28);


            pushFollow(FOLLOW_exp_in_namedArg399);
            exp29=exp();

            state._fsp--;

            stream_exp.add(exp29.getTree());

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
            // 87:5: -> ^( ARG Identifier exp )
            {
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:88:7: ^( ARG Identifier exp )
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:91:1: qualifiedName : Identifier ( '.' Identifier )* ;
    public final MetaflowParser.qualifiedName_return qualifiedName() throws RecognitionException {
        MetaflowParser.qualifiedName_return retval = new MetaflowParser.qualifiedName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Identifier30=null;
        Token char_literal31=null;
        Token Identifier32=null;

        CommonTree Identifier30_tree=null;
        CommonTree char_literal31_tree=null;
        CommonTree Identifier32_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:92:3: ( Identifier ( '.' Identifier )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:93:3: Identifier ( '.' Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();


            Identifier30=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName434); 
            Identifier30_tree = 
            (CommonTree)adaptor.create(Identifier30)
            ;
            adaptor.addChild(root_0, Identifier30_tree);


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:93:14: ( '.' Identifier )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:93:15: '.' Identifier
            	    {
            	    char_literal31=(Token)match(input,24,FOLLOW_24_in_qualifiedName437); 
            	    char_literal31_tree = 
            	    (CommonTree)adaptor.create(char_literal31)
            	    ;
            	    adaptor.addChild(root_0, char_literal31_tree);


            	    Identifier32=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName439); 
            	    Identifier32_tree = 
            	    (CommonTree)adaptor.create(Identifier32)
            	    ;
            	    adaptor.addChild(root_0, Identifier32_tree);


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
    // $ANTLR end "qualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_varDef_in_metaflow101 = new BitSet(new long[]{0x0000000008030400L});
    public static final BitSet FOLLOW_flow_in_metaflow104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_varDef119 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_varDef123 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_varDef125 = new BitSet(new long[]{0x0000000000020400L});
    public static final BitSet FOLLOW_exp_in_varDef127 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_varDef129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varDef160 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_varDef162 = new BitSet(new long[]{0x0000000000020400L});
    public static final BitSet FOLLOW_exp_in_varDef164 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_varDef166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StdIn_in_flow208 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_exp_in_flow216 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_flow225 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_pipe_in_flow228 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_25_in_flow232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_pipe263 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_pipe266 = new BitSet(new long[]{0x0000000000020400L});
    public static final BitSet FOLLOW_pipeArgs_in_pipe268 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_pipe270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_exp307 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_exp310 = new BitSet(new long[]{0x0000000000020400L});
    public static final BitSet FOLLOW_atom_in_exp313 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_exp_in_pipeArgs358 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs366 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_pipeArgs375 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs378 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_Identifier_in_namedArg395 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_namedArg397 = new BitSet(new long[]{0x0000000000020400L});
    public static final BitSet FOLLOW_exp_in_namedArg399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName434 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_qualifiedName437 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName439 = new BitSet(new long[]{0x0000000001000002L});

}