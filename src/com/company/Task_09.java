package com.company;
import java.util.Scanner;
public class Task_09 {
    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        System.out.println("Please write Positive number");
        int value1=imp.nextInt();
        if(value1%10==0){
            System.out.println("Your number can dived by 10 "+value1);

        }
        else{
            System.out.println("Your number can not dived by 10 "+value1);
        }
    }
}
