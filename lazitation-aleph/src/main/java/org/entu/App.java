package org.entu;

import java.util.stream.IntStream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        IntStream range = IntStream.range(10, 20);
        System.out.println(range.sum());
    }

    public void printMeditation() {
        System.out.println("I'm meditation");
    }
}
