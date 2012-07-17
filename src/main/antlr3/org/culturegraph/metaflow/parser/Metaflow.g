grammar Metaflow;

options {
  language = Java;
  output   = AST;
}

@header {
package org.culturegraph.metaflow.parser;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import org.culturegraph.metaflow.Flow;
import org.apache.commons.lang.StringEscapeUtils;
}

@lexer::header {
package org.culturegraph.metaflow.parser;
}

@members {
private Flow flow = new Flow();

public Flow getFlow() {
	return flow;
}

private static String toJavaString(String s){
  return StringEscapeUtils.unescapeJava(s.substring(1,s.length()-1));
}
}

metaflow
  :
  flow+
  ;

flow
  :
  (
    stdIn
    | inputString
  )
  (
    '|'
    (
      pipe
      | pipeRef
    )
  )+
  ';'
  ;

inputString
  :
  s=StringLiteral 
                  {
                   flow.setStringStart(toJavaString($s.text));
                  }
  ;

stdIn
  :
  '>' 
      {
       flow.setStdInStart();
      }
  ;

flowElement
  :
  pipe
  | pipeRef
  ;

pipeRef
  :
  '@' Identifier
  ;

pipe
@init {
Map<String, String> args = Collections.emptyMap();
String[] cArg = new String[0];
}
  :
  (qualifiedName) ('(' pipeArgs 
                                {
                                 if ($pipeArgs.cArg != null) {
                                 	cArg = new String[] { $pipeArgs.cArg };
                                 }
                                 args = $pipeArgs.args;
                                }
    ')')? 
          {
           flow.addElement($qualifiedName.text, args, cArg);
          }
  ;

pipeArgs returns [String cArg, Map<String, String> args]
@init {
$args = new HashMap<String, String>();
}
  :
  (
    s=StringLiteral 
                    {
                     $cArg = toJavaString($s.text);
                    }
    | a=namedArg 
                 {
                  $args.put($a.key, $a.value);
                 }
  )
  (',' b=namedArg 
                  {
                   $args.put($b.key, $b.value);
                  })*
  ;

namedArg returns [String key, String value]
  :
  argKey '=' s=StringLiteral 
                             {
                              $key = $argKey.text;
                              $value = toJavaString($s.getText());
                             }
  ;

argKey
  :
  Identifier
  ;

qualifiedName
  :
  Identifier ('.' Identifier)*
  ;

Identifier
  :
  Letter
  (
    Letter
    | Digit
  )*
  ;

fragment
Letter
  :
  'a'..'z'
  | 'A'..'Z'
  | '-'
  | '_'
  ;

fragment
Digit
  :
  '0'..'9'
  ;

StringLiteral
  :
  '"' EscapedString '"'
  ;

fragment
EscapedString
  :
  (
    EscapeSequence
    |
    ~(
      '\\'
      | '"'
      | '\r'
      | '\n'
     )
  )*
  ;

fragment
EscapeSequence
  :
  '\\'
  (
    'b'
    | 't'
    | 'n'
    | 'f'
    | 'r'
    | '\"'
    | '\''
    | '\\'
    | ('0'..'3') ('0'..'7') ('0'..'7')
    | ('0'..'7') ('0'..'7')
    | ('0'..'7')
  )
  ;

Whitespace
  :
  (
    ' '
    | '\t'
    | '\f'
  )+
  
   {
    $channel = HIDDEN;
   }
  ;

NewLine
  :
  (
    '\r' '\n'
    | '\r'
    | '\n'
  )
  
   {
    $channel = HIDDEN;
   }
  ;
