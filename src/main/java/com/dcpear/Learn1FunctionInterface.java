/**
 * In functional programming, we are allowed to assign functions to variables
 * ava provides a function interface that allows us to define functions as variables, which is quite a different
 * way than what we've been used to do. Basically, what this interface allows us to do is
 * assign functions to variables and work with them in a very similar way to how we'd work with any other data type.
 * Function<T,R> T= type of the argument , R type of the return value.
 * Reading:
 * https://www.geeksforgeeks.org/function-interface-in-java-with-examples/
 * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
 */
package com.dcpear;

import java.util.function.Function;

/**
 * Function interface example.
 */
public class Learn1FunctionInterface {

    protected static class Multiply{
        public static Integer triple(Integer x){
            return x*3;
        }
    }

    public static void main(String[] args){
        Function<Integer, Integer> myTriple=Multiply::triple; //using function interface
        Integer result = myTriple.apply(105); //this is how we call function objects
        System.out.println(result);
    }

}
