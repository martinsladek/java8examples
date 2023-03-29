package com.martinsladek.java8examples.streams2.parallelStreams.baeldung;

import java.util.Arrays;
import java.util.List;

public class Parallel22ParallelStreams {
    // src: https://www.baeldung.com/java-when-to-use-parallel-stream#2-parallel-streams
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        listOfNumbers.parallelStream().forEach(number ->
//        listOfNumbers.stream().parallel().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );
    }
}
