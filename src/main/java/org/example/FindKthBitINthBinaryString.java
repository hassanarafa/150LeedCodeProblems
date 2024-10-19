package org.example;

public class FindKthBitINthBinaryString {

    public static String invert(String x) {
        StringBuilder y = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '0')
                y.append('1');
            else
                y.append('0');
        }
        return y.toString();
    }

    public static String reverse(String x) {
        StringBuilder sb = new StringBuilder(x);
        return sb.reverse().toString();
    }

    public static char findKthBit(int n, int k) {
        String x = "0";
        for (int i = 1; i < n; i++) {
            x = x + '1' + invert(reverse(x));
        }
        return x.charAt(k - 1);
    }

    public static void main(String[] args) {
        System.out.println(findKthBit(2, 3));
    }

}
