package com.StremAPI.interview;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatWordCount {
    public static void main(String[] args) {
        // dispaly repated words/ number count in map
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 3, 3, 5, 7, 6, 9);
        List<String> list1 = Arrays.asList("abc", "abc", "def", "uuu", "opo");

        Map<Integer, Long> m = list.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        m.forEach((k, v) -> System.out.println("key:" + k + "count:" + v));

        Map<String, Long> m1 = list1.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        m1.forEach((k, v) -> System.out.println("key:" + k + "count:" + v));

        //without streams

        Map<String, Integer> map = new HashMap<>();
        int count = 1;
        for (String s : list1) {
            if (map.containsKey(s)) {
                count++;
                map.put(s, count);
            } else
                map.put(s, 1);
        }
        System.out.println(map);

    }
}
