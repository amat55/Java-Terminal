package com.company;
import java.util.Scanner;
public class sixthTask {
    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        int n=5,j=0,evensum=0;
        int negSum=0;
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[j]=imp.nextInt();
            j++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                negSum=negSum+a[i];
            }
            else if(a[i]%2==0){
                evensum=evensum+a[i];
            }
        }
        System.out.println("EvenNumbers Sum: "+evensum);
        System.out.println("NegativeNumbers Sum: "+negSum);
    }
}
