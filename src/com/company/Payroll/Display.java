package com.company.Payroll;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Display {
public void display(){
     try

    {
        File myObj = new File("PayStub.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    }
     catch(FileNotFoundException e)

    {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }

}
}