package org.example;

public class maxEnd3 {
    public int[] maxEnd3(int[] nums) {
        // Determine the larger value between the first and last elements
        int max = Math.max(nums[0], nums[nums.length - 1]);

        // Create a new array where all elements are set to the maximum value
        return new int[]{max, max, max};
    }
}
