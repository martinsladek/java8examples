package com.martinsladek.java8examples.lambda;

import java.util.function.BiPredicate;

public class Java8lambda2xBiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bp = (i, j) -> { return i == j; };

        System.out.println("Result is bp: " + bp.test(1, 1));
        System.out.println("Result is bp: " + bp.test(1, 2));
    }
}
