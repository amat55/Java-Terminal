package com.company;

public class Task_25 {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }
    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum =10;
        while (number > 0){
            int digit = number % 10;
            sum+=digit;
            number /= 10;
        }
        return sum;
    }
}
