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
}

@lexer::header {
package org.culturegraph.metaflow.parser;
}

@members {
private Flow flow = new Flow();

public Flow getFlow() {
	return flow;
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
                   flow.setStringStart($s.getText().substring(1, $s.getText().length() - 1));
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
                                 if($pipeArgs.cArg!=null){
                                    cArg= new String[]{$pipeArgs.cArg};
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
    simpleArg 
              {
               $cArg = $simpleArg.value;
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

simpleArg returns [String value]
  :
  StringLiteral 
                {
                 $value = $StringLiteral.getText().substring(1,
                 		$StringLiteral.getText().length() - 1);
                }
  ;

namedArg returns [String key, String value]
  :
  argKey '=' argValue 
                      {
                       $key = $argKey.text;
                       $value = $argValue.value;
                      }
  ;

argKey
  :
  Identifier
  ;

argValue returns [String value]
  :
  StringLiteral 
                {
                 $value = $StringLiteral.getText().substring(1,
                 		$StringLiteral.getText().length() - 1);
                }
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
  '"'
  (
    ~(
      '"'
      | '\n'
      | '\r'
     )
  )*
  '"'
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
