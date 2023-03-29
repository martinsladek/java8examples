package com.martinsladek.java8examples.random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Random1 {
    // https://stackoverflow.com/a/31705423
    public static String sourceWordsArray [] = { "1", "2", "3", "4" };
    public static List<String> sourceWords = Arrays.stream(sourceWordsArray).toList();

    public static void main(String[] args) {
        List<String> strList = createList003(5, sourceWords).stream().collect(Collectors.toList());

        strList.forEach(System.out::println);
    }

/*
    public static List<String> createList001(int listSize, List<String> sourceWords) {
        Random rand = new Random();
        List<String> wordList = sourceWords.
                stream().
                limit(listSize).
                collect(Collectors.toList());

        return wordList;
    }

    public static List<String> createList002(int listSize, List<String> sourceWords) {
        Random rand = new Random();
        List<String> wordList = rand.
                ints(listSize, 0, sourceWords.size()).
                mapToObj(i -> sourceWords.get(i)).
                collect(Collectors.toList());

        return wordList;
    }
*/

    public static List<String> createList003(int listSize, List<String> sourceWords) {
        Random rand = new Random();
        List<String> wordList = rand
                .ints(/*listSize, */0, sourceWords.size())
                .limit(listSize)
                .mapToObj(i -> sourceWords.get(i))
                .collect(Collectors.toList());

        return wordList;
    }
}
