package com.additionalcourses.generics;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        int addNumber = 0;
        Integer[] ints = new Integer[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = addNumber;
            addNumber++;
        }
        System.out.println(Arrays.toString(ints));
    }
}
