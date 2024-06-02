package org.example;

public class ReverseString {
    public static void reverseString(char[] s) {
        int x = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[x];
            s[x] = temp;
            x--;
        }
    }

    public static void main(String[] args) {
        char[] x = {'h', 'e', 'l', 'l', 'o'};
        reverseString(x);
        System.out.println(new String(x));
    }
}
