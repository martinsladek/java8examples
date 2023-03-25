package com.martinsladek.java8examples.lambda;

import java.util.function.Function;

public class Java8lambda3function {
    public static void main(String[] args) {
        Function<String, String> upperCase = (name) -> name.toUpperCase();

        System.out.println("Result is: " + upperCase.apply("functional"));
    }
}
