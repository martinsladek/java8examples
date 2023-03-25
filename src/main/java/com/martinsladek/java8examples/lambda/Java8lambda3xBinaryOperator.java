package com.martinsladek.java8examples.lambda;

import java.util.function.BinaryOperator;

public class Java8lambda3xBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (s, t) -> s.concat(" + ").concat(t);
        System.out.println(binaryOperator.apply("coca", "cola"));
    }
}
