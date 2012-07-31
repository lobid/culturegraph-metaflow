// $ANTLR 3.4 D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g 2012-07-31 15:38:38

package org.culturegraph.metaflow.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MetaflowParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARG", "DEF", "Digit", "EscapeSequence", "HexDigit", "Identifier", "LINE_COMMENT", "Letter", "OctalEscape", "QualifiedName", "StartString", "StdIn", "StringLiteral", "UnicodeEscape", "WS", "'('", "')'", "','", "'.'", "';'", "'='", "'def '", "'|'"
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

                if ( (LA1_0==25) ) {
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:33:1: varDef : 'def ' i= Identifier ( '=' StringLiteral )? -> ^( DEF Identifier StringLiteral ) ;
    public final MetaflowParser.varDef_return varDef() throws RecognitionException {
        MetaflowParser.varDef_return retval = new MetaflowParser.varDef_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token i=null;
        Token string_literal2=null;
        Token char_literal3=null;
        Token StringLiteral4=null;

        CommonTree i_tree=null;
        CommonTree string_literal2_tree=null;
        CommonTree char_literal3_tree=null;
        CommonTree StringLiteral4_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:34:3: ( 'def ' i= Identifier ( '=' StringLiteral )? -> ^( DEF Identifier StringLiteral ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:3: 'def ' i= Identifier ( '=' StringLiteral )?
            {
            string_literal2=(Token)match(input,25,FOLLOW_25_in_varDef125);  
            stream_25.add(string_literal2);


            i=(Token)match(input,Identifier,FOLLOW_Identifier_in_varDef129);  
            stream_Identifier.add(i);


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:23: ( '=' StringLiteral )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:24: '=' StringLiteral
                    {
                    char_literal3=(Token)match(input,24,FOLLOW_24_in_varDef132);  
                    stream_24.add(char_literal3);


                    StringLiteral4=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_varDef134);  
                    stream_StringLiteral.add(StringLiteral4);


                    }
                    break;

            }


            // AST REWRITE
            // elements: Identifier, StringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 36:5: -> ^( DEF Identifier StringLiteral )
            {
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:37:7: ^( DEF Identifier StringLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DEF, "DEF")
                , root_1);

                adaptor.addChild(root_1, 
                stream_Identifier.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_StringLiteral.nextNode()
                );

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:40:1: flow : ( StdIn | StringLiteral ) ( '|' ! pipe )+ ';' !;
    public final MetaflowParser.flow_return flow() throws RecognitionException {
        MetaflowParser.flow_return retval = new MetaflowParser.flow_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set5=null;
        Token char_literal6=null;
        Token char_literal8=null;
        MetaflowParser.pipe_return pipe7 =null;


        CommonTree set5_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree char_literal8_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:41:3: ( ( StdIn | StringLiteral ) ( '|' ! pipe )+ ';' !)
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:42:3: ( StdIn | StringLiteral ) ( '|' ! pipe )+ ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            set5=(Token)input.LT(1);

            if ( (input.LA(1) >= StdIn && input.LA(1) <= StringLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set5)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:46:3: ( '|' ! pipe )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:46:4: '|' ! pipe
            	    {
            	    char_literal6=(Token)match(input,26,FOLLOW_26_in_flow194); 

            	    pushFollow(FOLLOW_pipe_in_flow197);
            	    pipe7=pipe();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pipe7.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            char_literal8=(Token)match(input,23,FOLLOW_23_in_flow201); 

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

        Token char_literal10=null;
        Token char_literal12=null;
        MetaflowParser.qualifiedName_return qualifiedName9 =null;

        MetaflowParser.pipeArgs_return pipeArgs11 =null;


        CommonTree char_literal10_tree=null;
        CommonTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleSubtreeStream stream_qualifiedName=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedName");
        RewriteRuleSubtreeStream stream_pipeArgs=new RewriteRuleSubtreeStream(adaptor,"rule pipeArgs");
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:55:3: ( qualifiedName ( '(' pipeArgs ')' )? -> ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:56:3: qualifiedName ( '(' pipeArgs ')' )?
            {
            pushFollow(FOLLOW_qualifiedName_in_pipe232);
            qualifiedName9=qualifiedName();

            state._fsp--;

            stream_qualifiedName.add(qualifiedName9.getTree());

            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:56:17: ( '(' pipeArgs ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:56:18: '(' pipeArgs ')'
                    {
                    char_literal10=(Token)match(input,19,FOLLOW_19_in_pipe235);  
                    stream_19.add(char_literal10);


                    pushFollow(FOLLOW_pipeArgs_in_pipe237);
                    pipeArgs11=pipeArgs();

                    state._fsp--;

                    stream_pipeArgs.add(pipeArgs11.getTree());

                    char_literal12=(Token)match(input,20,FOLLOW_20_in_pipe239);  
                    stream_20.add(char_literal12);


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
                (CommonTree)adaptor.create(QualifiedName, (qualifiedName9!=null?input.toString(qualifiedName9.start,qualifiedName9.stop):null))
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


    public static class pipeArgs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pipeArgs"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:61:1: pipeArgs : ( StringLiteral | namedArg ) ( ',' ! namedArg )* ;
    public final MetaflowParser.pipeArgs_return pipeArgs() throws RecognitionException {
        MetaflowParser.pipeArgs_return retval = new MetaflowParser.pipeArgs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token StringLiteral13=null;
        Token char_literal15=null;
        MetaflowParser.namedArg_return namedArg14 =null;

        MetaflowParser.namedArg_return namedArg16 =null;


        CommonTree StringLiteral13_tree=null;
        CommonTree char_literal15_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:62:3: ( ( StringLiteral | namedArg ) ( ',' ! namedArg )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:63:3: ( StringLiteral | namedArg ) ( ',' ! namedArg )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:63:3: ( StringLiteral | namedArg )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==StringLiteral) ) {
                alt5=1;
            }
            else if ( (LA5_0==Identifier) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:64:5: StringLiteral
                    {
                    StringLiteral13=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_pipeArgs282); 
                    StringLiteral13_tree = 
                    (CommonTree)adaptor.create(StringLiteral13)
                    ;
                    adaptor.addChild(root_0, StringLiteral13_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:65:7: namedArg
                    {
                    pushFollow(FOLLOW_namedArg_in_pipeArgs290);
                    namedArg14=namedArg();

                    state._fsp--;

                    adaptor.addChild(root_0, namedArg14.getTree());

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:67:3: ( ',' ! namedArg )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:67:4: ',' ! namedArg
            	    {
            	    char_literal15=(Token)match(input,21,FOLLOW_21_in_pipeArgs299); 

            	    pushFollow(FOLLOW_namedArg_in_pipeArgs302);
            	    namedArg16=namedArg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, namedArg16.getTree());

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
    // $ANTLR end "pipeArgs"


    public static class namedArg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namedArg"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:70:1: namedArg : Identifier '=' StringLiteral -> ^( ARG Identifier StringLiteral ) ;
    public final MetaflowParser.namedArg_return namedArg() throws RecognitionException {
        MetaflowParser.namedArg_return retval = new MetaflowParser.namedArg_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Identifier17=null;
        Token char_literal18=null;
        Token StringLiteral19=null;

        CommonTree Identifier17_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree StringLiteral19_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:71:3: ( Identifier '=' StringLiteral -> ^( ARG Identifier StringLiteral ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:72:3: Identifier '=' StringLiteral
            {
            Identifier17=(Token)match(input,Identifier,FOLLOW_Identifier_in_namedArg319);  
            stream_Identifier.add(Identifier17);


            char_literal18=(Token)match(input,24,FOLLOW_24_in_namedArg321);  
            stream_24.add(char_literal18);


            StringLiteral19=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_namedArg323);  
            stream_StringLiteral.add(StringLiteral19);


            // AST REWRITE
            // elements: StringLiteral, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 73:5: -> ^( ARG Identifier StringLiteral )
            {
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:74:7: ^( ARG Identifier StringLiteral )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ARG, "ARG")
                , root_1);

                adaptor.addChild(root_1, 
                stream_Identifier.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_StringLiteral.nextNode()
                );

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:77:1: qualifiedName : Identifier ( '.' Identifier )* ;
    public final MetaflowParser.qualifiedName_return qualifiedName() throws RecognitionException {
        MetaflowParser.qualifiedName_return retval = new MetaflowParser.qualifiedName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Identifier20=null;
        Token char_literal21=null;
        Token Identifier22=null;

        CommonTree Identifier20_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree Identifier22_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:78:3: ( Identifier ( '.' Identifier )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:79:3: Identifier ( '.' Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();


            Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName358); 
            Identifier20_tree = 
            (CommonTree)adaptor.create(Identifier20)
            ;
            adaptor.addChild(root_0, Identifier20_tree);


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:79:14: ( '.' Identifier )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:79:15: '.' Identifier
            	    {
            	    char_literal21=(Token)match(input,22,FOLLOW_22_in_qualifiedName361); 
            	    char_literal21_tree = 
            	    (CommonTree)adaptor.create(char_literal21)
            	    ;
            	    adaptor.addChild(root_0, char_literal21_tree);


            	    Identifier22=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName363); 
            	    Identifier22_tree = 
            	    (CommonTree)adaptor.create(Identifier22)
            	    ;
            	    adaptor.addChild(root_0, Identifier22_tree);


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
    // $ANTLR end "qualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_varDef_in_metaflow96 = new BitSet(new long[]{0x0000000002018000L});
    public static final BitSet FOLLOW_flow_in_metaflow101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_varDef125 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Identifier_in_varDef129 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_varDef132 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_varDef134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_flow171 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_flow194 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_pipe_in_flow197 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_23_in_flow201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_pipe232 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_pipe235 = new BitSet(new long[]{0x0000000000010200L});
    public static final BitSet FOLLOW_pipeArgs_in_pipe237 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_pipe239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_pipeArgs282 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs290 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_pipeArgs299 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs302 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_Identifier_in_namedArg319 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_namedArg321 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_namedArg323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName358 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_qualifiedName361 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName363 = new BitSet(new long[]{0x0000000000400002L});

}