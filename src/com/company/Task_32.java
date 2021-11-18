package com.company;

import java.util.Scanner;

public class Task_32 {
    private static Scanner inp;
    public static void main(String[] args) {
            String string_value;
            int val_1, val_2 = 0;
            char char_Val;
            inp = new Scanner(System.in);

            System.out.println("Enter string Value=  ");
            string_value = inp.nextLine();

            System.out.println("Enter character=  ");
            char_Val = inp.next().charAt(0);

            for (val_1 = 0; val_1 < string_value.length(); val_1++) {
                if (string_value.charAt(val_1) == char_Val) {
                    val_2++;
                    break;
                }
            }
            if (val_2 == 0) {
                System.out.println("\nThere is no character ");
            } else {
                System.out.format("\nOccurrence of %c at %d position", char_Val, val_1);
            }
        }
    }

