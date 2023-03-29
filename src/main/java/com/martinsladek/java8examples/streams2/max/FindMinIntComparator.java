package com.martinsladek.java8examples.streams2.max;

import java.util.Arrays;
import java.util.List;

public class FindMinIntComparator {
    // src: https://www.geeksforgeeks.org/stream-min-method-in-java-with-examples/
    public static void main(String[] args) {

        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        // Using stream.min() to get minimum
        // element according to provided Integer Comparator
        Integer var = list.stream().min(Integer::compare).get();

        System.out.print(var);
    }
}
