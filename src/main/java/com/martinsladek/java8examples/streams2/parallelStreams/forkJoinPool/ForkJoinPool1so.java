package com.martinsladek.java8examples.streams2.parallelStreams.forkJoinPool;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ForkJoinPool1so {
    // Question: src: https://stackoverflow.com/questions/21163108/custom-thread-pool-in-java-8-parallel-stream
    // Answer: src: https://stackoverflow.com/a/22269778

    // FJP (fork join pool) adjustments: src: https://stackoverflow.com/a/21172732
    public static void main(String[] args) {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("Runtime.getRuntime().availableProcessors() == " + availableProcessors);

        int numParallelThreads = availableProcessors;
        ForkJoinPool forkJoinPool = null;

        try {
            forkJoinPool = new ForkJoinPool(numParallelThreads);
            final List<Integer> primes = forkJoinPool.submit(() ->
                    // Parallel task here, for example
                    IntStream.range(1, 1_000/*_000*/).parallel()
                            .peek( e -> System.out.println("peek: num = " + e + ", \t thread = " + Thread.currentThread().getName()) )
                            .filter(PrimesPrint::isPrime)
                            .boxed().collect(Collectors.toList())
            ).get();
            System.out.println(primes);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            if (forkJoinPool != null) {
                forkJoinPool.shutdown();
            }
        }
    }
}

class PrimesPrint {
    // Prime number evaluation borrowed from mkyong:
    // src: https://mkyong.com/java8/java-8-parallel-streams-examples/
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
}