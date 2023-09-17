package com.dmdev.cs.homeworkN2.loop.task1;

public class CountOdd {

    private static int odd;

    public static void getOdd(int value) {
        int result;
        for (int currentValue = (value > 0 ? value : value * -1); currentValue > 0; currentValue /= 10) {
            result = currentValue % 10;
            if (result % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Количество нечетных цифр: " + odd);
    }
}
