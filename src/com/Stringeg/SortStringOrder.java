package com.Stringeg;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class SortStringOrder {
    public static void main(String[] args) {

        String str = "red2 blue5 black4 green1 gold3";
        String[] arr = str.split(" ");
        Map<String, String> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        for (String s : arr) {
            String a = String.valueOf(s.charAt(s.length()-1));
            map.put(a, s);
        }
        IntStream.range(1, 9).forEach(i -> {
            if (map.containsKey(i+""))
                builder.append(" "+map.get(i+""));
        });
        System.out.println(builder.toString());
    }
}
