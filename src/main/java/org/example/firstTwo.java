package org.example;

public class firstTwo {
    public String firstTwo(String str) {
        // Check the length
        if (str.length() <= 2) {
            return str;  // Return the entire string if it's length is 2 or less
        } else {
            return str.substring(0, 2);  // Return the first 2 characters
        }
    }

}
