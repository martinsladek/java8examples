package com.martinsladek.java8examples.lambda;

import java.util.function.Consumer;

/*
* src: https://dzone.com/articles/functional-interface-explained-in-detail-introduce#:~:text=in%20java%208%2C%20there%20are%204%20main%20functional%20interfaces%20are%20introduced%20which%20could%20be%20used%20in%20different%20scenarios.
* src: https://dzone.com/articles/functional-interface-explained-in-detail-introduce
* */
public class Java8lambda1consumer {
    public static void main(String[] args) {
        Consumer<String > ucConsumer = (s) -> System.out.println(s.toUpperCase());
        ucConsumer.accept("consumer");
    }
}
