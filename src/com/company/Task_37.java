package com.company;

import java.util.Scanner;
//Task 5 Still thinking about that
public class Task_37 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int inp= scan.nextInt();
        int a[]= new int[inp];
        System.out.println("Odd Numbers:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
}

