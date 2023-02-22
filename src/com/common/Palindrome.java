package com.common;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("aaabaa"));
    }

    private static boolean palindrome(String s) {
        int len = s.length();
        boolean flag=true;
        for (int i = 0; i < len / 2; i++) {
            if(s.charAt(i)!=s.charAt(len-i-1)){
                flag =false;
                break;
            }
        }
        return flag;
    }
}
