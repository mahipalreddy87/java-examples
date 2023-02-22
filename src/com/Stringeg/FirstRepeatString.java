package com.Stringeg;

import java.util.HashSet;

public class FirstRepeatString {
    public static void main(String[] args) {
        String str = "Hello world"; // expected , l
        System.out.println(extracted(str));
    }

    private static Character extracted(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return str.charAt(i);
                }
            }
        }
        return null;
    }

    // Returns first repeating character in str using hashset
    Character firstRepeating(String str) {
        // Creates an empty hashset
        HashSet<Character> set = new HashSet<>();

        // Traverse the input array from left to right
        for (int i = 0; i < str.length(); i++) {
            Character c = (Character) str.charAt(i);

            // If element is already in hash set, update x
            // and then break
            if (set.contains(c))
                return c;

            else // Else add element to hash set
                set.add(c);
        }

        // If there was no repeated character
        return '\0';
    }
}
