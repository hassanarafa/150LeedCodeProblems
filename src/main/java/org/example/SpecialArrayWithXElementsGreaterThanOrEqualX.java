package org.example;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {
    public static int specialArray(int[] nums) {
        int[] bucket = new int[1001];
        for (int num : nums)
            bucket[num]++;
        int total = nums.length;
        for (int i = 0; i < 1001; i++) {
            if (i == total)
                return i;
            total -= bucket[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] x = {3, 5};
        System.out.println(specialArray(x));
    }
}
