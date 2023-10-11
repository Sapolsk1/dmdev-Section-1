package com.additionalcourses.procedural.loops;

import java.util.Arrays;

public class Lesson1Runner {

    public static void main(String[] args) {

        int[] arr = {120, 220, 30, 40, 31};
//        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
                System.out.println(Arrays.toString(arr));
            }
//        }
//        System.out.println(Arrays.toString(arr));
    }

}
