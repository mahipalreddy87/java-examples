package com.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        // producer
        new Thread(() -> {
            IntStream.range(0,9).forEach(i-> {
                try {
                    Thread.currentThread().setName("Producer Thread");
                    queue.put(i);
                    System.out.println("producer added item:"+i+" by:"+Thread.currentThread().getName());
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }).start();

        new Thread(() -> {
                try {
                    Integer i=  queue.peek();
                    System.out.println("consumer consumed the item:"+i+" by:"+Thread.currentThread().getName());
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }).start();
    }
}
