package com.company;
import java.util.Scanner;
public class Task_19 {
    public static void main(String[] args) {
        //Udemy Challenge
        Scanner imp=new Scanner(System.in);
        char keyboardValue=imp.next().charAt(0);
        System.out.println("Please enter character");
        switch (keyboardValue){
            case 'a': case'b': case'c': case'e':
                System.out.println("Was Found");
            default:
                System.out.println("Was Not Found");
                break;
        }

    }
}
