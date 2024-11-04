package org.example;

public class StringCompressionIII {

    public static String compressedString(String word) {
        StringBuilder result = new StringBuilder();
        int counter = 1;
        char x = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == x && counter < 9) {
                counter++;
            } else {
                result.append(counter).append(x);
                counter = 1;
                x = word.charAt(i);
            }
        }
        result.append(counter).append(x);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressedString("aaaaaaaaaa"));
    }
}
