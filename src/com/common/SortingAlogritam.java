package com.common;

import java.util.Arrays;

public class SortingAlogritam {
    public static void main(String[] args) {
        int[] array = {20, 30, 10, 40, 5, 66, 99, 88, 77, 65};

        //bubble sort -o(n2)
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] < array[j]) {
                    // swap the postion
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        // quick sort
         int pivot = array[0];
        for (int i =0;i<array.length;i++){
            if(pivot<array[i]){

            }
        }


        // Arrays.sort(array);
        Arrays.stream(array).forEach(System.out::println);
    }
}
