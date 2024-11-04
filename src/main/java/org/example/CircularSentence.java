package org.example;

public class CircularSentence {

    public static boolean isCircularSentence(String sentence) {
        if (!sentence.contains(" ") && sentence.charAt(0) == sentence.charAt(sentence.length() - 1)) {
            return true;
        }
        if (sentence.charAt(0) == sentence.charAt(sentence.length() - 1) && sentence.contains(" ")) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isCircularSentence("a a ab"));
    }
}
