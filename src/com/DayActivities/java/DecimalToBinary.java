package com.DayActivities.java;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        // enter a decimal number
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a decimal number:");
        // here we can take decimal number from user
        int decimalNumber = scanner.nextInt();

        /* to convert decimal to binary by using this method
        in this method the string representing binary format of the decimal number
         */
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("the binary representation is:" + binaryNumber + ",to the decimal number of" + decimalNumber);
        scanner.close();

    }
}
