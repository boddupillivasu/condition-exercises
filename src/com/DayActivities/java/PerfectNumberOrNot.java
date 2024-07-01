package com.DayActivities.java;

import java.util.Scanner;

public class PerfectNumberOrNot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // here we can take the input from the user
        System.out.println("enter  any number:");
        int number = scanner.nextInt();

        // method calling here
        if (isPerfectNumber(number)){
            System.out.println(number + ":this is a perfect number");

        }else {
            System.out.println(number + ":this is not a perfect number");
        }
        scanner.close();
    }
        public static boolean isPerfectNumber ( int number){
            if(number <1 ){
                return false;
            }
            int sum;
            sum =0 ;

            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0){
                    sum += i;
            }
        }
        return sum == number;
    }

    }
