package org.example;

public class ReverseInteger {
    public static int reverse(int x) {
        long result = x - x / 10 * 10;
        x = x / 10;
        while (x != 0) {
            if (result * 10 > 2147483647 || result * 10 < -2147483647)
                return 0;
            result *= 10;
            result += (x - x / 10 * 10);
            x = x / 10;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
