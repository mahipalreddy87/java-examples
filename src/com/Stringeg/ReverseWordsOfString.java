package com.Stringeg;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsOfString {
    public static void main(String[] args) {
        String string = "the sky is blue";
        String[] arr = string.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            builder.append(arr[i]).append(" ");
        }
        System.out.println(builder.toString());
    }
}
