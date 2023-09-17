package com.dmdev.cs.homework2.arrays.task2;

import java.util.Arrays;

public class NumericArray {

    public static void getNumericArray(char[] chars, int[] ints) {
        for (int i = 0; i < chars.length - 1; i++) {
            ints[i] = chars[i];
        }
        System.out.println("Numeric Array: " + Arrays.toString(ints));
    }
}
