package com.martinsladek.java8examples.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

//@SuppressWarnings("unchecked")
public class Java8streams9statistics {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

//        @SuppressWarnings("unchecked")
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> (int) x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
    }
}
