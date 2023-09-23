package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Set<Character> characters = new HashSet<>();
        if (s.isEmpty()) {
            return 0;
        }
        int maxLength = 1;
        int firstCharIndex = 0;

        for (int j = firstCharIndex; j < chars.length; j++) {
            if (!characters.contains(chars[j])) {
                characters.add(chars[j]);
                if (maxLength < characters.size()) {
                    maxLength = characters.size();
                }
            } else {
                j = ++firstCharIndex;
                j--;
                characters.clear();
            }
        }
        return maxLength;
    }
}
