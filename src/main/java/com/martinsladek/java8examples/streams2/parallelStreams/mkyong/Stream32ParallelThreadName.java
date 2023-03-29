package com.martinsladek.java8examples.streams2.parallelStreams.mkyong;

import java.util.stream.IntStream;

public class Stream32ParallelThreadName {
    public static void main(String[] args) {
        System.out.println("Normal...");
        IntStream range = IntStream.rangeClosed(0, 9);
        range.forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
        });

        System.out.println("Parallel...");
        IntStream range2 = IntStream.rangeClosed(0, 9);
        range2.parallel().forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
        });

    }
}
