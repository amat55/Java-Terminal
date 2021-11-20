package com.company;

import java.util.Scanner;

public class Task_41 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int []array;
        int []even;
        int []odd;
        odd=new int[5];
        array=new int[5];
        even=new int[5];
        System.out.println("Please write 5 numbers:");
        for(int i=0;i<5;i++)
        {
            array[i]=inp.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            if(array[i]%2==0)
                even[i]=array[i];
            else
                odd[i]=array[i];
        }
        System.out.println("The odd numbers:");
        for(int i=0;i<5;i++)
        {
            if(odd[i]!=0)
                System.out.println(odd[i]);
        }
        System.out.println("The even numbers:");
        for(int i=0;i<5;i++)
        {
            if(even[i]!=0)
                System.out.println(even[i]);
        }
    }
}
