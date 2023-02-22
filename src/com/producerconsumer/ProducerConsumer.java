package com.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.IntStream;

public class ProducerConsumer {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue(5);
        //producer code
        new Thread(()->{
                while (true){
                    IntStream.range(0,10).forEach(i-> {
                        try {
                            queue.put(i);
                            Thread.sleep(1000);
                            System.out.println("producer values:"+i);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                }

        }).start();

        //consumer code
        new Thread(()->{
            while (true){
                    try {
                        Integer i = queue.take();
                        System.out.println("consumer values:"+i);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }).start();
    }
}
