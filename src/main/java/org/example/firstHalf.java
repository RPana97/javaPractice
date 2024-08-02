package org.example;

public class firstHalf {
    public String firstHalf(String str) {
        // finds the middle
        int halfLength = str.length() / 2;
        // Return the first half of the string
        return str.substring(0, halfLength);
    }

}
