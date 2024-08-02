package org.example;

public class diff21 {
    //returns the difference if n is less than 21 and double the difference if over 21
    public int diff21(int n) {
        int diff;
        if (n < 21) {
            diff = 21-n;
        } else {
            diff = (n-21)*2;
        }
        return diff;
    }

}
