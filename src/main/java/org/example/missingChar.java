package org.example;

public class missingChar {
    // return a new string where the char at index n has been removed.
    public String missingChar(String str, int n) {
        String front = str.substring (0, n);
        String back = str.substring (n+1, str.length());
        return front+back;
    }

}
