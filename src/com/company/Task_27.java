package com.company;

public class Task_27 {
    //Udemy Challenge
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number<0){
            return -1;
        }
        else if(number==0){
            return 0;
        }
        else{
            int lastDigit=number%10;
            while(number>=10){
                number=number/10;
            }
            int firstDigit=number;
            return (lastDigit+firstDigit);
        }
    }


}
