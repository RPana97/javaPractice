package org.example;

public class front22 {
    //take the first 2 chars and return the string with the 2 chars added at both the front and back
    public String front22(String str) {
        int chars = 2;
        if (chars > str.length()) {
            chars = str.length();
        }

        String front = str.substring(0, chars);
        return front + str + front;
    }
}
