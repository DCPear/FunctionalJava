/**
 * use the function interface with functions that have more than one argument, or functions that have no arguments
 * There is another functional programming interface in Java. And this interface is called BiFunction.
 * BIFunction<T,U,R>
 */
package com.company;

import com.company.ownInterfaces.NoArgsFunction;
import com.company.ownInterfaces.TriFunction;
import java.util.function.BiFunction;

/**
 * Two arguments.
 */
public class Learn2BiFunctionsAndMore {
    public static void main(String[] args) {
        //using system provided BiFunction
        BiFunction<Integer, Integer, Integer> addTwoNumbers = (x, y) -> x + y;
        System.out.println(addTwoNumbers.apply(58, 22));

        //using interface created TriFunction
        TriFunction<Integer, Integer, Integer, Integer> addThreeNumbers = (x, y, z) -> x + y + z;
        System.out.println(addThreeNumbers.apply(10, 20, 30));

        //using interface created NoArgsFunction
        NoArgsFunction<String> helloWorld = () -> "Hello world!";
        System.out.println(helloWorld.apply());

    }
}
