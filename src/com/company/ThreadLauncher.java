package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThreadLauncher {

    public static void main(String args[]) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        IntStream.range(0, 10).forEach(i -> service.submit(new Task(i)));
    }
}

class Task implements Runnable {
    private static int taskId;

    public Task(int id) {
        this.taskId = id;
    }

    static {
        new Thread(() -> {
            System.out.println("inside Task ID : " + taskId + " performed by "
                    + Thread.currentThread().getName());
        }).start();
    }


    private static void runTask() {
    }

    @Override
    public void run() {
        System.out.println("Task ID : " + this.taskId + " performed by "
                + Thread.currentThread().getName());

    }
}