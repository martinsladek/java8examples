package com.martinsladek.java8examples.streams2.parallelStreams.mkyong;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream5CaseStudy {
    // src: https://mkyong.com/java8/java-8-parallel-streams-examples/
    private static final String DIR = System.getProperty("user.dir") + "/test/";

    public static void main(String[] args) throws IOException {
        System.out.println("Test dir: " + DIR);
//        System.exit(0);

//        Files.createDirectories(Paths.get(DIR));
        Stream5CaseStudy obj = new Stream5CaseStudy();
        List<Employee> employees = obj.generateMultipleEmployees(10_000);

        // normal, sequential
//        employees.stream().forEach(e -> e.save(DIR)); 		// 27s-29s

        // parallel
//        employees.parallelStream().forEach(e -> e.save(DIR)); // 7s-8s

        double age = employees
                .parallelStream()
//                .stream()
                .mapToInt(Employee::getAge)
                .average()
                .getAsDouble();

        System.out.println("Average age: " + age);
    }

    private static void save(Employee input) {
        try (FileOutputStream fos = new FileOutputStream(new File(DIR + input.getName() + ".txt"))) {
            try (ObjectOutputStream obs = new ObjectOutputStream(fos)) {
                obs.writeObject(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Employee> generateMultipleEmployees(int num) {
        return Stream.iterate(0, n -> n + 1)
                .limit(num)
                .map(x -> {
                    return new Employee(
                            generateRandomName(4),
                            generateRandomAge(15, 100),
                            generateRandomSalary(900.00, 200_000.00)
                    );
                })
                .collect(Collectors.toList());
    }

    private String generateRandomName(int length) {
        return new Random()
                .ints(5, 97, 122) // 97 = a , 122 = z
                .mapToObj(x -> String.valueOf((char) x))
                .collect(Collectors.joining());
    }

    private int generateRandomAge(int min, int max) {
        return new Random()
                .ints(1, min, max)
                .findFirst()
                .getAsInt();
    }

    private BigDecimal generateRandomSalary(double min, double max) {
        return new BigDecimal(new Random()
                .doubles(1, min, max)
                .findFirst()
                .getAsDouble()).setScale(2, RoundingMode.HALF_UP);
    }
}

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private BigDecimal salary;

    public Employee(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void save(String dir/*, Employee input*/) {
        Employee input = this;

        try (FileOutputStream fos = new FileOutputStream(new File(dir + input.getName() + ".txt"))) {
            try (ObjectOutputStream obs = new ObjectOutputStream(fos)) {
                obs.writeObject(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}