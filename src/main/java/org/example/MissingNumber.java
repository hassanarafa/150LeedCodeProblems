package org.example;

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
            if (i != nums[i])
                return i;
        return nums[nums.length - 1] + 1;
    }

    public static void main(String[] args) {
        int[] x = {3, 0, 1};
        System.out.println(missingNumber(x));
    }
}
