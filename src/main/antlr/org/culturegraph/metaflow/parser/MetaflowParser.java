// $ANTLR 3.4 D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g 2012-07-11 15:11:59

 package org.culturegraph.metaflow.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MetaflowParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Digit", "Identifier", "Letter", "NewLine", "StringLiteral", "Whitespace", "'('", "')'", "';'", "'='", "'@'", "'|'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int Digit=4;
    public static final int Identifier=5;
    public static final int Letter=6;
    public static final int NewLine=7;
    public static final int StringLiteral=8;
    public static final int Whitespace=9;

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
    public String getGrammarFileName() { return "D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g"; }


    public static class flow_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:17:1: flow : ( element )+ ( '|' element )* ';' ;
    public final MetaflowParser.flow_return flow() throws RecognitionException {
        MetaflowParser.flow_return retval = new MetaflowParser.flow_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal2=null;
        Token char_literal4=null;
        MetaflowParser.element_return element1 =null;

        MetaflowParser.element_return element3 =null;


        Object char_literal2_tree=null;
        Object char_literal4_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:18:3: ( ( element )+ ( '|' element )* ';' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:19:3: ( element )+ ( '|' element )* ';'
            {
            root_0 = (Object)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:19:3: ( element )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Identifier||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:19:3: element
            	    {
            	    pushFollow(FOLLOW_element_in_flow55);
            	    element1=element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, element1.getTree());

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


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:19:12: ( '|' element )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:19:13: '|' element
            	    {
            	    char_literal2=(Token)match(input,15,FOLLOW_15_in_flow59); 
            	    char_literal2_tree = 
            	    (Object)adaptor.create(char_literal2)
            	    ;
            	    adaptor.addChild(root_0, char_literal2_tree);


            	    pushFollow(FOLLOW_element_in_flow61);
            	    element3=element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, element3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            char_literal4=(Token)match(input,12,FOLLOW_12_in_flow65); 
            char_literal4_tree = 
            (Object)adaptor.create(char_literal4)
            ;
            adaptor.addChild(root_0, char_literal4_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "flow"


    public static class element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "element"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:22:1: element : ( pipe | pipeRef );
    public final MetaflowParser.element_return element() throws RecognitionException {
        MetaflowParser.element_return retval = new MetaflowParser.element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MetaflowParser.pipe_return pipe5 =null;

        MetaflowParser.pipeRef_return pipeRef6 =null;



        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:23:3: ( pipe | pipeRef )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Identifier) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:24:3: pipe
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pipe_in_element80);
                    pipe5=pipe();

                    state._fsp--;

                    adaptor.addChild(root_0, pipe5.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:25:5: pipeRef
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pipeRef_in_element86);
                    pipeRef6=pipeRef();

                    state._fsp--;

                    adaptor.addChild(root_0, pipeRef6.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "element"


    public static class pipeRef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pipeRef"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:28:1: pipeRef : '@' Identifier ;
    public final MetaflowParser.pipeRef_return pipeRef() throws RecognitionException {
        MetaflowParser.pipeRef_return retval = new MetaflowParser.pipeRef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal7=null;
        Token Identifier8=null;

        Object char_literal7_tree=null;
        Object Identifier8_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:29:3: ( '@' Identifier )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:30:3: '@' Identifier
            {
            root_0 = (Object)adaptor.nil();


            char_literal7=(Token)match(input,14,FOLLOW_14_in_pipeRef101); 
            char_literal7_tree = 
            (Object)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);


            Identifier8=(Token)match(input,Identifier,FOLLOW_Identifier_in_pipeRef103); 
            Identifier8_tree = 
            (Object)adaptor.create(Identifier8)
            ;
            adaptor.addChild(root_0, Identifier8_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pipeRef"


    public static class pipe_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pipe"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:33:1: pipe : pipeName ( '(' pipeArgs ')' )? ;
    public final MetaflowParser.pipe_return pipe() throws RecognitionException {
        MetaflowParser.pipe_return retval = new MetaflowParser.pipe_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        MetaflowParser.pipeName_return pipeName9 =null;

        MetaflowParser.pipeArgs_return pipeArgs11 =null;


        Object char_literal10_tree=null;
        Object char_literal12_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:34:3: ( pipeName ( '(' pipeArgs ')' )? )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:3: pipeName ( '(' pipeArgs ')' )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pipeName_in_pipe118);
            pipeName9=pipeName();

            state._fsp--;

            adaptor.addChild(root_0, pipeName9.getTree());

            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:12: ( '(' pipeArgs ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==10) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:13: '(' pipeArgs ')'
                    {
                    char_literal10=(Token)match(input,10,FOLLOW_10_in_pipe121); 
                    char_literal10_tree = 
                    (Object)adaptor.create(char_literal10)
                    ;
                    adaptor.addChild(root_0, char_literal10_tree);


                    pushFollow(FOLLOW_pipeArgs_in_pipe123);
                    pipeArgs11=pipeArgs();

                    state._fsp--;

                    adaptor.addChild(root_0, pipeArgs11.getTree());

                    char_literal12=(Token)match(input,11,FOLLOW_11_in_pipe125); 
                    char_literal12_tree = 
                    (Object)adaptor.create(char_literal12)
                    ;
                    adaptor.addChild(root_0, char_literal12_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pipe"


    public static class pipeArgs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pipeArgs"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:38:1: pipeArgs : ( constructorArg | namedArg )+ ;
    public final MetaflowParser.pipeArgs_return pipeArgs() throws RecognitionException {
        MetaflowParser.pipeArgs_return retval = new MetaflowParser.pipeArgs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MetaflowParser.constructorArg_return constructorArg13 =null;

        MetaflowParser.namedArg_return namedArg14 =null;



        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:39:3: ( ( constructorArg | namedArg )+ )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:40:3: ( constructorArg | namedArg )+
            {
            root_0 = (Object)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:40:3: ( constructorArg | namedArg )+
            int cnt5=0;
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==StringLiteral) ) {
                    alt5=1;
                }
                else if ( (LA5_0==Identifier) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:41:5: constructorArg
            	    {
            	    pushFollow(FOLLOW_constructorArg_in_pipeArgs148);
            	    constructorArg13=constructorArg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, constructorArg13.getTree());

            	    }
            	    break;
            	case 2 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:42:7: namedArg
            	    {
            	    pushFollow(FOLLOW_namedArg_in_pipeArgs156);
            	    namedArg14=namedArg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, namedArg14.getTree());

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

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pipeArgs"


    public static class constructorArg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructorArg"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:46:1: constructorArg : StringLiteral ;
    public final MetaflowParser.constructorArg_return constructorArg() throws RecognitionException {
        MetaflowParser.constructorArg_return retval = new MetaflowParser.constructorArg_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token StringLiteral15=null;

        Object StringLiteral15_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:47:3: ( StringLiteral )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:48:3: StringLiteral
            {
            root_0 = (Object)adaptor.nil();


            StringLiteral15=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_constructorArg176); 
            StringLiteral15_tree = 
            (Object)adaptor.create(StringLiteral15)
            ;
            adaptor.addChild(root_0, StringLiteral15_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructorArg"


    public static class namedArg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namedArg"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:51:1: namedArg : argName '=' argValue ;
    public final MetaflowParser.namedArg_return namedArg() throws RecognitionException {
        MetaflowParser.namedArg_return retval = new MetaflowParser.namedArg_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal17=null;
        MetaflowParser.argName_return argName16 =null;

        MetaflowParser.argValue_return argValue18 =null;


        Object char_literal17_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:52:3: ( argName '=' argValue )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:53:3: argName '=' argValue
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_argName_in_namedArg191);
            argName16=argName();

            state._fsp--;

            adaptor.addChild(root_0, argName16.getTree());

            char_literal17=(Token)match(input,13,FOLLOW_13_in_namedArg193); 
            char_literal17_tree = 
            (Object)adaptor.create(char_literal17)
            ;
            adaptor.addChild(root_0, char_literal17_tree);


            pushFollow(FOLLOW_argValue_in_namedArg195);
            argValue18=argValue();

            state._fsp--;

            adaptor.addChild(root_0, argValue18.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namedArg"


    public static class argName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argName"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:56:1: argName : Identifier ;
    public final MetaflowParser.argName_return argName() throws RecognitionException {
        MetaflowParser.argName_return retval = new MetaflowParser.argName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier19=null;

        Object Identifier19_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:57:3: ( Identifier )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:58:3: Identifier
            {
            root_0 = (Object)adaptor.nil();


            Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_argName210); 
            Identifier19_tree = 
            (Object)adaptor.create(Identifier19)
            ;
            adaptor.addChild(root_0, Identifier19_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argName"


    public static class argValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argValue"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:61:1: argValue : StringLiteral ;
    public final MetaflowParser.argValue_return argValue() throws RecognitionException {
        MetaflowParser.argValue_return retval = new MetaflowParser.argValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token StringLiteral20=null;

        Object StringLiteral20_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:62:3: ( StringLiteral )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:63:3: StringLiteral
            {
            root_0 = (Object)adaptor.nil();


            StringLiteral20=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_argValue225); 
            StringLiteral20_tree = 
            (Object)adaptor.create(StringLiteral20)
            ;
            adaptor.addChild(root_0, StringLiteral20_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argValue"


    public static class pipeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pipeName"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:66:1: pipeName : Identifier ;
    public final MetaflowParser.pipeName_return pipeName() throws RecognitionException {
        MetaflowParser.pipeName_return retval = new MetaflowParser.pipeName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier21=null;

        Object Identifier21_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:67:3: ( Identifier )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:68:3: Identifier
            {
            root_0 = (Object)adaptor.nil();


            Identifier21=(Token)match(input,Identifier,FOLLOW_Identifier_in_pipeName240); 
            Identifier21_tree = 
            (Object)adaptor.create(Identifier21)
            ;
            adaptor.addChild(root_0, Identifier21_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pipeName"

    // Delegated rules


 

    public static final BitSet FOLLOW_element_in_flow55 = new BitSet(new long[]{0x000000000000D020L});
    public static final BitSet FOLLOW_15_in_flow59 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_element_in_flow61 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_flow65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pipe_in_element80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pipeRef_in_element86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_pipeRef101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Identifier_in_pipeRef103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pipeName_in_pipe118 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_pipe121 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_pipeArgs_in_pipe123 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_pipe125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructorArg_in_pipeArgs148 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs156 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_StringLiteral_in_constructorArg176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argName_in_namedArg191 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_namedArg193 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argValue_in_namedArg195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_argName210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_argValue225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_pipeName240 = new BitSet(new long[]{0x0000000000000002L});

}