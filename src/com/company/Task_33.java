package com.company;

import java.util.Scanner;

public class Task_33 {
    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        String sval1;
        int ival2;
        System.out.println("Enter your String:");
        sval1=imp.nextLine();
        for(ival2=0;ival2<sval1.length();ival2++)
        {
            System.out.print(sval1.charAt(ival2));
            System.out.print(sval1.charAt(ival2));
        }
    }

}
