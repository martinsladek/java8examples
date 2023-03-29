package com.martinsladek.java8examples.streams2.parallelStreams.mkyong;

import java.util.stream.IntStream;

public class Stream3ParallelCheck {
    // src: https://mkyong.com/java8/java-8-parallel-streams-examples/
    public static void main(String[] args) {
        System.out.println("Sequential stream:");
        IntStream range = IntStream.rangeClosed(0, 9);
        System.out.println("range.isParallel(): " + range.isParallel());         // false
        System.out.print("Stream output: ");
        range.forEach(System.out::print);
        System.out.println();
        System.out.println();

        System.out.println("Parallel stream:");
        IntStream range2 = IntStream.rangeClosed(0, 9);
        IntStream range2Parallel = range2.parallel();
        System.out.println("range.isParallel(): " + range2Parallel.isParallel()); // true
        System.out.print("Stream output: ");
        range2Parallel.forEach(System.out::print);
        System.out.println();
    }
}
