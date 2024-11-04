package org.example;

public class DeleteCharactersToMakeFancyString {

    public static String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        boolean condition = false;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                if (!condition) {
                    result.append(s.charAt(i));
                    condition = true;
                }
            } else {
                condition = false;
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeFancyString("aaabaaaa"));
    }
}
