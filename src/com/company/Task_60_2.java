package com.company;

public class Task_60_2 extends Task_60_3 {
    private double interest;

    public Task_60_2(double balance, double interest) {
        super(balance);
        this.interest = interest;
    }

    public void addInterestToBalance() {
        double newAmount = (this.getBalance()+ (this.getBalance() * this.interest));
        System.out.println("Amount=  "+ newAmount);
        this.setBalance(newAmount);
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
