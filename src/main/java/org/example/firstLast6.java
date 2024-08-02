package org.example;

public class firstLast6 {
    public boolean firstLast6(int[] nums) {
        // Check if the array length is at least 1 and if 6 is at either the first or last position
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
