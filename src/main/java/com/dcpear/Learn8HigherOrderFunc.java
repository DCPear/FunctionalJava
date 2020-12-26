/**
 * Java treats functions in much the same way as any other data type and this allows us to do things
 * like pass functions, as arguments to other functions and return functions from other functions.
 * There's a term for functions that either take other functions as arguments or return other functions.
 * We call them higher order functions and using them in our code can provide amazing flexibility and reusability.
 */
package com.dcpear;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Learn8HigherOrderFunc {

    public static void main(String[] args) {

        //create a function take two arguments and return the first argument divided by the second argument.
        BiFunction<Float, Float, Float> divide = (x, y) -> {
            Float result = null;
            if (y == 0f) {
                System.out.println("Error:infinity");
                return 0f;
            }
            return x / y;
        };
        System.out.println(divide.apply(10f,2f));

        //Improved code with higher order functions
        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsntZeroCheck =
                (func) -> (x, y) -> {
                    if (y == 0f) {
                        System.out.println("Error: second argument is zero!");
                        return 0f;
                    }
                    return func.apply(x, y);
                };

        BiFunction<Float, Float, Float> divideSafe = secondArgIsntZeroCheck.apply(divide);

        System.out.println(divideSafe.apply(10f, 2f));
    }
}
