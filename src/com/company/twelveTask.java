package com.company;

import java.util.Scanner;

public class twelveTask {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please indicate the number of rows: ");
        int r = scn.nextInt();
        System.out.println("Please indicate the number of columns: ");
        int c = scn.nextInt();
        createSpiral(r, c);
    }

    public static void createSpiral(int a, int b) {
        int[][] arr = new int[a][b]; // a = row, b = column
        int right = b - 1;
        int left = 0;
        int top = 0;
        int bottom = a - 1;
        int count = 1;
        while (true) {
            if (left > right)
                break;
            //prtop row
            for (int i = left; i < right + 1; i++)
                arr[top][i] = count++;
            top++;
            if (top > bottom)
                break;
            //prright column
            for (int i = top; i < bottom + 1; i++)
                arr[i][right] = count++;
            right--;
            if (left > right)
                break;

            //prbottom row
            for (int i = right; i > left - 1; i--)
                arr[bottom][i] = count++;
            bottom--;
            if (top > bottom)
                break;
            //prleft column
            for (int i = bottom; i > top - 1; i--)
                arr[i][left] = count++;
            left++;

        }
        //print arr
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + "*");

            }
            System.out.println();
        }

    }
}
