package com.martinsladek.java8examples.streams;

import java.util.Arrays;
import java.util.List;

public class Java8streams4filter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

//get count of empty string
        long /*int*/ count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
    }
}
