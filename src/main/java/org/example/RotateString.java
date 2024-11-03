package org.example;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        if (s.equals(goal)) {
            return true;
        }
        if (s.length() == goal.length()) {
            int y = 0;
            StringBuilder x = new StringBuilder();
            do {
                x.append(goal.charAt(y));
                y++;
            } while (s.contains(x.toString() + goal.charAt(y)));
            return s.equals(goal.substring(y) + x);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "abcde"));
    }
}

