package com.company;

public class Task_36 {
    public static void main(String[] args) {
            int arr[] = new int[]{12,56,76,89,100,343,21,234};
            int smallest = arr[0];
            int largest = arr[0];
            int indexL=0,indexS=0;
                for(int i=1; i< arr.length; i++)
                {
                    if(arr[i] > largest) {
                        largest = arr[i];
                        indexL = i;
                    }
                    if (arr[i] < smallest){
                        smallest = arr[i];
                        indexS=i;
                    }
                }
            System.out.println("Smallest Number is : " + smallest +" Index number is= " +indexS );
            System.out.println("Largest Number is : " + largest + " Index number is= "+ indexL);

    }
}
