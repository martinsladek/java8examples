package com.martinsladek.java8examples.streams2.parallelStreams.baeldung;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class Parallel33CustomThreadPool {
    // src: https://www.baeldung.com/java-when-to-use-parallel-stream#3-custom-thread-pool

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        ForkJoinPool customThreadPool = new ForkJoinPool(4);
        int sum = customThreadPool.submit(
                () -> listOfNumbers.parallelStream().reduce(0, Integer::sum)).get();
        customThreadPool.shutdown();
        System.out.println("sum = " + sum);
        System.out.println("should be 10");
//        assertThat(sum).isEqualTo(10);
    }
}
