grammar Metaflow;

options {
  language     = Java;
  output       = AST;
  ASTLabelType = CommonTree;
}

tokens {
  ARG;
  QualifiedName;
  StartString;
}

@header {
package org.culturegraph.metaflow.parser;
}

@lexer::header {
package org.culturegraph.metaflow.parser;
import org.apache.commons.lang.StringEscapeUtils;
}

metaflow
  :
  f=flow 
         {
          System.out.println($f.tree.toStringTree());
         }
  ;

flow
  :
  (
    StdIn
    | StringLiteral
  )
  ('|'! pipe)+ ';'!
  ;


StdIn
  :
  '>'
  ;

pipe
  :
  qualifiedName ('(' pipeArgs ')')?
    ->
      ^(QualifiedName[$qualifiedName.text] pipeArgs*)
  ;

pipeArgs
  :
  (
    StringLiteral
    | namedArg
  )
  (','! namedArg)*
  ;

namedArg
  :
  Identifier '=' StringLiteral
    ->
      ^(ARG Identifier StringLiteral)
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

StringLiteral
  :
  '"'
  (
    EscapeSequence
    |
    ~(
      '\\'
      | '"'
     )
  )*
  '"' 
      {
       // strip the quotes from the resulting token and unescape
       setText(StringEscapeUtils.unescapeJava(getText().substring(1,
       		getText().length() - 1)));
      }
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
  )
  | UnicodeEscape
  | OctalEscape
  ;

fragment
OctalEscape
  :
  '\\' ('0'..'3') ('0'..'7') ('0'..'7')
  | '\\' ('0'..'7') ('0'..'7')
  | '\\' ('0'..'7')
  ;

fragment
UnicodeEscape
  :
  '\\' 'u' HexDigit HexDigit HexDigit HexDigit
  ;

fragment
HexDigit
  :
  (
    '0'..'9'
    | 'a'..'f'
    | 'A'..'F'
  )
  ;

fragment
Letter
  :
  '\u0024'
  | '\u0041'..'\u005a'
  | '\u005f'
  | '\u0061'..'\u007a'
  | '\u00c0'..'\u00d6'
  | '\u00d8'..'\u00f6'
  | '\u00f8'..'\u00ff'
  | '\u0100'..'\u1fff'
  | '\u3040'..'\u318f'
  | '\u3300'..'\u337f'
  | '\u3400'..'\u3d2d'
  | '\u4e00'..'\u9fff'
  | '\uf900'..'\ufaff'
  | '-'
  ;

fragment
Digit
  :
  '0'..'9'
  ;

LINE_COMMENT
  :
  '//'
  ~(
    '\n'
    | '\r'
   )*
  '\r'? '\n' 
             {
              System.out.println("comment found");
              $channel = HIDDEN;
             }
  ;

WS
  :
  (
    ' '
    | '\r'
    | '\t'
    | '\u000C'
    | '\n'
  )
  
   {
    $channel = HIDDEN;
   }
  ;
