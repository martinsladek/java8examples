package com.martinsladek.java8examples.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Java8DateTime2ZonedTester {

    public static void main(String args[]) {
        Java8DateTime2ZonedTester java8DateTime2ZonedTester = new Java8DateTime2ZonedTester();
        java8DateTime2ZonedTester.testZonedDateTime();
    }

    public void testZonedDateTime() {
        // Get the current date and time
        ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);
    }
}