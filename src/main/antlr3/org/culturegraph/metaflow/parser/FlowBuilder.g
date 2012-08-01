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
import org.culturegraph.metaflow.MetaFlowException;
}

@members {
Flow flow = new Flow();
Map<String, String> vars = new HashMap<String, String>();

public final void addVaribleAssignements(final Map<String, String> vars) {
	this.vars.putAll(vars);
}
}

metaflow returns [Flow flow]
  :
  varDefs flow 
               {
                $flow = this.flow;
               }
  ;

varDefs
  :
  varDef* 
          {
           
          }
  ;

varDef
  :
  ^(ASSIGN name=Identifier e=exp?)
  
   {
    vars.put($name.text, $e.value);
   }
  |
  ^(DEFAULT name=Identifier e=exp?)
  
   {
    if(!vars.containsKey($name.text)){
        vars.put($name.text, $e.value);
        }
   }
  ;

flow
  :
  (
    StdIn 
          {
           flow.setStdInStart();
          }
    | e=exp 
            {
             flow.setStringStart($e.value);
            }
  )
  (
    pipe
  )+
  ;

exp returns [String value]
  :
  s=StringLiteral 
                  {
                   $value = $s.text;
                  }
  | id=Identifier 
                  {
                   $value = vars.get($id.text);
                   if ($value == null) {
                   	throw new MetaFlowException("Variable " + $id.text + " not assigned.");
                   }
                  }
  |
  ^('+' e1=exp e2=exp)
  
   {
    $value = $e1.value + $e2.value;
   }
  ;

pipe
@init {
final Map<String, String> args = new HashMap<String, String>();
}
  :
  ^(
    name=QualifiedName carg=exp?
    (
      a=arg 
            {
             args.put($a.key, $a.value);
            }
    )*
   )
  
   {
    flow.addElement($name.text, args, $carg.value);
   }
  ;

arg returns [String key, String value]
  :
  ^(ARG k=Identifier e=exp)
  
   {
    $key = $k.text;
    $value = $e.value;
   }
  ;
