package com.company;

import java.util.stream.IntStream;

public class AsynchJava {
    public static void main(String[] args) {

        new Thread(() -> {
            IntStream.range(0,10).forEach(i->{
                System.out.println(i+":"+Thread.currentThread().getName());
            });
        }).start();
        System.out.println(Thread.currentThread().getName());
    }
}
