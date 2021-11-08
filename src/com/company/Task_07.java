package com.company;

public class Task_07 {
    public static void main(String[] args) {

    }
    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9_999) return false;

        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
