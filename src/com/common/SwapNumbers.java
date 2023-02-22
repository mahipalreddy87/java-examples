package com.common;

public class SwapNumbers {
    public static void main(String[] args) {
        // swap number with out using third variable.
        int a = 10;
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println( a);
        System.out.println( b);

    }
}
