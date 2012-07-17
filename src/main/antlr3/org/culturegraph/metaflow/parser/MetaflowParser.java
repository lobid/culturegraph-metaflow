// $ANTLR 3.4 D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g 2012-07-17 10:36:37

package org.culturegraph.metaflow.parser;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import org.culturegraph.metaflow.Flow;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MetaflowParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Digit", "Identifier", "Letter", "NewLine", "StringLiteral", "Whitespace", "'('", "')'", "','", "'.'", "';'", "'='", "'>'", "'@'", "'|'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public String getGrammarFileName() { return "D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g"; }


    private Flow flow = new Flow();

    public Flow getFlow() {
    	return flow;
    }


    public static class metaflow_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metaflow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:28:1: metaflow : ( flow )+ ;
    public final MetaflowParser.metaflow_return metaflow() throws RecognitionException {
        MetaflowParser.metaflow_return retval = new MetaflowParser.metaflow_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MetaflowParser.flow_return flow1 =null;



        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:29:3: ( ( flow )+ )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:30:3: ( flow )+
            {
            root_0 = (Object)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:30:3: ( flow )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==StringLiteral||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:30:3: flow
            	    {
            	    pushFollow(FOLLOW_flow_in_metaflow60);
            	    flow1=flow();

            	    state._fsp--;

            	    adaptor.addChild(root_0, flow1.getTree());

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
    // $ANTLR end "metaflow"


    public static class flow_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:33:1: flow : ( stdIn | inputString ) ( '|' ( pipe | pipeRef ) )+ ';' ;
    public final MetaflowParser.flow_return flow() throws RecognitionException {
        MetaflowParser.flow_return retval = new MetaflowParser.flow_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal4=null;
        Token char_literal7=null;
        MetaflowParser.stdIn_return stdIn2 =null;

        MetaflowParser.inputString_return inputString3 =null;

        MetaflowParser.pipe_return pipe5 =null;

        MetaflowParser.pipeRef_return pipeRef6 =null;


        Object char_literal4_tree=null;
        Object char_literal7_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:34:3: ( ( stdIn | inputString ) ( '|' ( pipe | pipeRef ) )+ ';' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:3: ( stdIn | inputString ) ( '|' ( pipe | pipeRef ) )+ ';'
            {
            root_0 = (Object)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:3: ( stdIn | inputString )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==StringLiteral) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:36:5: stdIn
                    {
                    pushFollow(FOLLOW_stdIn_in_flow82);
                    stdIn2=stdIn();

                    state._fsp--;

                    adaptor.addChild(root_0, stdIn2.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:37:7: inputString
                    {
                    pushFollow(FOLLOW_inputString_in_flow90);
                    inputString3=inputString();

                    state._fsp--;

                    adaptor.addChild(root_0, inputString3.getTree());

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:39:3: ( '|' ( pipe | pipeRef ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:40:5: '|' ( pipe | pipeRef )
            	    {
            	    char_literal4=(Token)match(input,18,FOLLOW_18_in_flow104); 
            	    char_literal4_tree = 
            	    (Object)adaptor.create(char_literal4)
            	    ;
            	    adaptor.addChild(root_0, char_literal4_tree);


            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:41:5: ( pipe | pipeRef )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==Identifier) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==17) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:42:7: pipe
            	            {
            	            pushFollow(FOLLOW_pipe_in_flow118);
            	            pipe5=pipe();

            	            state._fsp--;

            	            adaptor.addChild(root_0, pipe5.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:43:9: pipeRef
            	            {
            	            pushFollow(FOLLOW_pipeRef_in_flow128);
            	            pipeRef6=pipeRef();

            	            state._fsp--;

            	            adaptor.addChild(root_0, pipeRef6.getTree());

            	            }
            	            break;

            	    }


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


            char_literal7=(Token)match(input,14,FOLLOW_14_in_flow143); 
            char_literal7_tree = 
            (Object)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);


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


    public static class inputString_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inputString"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:49:1: inputString : s= StringLiteral ;
    public final MetaflowParser.inputString_return inputString() throws RecognitionException {
        MetaflowParser.inputString_return retval = new MetaflowParser.inputString_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token s=null;

        Object s_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:50:3: (s= StringLiteral )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:51:3: s= StringLiteral
            {
            root_0 = (Object)adaptor.nil();


            s=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_inputString160); 
            s_tree = 
            (Object)adaptor.create(s)
            ;
            adaptor.addChild(root_0, s_tree);



                               flow.setStringStart(s.getText().substring(1, s.getText().length() - 1));
                              

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
    // $ANTLR end "inputString"


    public static class stdIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stdIn"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:57:1: stdIn : '>' ;
    public final MetaflowParser.stdIn_return stdIn() throws RecognitionException {
        MetaflowParser.stdIn_return retval = new MetaflowParser.stdIn_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal8=null;

        Object char_literal8_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:58:3: ( '>' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:59:3: '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal8=(Token)match(input,16,FOLLOW_16_in_stdIn196); 
            char_literal8_tree = 
            (Object)adaptor.create(char_literal8)
            ;
            adaptor.addChild(root_0, char_literal8_tree);



                   flow.setStdInStart();
                  

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
    // $ANTLR end "stdIn"


    public static class flowElement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "flowElement"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:65:1: flowElement : ( pipe | pipeRef );
    public final MetaflowParser.flowElement_return flowElement() throws RecognitionException {
        MetaflowParser.flowElement_return retval = new MetaflowParser.flowElement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MetaflowParser.pipe_return pipe9 =null;

        MetaflowParser.pipeRef_return pipeRef10 =null;



        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:66:3: ( pipe | pipeRef )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Identifier) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:67:3: pipe
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pipe_in_flowElement220);
                    pipe9=pipe();

                    state._fsp--;

                    adaptor.addChild(root_0, pipe9.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:68:5: pipeRef
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pipeRef_in_flowElement226);
                    pipeRef10=pipeRef();

                    state._fsp--;

                    adaptor.addChild(root_0, pipeRef10.getTree());

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
    // $ANTLR end "flowElement"


    public static class pipeRef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pipeRef"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:71:1: pipeRef : '@' Identifier ;
    public final MetaflowParser.pipeRef_return pipeRef() throws RecognitionException {
        MetaflowParser.pipeRef_return retval = new MetaflowParser.pipeRef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal11=null;
        Token Identifier12=null;

        Object char_literal11_tree=null;
        Object Identifier12_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:72:3: ( '@' Identifier )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:73:3: '@' Identifier
            {
            root_0 = (Object)adaptor.nil();


            char_literal11=(Token)match(input,17,FOLLOW_17_in_pipeRef241); 
            char_literal11_tree = 
            (Object)adaptor.create(char_literal11)
            ;
            adaptor.addChild(root_0, char_literal11_tree);


            Identifier12=(Token)match(input,Identifier,FOLLOW_Identifier_in_pipeRef243); 
            Identifier12_tree = 
            (Object)adaptor.create(Identifier12)
            ;
            adaptor.addChild(root_0, Identifier12_tree);


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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:76:1: pipe : ( qualifiedName ) ( '(' pipeArgs ')' )? ;
    public final MetaflowParser.pipe_return pipe() throws RecognitionException {
        MetaflowParser.pipe_return retval = new MetaflowParser.pipe_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal14=null;
        Token char_literal16=null;
        MetaflowParser.qualifiedName_return qualifiedName13 =null;

        MetaflowParser.pipeArgs_return pipeArgs15 =null;


        Object char_literal14_tree=null;
        Object char_literal16_tree=null;


        Map<String, String> args = Collections.emptyMap();
        String[] cArg = new String[0];

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:81:3: ( ( qualifiedName ) ( '(' pipeArgs ')' )? )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:82:3: ( qualifiedName ) ( '(' pipeArgs ')' )?
            {
            root_0 = (Object)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:82:3: ( qualifiedName )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:82:4: qualifiedName
            {
            pushFollow(FOLLOW_qualifiedName_in_pipe264);
            qualifiedName13=qualifiedName();

            state._fsp--;

            adaptor.addChild(root_0, qualifiedName13.getTree());

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:82:19: ( '(' pipeArgs ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==10) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:82:20: '(' pipeArgs ')'
                    {
                    char_literal14=(Token)match(input,10,FOLLOW_10_in_pipe268); 
                    char_literal14_tree = 
                    (Object)adaptor.create(char_literal14)
                    ;
                    adaptor.addChild(root_0, char_literal14_tree);


                    pushFollow(FOLLOW_pipeArgs_in_pipe270);
                    pipeArgs15=pipeArgs();

                    state._fsp--;

                    adaptor.addChild(root_0, pipeArgs15.getTree());


                                                     if((pipeArgs15!=null?pipeArgs15.cArg:null)!=null){
                                                        cArg= new String[]{(pipeArgs15!=null?pipeArgs15.cArg:null)};
                                                      }
                                                      args = (pipeArgs15!=null?pipeArgs15.args:null);
                                                    

                    char_literal16=(Token)match(input,11,FOLLOW_11_in_pipe311); 
                    char_literal16_tree = 
                    (Object)adaptor.create(char_literal16)
                    ;
                    adaptor.addChild(root_0, char_literal16_tree);


                    }
                    break;

            }



                       flow.addElement((qualifiedName13!=null?input.toString(qualifiedName13.start,qualifiedName13.stop):null), args, cArg);
                      

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
        public String cArg;
        public Map<String, String> args;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pipeArgs"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:95:1: pipeArgs returns [String cArg, Map<String, String> args] : ( simpleArg |a= namedArg ) ( ',' b= namedArg )* ;
    public final MetaflowParser.pipeArgs_return pipeArgs() throws RecognitionException {
        MetaflowParser.pipeArgs_return retval = new MetaflowParser.pipeArgs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal18=null;
        MetaflowParser.namedArg_return a =null;

        MetaflowParser.namedArg_return b =null;

        MetaflowParser.simpleArg_return simpleArg17 =null;


        Object char_literal18_tree=null;


        retval.args = new HashMap<String, String>();

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:99:3: ( ( simpleArg |a= namedArg ) ( ',' b= namedArg )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:100:3: ( simpleArg |a= namedArg ) ( ',' b= namedArg )*
            {
            root_0 = (Object)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:100:3: ( simpleArg |a= namedArg )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==StringLiteral) ) {
                alt7=1;
            }
            else if ( (LA7_0==Identifier) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:101:5: simpleArg
                    {
                    pushFollow(FOLLOW_simpleArg_in_pipeArgs356);
                    simpleArg17=simpleArg();

                    state._fsp--;

                    adaptor.addChild(root_0, simpleArg17.getTree());


                                   retval.cArg = (simpleArg17!=null?simpleArg17.value:null);
                                  

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:105:7: a= namedArg
                    {
                    pushFollow(FOLLOW_namedArg_in_pipeArgs383);
                    a=namedArg();

                    state._fsp--;

                    adaptor.addChild(root_0, a.getTree());


                                      retval.args.put((a!=null?a.key:null), (a!=null?a.value:null));
                                     

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:110:3: ( ',' b= namedArg )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:110:4: ',' b= namedArg
            	    {
            	    char_literal18=(Token)match(input,12,FOLLOW_12_in_pipeArgs412); 
            	    char_literal18_tree = 
            	    (Object)adaptor.create(char_literal18)
            	    ;
            	    adaptor.addChild(root_0, char_literal18_tree);


            	    pushFollow(FOLLOW_namedArg_in_pipeArgs416);
            	    b=namedArg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());


            	                     retval.args.put((b!=null?b.key:null), (b!=null?b.value:null));
            	                    

            	    }
            	    break;

            	default :
            	    break loop8;
                }
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


    public static class simpleArg_return extends ParserRuleReturnScope {
        public String value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simpleArg"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:116:1: simpleArg returns [String value] : StringLiteral ;
    public final MetaflowParser.simpleArg_return simpleArg() throws RecognitionException {
        MetaflowParser.simpleArg_return retval = new MetaflowParser.simpleArg_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token StringLiteral19=null;

        Object StringLiteral19_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:117:3: ( StringLiteral )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:118:3: StringLiteral
            {
            root_0 = (Object)adaptor.nil();


            StringLiteral19=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_simpleArg456); 
            StringLiteral19_tree = 
            (Object)adaptor.create(StringLiteral19)
            ;
            adaptor.addChild(root_0, StringLiteral19_tree);



                             retval.value = StringLiteral19.getText().substring(1,
                             		StringLiteral19.getText().length() - 1);
                            

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
    // $ANTLR end "simpleArg"


    public static class namedArg_return extends ParserRuleReturnScope {
        public String key;
        public String value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namedArg"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:125:1: namedArg returns [String key, String value] : argKey '=' argValue ;
    public final MetaflowParser.namedArg_return namedArg() throws RecognitionException {
        MetaflowParser.namedArg_return retval = new MetaflowParser.namedArg_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal21=null;
        MetaflowParser.argKey_return argKey20 =null;

        MetaflowParser.argValue_return argValue22 =null;


        Object char_literal21_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:126:3: ( argKey '=' argValue )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:127:3: argKey '=' argValue
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_argKey_in_namedArg494);
            argKey20=argKey();

            state._fsp--;

            adaptor.addChild(root_0, argKey20.getTree());

            char_literal21=(Token)match(input,15,FOLLOW_15_in_namedArg496); 
            char_literal21_tree = 
            (Object)adaptor.create(char_literal21)
            ;
            adaptor.addChild(root_0, char_literal21_tree);


            pushFollow(FOLLOW_argValue_in_namedArg498);
            argValue22=argValue();

            state._fsp--;

            adaptor.addChild(root_0, argValue22.getTree());


                                   retval.key = (argKey20!=null?input.toString(argKey20.start,argKey20.stop):null);
                                   retval.value = (argValue22!=null?argValue22.value:null);
                                  

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


    public static class argKey_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argKey"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:134:1: argKey : Identifier ;
    public final MetaflowParser.argKey_return argKey() throws RecognitionException {
        MetaflowParser.argKey_return retval = new MetaflowParser.argKey_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier23=null;

        Object Identifier23_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:135:3: ( Identifier )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:136:3: Identifier
            {
            root_0 = (Object)adaptor.nil();


            Identifier23=(Token)match(input,Identifier,FOLLOW_Identifier_in_argKey538); 
            Identifier23_tree = 
            (Object)adaptor.create(Identifier23)
            ;
            adaptor.addChild(root_0, Identifier23_tree);


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
    // $ANTLR end "argKey"


    public static class argValue_return extends ParserRuleReturnScope {
        public String value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argValue"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:139:1: argValue returns [String value] : StringLiteral ;
    public final MetaflowParser.argValue_return argValue() throws RecognitionException {
        MetaflowParser.argValue_return retval = new MetaflowParser.argValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token StringLiteral24=null;

        Object StringLiteral24_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:140:3: ( StringLiteral )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:141:3: StringLiteral
            {
            root_0 = (Object)adaptor.nil();


            StringLiteral24=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_argValue557); 
            StringLiteral24_tree = 
            (Object)adaptor.create(StringLiteral24)
            ;
            adaptor.addChild(root_0, StringLiteral24_tree);



                             retval.value = StringLiteral24.getText().substring(1,
                             		StringLiteral24.getText().length() - 1);
                            

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


    public static class qualifiedName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qualifiedName"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:148:1: qualifiedName : Identifier ( '.' Identifier )* ;
    public final MetaflowParser.qualifiedName_return qualifiedName() throws RecognitionException {
        MetaflowParser.qualifiedName_return retval = new MetaflowParser.qualifiedName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier25=null;
        Token char_literal26=null;
        Token Identifier27=null;

        Object Identifier25_tree=null;
        Object char_literal26_tree=null;
        Object Identifier27_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:149:3: ( Identifier ( '.' Identifier )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:150:3: Identifier ( '.' Identifier )*
            {
            root_0 = (Object)adaptor.nil();


            Identifier25=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName591); 
            Identifier25_tree = 
            (Object)adaptor.create(Identifier25)
            ;
            adaptor.addChild(root_0, Identifier25_tree);


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:150:14: ( '.' Identifier )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:150:15: '.' Identifier
            	    {
            	    char_literal26=(Token)match(input,13,FOLLOW_13_in_qualifiedName594); 
            	    char_literal26_tree = 
            	    (Object)adaptor.create(char_literal26)
            	    ;
            	    adaptor.addChild(root_0, char_literal26_tree);


            	    Identifier27=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName596); 
            	    Identifier27_tree = 
            	    (Object)adaptor.create(Identifier27)
            	    ;
            	    adaptor.addChild(root_0, Identifier27_tree);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
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
    // $ANTLR end "qualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_flow_in_metaflow60 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_stdIn_in_flow82 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_inputString_in_flow90 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_flow104 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_pipe_in_flow118 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_pipeRef_in_flow128 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_14_in_flow143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_inputString160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_stdIn196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pipe_in_flowElement220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pipeRef_in_flowElement226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_pipeRef241 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Identifier_in_pipeRef243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_pipe264 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_pipe268 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_pipeArgs_in_pipe270 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_pipe311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleArg_in_pipeArgs356 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs383 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_pipeArgs412 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs416 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_StringLiteral_in_simpleArg456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argKey_in_namedArg494 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_namedArg496 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_argValue_in_namedArg498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_argKey538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_argValue557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName591 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_qualifiedName594 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName596 = new BitSet(new long[]{0x0000000000002002L});

}