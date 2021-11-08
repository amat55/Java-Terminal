package com.company;
import java.util.Scanner;
public class Task_04 {
    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        System.out.print("Please write character: ");
        char fromKeyboard=imp.next().charAt(0);
        switch (fromKeyboard){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Your character is vowel");
                break;
            default:
                System.out.println("Your character is consonant");
        }
    }


}
