package com.company;

public class Task_56_STD {
    String name;
    String surName;
    String fieldOfStudy;
    int ID;
    int yearOfEnrollment;

    public Task_56_STD(String name, String surName, int ID, int yearOfEnrollment) {
        this.name = name;
        this.surName = surName;
        this.ID = ID;
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public int getyearOfStudy(int yearOfEnrollment) {
        return yearOfEnrollment;
    }
    public void listOfStudents(Task_56_STD [] std){
        for (int i = 0; i < std.length; i++){
            System.out.println("Name: " + std[i].name + "  ID: " + std[i].ID +
                    "  Field Of Study: " + std[i].fieldOfStudy);
        }

    }
}
