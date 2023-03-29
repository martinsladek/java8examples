package com.martinsladek.java8examples.streams2.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted1ComparatorReverseInt {
    // src: https://www.geeksforgeeks.org/stream-sorted-comparator-comparator-method-java/
    public static void main(String[] args) {
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(5, -10, 7, -18, 23);

        System.out.println("Stream sorted with comparator : ");

        // reverse order
        list.stream().sorted(Comparator.reverseOrder()).
                forEach(System.out::println);
    }
}
