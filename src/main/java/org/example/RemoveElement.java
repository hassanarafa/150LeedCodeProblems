package org.example;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0, n = nums.length - 1;
        for (int i = 0; i < n + 1; i++) {
            if (nums[i] == val) {
                nums[i] = nums[n];
                nums[n] = 0;
                count++;
                n--;
            }
            if (nums[i] == val)
                i--;
        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        int[] x = {3, 2, 2, 3};
        System.out.println(removeElement(x, 3));
    }
}
