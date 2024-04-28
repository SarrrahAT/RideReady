/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251_project;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static pkg251_project.Student.makeSubscription;
import java.util.Scanner;
import static pkg251_project.Trip.viewSchedule;

//import static pkg251_project.Bus.isBusFull;
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
         // test the tracking bus 
         List<Bus> busList;
        busList = new ArrayList<>();
        busList.add(new Bus(1, 50, "Main St", true));
        busList.add(new Bus(2, 50, "High St", false));

         try {
            Bus bus = busList.get(0);
            System.out.println("Bus ID: " + bus.getBusID() + " Location: " + bus.getCurrentLocation());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds.");
        }/**Student student = new Student();
        String location = student.trackBus(1);
        System.out.println(location); // Output should be "Main St"
         */
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
        
   
      // Example usage for makeSubscription made by Reham Alsulami
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String StudentName=scanner.nextLine();
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
        
        

        Student.makeSubscription(StudentName,startDay, startMonth, startYear, packageChoice, isActive);
        
        // Example usage for makeSubscription made by Reham Alsulami
        int cancelChoice;
       do {
            // Prompt the user for cancellation input
            System.out.print("If you want to cancel the subscription, please press 1. If you don't want to cancel, press 0: ");
            cancelChoice = scanner.nextInt();

            // Process cancellation choice
            if (cancelChoice == 1) {
                // Call cancelSubscription method
                Student.cancelSubscription(StudentName,startDay, startMonth, startYear, packageChoice);
            } else if (cancelChoice == 0) {
                System.out.println("Your reservation has been confirmed successfully!");
            } else {
                System.out.println("The number is invalid. Please try again.");
            }
        } while (cancelChoice != 0 && cancelChoice != 1);
       
       /// Test the makePayment -sara Alrashdi
      
            // Prompt user to enter student name
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        
        // Prompt user to enter card number
        System.out.print("Enter card number: ");
        String cardNumber = scanner.nextLine();
        
        // Call makePayment method with actual inputs
       Payment.makePayment(studentName, cardNumber, 0); // 0 as initial value for subscription months
        
       
        // Close scanner
        scanner.close();
        
        
        // Test methods  checkCapacity _ Sara Alrashdi
         //  An array containing a set of values for the bus capacity and the number of reserved seats
    int[][] testData = {
        {50, 40}, // Capacity value and number of reserved seats 1
        {30, 20}, // Capacity value and number of reserved seats 2
        {40, 40}, // Capacity value and number of reserved seats 3
    };
    
    // // Iterate to test the method with each value in the array
    for (int i = 0; i < testData.length; i++) {
        int capacity = testData[i][0]; // Capacity value
        int reservedSeats = testData[i][1]; // The value of the number of reserved seats
        
        // Call the method and print the result
        int availability = Bus.checkCapacity(capacity, reservedSeats);
        if (availability >= 0) {
            System.out.println("Test " + (i+1) + ": There are " + availability + " empty seats available.");
        } else {
            System.out.println("Test " + (i+1) + ": The bus is full, choose another bus.");
        }
    } 
      
    // Example usage for reserveTrip made by Reham Alsulami and Raghad Farghal 
     

        // Attempt to reserve a trip
        Student.reserveTrip2();


     
        
        // Test methods viewSchedule
    
         viewSchedule("schedule_output.txt"); 
    }
    

      
}  

    
          
    
   
    
    
    
    

