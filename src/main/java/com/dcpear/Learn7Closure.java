/**
 * When we return a function, it still has access to the scope that it was returned from. And this is a very
 * important concept since, if it didn't exist, returning functions would be pretty useless in many cases.
 */
package com.dcpear;

import com.dcpear.ownInterfaces.NoArgsFunction;

public class Learn7Closure {
    public static void main(String[] args) {
        NoArgsFunction<NoArgsFunction<String>> createGreeter = () -> {
            String name = "Deepa";
            return () -> "Hello, " + name;
        };

        NoArgsFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());
    }
}
