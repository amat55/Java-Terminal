package com.company;

public class Task_13 {
    //Udemy challenge :)
    public static void main(String[] args) {
    printMegaBytesAndKiloBytes(5);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else{

            System.out.println(kiloBytes + "KB =" + (kiloBytes/1024) + " MB " + (kiloBytes%1024) + " KB " );
        }
    }
}
