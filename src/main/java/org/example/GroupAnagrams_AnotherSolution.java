package org.example;

import java.util.*;

public class GroupAnagrams_AnotherSolution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] x = str.toCharArray();
            Arrays.sort(x);
            String string = new String(x);
            if (!map.containsKey(string))
                map.put(string, new ArrayList<>());
            map.get(string).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] name = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(name));
    }
}
