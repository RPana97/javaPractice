package org.example;

public class makeEnds {
    public int[] makeEnds(int[] nums) {
        // Create a new array of length 2
        int[] result = new int[2];

        // Set the first element to the first element of the input array
        result[0] = nums[0];
        // Set the second element to the last element of the input array
        result[1] = nums[nums.length - 1];

        return result;
    }
}
