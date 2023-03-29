package com.martinsladek.java8examples.random;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SecureRandom3a {
    // src: https://howtodoinjava.com/java8/stream-random-numbers-range/
    public static void main(String[] args) throws NoSuchAlgorithmException {
        SecureRandom secureRandomGenerator = SecureRandom.getInstanceStrong();

        //1. Get 128 random bytes
        byte[] randomBytes = new byte[128];
        secureRandomGenerator.nextBytes(randomBytes);

        //2. Get random integer
        int r = secureRandomGenerator.nextInt();

        //3. Get random integer in range
        int randInRange = secureRandomGenerator.nextInt(999999);

        System.out.println("random integer: " + r);
        System.out.println("random integer in range: " + randInRange);
    }
}
