package org.example;

public class extraEnd {
    public static String extraEnd(String str) {
        // gets last 2 chars in string
        String lastTwoChars = str.substring(str.length() - 2);
        // Return the last 2 chars repeated 3 times
        return lastTwoChars + lastTwoChars + lastTwoChars;
    }
}
