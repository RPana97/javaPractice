package org.example;

public class rotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        // Create a new array for the rotated result
        int[] result = new int[3];

        // Rotate the elements to the left
        result[0] = nums[1]; // The second element becomes the first
        result[1] = nums[2]; // The third element becomes the second
        result[2] = nums[0]; // The first element becomes the third

        return result;
    }
}
