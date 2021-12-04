package com.company;

public class Task_59_2 extends Task_59_3{
    private double salary;
    private int startingYear;
    private String insuranceNumber;

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public Task_59_2(String name, double salary, int startingYear, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.startingYear = startingYear;
        this.insuranceNumber = insuranceNumber;

    }
    @Override
    public String toString() {
        return "Name = " + getName() + '\n' + "Salary = " + this.salary + '\n' + "Starting Year = " +
                this.startingYear+ '\n' +
                "Insurance Number = " + this.insuranceNumber ;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(int startingYear) {
        this.startingYear = startingYear;
    }

}
