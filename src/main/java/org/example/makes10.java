package org.example;

public class makes10 {
    //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public boolean makes10(int a, int b) {
        int sum;
        sum = a+b;
        if (sum == 10) return true;
        if (a == 10 || b == 10) return true;
        return false;
    }

}
