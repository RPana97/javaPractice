package org.example;

public class reverse3 {
    public int[] reverse3(int[] nums) {
        // Create a new array for the reversed result
        int[] result = new int[3];

        // Assign the elements in reverse order
        result[0] = nums[2]; // Last element of the original array becomes the first
        result[1] = nums[1]; // Middle element remains in the same position
        result[2] = nums[0]; // First element of the original array becomes the last

        return result;
    }
}
