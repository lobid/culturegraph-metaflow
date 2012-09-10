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
import java.util.ArrayList;
import java.util.List;
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
  varDefs mainflow 
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
    if (!vars.containsKey($name.text)) {
    	vars.put($name.text, $e.value);
    }
   }
  ;

mainflow
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
  flow
  ;

tee
  :
  ^(
    TEE 
        {
         flow.startTee();
         //System.out.println("start tee");
        }
    (
      ^(SUBFLOW flow)
      
       {
        flow.endSubFlow();
        // System.out.println("end subflow");
       }
    )+
   )
  
   {
    flow.endTee();
    //System.out.println("end tee");
   }
  ;

flow
  :
  (
    pipe
    | tee
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
final Map<String, String> namedArgs = new HashMap<String, String>();
final List<Object> cArgs = new ArrayList<Object>();
}
  :
  ^(
    name=QualifiedName
    (
      e=exp 
            {
             cArgs.add($e.value);
            }
    )?
    (
      VarRef 
             {
              cArgs.add(Collections.unmodifiableMap(vars));
             }
    )?
    (
      a=arg 
            {
             namedArgs.put($a.key, $a.value);
            }
    )*
   )
  
   {
    flow.addElement(flow.createElement($name.text, namedArgs, cArgs));
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
