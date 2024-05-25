package org.example;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder y= new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48&&s.charAt(i)<=57))
                y.append(s.charAt(i));
        }
        int p=y.length()-1;
        for (int i=0;i<y.length()/2;i++)
        {
            if(y.charAt(i)!=y.charAt(p))
                return false;
            p--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
