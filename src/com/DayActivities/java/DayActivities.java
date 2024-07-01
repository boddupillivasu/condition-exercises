package com.DayActivities.java;

import java.util.Scanner;

public class DayActivities {
    public static void main(String[] args) {

//        int day;
//        day =1;
        /*
        here we assume the days(day1= monday, day2 = tuesday,day3 = wednesday, day4 =thursday
        day5 = friday,day6= saturday,da7 = sunday)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter  day number:");
        int day = scanner.nextInt();


        switch (day) {
            case 1:
                System.out.println("gym");
                break;

            case 2:
                System.out.println("yoga");
                break;
            case 3:
                System.out.println("swimming");
                break;
            case 4:
                System.out.println("reading");
                break;
            case 5:
                System.out.println("movies");
                break;
            case 6:
                System.out.println("hiking");
                break;
            case 7:
                System.out.println("rest");
                break;
            default:
                System.out.println("the holiday");


        }
    }
}
