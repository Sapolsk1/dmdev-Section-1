package com.dmdev.cs.homeworkN2.arrays.task2;

public class Compare {

    public static void compareNumbers(int[] ints, int average) {
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] > average) {
                System.out.println("Число, больше среднего арифметического: " + ints[i]);
            }
        }
    }
}
