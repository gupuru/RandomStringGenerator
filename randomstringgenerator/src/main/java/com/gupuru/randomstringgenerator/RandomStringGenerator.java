package com.gupuru.randomstringgenerator;


import java.util.Random;

public class RandomStringGenerator {

    private static final String CHARACTERS = "0123456789qwertyuiopasdfghjklzxcvbnm";
    private static final int DEFAULT_SIZE = 10;

    public static String get() {
        return get(DEFAULT_SIZE);
    }

    public static String get(int sizeOfRandomString) {
        if (sizeOfRandomString < 1) {
            sizeOfRandomString = DEFAULT_SIZE;
        }
        final Random random = new Random();
        final StringBuilder sb = new StringBuilder(sizeOfRandomString);
        for (int i = 0; i < sizeOfRandomString; ++i)
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        return sb.toString();
    }

}
