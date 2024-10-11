package org.example;

public class MinimumStringLengthAfterRemovingSubstrings {
    public static int minLength(String s) {
        while (true) {
            boolean condition = true;
            for (int i = 0; i < s.length() - 1; i++) {
                if ((s.charAt(i) == 'A' && s.charAt(i + 1) == 'B') || (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D')) {
                    s = s.substring(0, i) + s.substring(i + 2);
                    condition = false;
                }
            }
            if (condition)
                break;
        }
        return s.length();
    }

    public static void main(String[] args) {
        String x = "ACBBD";
        System.out.println(minLength(x));
    }
}
