package com.dmdev.cs.homework.task3;

import java.util.Scanner;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 *
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CompareSquareTriangle.getCompare(getFirstSquare(), getSecondSquare());
        scanner.close();
    }

    private static double getFirstSquare() {
        System.out.println("Введите значение длины первого катета для первого треугольника:");
        int firstValueFirstTriangle = scanner.nextInt();
        System.out.println("Введите значение длины второго катета для первого треугольника:");
        int secondValueFirstTriangle = scanner.nextInt();
        return SquareTriangle.getSquare(firstValueFirstTriangle, secondValueFirstTriangle);
    }
    private static double getSecondSquare() {
        System.out.println("Введите значение длины второго катета для первого треугольника:");
        int firstValueSecondTriangle = scanner.nextInt();
        System.out.println("Введите значение длины второго катета для первого треугольника:");
        int secondValueSecondTriangle = scanner.nextInt();
        return SquareTriangle.getSquare(firstValueSecondTriangle, secondValueSecondTriangle);
    }
}
