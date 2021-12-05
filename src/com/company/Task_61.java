package com.company;

import java.util.Scanner;

public class Task_61 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / count));
        scanner.close();
    }
}
