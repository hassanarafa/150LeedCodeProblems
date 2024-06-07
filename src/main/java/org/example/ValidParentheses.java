package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ValidParentheses {
    public static boolean isValid(String s) {
        List<String> list = new ArrayList<>();
        boolean condition = false;
        for (int i = 0; i < s.length(); i++) {
            list.add(String.valueOf(s.charAt(i)));
        }
        while (list.size() >= 2) {
            String y = String.join("", list);
            if (y.contains("()")) {
                condition = true;
                int x = y.indexOf("()");
                list.remove(x);
                list.remove(x);
            }
            y = String.join("", list);
            if (y.contains("{}")) {
                condition = true;
                int x = y.indexOf("{}");
                list.remove(x);
                list.remove(x);
            }
            y = String.join("", list);
            if (y.contains("[]")) {
                condition = true;
                int x = y.indexOf("[]");
                list.remove(x);
                list.remove(x);
            }
            if (!condition)
                break;
            condition = false;
        }
        if (Objects.equals(String.valueOf(list), "()") || Objects.equals(String.valueOf(list), "{}") || Objects.equals(String.valueOf(list), "[]"))
            list.clear();
        return list.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}}{"));
    }
}
