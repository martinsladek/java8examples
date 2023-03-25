package com.martinsladek.java8examples.lambda;

import java.util.function.BiConsumer;

public class Java8lambda1xBiconsumer {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (x, y) -> {
            System.out.println("x: " + x + ", y: " + y);
        };

        biConsumer.accept("Sun", "Moon");
    }
}
