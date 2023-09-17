package com.dmdev.cs.homework1.task3;

public class CompareSquareTriangle {

    public static void getCompare(double firstSquare, double secondSquare) {
        if (firstSquare > secondSquare) {
            System.out.println("Первый треугольник больше второго: " + firstSquare + " > " + secondSquare);
        } else if(secondSquare > firstSquare) {
            System.out.println("Первый треугольник меньше второго: " + secondSquare + " > " + firstSquare);
        } else {
            System.out.println("Первый треугольник равен второму: " + secondSquare + " = " + firstSquare);
        }
    }
}
