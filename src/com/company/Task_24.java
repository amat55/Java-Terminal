package com.company;
import java.util.Arrays;
import java.util.Collections;

public class Task_24 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3, 5, 7, 4, 8};
        int max = Collections.max(Arrays.asList(arr));
        System.out.println("Maximum: " + max);

        for (int i = max; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(" " + (j + 1) + " ");
        }
    }

}
