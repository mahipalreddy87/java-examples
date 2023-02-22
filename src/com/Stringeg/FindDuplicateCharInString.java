package com.Stringeg;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateCharInString {
    public static void main(String[] args) {
        String str = "Hello world";
        //  System.out.println(findDuplicates(str));
        //System.out.println(findDuplicatesWithLessComplexity(str));
        System.out.println(findDuplicatesCollection(str));

    }

    private static Set<Character> findDuplicatesCollection(String str) {
        Set<Character> characterSet = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) { // o(n)
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);  // o(logn)  total = o(nlogn)
            } else
                map.put(str.charAt(i), 1);
        }
        map.entrySet().stream().forEach(i -> {
            if (i.getValue() > 1) characterSet.add(i.getKey());
        });

        return characterSet;
    }

    private static Set<Character> findDuplicates(String str) {
        // compare with character
       /* Set<Character> characterSet = new HashSet<>();
        char[] arr =str.toCharArray();
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    characterSet.add(arr[j]);
            }
        }*/

        // compare with character ASCI
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {  //o(n)
            for (int j = i + 1; j < str.length(); j++) { //O(n)
                if (str.charAt(i) == str.charAt(j))
                    characterSet.add(str.charAt(j));
            }
        }

        return characterSet;
    }

    private static Set<Character> findDuplicatesWithLessComplexity(String str) {

        // compare with character ASCI
        Set<Character> characterSet = new HashSet<>();
        int a[] = new int[256];
        for (int i = 0; i < str.length(); i++) {  //o(n)
            a[str.charAt(0)] = a[str.charAt(0)] + 1;
        }
        for (int i = 0; i < 256; i++) {  //o(n)
            if (a[i] > 1) characterSet.add((char) i);
        }
        // o(n)+o(n)= o(2n)=> o(n)

        return characterSet;
    }
}
