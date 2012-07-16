grammar Metaflow;

options {
  language = Java;
  output   = AST;
}

@header {
package org.culturegraph.metaflow.parser;
}

@lexer::header {
package org.culturegraph.metaflow.parser;
}

@members {
private org.culturegraph.metaflow.Flow flow = new org.culturegraph.metaflow.Flow();

public org.culturegraph.metaflow.Flow getFlow() {
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
  :
  (qualifiedName) ('(' pipeArgs ')')? 
                                      {
                                       if ($pipeArgs.cArg == null) {
                                       	flow.addElement($qualifiedName.text, new String[0]);
                                       } else {
                                       	flow.addElement($qualifiedName.text, new String[] { $pipeArgs.cArg });
                                       }
                                      }
  ;

pipeArgs returns [String cArg]
  :
  (
    simpleArg 
              {
               $cArg = $simpleArg.value;
              }
    | namedArg
  )
  (',' namedArg)*
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
                       $value = $argValue.text;
                      }
  ;

argKey
  :
  Identifier
  ;

argValue
  :
  StringLiteral
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
