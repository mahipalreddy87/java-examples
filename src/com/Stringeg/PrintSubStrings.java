package com.Stringeg;

import java.util.Collections;

public class PrintSubStrings {
    public static void main(String[] args) {

        String s = "geeks";
        char[] array = s.toCharArray();

        subString(array, array.length);
    }

    // Function to print all sub strings
    static void subString(char str[], int n) {
        // Pick starting point
        for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                //  Print characters from current
                // starting point to current ending
                // point.
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(str[k]);
                }

                System.out.println();
            }
        }
    }

}
