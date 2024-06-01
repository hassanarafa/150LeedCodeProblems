package org.example;

public class SingleNumber_AnotherSolution {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) result = result ^ num;
        return result;
    }

    public static void main(String[] args) {
        int[] x = {4, 2, 1, 2, 1};
        System.out.println(singleNumber(x));
    }
}
