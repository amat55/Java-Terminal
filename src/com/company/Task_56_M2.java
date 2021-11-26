package com.company;

public class Task_56_M2 {
    public static void main(String[] args) {
        Task_56_STD std[] =  new Task_56_STD[2];
        std[0] = new Task_56_STD("Ahmet", "Mete", 100, 2018);
        std[0].fieldOfStudy = "Electronics";
        std[1] = new Task_56_STD("Mesut", "Mete", 101, 2019);
        std[1].fieldOfStudy = "IT";
        int year = std[0].getyearOfStudy(std[0].yearOfEnrollment);
        int year2 = std[0].getyearOfStudy(std[1].yearOfEnrollment);
        System.out.println(year);
        System.out.println(year2);
        std[0].listOfStudents(std);

    }

}
