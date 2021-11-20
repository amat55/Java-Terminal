package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task_44 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please specify how many elements will be in the array: ");
        int size = scn.nextInt();
        int [] arr = new int[size];
        System.out.println("Please enter elements of the array (put a space between two elements): ");
        for (int i = 0; i < size; i++)
            arr[i] = scn.nextInt();
        System.out.println("Elements of the array: " + Arrays.toString(arr));
        IntStream.rangeClosed(0,size - 1)
                .mapToObj(i -> i % 2 == 0 ? ("index number (even): " + i + ", value: " + arr[i]) : ("index number (odd): " + i + ", value: " + arr[i]))
                .forEach(System.out::println);
    }

}
