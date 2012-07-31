tree grammar FlowBuilder;

options {
  language     = Java;
  tokenVocab   = Metaflow;
  ASTLabelType = CommonTree;
}

@header {
package org.culturegraph.metaflow.parser;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import org.culturegraph.metaflow.Flow;
}

@members {
Flow flow = new Flow();
}

metaflow returns [Flow flow]
  :
  flow 
         {
         $flow = this.flow;
         }
  ;

flow
  :
  (
    StdIn 
          {
           flow.setStdInStart();
          }
    | sl=StringLiteral 
                       {
                        flow.setStringStart($sl.text);
                       }
  )
  (
    pipe
  )+
  ;

pipe
@init {
final Map<String, String> args = new HashMap<String, String>();
}
  :
  ^(
    name=QualifiedName carg=StringLiteral?
    (
      a=arg 
            {
             args.put($a.key, $a.value);
            }
    )*
   )
  
   {
    flow.addElement($name.text, args, $carg.text);
     //System.out.println("created "+$name.text);
   }
  ;

arg returns [String key, String value]
  :
  ^(ARG k=Identifier v=StringLiteral)
  
   {
    $key = $k.text;
    $value = $v.text;
   }
  ;
