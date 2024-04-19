/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251_project;

import java.text.SimpleDateFormat;
import java.util.Date;
import static pkg251_project.Student.makeSubscription;
import java.util.Scanner;
import static pkg251_project.Bus.isBusFull;
/**
 *
 * @author Sarah Ibrahim
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Sarah Altalhi");
         System.out.println("Sara Alrashdi");
         System.out.println("Raghad Farghal");
         System.out.println("Reham Alsulami");
         System.out.println("yara alghamdi");
         
        // test the verifyPayment -Yara 
        int cardNum1 ;
        cardNum1=123;
         Payment.verifyPayment(cardNum1);
         int cardNum2 ;
        cardNum2=1234567891;
        Payment.verifyPayment(cardNum2);
        // test the generateReceipt -Yara 
        int monthNumber = 4;
        double cost = 100.50;
        Date startDate = new Date();
        Date endDate = new Date(System.currentTimeMillis() + 86400000); // Adding 1 day to the current date

        Payment.generateReceipt(monthNumber, cost, startDate, endDate);
        
   
      // Example usage
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start day: ");
        int startDay = scanner.nextInt();
        System.out.print("Enter start month: ");
        int startMonth = scanner.nextInt();
        System.out.print("Enter start year: ");
        int startYear = scanner.nextInt();
        System.out.println("Choose subscription package:");
        System.out.println("1. Monthly subscription (700 RS)");
        System.out.println("2. 2-month subscription (1400 RS)");
        System.out.println("3. 3-month subscription (2100 RS)");
        System.out.print("Enter your choice: ");
        int packageChoice = scanner.nextInt();
        boolean isActive = true; // Assume subscription is active

        Student.makeSubscription(startDay, startMonth, startYear, packageChoice, isActive);
       
       /// Test the makePayment -sara Alrashdi

        //Requesting the user to enter the student's name
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();

      //  Requesting the user to enter the card number
        System.out.println("Enter card number:");
        String cardNumber = scanner.nextLine();

     // Requesting the user to enter the cost 
        System.out.println("Enter cost:");
        double Cost = scanner.nextDouble();

       //Call method MakePayment
       Payment.makePayment(studentName, cardNumber, Cost);

        // Test isBusFull method - Sarah Altalhi
        int busCapacity = 50; // Example capacity of the bus
        int reservedSeats = 50; // Example number of reserved seats
        
        // Call the method and check if the bus is full
        boolean isFull = isBusFull(busCapacity, reservedSeats);

        // Print the result (optional)
        System.out.println("Is the bus full? " + isFull);
        
    }    
          
    }
   
    
    
    
    

