package com.company;

public class Task_60_4 extends Task_60_3{
    private double limit;

    @Override
    public void transfer(double amount) {
        if(amount <= this.limit){
            super.transfer(amount);
        }else{
            System.out.println(amount + limit + "\n");
        }

    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public Task_60_4(double balance,double limit) {
        super(balance);
        this.limit = limit;
    }
}
