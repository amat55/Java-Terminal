package com.company;
import java.util.Scanner;
public class Task_08 {
    public static void main(String[] args) {
     Scanner imp=new Scanner(System.in);
     int i,fact=1;
     int number=imp.nextInt();
     for(i=1;i<=number;i++){
         fact=fact*i;
     }
        System.out.println("Factorial of "+number + " is "+fact);
    }
}
