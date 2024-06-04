package org.example;

import java.util.*;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        if (s.length() == 1)
            return 1;
        char[] x = s.toCharArray();
        Arrays.sort(x);
        List<Integer> list = new ArrayList<>();
        int count = 1, sum = 0;
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] != x[i + 1] && i == x.length - 2) {
                list.add(count);
                list.add(1);
            } else if (x[i] == x[i + 1] && i == x.length - 2) {
                count++;
                list.add(count);
            } else if (x[i] != x[i + 1]) {
                list.add(count);
                count = 1;
            } else
                count++;
        }
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                sum += list.get(i);
            else
                odd.add(list.get(i));
        }
        Collections.sort(odd);
        if(!odd.isEmpty())
            sum += odd.getLast();
        for (int i = 0; i < odd.size() - 1; i++)
            sum += (odd.get(i) - 1);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));
    }
}

