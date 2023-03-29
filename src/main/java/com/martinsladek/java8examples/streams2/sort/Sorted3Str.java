package com.martinsladek.java8examples.streams2.sort;

import java.util.stream.Stream;

public class Sorted3Str {
    // src: https://www.geeksforgeeks.org/stream-sorted-comparator-comparator-method-java/
    public static void main(String[] args) {
        // Creating an array of Strings
        String[] array = { "GFG", "Geeks", "for",
                "GeeksforGeeks", "GeeksQuiz" };

        System.out.println("The sorted stream is :");

        // sorting the elements of array based
        // on their last character
        Stream.of(array).sorted((str1, str2)
                        -> Character.compare(str1
                                .charAt(str1.length() - 1),
                        str2.charAt(str2.length() - 1)))
                .         forEach(System.out::println);
    }
}
