package com.martinsladek.java8examples.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Java8DateTime6BackwardCompatibility {

    public static void main(String args[]) {
        Java8DateTime6BackwardCompatibility java8DateTime6BackwardCompatibility = new Java8DateTime6BackwardCompatibility();
        java8DateTime6BackwardCompatibility.testBackwardCompatability();
    }

    public void testBackwardCompatability() {
        //Get the current date
        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);

        //Get the instant of current date in terms of milliseconds
        Instant now = currentDate.toInstant();
        ZoneId currentZone = ZoneId.systemDefault();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
        System.out.println("Local date: " + localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
        System.out.println("Zoned date: " + zonedDateTime);
    }
}
