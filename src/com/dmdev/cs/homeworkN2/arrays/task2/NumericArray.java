package com.dmdev.cs.homeworkN2.arrays.task2;

public class NumericArray {

    public static int[] getNumericArray(char[] chars, int[] ints) {
        for (int i = 0; i < chars.length - 1; i++) {
            ints[i] = chars[i];
        }
        return ints;
    }
}
