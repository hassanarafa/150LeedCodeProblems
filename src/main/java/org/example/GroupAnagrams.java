package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        for (String str : strs) {
            list1.add(str);
            char[] x = str.toCharArray();
            Arrays.sort(x);
            list.add(new String(x));
        }
        List<List<String>> result =new ArrayList<>();
        while (!list1.isEmpty())
        {
            List<String>y=new ArrayList<>();
            y.add(list1.getFirst());
            for(int i=1;i<list.size();i++)
            {
                if(Objects.equals(list.get(i), list.getFirst()))
                {
                    System.out.println(i);
                    y.add(list1.get(i));
                    list.remove(i);
                    list1.remove(i);
                    i--;
                }
            }
            list.removeFirst();
            list1.removeFirst();
            result.add(y);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] x = {"", "", ""};
        System.out.println(groupAnagrams(x));
    }
}
