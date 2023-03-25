package com.martinsladek.java8examples.javascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Java8GraalJs {
/*
* No more Nashorn JS engine on Java 17
* Use Graal.js:
* https://stackoverflow.com/a/71481633
*
* */
    public static void main(String args[]) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine graalEngine = new ScriptEngineManager().getEngineByName("graal.js");


        String name = "Mahesh";
        Integer result = null;

        try {
            graalEngine.eval("print('" + name + "')");
            result = (Integer) graalEngine.eval("10 + 2");

        } catch(ScriptException e) {
            System.out.println("Error executing script: "+ e.getMessage());
        }
        System.out.println(result.toString());
    }
}
