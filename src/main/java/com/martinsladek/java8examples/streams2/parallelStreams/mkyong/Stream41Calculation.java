package com.martinsladek.java8examples.streams2.parallelStreams.mkyong;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream41Calculation {
    // src: https://mkyong.com/java8/java-8-parallel-streams-examples/
    public static void main(String[] args) {

        long count = Stream.iterate(0, n -> n + 1)
//                .limit(1_000_000)
                .limit(300_000)
                .parallel()   // with this 23s, without this 1m 10s
                .filter(Stream41Calculation::isPrime)
                .peek(x -> System.out.format("%s\t", x))
                .count();

        System.out.println("\nTotal: " + count);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
}
