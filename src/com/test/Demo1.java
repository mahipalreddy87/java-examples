package com.test;

import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        int a=11111112;
        System.out.println(checkRepeatNumber(a));

    }
// loop
    private static boolean checkRepeatNumber(int a) {
        int r =a%10;
        while (a!=0){
            int rem =a%10;
            a=a/10;
            if(rem!=r)return false;
        }


        return true;
    }
}
