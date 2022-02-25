package com.company.Payroll;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class HourlyEmployee extends Employee{
    private double wage;
    private  double hours;

    public HourlyEmployee(double wage, double hours){
        this.hours = hours;
        this.wage = wage;
    }
    @Override
    public double getPaymentAmount() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Hours Worked: ");
        hours = scan.nextDouble();
        wage = hours *800;

        try {
            FileWriter myWriter = new FileWriter("PayStub.txt", true);
            myWriter.append("\nHours Worked: ").append(String.valueOf(hours));
            myWriter.append("\nTotal Wage: ").append(String.valueOf(wage));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return wage;
    }

    @Override
    public void writeToFile() {


    }


    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
