package org.example;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int i = 0, j = 1, max = 0;
        while (j < prices.length) {
            if (prices[i] > prices[j]) {
                i = j;
                j++;
            } else {
                max = Math.max(max, (prices[j] - prices[i]));
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] x = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(x));
    }
}
