// $ANTLR 3.4 D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g 2012-07-20 11:08:55

package org.culturegraph.metaflow.parser;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import org.culturegraph.metaflow.Flow;
import org.apache.commons.lang.StringEscapeUtils;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MetaflowParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Digit", "EscapeSequence", "EscapedString", "Identifier", "Letter", "NewLine", "StringLiteral", "Whitespace", "'('", "')'", "','", "'.'", "';'", "'='", "'>'", "'@'", "'|'"
    };

    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int Digit=4;
    public static final int EscapeSequence=5;
    public static final int EscapedString=6;
    public static final int Identifier=7;
    public static final int Letter=8;
    public static final int NewLine=9;
    public static final int StringLiteral=10;
    public static final int Whitespace=11;

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

    private static String toJavaString(String s) {
    	return StringEscapeUtils.unescapeJava(s.substring(1, s.length() - 1));
    }


    public static class metaflow_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metaflow"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:33:1: metaflow : ( flow )+ ;
    public final MetaflowParser.metaflow_return metaflow() throws RecognitionException {
        MetaflowParser.metaflow_return retval = new MetaflowParser.metaflow_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MetaflowParser.flow_return flow1 =null;



        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:34:3: ( ( flow )+ )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:3: ( flow )+
            {
            root_0 = (Object)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:3: ( flow )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==StringLiteral||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:35:3: flow
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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:38:1: flow : ( stdIn | inputString ) ( '|' pipe )+ ';' ;
    public final MetaflowParser.flow_return flow() throws RecognitionException {
        MetaflowParser.flow_return retval = new MetaflowParser.flow_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal4=null;
        Token char_literal6=null;
        MetaflowParser.stdIn_return stdIn2 =null;

        MetaflowParser.inputString_return inputString3 =null;

        MetaflowParser.pipe_return pipe5 =null;


        Object char_literal4_tree=null;
        Object char_literal6_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:39:3: ( ( stdIn | inputString ) ( '|' pipe )+ ';' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:40:3: ( stdIn | inputString ) ( '|' pipe )+ ';'
            {
            root_0 = (Object)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:40:3: ( stdIn | inputString )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
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
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:41:5: stdIn
                    {
                    pushFollow(FOLLOW_stdIn_in_flow82);
                    stdIn2=stdIn();

                    state._fsp--;

                    adaptor.addChild(root_0, stdIn2.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:42:7: inputString
                    {
                    pushFollow(FOLLOW_inputString_in_flow90);
                    inputString3=inputString();

                    state._fsp--;

                    adaptor.addChild(root_0, inputString3.getTree());

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:44:3: ( '|' pipe )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:44:4: '|' pipe
            	    {
            	    char_literal4=(Token)match(input,20,FOLLOW_20_in_flow99); 
            	    char_literal4_tree = 
            	    (Object)adaptor.create(char_literal4)
            	    ;
            	    adaptor.addChild(root_0, char_literal4_tree);


            	    pushFollow(FOLLOW_pipe_in_flow101);
            	    pipe5=pipe();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pipe5.getTree());

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


            char_literal6=(Token)match(input,16,FOLLOW_16_in_flow105); 
            char_literal6_tree = 
            (Object)adaptor.create(char_literal6)
            ;
            adaptor.addChild(root_0, char_literal6_tree);


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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:47:1: inputString : s= StringLiteral ;
    public final MetaflowParser.inputString_return inputString() throws RecognitionException {
        MetaflowParser.inputString_return retval = new MetaflowParser.inputString_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token s=null;

        Object s_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:48:3: (s= StringLiteral )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:49:3: s= StringLiteral
            {
            root_0 = (Object)adaptor.nil();


            s=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_inputString122); 
            s_tree = 
            (Object)adaptor.create(s)
            ;
            adaptor.addChild(root_0, s_tree);



                               flow.setStringStart(toJavaString((s!=null?s.getText():null)));
                              

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:55:1: stdIn : '>' ;
    public final MetaflowParser.stdIn_return stdIn() throws RecognitionException {
        MetaflowParser.stdIn_return retval = new MetaflowParser.stdIn_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal7=null;

        Object char_literal7_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:56:3: ( '>' )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:57:3: '>'
            {
            root_0 = (Object)adaptor.nil();


            char_literal7=(Token)match(input,18,FOLLOW_18_in_stdIn158); 
            char_literal7_tree = 
            (Object)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);



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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:63:1: flowElement : ( pipe | pipeRef );
    public final MetaflowParser.flowElement_return flowElement() throws RecognitionException {
        MetaflowParser.flowElement_return retval = new MetaflowParser.flowElement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MetaflowParser.pipe_return pipe8 =null;

        MetaflowParser.pipeRef_return pipeRef9 =null;



        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:64:3: ( pipe | pipeRef )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Identifier) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:65:3: pipe
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pipe_in_flowElement182);
                    pipe8=pipe();

                    state._fsp--;

                    adaptor.addChild(root_0, pipe8.getTree());

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:66:5: pipeRef
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pipeRef_in_flowElement188);
                    pipeRef9=pipeRef();

                    state._fsp--;

                    adaptor.addChild(root_0, pipeRef9.getTree());

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:69:1: pipeRef : '@' Identifier ;
    public final MetaflowParser.pipeRef_return pipeRef() throws RecognitionException {
        MetaflowParser.pipeRef_return retval = new MetaflowParser.pipeRef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal10=null;
        Token Identifier11=null;

        Object char_literal10_tree=null;
        Object Identifier11_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:70:3: ( '@' Identifier )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:71:3: '@' Identifier
            {
            root_0 = (Object)adaptor.nil();


            char_literal10=(Token)match(input,19,FOLLOW_19_in_pipeRef203); 
            char_literal10_tree = 
            (Object)adaptor.create(char_literal10)
            ;
            adaptor.addChild(root_0, char_literal10_tree);


            Identifier11=(Token)match(input,Identifier,FOLLOW_Identifier_in_pipeRef205); 
            Identifier11_tree = 
            (Object)adaptor.create(Identifier11)
            ;
            adaptor.addChild(root_0, Identifier11_tree);


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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:74:1: pipe : ( qualifiedName ) ( '(' pipeArgs ')' )? ;
    public final MetaflowParser.pipe_return pipe() throws RecognitionException {
        MetaflowParser.pipe_return retval = new MetaflowParser.pipe_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal13=null;
        Token char_literal15=null;
        MetaflowParser.qualifiedName_return qualifiedName12 =null;

        MetaflowParser.pipeArgs_return pipeArgs14 =null;


        Object char_literal13_tree=null;
        Object char_literal15_tree=null;


        Map<String, String> args = Collections.emptyMap();
        String[] cArg = new String[0];

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:79:3: ( ( qualifiedName ) ( '(' pipeArgs ')' )? )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:80:3: ( qualifiedName ) ( '(' pipeArgs ')' )?
            {
            root_0 = (Object)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:80:3: ( qualifiedName )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:80:4: qualifiedName
            {
            pushFollow(FOLLOW_qualifiedName_in_pipe226);
            qualifiedName12=qualifiedName();

            state._fsp--;

            adaptor.addChild(root_0, qualifiedName12.getTree());

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:80:19: ( '(' pipeArgs ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:80:20: '(' pipeArgs ')'
                    {
                    char_literal13=(Token)match(input,12,FOLLOW_12_in_pipe230); 
                    char_literal13_tree = 
                    (Object)adaptor.create(char_literal13)
                    ;
                    adaptor.addChild(root_0, char_literal13_tree);


                    pushFollow(FOLLOW_pipeArgs_in_pipe232);
                    pipeArgs14=pipeArgs();

                    state._fsp--;

                    adaptor.addChild(root_0, pipeArgs14.getTree());


                                                     if ((pipeArgs14!=null?pipeArgs14.cArg:null) != null) {
                                                     	cArg = new String[] { (pipeArgs14!=null?pipeArgs14.cArg:null) };
                                                     }
                                                     args = (pipeArgs14!=null?pipeArgs14.args:null);
                                                    

                    char_literal15=(Token)match(input,13,FOLLOW_13_in_pipe273); 
                    char_literal15_tree = 
                    (Object)adaptor.create(char_literal15)
                    ;
                    adaptor.addChild(root_0, char_literal15_tree);


                    }
                    break;

            }



                       flow.addElement((qualifiedName12!=null?input.toString(qualifiedName12.start,qualifiedName12.stop):null), args, cArg);
                      

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:93:1: pipeArgs returns [String cArg, Map<String, String> args] : (s= StringLiteral |a= namedArg ) ( ',' b= namedArg )* ;
    public final MetaflowParser.pipeArgs_return pipeArgs() throws RecognitionException {
        MetaflowParser.pipeArgs_return retval = new MetaflowParser.pipeArgs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token s=null;
        Token char_literal16=null;
        MetaflowParser.namedArg_return a =null;

        MetaflowParser.namedArg_return b =null;


        Object s_tree=null;
        Object char_literal16_tree=null;


        retval.args = new HashMap<String, String>();

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:97:3: ( (s= StringLiteral |a= namedArg ) ( ',' b= namedArg )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:98:3: (s= StringLiteral |a= namedArg ) ( ',' b= namedArg )*
            {
            root_0 = (Object)adaptor.nil();


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:98:3: (s= StringLiteral |a= namedArg )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==StringLiteral) ) {
                alt6=1;
            }
            else if ( (LA6_0==Identifier) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:99:5: s= StringLiteral
                    {
                    s=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_pipeArgs320); 
                    s_tree = 
                    (Object)adaptor.create(s)
                    ;
                    adaptor.addChild(root_0, s_tree);



                                         retval.cArg = toJavaString((s!=null?s.getText():null));
                                        

                    }
                    break;
                case 2 :
                    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:103:7: a= namedArg
                    {
                    pushFollow(FOLLOW_namedArg_in_pipeArgs353);
                    a=namedArg();

                    state._fsp--;

                    adaptor.addChild(root_0, a.getTree());


                                      retval.args.put((a!=null?a.key:null), (a!=null?a.value:null));
                                     

                    }
                    break;

            }


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:108:3: ( ',' b= namedArg )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:108:4: ',' b= namedArg
            	    {
            	    char_literal16=(Token)match(input,14,FOLLOW_14_in_pipeArgs382); 
            	    char_literal16_tree = 
            	    (Object)adaptor.create(char_literal16)
            	    ;
            	    adaptor.addChild(root_0, char_literal16_tree);


            	    pushFollow(FOLLOW_namedArg_in_pipeArgs386);
            	    b=namedArg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());


            	                       retval.args.put((b!=null?b.key:null), (b!=null?b.value:null));
            	                      

            	    }
            	    break;

            	default :
            	    break loop7;
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


    public static class namedArg_return extends ParserRuleReturnScope {
        public String key;
        public String value;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namedArg"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:114:1: namedArg returns [String key, String value] : argKey '=' s= StringLiteral ;
    public final MetaflowParser.namedArg_return namedArg() throws RecognitionException {
        MetaflowParser.namedArg_return retval = new MetaflowParser.namedArg_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token s=null;
        Token char_literal18=null;
        MetaflowParser.argKey_return argKey17 =null;


        Object s_tree=null;
        Object char_literal18_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:115:3: ( argKey '=' s= StringLiteral )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:116:3: argKey '=' s= StringLiteral
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_argKey_in_namedArg428);
            argKey17=argKey();

            state._fsp--;

            adaptor.addChild(root_0, argKey17.getTree());

            char_literal18=(Token)match(input,17,FOLLOW_17_in_namedArg430); 
            char_literal18_tree = 
            (Object)adaptor.create(char_literal18)
            ;
            adaptor.addChild(root_0, char_literal18_tree);


            s=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_namedArg434); 
            s_tree = 
            (Object)adaptor.create(s)
            ;
            adaptor.addChild(root_0, s_tree);



                                          retval.key = (argKey17!=null?input.toString(argKey17.start,argKey17.stop):null);
                                          retval.value = toJavaString(s.getText());
                                         

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
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:123:1: argKey : Identifier ;
    public final MetaflowParser.argKey_return argKey() throws RecognitionException {
        MetaflowParser.argKey_return retval = new MetaflowParser.argKey_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier19=null;

        Object Identifier19_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:124:3: ( Identifier )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:125:3: Identifier
            {
            root_0 = (Object)adaptor.nil();


            Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_argKey481); 
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
    // $ANTLR end "argKey"


    public static class qualifiedName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qualifiedName"
    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:128:1: qualifiedName : Identifier ( '.' Identifier )* ;
    public final MetaflowParser.qualifiedName_return qualifiedName() throws RecognitionException {
        MetaflowParser.qualifiedName_return retval = new MetaflowParser.qualifiedName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Identifier20=null;
        Token char_literal21=null;
        Token Identifier22=null;

        Object Identifier20_tree=null;
        Object char_literal21_tree=null;
        Object Identifier22_tree=null;

        try {
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:129:3: ( Identifier ( '.' Identifier )* )
            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:130:3: Identifier ( '.' Identifier )*
            {
            root_0 = (Object)adaptor.nil();


            Identifier20=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName496); 
            Identifier20_tree = 
            (Object)adaptor.create(Identifier20)
            ;
            adaptor.addChild(root_0, Identifier20_tree);


            // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:130:14: ( '.' Identifier )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\workspace\\org.culturegraph.metaflow\\src\\main\\antlr3\\org\\culturegraph\\metaflow\\parser\\Metaflow.g:130:15: '.' Identifier
            	    {
            	    char_literal21=(Token)match(input,15,FOLLOW_15_in_qualifiedName499); 
            	    char_literal21_tree = 
            	    (Object)adaptor.create(char_literal21)
            	    ;
            	    adaptor.addChild(root_0, char_literal21_tree);


            	    Identifier22=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName501); 
            	    Identifier22_tree = 
            	    (Object)adaptor.create(Identifier22)
            	    ;
            	    adaptor.addChild(root_0, Identifier22_tree);


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
    // $ANTLR end "qualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_flow_in_metaflow60 = new BitSet(new long[]{0x0000000000040402L});
    public static final BitSet FOLLOW_stdIn_in_flow82 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_inputString_in_flow90 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_flow99 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_pipe_in_flow101 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16_in_flow105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_inputString122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_stdIn158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pipe_in_flowElement182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pipeRef_in_flowElement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_pipeRef203 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Identifier_in_pipeRef205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedName_in_pipe226 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_pipe230 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_pipeArgs_in_pipe232 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_pipe273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_pipeArgs320 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs353 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_pipeArgs382 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_namedArg_in_pipeArgs386 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_argKey_in_namedArg428 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_namedArg430 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_StringLiteral_in_namedArg434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_argKey481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName496 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_qualifiedName499 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedName501 = new BitSet(new long[]{0x0000000000008002L});

}