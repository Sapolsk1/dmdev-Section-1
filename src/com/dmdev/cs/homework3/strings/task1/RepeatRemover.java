package com.dmdev.cs.homework3.strings.task1;

public class RepeatRemover {

    public static String removeRepeats(String str) {
        String result = str.toUpperCase().replaceAll(" ", "");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < result.length(); i++) {
            if (i != 0 && result.charAt(i) != result.charAt(i - 1)) {
                stringBuilder.append(result.charAt(i));
            }
            if (i == 0) {
                stringBuilder.append(result.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
