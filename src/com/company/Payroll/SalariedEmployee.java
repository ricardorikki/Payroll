package com.company.Payroll;

public class SalariedEmployee extends Employee{

    private double weeklySalary;

    public SalariedEmployee(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }


    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public void display(){
        System.out.println();
    }
}
