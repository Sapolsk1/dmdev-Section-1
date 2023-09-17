package com.dmdev.cs.homework2.loop.task2;

import java.util.Scanner;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321

 * Примечание: для решения может понадобиться функция возведение числа в степень: Math.pow(число, степень)
 */

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        int value = SCANNER.nextInt();
        InvertMethod.invertValue(value);
    }
}
