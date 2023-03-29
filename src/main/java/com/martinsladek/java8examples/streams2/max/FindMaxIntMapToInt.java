package com.martinsladek.java8examples.streams2.max;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class FindMaxIntMapToInt {
    // src: https://www.baeldung.com/java-collection-min-max#find-max-in-a-list-of-integers
    public static void main(String[] args) {
        // given
        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 56, 7, 89, 10);
        Integer expectedResult = 89;

        // then
        Integer max = listOfIntegers
                .stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);

        System.out.println("max: " + max);
//        assertEquals("Should be 89", expectedResult, max);
    }
}
