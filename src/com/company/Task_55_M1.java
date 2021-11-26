package com.company;

import java.util.Scanner;

public class Task_55_M1 {
    public static void main(String[] args) {
        Task_55_CVT con = new Task_55_CVT();
        Scanner scn = new Scanner(System.in);

        double result = con.centimeterToInch(scn.nextDouble());
        System.out.println(result);

        double result2 = con.inchToCentimeter(scn.nextDouble());
        System.out.println(result2);

        double result3 = con.meterToYards(scn.nextDouble());
        System.out.println(result3);

        double result4 = con.yardsToMeter(scn.nextDouble());
        System.out.println(result4);

        double result5 = con.celsiusToFahrenheit(scn.nextDouble());
        System.out.println(result5);

        double result6 = con.fahrenheitToCelsius(scn.nextDouble());
        System.out.println(result6);

    }

}
