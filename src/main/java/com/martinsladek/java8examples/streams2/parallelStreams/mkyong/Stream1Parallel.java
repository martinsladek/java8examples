package com.martinsladek.java8examples.streams2.parallelStreams.mkyong;

import java.util.stream.IntStream;

public class Stream1Parallel {
    // src: https://mkyong.com/java8/java-8-parallel-streams-examples/
    public static void main(String[] args) {
        System.out.println("Sequential...");
        IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(System.out::println);

        System.out.println("Parallel...");
        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEach(System.out::println);

    }
}
