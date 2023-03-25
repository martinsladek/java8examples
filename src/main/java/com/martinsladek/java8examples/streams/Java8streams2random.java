package com.martinsladek.java8examples.streams;

import java.util.Random;

public class Java8streams2random {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}
