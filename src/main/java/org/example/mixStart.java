package org.example;

public class mixStart {
    //returns true if the first three chars contain ix as the last 2 chars.
    public boolean mixStart(String str) {

        if (str.length() < 3) return false;

        String chars = str.substring(1, 3);

        if (chars.equals("ix")) {
            return true;
        } else {
            return false;
        }
    }
}
