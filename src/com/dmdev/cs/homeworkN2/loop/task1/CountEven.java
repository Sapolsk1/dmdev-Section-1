package com.dmdev.cs.homeworkN2.loop.task1;

public class CountEven {

    public static int getEven(int value) {
        int even = 0;
        int result;
        for (int currentValue = (value > 0 ? value : value * -1); currentValue > 0; currentValue /= 10) {
            result = currentValue % 10;
            if (result % 2 == 0) {
                even++;
            }
        }
        return even;
    }
}
