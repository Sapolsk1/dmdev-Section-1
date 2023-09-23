package com.leetcode;

import java.util.Arrays;

/**
 * brute force algorithm
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] numbers1 = {2, 7, 11, 15};
        int[] numbers2 = {3, 2, 4};
        int[] numbers3 = {3, 3};
        int target1 = 9;
        int target2 = 6;
        int target3 = 6;
        int[] resultArray1 = twoSum(numbers1, target1);
        int[] resultArray2 = twoSum(numbers2, target2);
        int[] resultArray3 = twoSum(numbers3, target3);
        System.out.println(Arrays.toString(resultArray1));
        System.out.println(Arrays.toString(resultArray2));
        System.out.println(Arrays.toString(resultArray3));

    }

    private static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
