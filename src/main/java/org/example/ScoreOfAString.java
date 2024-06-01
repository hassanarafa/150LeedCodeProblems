package org.example;

public class ScoreOfAString {
    public static int scoreOfString(String s) {
        int sum = 0;
        for (int i = 1; i < s.length(); i++)
            sum += (Math.abs(s.charAt(i) - s.charAt(i - 1)));
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
        ;
    }
}
