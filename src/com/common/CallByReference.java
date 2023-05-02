package com.common;

public class CallByReference {
    int a ;
    public static void main(String[] args) {
        CallByReference c= new CallByReference();
        c.a=10;
        modifyobj(c);
        System.out.println(c.a);
    }
/*
if you pass the reference then original object will copy will modify.
 */
    private static void modifyobj(CallByReference c) {
        c.a=20;
    }
}
