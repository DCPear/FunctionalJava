/**
 * in Java not only are we allowed to use the function interface to create references to existing functions on
 * other classes but we're also allowed to use the function interface to define new functions from scratch.
 * Function<Integer, Integer> myFunction =(someArg) -> someArg * 2 +1;
 * Function<String, Integer> getStringLength = (myString)->myString.length();
 * Function<Integer, Integer> myFunction = (x) -> {
 * Integer result =x *3
 * return
 * }
 */
package com.company;

import java.util.function.Function;

/**
 * Lambda example
 */
public class Learn3LambadaExpressions {

    public static void main(String[] args) {
        Function<Integer, Integer> getAbsoluteValue = (num) -> num < 0 ? -num : num;
        System.out.println(getAbsoluteValue.apply((-5300)));

    }

}
