package com.company;
//import java.util.Scanner;
public class FourteenTask {
    public static void main(String[] args) {
        //Scanner imp=new Scanner(System.in);
        //Udemy challenge :)
       printConversion(5);
    }
    public static long toMilesPerHour(double kilometresPerHour){
            return kilometresPerHour < 0 ? -1:Math.round(kilometresPerHour/1.609);
    }
    public static void printConversion(double kilometresPerHour){
        System.out.println(kilometresPerHour<0?"Invalid Value ":kilometresPerHour + toMilesPerHour(kilometresPerHour)+ "mi/h");
    }
}
