package com.dmdev.cs.homework2.loop.task1;

public class CountEven {
    private static int even;

    public static void getEven(int value) {
        int result;
        for (int currentValue = (value > 0 ? value : value * -1); currentValue > 0; currentValue /= 10) {
            System.out.println(currentValue);
            result = currentValue % 10;
            if (result % 2 == 0) {
                even++;
            }
        }
        System.out.println("Количество четных цифр: " + even);
    }
}
