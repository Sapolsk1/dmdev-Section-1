package com.dmdev.cs.homework1.task2;

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

    private static final Scanner SCANNER = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        getResult();
    }

    private static void getResult() {
        System.out.println("First operand: ");
        double firstOperand = SCANNER.nextDouble();
        System.out.println("Second operand: ");
        double second = SCANNER.nextDouble();
        System.out.println("Operation symbol: ");
        char operation = SCANNER.next().charAt(0);
        Function.getResults(firstOperand, second, operation);
        SCANNER.close();
    }
}
