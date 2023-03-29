package com.martinsladek.java8examples.streams2.parallelStreams.baeldung;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Parallel42SplittingCost {
    // src: https://www.baeldung.com/java-when-to-use-parallel-stream#2-splitting-costs
    private static final List<Integer> arrayListOfNumbers = new ArrayList<>();
    private static final List<Integer> linkedListOfNumbers = new LinkedList<>();

    static {
        IntStream.rangeClosed(1, 1_000_000).forEach(i -> {
            arrayListOfNumbers.add(i);
            linkedListOfNumbers.add(i);
        });
    }

    public static void main(String[] args) {
//        arrayListOfNumbers.stream().reduce(0, Integer::sum);
//        arrayListOfNumbers.parallelStream().reduce(0, Integer::sum);
//        linkedListOfNumbers.stream().reduce(0, Integer::sum);
        linkedListOfNumbers.parallelStream().reduce(0, Integer::sum);
    }
}
