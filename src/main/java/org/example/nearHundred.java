package org.example;

public class nearHundred {
    // return true if it is within 10 of 100 or 200
    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }
}
