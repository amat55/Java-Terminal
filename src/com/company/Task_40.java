package com.company;

import java.util.Scanner;

public class Task_40 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int r= inp.nextInt();
        int c=inp.nextInt();
        int [][]a=new int[r][c];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]= inp.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j =0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
