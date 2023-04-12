package com.common;

import java.util.HashSet;

public class FindTripletSum {
    public static void main(String[] args) {
        /*
             Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
             Output: 12, 3, 9
         */  //o(n2)
        int[] arr = {12, 3, 4, 1, 6, 9};
        int sum = 24;
        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            int curr_sum = sum - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (set.contains(curr_sum - arr[j])) {
                    System.out.print("Triplet is " + arr[i] + ", " + arr[j] + ", " + (curr_sum - arr[j]));
                }
                set.add(arr[j]);
            }
        }


    }
}
