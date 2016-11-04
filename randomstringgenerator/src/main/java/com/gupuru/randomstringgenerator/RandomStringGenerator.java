package com.gupuru.randomstringgenerator;


import java.util.Random;

public class RandomStringGenerator {

    private static final String CHARACTERS = "0123456789qwertyuiopasdfghjklzxcvbnm";
    private final static String OTHER_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+-=";
    private static final int DEFAULT_SIZE = 10;

    public static String get() {
        return generate(DEFAULT_SIZE, CHARACTERS);
    }

    public static String get(int size) {
        return generate(size, CHARACTERS);
    }

    public static String getInSymbol() {
        return generate(DEFAULT_SIZE, OTHER_CHARACTERS);
    }

    public static String getInSymbol(int size) {
        return generate(size, OTHER_CHARACTERS);
    }

    public static int getNumber(int ran) {
        if (ran < 1) {
            ran = DEFAULT_SIZE;
        }
        Random rnd = new Random();
        return rnd.nextInt(ran);
    }

    private static String generate(int sizeOfRandomString, String characters) {
        if (sizeOfRandomString < 1) {
            sizeOfRandomString = DEFAULT_SIZE;
        }
        final Random random = new Random();
        final StringBuilder sb = new StringBuilder(sizeOfRandomString);
        for (int i = 0; i < sizeOfRandomString; ++i)
            sb.append(characters.charAt(random.nextInt(characters.length())));
        return sb.toString();
    }

}
