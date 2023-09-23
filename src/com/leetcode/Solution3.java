package com.leetcode;

public class Solution3 {

    public static void main(String[] args) {
        String ss = "pwwkew";
        System.out.println(lengthOfLongestSubstring(ss));
    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (isHaven(s, i, j))
                    result = Math.max(result, j - i + 1);
            }
        }
        return result;
    }

    public static Boolean isHaven(String s, int i, int j) {
        boolean[] result = new boolean[5000];
        for (int k = i; k <= j; k++) {
            if (result[s.charAt(k)] == true)
                return false;

            result[s.charAt(k)] = true;
        }
        return true;
    }

    public static int lengthOfLongestSubstring1(String s) {
        int result = 0;
        boolean[] result1 = new boolean[5000];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (result1[s.charAt(i)] == true) {

                }
                    result = Math.max(result, j - i + 1);
            }
        }
        return result;
    }
}
