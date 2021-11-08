package com.company;
import java.util.Scanner;
public class Task_02 {
    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        int firstNum,secondNum,thirdNum;
        System.out.println("Please write two digit number");
        firstNum=imp.nextInt();
        if(firstNum>=10 && firstNum <=99){
            secondNum=firstNum/10;
            thirdNum=firstNum%10;
            if(secondNum+thirdNum+secondNum*thirdNum==firstNum){
                System.out.println();
            }
            else{
                System.out.println("Your number is two digit number");
            }

        }
        else{
            System.out.println("Your number isn't two digit number");
        }
    }
}

