package com.MultiThreading;

import java.util.Collections;
import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<String> f1 = executorService.submit(new PrintTask("TASK1"));

        Future<String> f2 = executorService.submit(new PrintTask("TASK2"));

        System.out.println(f1.get());

        System.out.println(f2.get());

        executorService.shutdown();
     
    }
}

class PrintTask implements Callable {
    String string;

    public PrintTask(String string) {
        this.string = string;
    }


    @Override
    public Object call() throws Exception {
        return string + " printing message from TASK";
    }
}