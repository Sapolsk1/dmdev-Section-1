package com.dmdev.cs.homework2.arrays.task1;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */

public class Main {
    public static int[] arr = {3, 5, -6, 3, 2, -9, 0, -123};

    public static void main(String[] args) {
        System.out.println(arr.length);
        int count = getCount(arr);
        System.out.println(count);
        getPositiveArray(count);
    }

    private static int getCount(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j >= 0) {
                count++;
            }
        }
        return count;
    }

    private static void getPositiveArray(int count) {
        int[] array = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                array[i] = arr[i] * array.length;
                System.out.println(array[i]);
            } else {
                i++;
                System.out.println(i);
            }
        }
        System.out.println(Arrays.toString(array));
    }
}