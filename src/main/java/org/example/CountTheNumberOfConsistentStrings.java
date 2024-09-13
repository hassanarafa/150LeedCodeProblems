package org.example;

import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            Set<Character> x = new HashSet<>();
            for (char c : word.toCharArray()) {
                x.add(c);
            }
            StringBuilder result = new StringBuilder();
            for (Character a : x) {
                result.append(a);
            }
            int total = 0;
            for (Character b : word.toCharArray()) {
                if (allowed.contains(b.toString())) {
                    total++;
                }
            }
            if (total == word.length()) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] x = { "a", "b", "c", "ab", "ac", "bc", "abc" };
        System.out.println(countConsistentStrings("abc", x));
    }
}
