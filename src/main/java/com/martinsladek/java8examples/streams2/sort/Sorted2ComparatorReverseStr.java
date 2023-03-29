package com.martinsladek.java8examples.streams2.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted2ComparatorReverseStr {
    // src: https://www.geeksforgeeks.org/stream-sorted-comparator-comparator-method-java/
    public static void main(String[] args) {
        // Creating a list of Strings
        List<String> list = Arrays.asList("Geeks", "for", "GeeksforGeeks", "GeeksQuiz", "GFG");

        System.out.println("Stream sorted with comparator:");

        // reverse order
        list.stream().sorted(Comparator.reverseOrder()).
                forEach(System.out::println);
    }
}
