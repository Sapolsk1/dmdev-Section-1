package com.dmdev.cs.homeworkN2.loop.task2;

public class InvertMethod {

    public static void invertValue(int value) {
        int result = 0;
        for (int currentValue = value; currentValue > 0 ; currentValue /= 10) {
            int temp = currentValue % 10;
            result = result * 10 + temp;
        }
        System.out.println("result: " + result);
    }
}
