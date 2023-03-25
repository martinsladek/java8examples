package com.martinsladek.java8examples.lambda;

import java.util.function.Supplier;

public class Java8lambda4supplier {
    public static void main(String[] args) {
        Supplier<String> helloWorld = () -> {
            return "Hello World";
        };

        System.out.println("Greeting message: " + helloWorld.get());
    }
}
