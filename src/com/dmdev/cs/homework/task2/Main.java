package com.dmdev.cs.homework.task2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Даны 3 переменные:
 *
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 *
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 *
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */

public class Main {

    public static void main(String[] args) {
        double d = 2.0;

        Function function = new Function();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);;
        System.out.println("First operand: ");
        double firstOperand = scanner.nextDouble();
        System.out.println("Second operand: ");
        double second = scanner.nextDouble();
        System.out.println("Operation symbol: ");
        char operation = scanner.next().charAt(0);
        scanner.close();
        function.getResult(firstOperand, second, operation);

    }
}
