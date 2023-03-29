package com.martinsladek.java8examples.streams2.parallelStreams.baeldung;

import java.util.Arrays;
import java.util.List;

public class Parallel31SplitSource {
    // src: https://www.baeldung.com/java-when-to-use-parallel-stream#1-splitting-source
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        int sum = listOfNumbers.parallelStream().reduce(0, Integer::sum);
        System.out.println("sum = " + sum);
        System.out.println("should be 10");
//        assertThat(sum).isNotEqualTo(15);
    }
}
