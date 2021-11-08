package com.company;

public class Task_14 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n){
        // allocating memory to array
        int fibonacci[] = new int[n+2]; //1 extra to handle case, n = 0
        int i;

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (i = 2 ; i <= n; i++){
            /* Add the previous 2 numbers in the series and store it*/
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (i = 0; i < fibonacci.length; i++){
            System.out.println(fibonacci[i]);
        }
        return fibonacci[n];
    }

}
