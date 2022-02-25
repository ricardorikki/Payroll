package com.company.Payroll;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;
public class Employee extends Invoice implements Payable{

private String firstName;
private String lastName;
private String socialSecurityNumber;

    public Employee(){}

    @Override
    public double getPaymentAmount() {

        return 0;
    }

    @Override
    public void writeToFile() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter First Name: ");
        firstName = scan.nextLine();
        System.out.print("Enter Last Name: ");
        lastName = scan.nextLine();
        System.out.print("Enter Social Security Number: ");
        socialSecurityNumber = scan.nextLine();

        try {
            FileWriter myWriter = new FileWriter("PayStub.txt",true);
            myWriter.write("\n\n**********PAY STUB*************");
            LocalDate myObj = LocalDate.now(); // Create a date object

            myWriter.write("\nDate: "+myObj);
            myWriter.write("\nEmployee Type: Full Time");
            myWriter.write("\nFirst Name: "+firstName);
            myWriter.write("\nLast Name: "+lastName);
            myWriter.write("\nSocial Security Number: "+socialSecurityNumber);
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public Employee(String firstName,String lastName, String socialSecurityNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.socialSecurityNumber = socialSecurityNumber;
}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


}
