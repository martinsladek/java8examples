package com.martinsladek.java8examples.streams;

import java.util.Random;

public class Java8streams6sorted {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }
}
