package com.martinsladek.java8examples.random;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Random2 {
    public static void main(String[] args) {
        // src: https://howtodoinjava.com/java8/stream-random-numbers-range/
        Random random = new Random();

        //1
        IntStream randStream = random.ints(5);
        randStream.forEach(System.out::println);

        //2
        DoubleStream doubleStream = random.doubles(5, 0, 0.5);
        doubleStream.forEach(System.out::println);

        //collect to list
        List<Long> longs = random.longs(5)
                .boxed()
                .collect(Collectors.toList());

        longs.stream().forEach(System.out::println);
    }
}
