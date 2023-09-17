package com.dmdev.cs.homework2.arrays.task1;

public class ArrayCounter {

    public static int getCount(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j >= 0) {
                count++;
            }
        }
        return count;
    }
}
