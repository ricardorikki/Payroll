package com.company.Payroll;

//Ricardo Knighht ID#1500144669
public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee employee = new Employee( "ricardo","Knight","12WE344QA");
        Invoice invoice = new Invoice("AS21ee", "Car Window",2,1000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(0.0,0);
        Display display = new Display();
        employee.writeToFile();
        invoice.writeToFile();
        hourlyEmployee.writeToFile();
        display.display();

    }
}
