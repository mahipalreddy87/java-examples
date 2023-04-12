package com.common;

import java.util.Arrays;

public class RoatationStrings {
    public static void main(String[] args) {

       String str = "hello,lloeh";
       System.out.println(isStringRotation(str));
    }

    private static boolean isStringRotation(String str) {
        String[] array = str.split(",");
        String str1= array[0];
        String str2= array[1];
        char[] array1=str1.toCharArray();
        char[] array2=str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        if(new String(array1).equals(new String(array2))) return true;
        System.out.println(new String(array1));
        return false;
    }
}
