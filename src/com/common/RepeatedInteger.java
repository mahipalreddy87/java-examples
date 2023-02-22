package com.common;

public class RepeatedInteger {
    public static void main(String[] args) {

        int N = 22222222;
        System.out.println(checkSameDigits(N));
    }

    // Function to check if all the digits
    // in the number N is the same or not
    public static String checkSameDigits(int N)
    {
        // Find the last digit
        int digit = N % 10;

        while (N != 0) {

            // Find the current last digit
            int current_digit = N % 10;

            // Update the value of N
            N = N / 10;

            // If there exists any distinct
            // digit, then return No
            if (current_digit != digit) {
                return "No";
            }
        }

        // Otherwise, return Yes
        return "Yes";
    }

}
