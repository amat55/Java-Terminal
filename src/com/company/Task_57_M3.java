package com.company;

import java.util.Scanner;

public class Task_57_M3 {
    public static void main(String[] args) {
        Task_57_SUB sbj = new Task_57_SUB();
        sbj.printSubjects();

        Task_57_SUB sbj2 = new Task_57_SUB("Computer");
        sbj2.printSubjects();

        Task_57_SUB sbj3 = new Task_57_SUB("Science");
        sbj3.printSubjects();

        Scanner scn = new Scanner(System.in);

        Task_57_SUB sbj4 = new Task_57_SUB(scn.nextLine());
        sbj4.printSubjects();
    }

}
