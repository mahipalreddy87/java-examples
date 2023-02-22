package com.test;

import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        int a=1111111;
        checkRepeatNumber(a);
    }
// loop
    private static boolean checkRepeatNumber(int a) {
        int rem=a%10;
        while (a!=0){
            int rem1 = a%10;
             a = a/10;

            if(rem1 !=rem) return false;
        }

        return true;
    }
}
