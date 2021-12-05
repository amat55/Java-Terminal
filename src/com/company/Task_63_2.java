package com.company;

import java.util.Locale;

public class Task_63_2 {

    private int doors;
    private int year;
    private String model;
    private String colour;


    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel == "aventador" || validModel == "urus"){
            this.model = model;
        }else
            System.out.println("Unknown");

    }

    public String getModel() {
        return this.model;
    }
}
