package com.martinsladek.java8examples.streams2.max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class FindMaxPersonComparator {
    // src: https://www.baeldung.com/java-collection-min-max#find-min-with-custom-objects
    public static void main(String[] args) {
        // given
        Person alex = new Person("Alex", 23);
        Person john = new Person("John", 40);
        Person peter = new Person("Peter", 32);
        List<Person> people = Arrays.asList(alex, john, peter);

        // then
        Person minByAge = people
                .stream()
                .min(Comparator.comparing(Person::getAge))
                .orElseThrow(NoSuchElementException::new);

        System.out.println("min person by age: " + minByAge);
//        assertEquals("Should be Alex", alex, minByAge);
    }
}
class Person {
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}