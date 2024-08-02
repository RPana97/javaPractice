package org.example;

public class comboString {
    public String comboString(String a, String b) {
        // Determine which string is shorter and which is longer
        if (a.length() < b.length()) {
            return a + b + a; // shorter a, longer b
        } else {
            return b + a + b; // shorter b, longer a
        }
    }

}
