package com.dmdev.cs.homeworkN2.arrays.task2;

public class AverageSum {

    public static int getAverageSum(int[] ints) {
        int result = 0;
        for (int anInt : ints) {
            result = result + anInt;
        }
        return result / ints.length;
    }
}
