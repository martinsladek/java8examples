package com.martinsladek.java8examples.lambda;

import java.util.function.Predicate;

public class Java8lambda2predicate {
    public static void main(String[] args) {
        Predicate<Integer> p = (i) -> { return i % 2 == 0; };

        System.out.println("Result is p: " + p.test(4));
    }
}
