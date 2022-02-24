package com.company.Payroll;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

import java.util.Scanner;
public class Invoice implements Payable{

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePattern;

    public Invoice(String partNumber, String partDescription,
                   int quantity, double pricePattern){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePattern = pricePattern;
    }

    public Invoice() {

    }

    @Override
    public double getPaymentAmount() {


        return 0;
    }

    @Override
    public void writeToFile() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Part Number: ");
        partNumber = scan.nextLine();
        System.out.print("Enter Part Description: ");
        partDescription = scan.nextLine();
        System.out.print("Enter Quantity: ");
        quantity = scan.nextInt();
        System.out.print("Enter Price Pattern: ");
        pricePattern = scan.nextDouble();

        // setPartDescription(scan.nextLine());
        FileWriter fWriter = null;
        BufferedWriter writer = null;
        try {
            FileWriter myWriter = new FileWriter("PayStub.txt", true);
            myWriter.append("\nPart Number: " + partNumber);
            myWriter.append("\nPart Description: " + partDescription);
            myWriter.append("\nQuantity: " + quantity);
            myWriter.append("\nPrice Pattern: " + pricePattern);

            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();


        }
    }

    public double getPricePattern() {
        return pricePattern;
    }

    public void setPricePattern(double pricePattern) {
        this.pricePattern = pricePattern;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CharSequence setPartNumber(String partNumber) {
        this.partNumber = partNumber;
        return partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public CharSequence setPartDescription(String partDescription) {
        this.partDescription = partDescription;
        return partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }
}