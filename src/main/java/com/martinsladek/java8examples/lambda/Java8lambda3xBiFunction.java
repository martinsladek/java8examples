package com.martinsladek.java8examples.lambda;

import java.util.function.BiFunction;

public class Java8lambda3xBiFunction {
    public static void main(String[] args) {
        BiFunction<String, String, String> bf = (name, surname) -> name.toUpperCase() + "_" + surname.toUpperCase();
        System.out.println("Result is: " + bf.apply("karel", "novak"));
    }
}
