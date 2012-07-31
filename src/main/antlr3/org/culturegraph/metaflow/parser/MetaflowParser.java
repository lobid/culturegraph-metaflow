// $ANTLR 3.4 D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g 2012-07-31 17:00:21

package org.culturegraph.metaflow.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MetaflowParser extends Parser {
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:25:1: metaflow : ( varDef )* f= flow ;
    public final MetaflowParser.metaflow_return metaflow() throws RecognitionException {
        MetaflowParser.metaflow_return retval = new MetaflowParser.metaflow_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MetaflowParser.flow_return f =null;

        MetaflowParser.varDef_return varDef1 =null;



        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:26:3: ( ( varDef )* f= flow )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:27:3: ( varDef )* f= flow
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:27:3: ( varDef )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:27:3: varDef
            	    {
            	    pushFollow(FOLLOW_varDef_in_metaflow96);
            	    varDef1=varDef();

            	    state._fsp--;

            	    adaptor.addChild(root_0, varDef1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_flow_in_metaflow101);
            f=flow();

            state._fsp--;

            adaptor.addChild(root_0, f.getTree());

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:33:1: varDef : 'def ' i= Identifier ( '=' exp )? ';' -> ^( DEF Identifier ( exp )? ) ;
    public final MetaflowParser.varDef_return varDef() throws RecognitionException {
        MetaflowParser.varDef_return retval = new MetaflowParser.varDef_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token i=null;
        Token string_literal2=null;
        Token char_literal3=null;
        Token char_literal5=null;
        MetaflowParser.exp_return exp4 =null;


        CommonTree i_tree=null;
        CommonTree string_literal2_tree=null;
        CommonTree char_literal3_tree=null;
        CommonTree char_literal5_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:34:3: ( 'def ' i= Identifier ( '=' exp )? ';' -> ^( DEF Identifier ( exp )? ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:3: 'def ' i= Identifier ( '=' exp )? ';'
            {
            string_literal2=(Token)match(input,26,FOLLOW_26_in_varDef125);  
            stream_26.add(string_literal2);


            i=(Token)match(input,Identifier,FOLLOW_Identifier_in_varDef129);  
            stream_Identifier.add(i);


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:23: ( '=' exp )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:24: '=' exp
                    {
                    char_literal3=(Token)match(input,25,FOLLOW_25_in_varDef132);  
                    stream_25.add(char_literal3);


                    pushFollow(FOLLOW_exp_in_varDef134);
                    exp4=exp();

                    state._fsp--;

                    stream_exp.add(exp4.getTree());

                    }
                    break;

            }


            char_literal5=(Token)match(input,24,FOLLOW_24_in_varDef138);  
            stream_24.add(char_literal5);


            // AST REWRITE
            // elements: Identifier, exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 36:5: -> ^( DEF Identifier ( exp )? )
            {
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:37:7: ^( DEF Identifier ( exp )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DEF, "DEF")
                , root_1);

                adaptor.addChild(root_1, 
                stream_Identifier.nextNode()
                );

                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:37:24: ( exp )?
                if ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_1, stream_exp.nextTree());

                }
                stream_exp.reset();

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
    // $ANTLR end "varDef"


    public static class flow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:40:1: flow : ( StdIn | exp ) ( '|' ! pipe )+ ';' !;
    public final MetaflowParser.flow_return flow() throws RecognitionException {
        MetaflowParser.flow_return retval = new MetaflowParser.flow_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token StdIn6=null;
        Token char_literal8=null;
        Token char_literal10=null;
        MetaflowParser.exp_return exp7 =null;

        MetaflowParser.pipe_return pipe9 =null;


        CommonTree StdIn6_tree=null;
        CommonTree char_literal8_tree=null;
        CommonTree char_literal10_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:41:3: ( ( StdIn | exp ) ( '|' ! pipe )+ ';' !)
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:42:3: ( StdIn | exp ) ( '|' ! pipe )+ ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:42:3: ( StdIn | exp )
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
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:43:5: StdIn
                    {
                    StdIn6=(Token)match(input,StdIn,FOLLOW_StdIn_in_flow180); 
                    StdIn6_tree = 
                    (CommonTree)adaptor.create(StdIn6)
                    ;
                    adaptor.addChild(root_0, StdIn6_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:44:7: exp
                    {
                    pushFollow(FOLLOW_exp_in_flow188);
                    exp7=exp();

                    state._fsp--;

                    adaptor.addChild(root_0, exp7.getTree());

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:46:3: ( '|' ! pipe )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:46:4: '|' ! pipe
            	    {
            	    char_literal8=(Token)match(input,27,FOLLOW_27_in_flow197); 

            	    pushFollow(FOLLOW_pipe_in_flow200);
            	    pipe9=pipe();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pipe9.getTree());

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


            char_literal10=(Token)match(input,24,FOLLOW_24_in_flow204); 

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:54:1: pipe : qualifiedName ( '(' pipeArgs ')' )? -> ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* ) ;
    public final MetaflowParser.pipe_return pipe() throws RecognitionException {
        MetaflowParser.pipe_return retval = new MetaflowParser.pipe_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal12=null;
        Token char_literal14=null;
        MetaflowParser.qualifiedName_return qualifiedName11 =null;

        MetaflowParser.pipeArgs_return pipeArgs13 =null;


        CommonTree char_literal12_tree=null;
        CommonTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleSubtreeStream stream_qualifiedName=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedName");
        RewriteRuleSubtreeStream stream_pipeArgs=new RewriteRuleSubtreeStream(adaptor,"rule pipeArgs");
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:55:3: ( qualifiedName ( '(' pipeArgs ')' )? -> ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:56:3: qualifiedName ( '(' pipeArgs ')' )?
            {
            pushFollow(FOLLOW_qualifiedName_in_pipe235);
            qualifiedName11=qualifiedName();

            state._fsp--;

            stream_qualifiedName.add(qualifiedName11.getTree());

            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:56:17: ( '(' pipeArgs ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:56:18: '(' pipeArgs ')'
                    {
                    char_literal12=(Token)match(input,19,FOLLOW_19_in_pipe238);  
                    stream_19.add(char_literal12);


                    pushFollow(FOLLOW_pipeArgs_in_pipe240);
                    pipeArgs13=pipeArgs();

                    state._fsp--;

                    stream_pipeArgs.add(pipeArgs13.getTree());

                    char_literal14=(Token)match(input,20,FOLLOW_20_in_pipe242);  
                    stream_20.add(char_literal14);


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
            // 57:5: -> ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* )
            {
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:58:7: ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(QualifiedName, (qualifiedName11!=null?input.toString(qualifiedName11.start,qualifiedName11.stop):null))
                , root_1);

                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:58:44: ( pipeArgs )*
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:61:1: exp : ( atom | atom '+' atom -> ^( '+' atom atom ) );
    public final MetaflowParser.exp_return exp() throws RecognitionException {
        MetaflowParser.exp_return retval = new MetaflowParser.exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal17=null;
        MetaflowParser.atom_return atom15 =null;

        MetaflowParser.atom_return atom16 =null;

        MetaflowParser.atom_return atom18 =null;


        CommonTree char_literal17_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:62:3: ( atom | atom '+' atom -> ^( '+' atom atom ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Identifier||LA6_0==StringLiteral) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==20||LA6_1==22||LA6_1==24||LA6_1==27) ) {
                    alt6=1;
                }
                else if ( (LA6_1==21) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:63:3: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_exp279);
                    atom15=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom15.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:64:5: atom '+' atom
                    {
                    pushFollow(FOLLOW_atom_in_exp285);
                    atom16=atom();

                    state._fsp--;

                    stream_atom.add(atom16.getTree());

                    char_literal17=(Token)match(input,21,FOLLOW_21_in_exp287);  
                    stream_21.add(char_literal17);


                    pushFollow(FOLLOW_atom_in_exp289);
                    atom18=atom();

                    state._fsp--;

                    stream_atom.add(atom18.getTree());

                    // AST REWRITE
                    // elements: atom, atom, 21
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 65:5: -> ^( '+' atom atom )
                    {
                        // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:66:7: ^( '+' atom atom )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_21.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_1, stream_atom.nextTree());

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

        Token set19=null;

        CommonTree set19_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:70:3: ( StringLiteral | Identifier )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set19=(Token)input.LT(1);

            if ( input.LA(1)==Identifier||input.LA(1)==StringLiteral ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set19)
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

        Token char_literal22=null;
        MetaflowParser.exp_return exp20 =null;

        MetaflowParser.namedArg_return namedArg21 =null;

        MetaflowParser.namedArg_return namedArg23 =null;


        CommonTree char_literal22_tree=null;

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

                if ( (LA7_1==25) ) {
                    alt7=2;
                }
                else if ( ((LA7_1 >= 20 && LA7_1 <= 22)) ) {
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
                    pushFollow(FOLLOW_exp_in_pipeArgs351);
                    exp20=exp();

                    state._fsp--;

                    adaptor.addChild(root_0, exp20.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:79:7: namedArg
                    {
                    pushFollow(FOLLOW_namedArg_in_pipeArgs359);
                    namedArg21=namedArg();

                    state._fsp--;

                    adaptor.addChild(root_0, namedArg21.getTree());

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:81:3: ( ',' ! namedArg )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:81:4: ',' ! namedArg
            	    {
            	    char_literal22=(Token)match(input,22,FOLLOW_22_in_pipeArgs368); 

            	    pushFollow(FOLLOW_namedArg_in_pipeArgs371);
            	    namedArg23=namedArg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, namedArg23.getTree());

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

        Token Identifier24=null;
        Token char_literal25=null;
        MetaflowParser.exp_return exp26 =null;


        CommonTree Identifier24_tree=null;
        CommonTree char_literal25_tree=null;
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:85:3: ( Identifier '=' exp -> ^( ARG Identifier exp ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:86:3: Identifier '=' exp
            {
            Identifier24=(Token)match(input,Identifier,FOLLOW_Identifier_in_namedArg388);  
            stream_Identifier.add(Identifier24);


            char_literal25=(Token)match(input,25,FOLLOW_25_in_namedArg390);  
            stream_25.add(char_literal25);


            pushFollow(FOLLOW_exp_in_namedArg392);
            exp26=exp();

            state._fsp--;

            stream_exp.add(exp26.getTree());

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

        Token Identifier27=null;
        Token char_literal28=null;
        Token Identifier29=null;

        CommonTree Identifier27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree Identifier29_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:92:3: ( Identifier ( '.' Identifier )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:93:3: Identifier ( '.' Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();


            Identifier27=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName427); 
            Identifier27_tree = 
            (CommonTree)adaptor.create(Identifier27)
            ;
            adaptor.addChild(root_0, Identifier27_tree);


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:93:14: ( '.' Identifier )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:93:15: '.' Identifier
            	    {
            	    char_literal28=(Token)match(input,23,FOLLOW_23_in_qualifiedName430); 
            	    char_literal28_tree = 
            	    (CommonTree)adaptor.create(char_literal28)
            	    ;
            	    adaptor.addChild(root_0, char_literal28_tree);


            	    Identifier29=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName432); 
            	    Identifier29_tree = 
            	    (CommonTree)adaptor.create(Identifier29)
            	    ;
            	    adaptor.addChild(root_0, Identifier29_tree);


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


 

    public static final BitSet FOLLOW_varDef_in_metaflow96 = new BitSet(new long[]{0x0000000004018200L});
    public static final BitSet FOLLOW_flow_in_metaflow101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_varDef125 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Identifier_in_varDef129 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_varDef132 = new BitSet(new long[]{0x0000000000010200L});
    public static final BitSet FOLLOW_exp_in_varDef134 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_varDef138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StdIn_in_flow180 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_exp_in_flow188 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_flow197 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_pipe_in_flow200 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_24_in_flow204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_pipe235 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_pipe238 = new BitSet(new long[]{0x0000000000010200L});
    public static final BitSet FOLLOW_pipeArgs_in_pipe240 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_pipe242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_exp279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_exp285 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_exp287 = new BitSet(new long[]{0x0000000000010200L});
    public static final BitSet FOLLOW_atom_in_exp289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_pipeArgs351 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs359 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_pipeArgs368 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs371 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_Identifier_in_namedArg388 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_namedArg390 = new BitSet(new long[]{0x0000000000010200L});
    public static final BitSet FOLLOW_exp_in_namedArg392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName427 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_qualifiedName430 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName432 = new BitSet(new long[]{0x0000000000800002L});

}