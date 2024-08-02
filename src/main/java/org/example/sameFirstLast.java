package org.example;

public class sameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        // Check if the array length is at least 1 and if the first element is equal to the last element
        return nums.length > 0 && nums[0] == nums[nums.length - 1];

    }

}
