package org.example;

import java.util.Arrays;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == nums[i + 1])
                return true;
        return false;
    }


    public static void main(String[] args) {
        int[] x = {1, 2, 3, 1};
        System.out.println(containsDuplicate(x));
    }
}