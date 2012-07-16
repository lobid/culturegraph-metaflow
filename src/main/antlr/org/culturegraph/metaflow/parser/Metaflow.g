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

flow
  :
  element+ ('|' element)* ';'
  ;

element
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
  (
   qualifiedName
  )
  ('(' pipeArgs ')')?
  ;

pipeArgs
  :
  (
    simpleArg
    | namedArg
  )+
  ;

simpleArg
  :
  StringLiteral
  ;

namedArg
  :
  argName '=' argValue
  ;

argName
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
