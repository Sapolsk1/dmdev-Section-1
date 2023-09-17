package com.dmdev.cs.lesson21;

/**
 * 2. Имеется число. Посчитать сумму цифр данного числа.
 */

public class Task2 {

    public static void main(String[] args) {
//        12345 % 10 = 5 -> 12345 / 10 = 1234
        int value = 111;
        int result = sum(value);
        System.out.println("Сумма: " + result);
    }

    private static int sum(int value) {
        int result = 0;
        for (int currentValue = (value > 0  ? value : value * -1); currentValue > 0 ; currentValue /= 10) {
            result = result + currentValue % 10;
        }
        return result;
    }
}
