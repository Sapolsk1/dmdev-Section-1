package com.dmdev.cs.homework2.arrays.task3.counter;

public class NegativeCounter implements NumberCounter{

    @Override
    public int getCount(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j < 0) {
                count++;
            }
        }
        return count;
    }
}
