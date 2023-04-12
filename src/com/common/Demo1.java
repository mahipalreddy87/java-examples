package com.common;

public class Demo1 {
    public static void main(String[] args) {
        String str = "liril";
        System.out.println(isPalidrom(str));
    }

    private static boolean isPalidrom(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
