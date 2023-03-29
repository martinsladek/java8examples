package com.martinsladek.java8examples.streams2.parallelStreams.mkyong;

import java.util.ArrayList;
import java.util.List;

public class Stream2ParallelStream {
    public static void main(String[] args) {
        System.out.println("Sequential...");
        List<String> data1 = getData();
        data1.stream().forEach(System.out::println);

        System.out.println("Parallel...");
        List<String> data2 = getData();
        data2.parallelStream().forEach(System.out::println);
    }

    private static List<String> getData() {
        List<String> data = new ArrayList<>();

        int n = 97;  // 97 = a , 122 = z
        while (n <= 122) {
            char c = (char) n;
            data.add(String.valueOf(c));
            n++;
        }

        return data;
    }
}
