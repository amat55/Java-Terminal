package com.company;
import java.util.Scanner;
public class Task_15 {
    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        int integer,odd=0,even=0;
        System.out.println("Enter the integers ");
        for(int i=0;i<5;i++){
            integer=imp.nextInt();
            if(integer%2==0){
                even+=integer;
            }
            else{
                odd+=integer;
            }
        }
        System.out.print("Sum of even numbers: "+even);
        System.out.println("Sum of odd numbers: "+odd);
    }
}
