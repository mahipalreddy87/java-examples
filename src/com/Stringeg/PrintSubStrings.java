package com.Stringeg;

import java.util.Collections;

public class PrintSubStrings {
    public static void main(String[] args) {

        String s = "geeks";
        char[] array = s.toCharArray();

        subString(array, array.length);
    }

    // Function to print all sub strings
    static void subString(char str[], int numLength) {
        // Pick starting point
        for (int a = 1; a <= numLength; a++) {
            // Pick ending point
            for (int i = 0; i <= numLength - a; i++) {
                //  Print characters from current
                // starting point to current ending
                // point.
                int j = i + a - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(str[k]);
                }

                System.out.println();
            }
        }
    }

}
