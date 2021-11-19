package com.company;

import java.util.Scanner;

public class Task_39 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int length=5;
        int arry[]=new int[length];
        System.out.println("Please write numbers 5 times: ");
        for(int i=0;i<length;i++)
        {
            arry[i]=inp.nextInt();
        }
        System.out.println("Even Numbers is = ");
        for(int i=0;i<length;i++)
        {
            if(arry[i]%2==0)
            {
                System.out.println(arry[i]+" ");
            }
        }
        System.out.println("Odd Numbers is = ");
        for(int i=0;i<length;i++)
        {
            if(arry[i]%2!=0)
            {
                System.out.print(arry[i]+" ");
            }
        }
    }
}
