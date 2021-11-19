package com.company;

import java.util.Scanner;

public class Task_38 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Size, cal;
        int positive = 0, negative = 0;
        sc = new Scanner(System.in);
        System.out.print(" Please write array size : ");
        Size = sc.nextInt();
        int [] ar = new int[Size];
        for (cal = 0; cal < Size; cal++)
        {
            ar[cal] = sc.nextInt();
        }
        for(cal = 0; cal < Size; cal++)
        {
            if(ar[cal] >= 0)
            {
                positive++;
            }
            else
            {
                negative++;
            }
        }
        System.out.println("\n Positive numbers = " + positive);
        System.out.println("\n Negative numbers = " + negative);
    }

}

