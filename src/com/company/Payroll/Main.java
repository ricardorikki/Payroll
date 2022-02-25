package com.company.Payroll;

import java.util.Scanner;
//Ricardo Knighht ID#1500144669
public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee employee = new Employee( "ricardo","Knight","12WE344QA");
        Invoice invoice = new Invoice("AS21ee", "Car Window",2,1000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(0.0,0);
        Display display = new Display();

        Scanner scan = new Scanner(System.in);
        System.out.print("\033[4;32m\n*********WELCOME TO PAYSAL********\n\033[0m");
        System.out.print("\t1...Full Time Employee \n");
        System.out.print("\t2...Contracted Employee\n");
        System.out.print("\t3...Exit\n");
        System.out.print("\tPlease Enter Worker Type: ");
        int workerType = scan.nextInt();

        switch (workerType) {
            case 1 -> {
                employee.writeToFile();
                hourlyEmployee.getPaymentAmount();
            }
            case 2 -> invoice.writeToFile();
            case 3 -> {
                System.out.println("Program Terminated");
                System.exit(0); // for terminating the program
            }
            default -> {
            }
        }
        display.display();
    }
}
