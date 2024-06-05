package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FindCommonCharacters {

    public static int getRepeat(String[] a, char x) {
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i].contains(String.valueOf(x)))
                count++;
        }
        return count;
    }

    public static int getMin(String[] a, char x) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a[i].length(); j++) {
                if (a[i].charAt(j) == x)
                    count++;
            }
            min = Math.min(min, count);
        }
        return min;
    }

    public static List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        char[] arr = words[0].toCharArray();
        Arrays.sort(arr);
        words[0] = String.valueOf(arr);
        System.out.println(words[0]);
        for (int i = 0; i < words[0].length(); i++) {
            while (i < words[0].length() - 1 && Objects.equals(words[0].charAt(i), words[0].charAt(i + 1))) {
                i++;
            }
            if (getRepeat(words, words[0].charAt(i)) == words.length - 1) {
                int count = getMin(words, words[0].charAt(i));
                for (int j = 0; j < count; j++) {
                    list.add(String.valueOf(words[0].charAt(i)));
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] x = {"bbddabab", "cbcddbdd", "bbcadcab", "dabcacad", "cddcacbc", "ccbdbcba", "cbddaccc", "accdcdbb"};
        System.out.println(commonChars(x));
    }
}
