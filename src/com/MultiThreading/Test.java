package com.MultiThreading;

public class Test {
    public static void main(String[] args) {

        new Thread(()->{
           System.out.println("sub thread");
        }).start();
        System.out.println("main thread");
    }
}
