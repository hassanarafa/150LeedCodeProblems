package org.example;

public class AppendCharactersToStringToMakeSubsequence {
    public static int appendCharacters(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j))
                j++;
            i++;
        }
        return t.length() - j;
    }

    public static void main(String[] args) {
        System.out.println(appendCharacters("vrykt", "rkge"));
    }
}
