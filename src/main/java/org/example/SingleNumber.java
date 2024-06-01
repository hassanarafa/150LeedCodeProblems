package org.example;

import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i++)
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
                return nums[i];
        return (nums[0] != nums[1] ? nums[0] : nums[nums.length - 1]);
    }

    public static void main(String[] args) {
        int[] x = {2, 1, 2};
        System.out.println(singleNumber(x));
    }
}
