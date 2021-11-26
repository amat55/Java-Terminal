package com.company;
import java.util.Scanner;

public class Task_53 {
    //Udemy Challenge
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write your year of birth:");
        boolean hasNextInt=scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();//handle next line character (Enter key)
            System.out.println("Write your name ");
            String name=scanner.nextLine();
            int age=2021-yearOfBirth;
            if(age >=0 && age<=100){
                System.out.print("Your age is= "+age + " Your name is= "+name);
            }else
                System.out.println("Invalid birth");

        }else {
            System.out.println("Wrong Value please try again");
        }
        scanner.close();
    }

}
