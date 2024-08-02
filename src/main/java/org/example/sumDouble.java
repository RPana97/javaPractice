package org.example;

public class sumDouble {
    //returns sum or double sum if both int are the same
    public int sumDouble(int a, int b) {
        int sum;

        if (a==b) {
            sum = (a+b)*2;
        }
        else {
            sum = a+b;
        }
        return sum;
    }

}
