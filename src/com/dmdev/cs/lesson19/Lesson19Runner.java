package com.dmdev.cs.lesson19;

public class Lesson19Runner {

    public static void main(String[] args) {
        int value = 10;
        whileExample(value);
        System.out.println("");
        doWhileExample(value);
    }

    public static void whileExample(int value) {
        while (value > 0) {
            System.out.println(value);
            value--;
        }
    }

    public static void doWhileExample(int value) {
        do {
            System.out.println(value);
            value--;
        } while (value > 0);
    }
}
