package com.martinsladek.java8examples.random;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.stream.IntStream;

public class SecureRandom3b {
    // src: https://howtodoinjava.com/java8/stream-random-numbers-range/
    public static void main(String[] args) throws NoSuchAlgorithmException {
        SecureRandom sRand = SecureRandom.getInstanceStrong();

        IntStream randStream = sRand.ints(5);

        randStream.forEach(System.out::println);
    }
}
