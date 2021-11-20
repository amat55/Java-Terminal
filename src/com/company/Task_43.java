package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task_43 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please specify how many elements will be in the array: ");
        int size = scn.nextInt();
        int [] arr = new int[size];
        System.out.println("Please enter elements of the array (put a space between two elements): ");
        for (int i = 0; i < size; i++)
            arr[i] = scn.nextInt();
        System.out.println("Elements of the array: " + Arrays.toString(arr));
        int odd = size % 2 == 0 ? (size / 2) : ((size - 1) / 2);
        int even = size % 2 == 0 ? (size / 2) : ((size + 1) / 2);
        int [] oddElements = new int[odd];
        int [] evenElements = new int[even];
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < size; i++)
            if (i % 2 == 0)
                evenElements[countEven++] = arr[i];
            else
                oddElements[countOdd++] = arr[i];
        System.out.println("Elements which has odd index starting from 1 (+2 ): " + Arrays.toString(oddElements));
        System.out.println("Elements which has even index starting from 0 (+2 ): " + Arrays.toString(evenElements));

    }

}
