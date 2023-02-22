package com.common;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int searchElement = 30;
        int end = arr.length - 1;
        binarySearch(arr, 0, end, searchElement);
    }

    public static void binarySearch(int arr[], int first, int end, int searchElement) {
        int mid = (first + end) / 2;
        //while loop beacue need to seach each element till end
        while (first <= end) {
            if (arr[mid] < searchElement) {
                first = mid + 1;
            } else if (arr[mid] == searchElement) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                end = mid - 1;
            }
            mid = (first + end) / 2;
        }
        if (first > end) {
            System.out.println("Element is not found!");
        }
    }
}