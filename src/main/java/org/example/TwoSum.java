package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (numMap.containsKey(x))
                return new int[]{i, numMap.get(x)};
            numMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] x = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(x, 6)));
    }
}
