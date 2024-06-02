package org.example;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int x = 0, y = height.length - 1, sum = Math.min(height[x], height[y]) * (y - x);
        while (x < y) {
            sum = Math.max(sum, (Math.min(height[x], height[y]) * (y - x)));
            if (height[x] > height[y])
                y--;
            else
                x++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] x = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(x));
    }
}
