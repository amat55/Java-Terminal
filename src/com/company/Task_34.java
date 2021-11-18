package com.company;

import java.util.Scanner;

public class Task_34 {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.println("Please write your name:");
        String str = imp.nextLine();
        int ival = str.length();
        System.out.print(str.charAt(0) + " ");
        for (int i = 1; i < ival; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                char cval = str.charAt(i + 1);
                System.out.print(cval + " ");
            }
        }
    }
}
