// $ANTLR 3.4 D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g 2012-07-31 12:40:17

package org.culturegraph.metaflow.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MetaflowParser extends Parser {
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:24:1: metaflow : f= flow ;
    public final MetaflowParser.metaflow_return metaflow() throws RecognitionException {
        MetaflowParser.metaflow_return retval = new MetaflowParser.metaflow_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        MetaflowParser.flow_return f =null;



        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:25:3: (f= flow )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:26:3: f= flow
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_flow_in_metaflow93);
            f=flow();

            state._fsp--;

            adaptor.addChild(root_0, f.getTree());


                      System.out.println((f!=null?((CommonTree)f.tree):null).toStringTree());
                     

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


    public static class flow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:32:1: flow : ( StdIn | StringLiteral ) ( '|' ! pipe )+ ';' !;
    public final MetaflowParser.flow_return flow() throws RecognitionException {
        MetaflowParser.flow_return retval = new MetaflowParser.flow_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set1=null;
        Token char_literal2=null;
        Token char_literal4=null;
        MetaflowParser.pipe_return pipe3 =null;


        CommonTree set1_tree=null;
        CommonTree char_literal2_tree=null;
        CommonTree char_literal4_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:33:3: ( ( StdIn | StringLiteral ) ( '|' ! pipe )+ ';' !)
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:34:3: ( StdIn | StringLiteral ) ( '|' ! pipe )+ ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            set1=(Token)input.LT(1);

            if ( (input.LA(1) >= StdIn && input.LA(1) <= StringLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set1)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:38:3: ( '|' ! pipe )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:38:4: '|' ! pipe
            	    {
            	    char_literal2=(Token)match(input,24,FOLLOW_24_in_flow143); 

            	    pushFollow(FOLLOW_pipe_in_flow146);
            	    pipe3=pipe();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pipe3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            char_literal4=(Token)match(input,22,FOLLOW_22_in_flow150); 

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:47:1: pipe : qualifiedName ( '(' pipeArgs ')' )? -> ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* ) ;
    public final MetaflowParser.pipe_return pipe() throws RecognitionException {
        MetaflowParser.pipe_return retval = new MetaflowParser.pipe_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal6=null;
        Token char_literal8=null;
        MetaflowParser.qualifiedName_return qualifiedName5 =null;

        MetaflowParser.pipeArgs_return pipeArgs7 =null;


        CommonTree char_literal6_tree=null;
        CommonTree char_literal8_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_qualifiedName=new RewriteRuleSubtreeStream(adaptor,"rule qualifiedName");
        RewriteRuleSubtreeStream stream_pipeArgs=new RewriteRuleSubtreeStream(adaptor,"rule pipeArgs");
        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:48:3: ( qualifiedName ( '(' pipeArgs ')' )? -> ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:49:3: qualifiedName ( '(' pipeArgs ')' )?
            {
            pushFollow(FOLLOW_qualifiedName_in_pipe182);
            qualifiedName5=qualifiedName();

            state._fsp--;

            stream_qualifiedName.add(qualifiedName5.getTree());

            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:49:17: ( '(' pipeArgs ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:49:18: '(' pipeArgs ')'
                    {
                    char_literal6=(Token)match(input,18,FOLLOW_18_in_pipe185);  
                    stream_18.add(char_literal6);


                    pushFollow(FOLLOW_pipeArgs_in_pipe187);
                    pipeArgs7=pipeArgs();

                    state._fsp--;

                    stream_pipeArgs.add(pipeArgs7.getTree());

                    char_literal8=(Token)match(input,19,FOLLOW_19_in_pipe189);  
                    stream_19.add(char_literal8);


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
            // 50:5: -> ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* )
            {
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:51:7: ^( QualifiedName[$qualifiedName.text] ( pipeArgs )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(QualifiedName, (qualifiedName5!=null?input.toString(qualifiedName5.start,qualifiedName5.stop):null))
                , root_1);

                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:51:44: ( pipeArgs )*
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:54:1: pipeArgs : ( StringLiteral | namedArg ) ( ',' ! namedArg )* ;
    public final MetaflowParser.pipeArgs_return pipeArgs() throws RecognitionException {
        MetaflowParser.pipeArgs_return retval = new MetaflowParser.pipeArgs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token StringLiteral9=null;
        Token char_literal11=null;
        MetaflowParser.namedArg_return namedArg10 =null;

        MetaflowParser.namedArg_return namedArg12 =null;


        CommonTree StringLiteral9_tree=null;
        CommonTree char_literal11_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:55:3: ( ( StringLiteral | namedArg ) ( ',' ! namedArg )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:56:3: ( StringLiteral | namedArg ) ( ',' ! namedArg )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:56:3: ( StringLiteral | namedArg )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==StringLiteral) ) {
                alt3=1;
            }
            else if ( (LA3_0==Identifier) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:57:5: StringLiteral
                    {
                    StringLiteral9=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_pipeArgs232); 
                    StringLiteral9_tree = 
                    (CommonTree)adaptor.create(StringLiteral9)
                    ;
                    adaptor.addChild(root_0, StringLiteral9_tree);


                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:58:7: namedArg
                    {
                    pushFollow(FOLLOW_namedArg_in_pipeArgs240);
                    namedArg10=namedArg();

                    state._fsp--;

                    adaptor.addChild(root_0, namedArg10.getTree());

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:60:3: ( ',' ! namedArg )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:60:4: ',' ! namedArg
            	    {
            	    char_literal11=(Token)match(input,20,FOLLOW_20_in_pipeArgs249); 

            	    pushFollow(FOLLOW_namedArg_in_pipeArgs252);
            	    namedArg12=namedArg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, namedArg12.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:63:1: namedArg : Identifier '=' StringLiteral -> ^( ARG Identifier StringLiteral ) ;
    public final MetaflowParser.namedArg_return namedArg() throws RecognitionException {
        MetaflowParser.namedArg_return retval = new MetaflowParser.namedArg_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Identifier13=null;
        Token char_literal14=null;
        Token StringLiteral15=null;

        CommonTree Identifier13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree StringLiteral15_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:64:3: ( Identifier '=' StringLiteral -> ^( ARG Identifier StringLiteral ) )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:65:3: Identifier '=' StringLiteral
            {
            Identifier13=(Token)match(input,Identifier,FOLLOW_Identifier_in_namedArg269);  
            stream_Identifier.add(Identifier13);


            char_literal14=(Token)match(input,23,FOLLOW_23_in_namedArg271);  
            stream_23.add(char_literal14);


            StringLiteral15=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_namedArg273);  
            stream_StringLiteral.add(StringLiteral15);


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
            // 66:5: -> ^( ARG Identifier StringLiteral )
            {
                // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:67:7: ^( ARG Identifier StringLiteral )
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:70:1: qualifiedName : Identifier ( '.' Identifier )* ;
    public final MetaflowParser.qualifiedName_return qualifiedName() throws RecognitionException {
        MetaflowParser.qualifiedName_return retval = new MetaflowParser.qualifiedName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token Identifier16=null;
        Token char_literal17=null;
        Token Identifier18=null;

        CommonTree Identifier16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree Identifier18_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:71:3: ( Identifier ( '.' Identifier )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:72:3: Identifier ( '.' Identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();


            Identifier16=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName308); 
            Identifier16_tree = 
            (CommonTree)adaptor.create(Identifier16)
            ;
            adaptor.addChild(root_0, Identifier16_tree);


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:72:14: ( '.' Identifier )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:72:15: '.' Identifier
            	    {
            	    char_literal17=(Token)match(input,21,FOLLOW_21_in_qualifiedName311); 
            	    char_literal17_tree = 
            	    (CommonTree)adaptor.create(char_literal17)
            	    ;
            	    adaptor.addChild(root_0, char_literal17_tree);


            	    Identifier18=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName313); 
            	    Identifier18_tree = 
            	    (CommonTree)adaptor.create(Identifier18)
            	    ;
            	    adaptor.addChild(root_0, Identifier18_tree);


            	    }
            	    break;

            	default :
            	    break loop5;
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


 

    public static final BitSet FOLLOW_flow_in_metaflow93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_flow120 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_flow143 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_pipe_in_flow146 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_22_in_flow150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_pipe182 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_pipe185 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_pipeArgs_in_pipe187 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_pipe189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_pipeArgs232 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs240 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_pipeArgs249 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs252 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_Identifier_in_namedArg269 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_namedArg271 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_StringLiteral_in_namedArg273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName308 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_qualifiedName311 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName313 = new BitSet(new long[]{0x0000000000200002L});

}