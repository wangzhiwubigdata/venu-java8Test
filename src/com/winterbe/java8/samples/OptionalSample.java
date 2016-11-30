package com.winterbe.java8.samples;

import java.util.Optional;

public class OptionalSample {
    private static void printUpperCase(Optional<String> str) {
        String upper = str.map(String::toUpperCase).orElse("-[NONE]-");
        System.out.println(upper);
    }

    public static void main(String[] args) {
        Optional<String> javaAuthor = Optional.of("James Gosling");
        Optional<String> nothing = Optional.empty();
        printUpperCase(javaAuthor);
        printUpperCase(nothing);
    }
}
