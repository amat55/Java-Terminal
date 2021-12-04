package com.company;

public class Task_60_3 {
    private double balance;

    public Task_60_3(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
    public void transfer(double amount){
        this.balance -= amount;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
}
