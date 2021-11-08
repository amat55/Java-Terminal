package com.company;
import java.util.Scanner;
public class Task_10 {
    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        System.out.println("Please write a number: ");
        int firstNum=imp.nextInt();
        System.out.println("Please write b number");
        int secondNum= imp.nextInt();
        for (int i=firstNum; i<=secondNum;i++){
            System.out.println(i);
        }

    }
}
