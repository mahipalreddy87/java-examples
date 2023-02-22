package com.ForkJoinPool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Test {
    public static void main(String[] args) {
        // search array and find the element occurences
        int a[] = {1, 2, 3, 3, 4, 5, 5, 6, 5, 7, 8, 9, 5, 3, 4, 5, 6, 7, 4};
        int searchElement = 6;
        ForkJoinPool pool = ForkJoinPool.commonPool();
        DemoTask task = new DemoTask(a, 0, a.length - 1, searchElement);
        int count = pool.invoke(task);
        System.out.printf("%d search element fount count %d", searchElement, count);
    }

}

class SearchTask extends RecursiveTask<Integer> {
    private int element;
    private int startLen;
    private int endingLen;
    private int[] arr;

    public SearchTask(int element, int start, int ending, int[] a) {
        this.element = element;
        this.startLen = start;
        this.endingLen = ending;
        this.arr = a;
    }

    @Override
    protected Integer compute() {
        if (arr.length > 3) {
            int mid = (startLen + endingLen) / 2;
            System.out.println("current thread" + Thread.currentThread());
            SearchTask t1 = new SearchTask(element, startLen, mid, arr);
            SearchTask t2 = new SearchTask(element, mid + 1, endingLen, arr);
            t1.fork();
            t2.fork();
            return t1.join() + t2.join();
        } else
            return searchElementCount(element, arr);
    }

    private static int searchElementCount(int searchElement, int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == searchElement) count++;
        }
        return count;
    }
}
