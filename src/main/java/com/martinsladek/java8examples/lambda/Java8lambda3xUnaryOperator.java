package com.martinsladek.java8examples.lambda;

import java.util.function.UnaryOperator;

public class Java8lambda3xUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (s) -> s.concat("Operator");
        System.out.println(unaryOperator.apply(("Unary")));
    }
}
