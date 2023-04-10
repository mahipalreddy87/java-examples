package com.ForkJoinPool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;


public class ForkJoinPoolDemo {
    public static void main(String[] args) {
        // search array and find the element occurences
        int a[] = {1, 2, 3, 3, 4, 5, 5, 5, 7, 8, 9, 5, 3, 4, 5, 6, 7, 4};
        int searchElement = 6;
        ForkJoinPool pool = ForkJoinPool.commonPool();
        DemoTask task = new DemoTask(a, 0, a.length - 1, searchElement);
        int count = pool.invoke(task);
        System.out.printf("%d search element fount count %d", searchElement, count);
    }
}

class DemoTask extends RecursiveTask<Integer> {
    private int[] arr;
    private int s, l;
    private int searchElement;

    DemoTask(int[] arr, int s, int l, int searchElement) {
        this.arr = arr;
        this.s = s;
        this.l = l;
        this.searchElement = searchElement;
    }

    @Override
    protected Integer compute() {
        System.out.println(Thread.currentThread());
        int size = l - s + 1;
        int mid = (s + l) / 2;
        if (size > 3) {
            DemoTask task1 = new DemoTask(arr, s, mid, searchElement);
            DemoTask task2 = new DemoTask(arr, mid+1, l, searchElement);
            task1.fork();
            task2.fork();
            int result = task1.join() + task2.join();
            return result;
        } else {
            return processSearch();
        }
    }

    private Integer processSearch() {
        int count = 0;
        for (Integer i : arr) {
            if (i == searchElement) count++;
        }
        return count;
    }
}
