package com.company;
import java.util.Scanner;
public class fifthTask {
    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        System.out.println("Please write character");
        double result;
        double valueOfClothes=imp.nextDouble();
        if(valueOfClothes<=1000){
            System.out.println("You will pay "+valueOfClothes);
        }
        else if(valueOfClothes >=1000.1){
            result=(valueOfClothes*5)/100;
            System.out.println("Your earned %5 discound now you will pay= "+ result);

        }
        else if(valueOfClothes>=2000.1){
            result=(valueOfClothes*10)/100;
            System.out.println("Your earned %10 discound now you will pay= "+ result);
        }
        else if(valueOfClothes >=5000.1){
            result=(valueOfClothes*15)/100;
            System.out.println("Your earned %15 discound now you will pay= "+ result);
        }else
            System.out.println("Wrong value please write again");
    }
}
