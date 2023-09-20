package com.dmdev.cs.homeworkN2.loop.task1;

public class CountOdd {

    public static int getOdd(int value) {
        int odd = 0;
        int result;
        for (int currentValue = (value > 0 ? value : value * -1); currentValue > 0; currentValue /= 10) {
            result = currentValue % 10;
            if (result % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }
}
