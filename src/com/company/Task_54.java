package com.company;

import java.util.Scanner;

public class Task_54 {
    //Udemy Challenge
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Value is #" + order + " :");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;

            } else {
                System.out.println("Wrong value!");
            }
            scanner.nextLine();
        }
        System.out.println("Sum is= " + sum);
        scanner.close();
    }
}
