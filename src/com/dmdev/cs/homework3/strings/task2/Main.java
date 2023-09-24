package com.dmdev.cs.homework3.strings.task2;

import java.util.Arrays;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 *
 * Написать 2 метода:
 *
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 *
 * Посчитать сумму всех чисел из строки
 *
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Main {

    public static void main(String[] args) {
        String str = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] digits = ArrayOfNumbers.getDigits(str);
        int digitsSum = ArrayOfNumbers.getDigitsSum(str);
        System.out.println(Arrays.toString(digits));
        System.out.println(digitsSum);
    }
}
