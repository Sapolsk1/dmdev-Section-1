package com.dmdev.cs.homework2.arrays.task3.arrays;

public class PositiveArray {

    public static int[] getArray(int count, int[] arr) {
        int[] array = new int[count];
        int lastEmptyIndex = 0;
        for (int j : arr) {
            if (j > 0) {
                array[lastEmptyIndex] = j;
                lastEmptyIndex++;
            }
        }
        return array;
    }
}
