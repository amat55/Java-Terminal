package com.company;

public class Task_06 {
    //Udemy challenge :)
    public static void main(String[] args) {

    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)){
            return false;
        }
        return true;
    }
}
