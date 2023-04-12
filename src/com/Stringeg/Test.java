package com.Stringeg;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // expected [[cat, tac, act], [dog, god]]
        String wordArr[] = {"cat", "dog", "tac", "god", "act"};
        System.out.println(groupAnagrams(wordArr));
    }

    private static List<List<String>> groupAnagrams(String[] wordArr) {

        // iterate the array
        // sort the string and keep in map as key
        // if map contain key add value in list
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < wordArr.length; i++) {
            char[] charArray = wordArr[i].toCharArray();
            Arrays.sort(charArray);
            map.putIfAbsent(new String(charArray),new ArrayList<String>());
            map.get(charArray).add(wordArr[i]);
        }
        return new ArrayList<>(map.values());
    }
}
