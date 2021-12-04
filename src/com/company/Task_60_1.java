package com.company;

public class Task_60_1 {
    public static void main(String[] args) {
        Task_60_3 Ahmet = new Task_60_3(5000);
        Task_60_2 ahmetS = new Task_60_2(1000, 0.75);
        Task_60_4 x = new Task_60_4(800, 1000);
        Ahmet.deposit(500);
        System.out.println(Ahmet.getBalance());
        Ahmet.withdraw(500);
        System.out.println(Ahmet.getBalance());
        ahmetS.addInterestToBalance();
        System.out.println(ahmetS.getBalance());
        x.transfer(200);
        x.transfer(100);
        System.out.println("Balance= " + x.getBalance());

    }

}
