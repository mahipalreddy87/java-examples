package com.Stringeg;

// Driver program to test above functions

import java.util.*;


class GroupAnagramStrings {
    public static void main(String args[]) {
        // expected [[cat, tac, act], [dog, god]]
        String wordArr[] = {"cat", "dog", "tac", "god", "act"};
        System.out.println(groupAnagrams(wordArr));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();     // For storing result

        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] character = str.toCharArray();
            Arrays.sort(character);
            String sortedString = new String(character);

            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            // map.computeIfAbsent(s, t -> new ArrayList<>()); also can use
            // Now Putting the string into the list that we just created in if-condition
            map.get(sortedString).add(str);
        }
        res.addAll(map.values());
        return res;
    }
}