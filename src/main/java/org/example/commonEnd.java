package org.example;

public class commonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        // Check if the first element or the last element of both arrays are the same
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }
}
