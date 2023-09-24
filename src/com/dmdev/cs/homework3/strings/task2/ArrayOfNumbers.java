package com.dmdev.cs.homework3.strings.task2;

public class ArrayOfNumbers {

    public static int[] getDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        int[] result = new int[count];
        int lastIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                result[lastIndex] = Integer.parseInt(String.valueOf(str.charAt(i)));
                lastIndex++;
            }
        }
        return result;
    }

    public static int getDigitsSum(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
               result += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return result;
    }
}
