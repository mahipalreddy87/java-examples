package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i =0; i<4; i++){
            service.submit(new Task(i));
        }
    }
}
