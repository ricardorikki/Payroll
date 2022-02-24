package com.company.Payroll;

public class CommissionEmployee extends Employee{

    protected double grossSales;
    protected double commissionRate;


    public CommissionEmployee(double grossSales, double commissionRate){
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public CommissionEmployee() {

    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

}
