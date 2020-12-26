/**
 * Exploring Java's ability to return functions from other functions
 * since Java allows us to treat functions in the same way as any other data type,
 * it's possible in Java to have a function that returns another function.
 */
package com.dcpear;

import com.dcpear.ownInterfaces.NoArgsFunction;

import java.util.function.Function;

public class Learn6ReturningFunctions {

    protected  static class Calculations {

        //create a function that takes and return an integer
        public static Function<Integer, Integer> createMultiplier(Integer y) {
            return (Integer x) -> x * y;
        }
    }

    public static void main(String[] args) {

        //create a no args function that creates a String
        //    NoArgsFunction<NoArgsFunction<String>>returnFunction =()->{
        //        return()->"Hello retuning String";
        //    };

        // function that returns a function that returns a String
        NoArgsFunction<NoArgsFunction<String>> createGreetingString = () -> () -> "Hello retuning String";
        NoArgsFunction<String> returnGreeting = createGreetingString.apply();
        System.out.println(returnGreeting.apply());

        //use multiplier
        Function<Integer, Integer> timesTwo = Calculations.createMultiplier(2);
        Function<Integer, Integer> timesThree = Calculations.createMultiplier(3);
        Function<Integer, Integer> timesFour =Calculations.createMultiplier(4);

        System.out.println(timesTwo.apply(6));
        System.out.println(timesThree.apply(6));
        System.out.println(timesFour.apply(6));

    }
}
