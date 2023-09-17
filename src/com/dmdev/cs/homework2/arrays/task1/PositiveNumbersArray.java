package com.dmdev.cs.homework2.arrays.task1;

import java.util.Arrays;

public class PositiveNumbersArray {

    public static void getPositiveArray(int count, int[] arr) {
        int[] array = new int[count];
        int lastEmptyIndex = 0;
        for (int j : arr) {
            if (j >= 0) {
                array[lastEmptyIndex] = j * count;
                lastEmptyIndex++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
