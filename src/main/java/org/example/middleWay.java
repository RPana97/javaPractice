package org.example;

public class middleWay {
    public int[] middleWay(int[] a, int[] b) {
        // finds the middle elements from both arrays
        int[] result = new int[2];
        result[0] = a[1]; // Middle of the first array
        result[1] = b[1]; // Middle of the second array

        return result;
    }

}
