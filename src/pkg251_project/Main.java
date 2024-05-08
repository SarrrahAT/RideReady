/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251_project;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.Scanner;


//import static pkg251_project.Bus.isBusFull;
/**
 *
 * @author Sarah Ibrahim
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Payment paymentSystem = new Payment();
    private static Subscription subscriptionSystem = new Subscription();
    private static Bus busSystem = new Bus();
    private static Trip tripSystem = new Trip(1, "Start", "Destination", 10, 10, 10, 10, "2024-05-01"); // Example parameters
    private static Driver driverSystem = new Driver("John Doe", "VehicleType", 12345, new Date()); // Example parameters
   // private static Student student = new Student ();
    /**
    /**

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int option;
        do {
            System.out.println("Welcome to RiedReady Application");
            System.out.println("1 - Bus Subscription Payments");
            System.out.println("2 - Trip Reservation");
            System.out.println("3 - Tracking the Bus");
            System.out.println("4 - Manipulate Trip Schedule");
            System.out.println("5 - Quit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    handleSubscription();
                    break;
                case 2:
                    handleReservation();
                    break;
                case 3:
                    handleTracking();
                    break;
                case 4:
                    handleSchedule();
                    break;
                case 5:
                    System.out.println("Thank you for using RiedReady application. Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 5);
                
  
        
   
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
      
        Scanner input = new Scanner(System.in);
        
      // Asking for the card number
        System.out.print("Please enter the card number: ");
        String cardNumber = input.nextLine();
        
       Payment.verifyPayment(cardNumber);
        // Call makePayment method with actual inputs
       Payment.makePayment(StudentName, cardNumber, packageChoice); 
         
        
       // Date startDate = new Date();
       // Date endDate = new Date(System.currentTimeMillis() + 86400000); // Adding 1 day to the current date
        double cost=Student.calculateCost(packageChoice);

        Payment.generateReceipt(packageChoice, (int) cost, startDay );
        
        // Close scanner
        input.close();
        
    //////////////////////////////    
        
        
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
     
        Trip[] trips = new Trip[5];

        trips[0] = new Trip(1, "Al Salamah", "KAU North 1", 10, 4, 9, 10, 5,"Ahmed");
        trips[1] = new Trip(2, "Al Shati", "KAU North 3", 12, 4, 12, 20, 15,"Mohammed");
        trips[2] = new Trip(3, "KAU South", "Al Hamra", 15, 4, 15, 30, 25,"Ali");
        trips[3] = new Trip(4, "KAU Western 1", "Al Rawdah", 18, 4, 18, 40, 35, "Omar");
        trips[4] = new Trip(5, "KAU Eastern 1", "Al Aziziya", 20, 4, 20, 50, 45,"Adam");


        // Attempt to reserve a trip
        Student.reserveTrip2(trips);
        
        
        
 Trip[] trips2 = new Trip[5];

        trips[0] = new Trip(1, "Al Salamah", "KAU North 1", 10, 4, 9, 10, "Ahmed");
        trips[1] = new Trip(2, "Al Shati", "KAU North 3", 12, 4, 12, 20, "Mohammed");
        trips[2] = new Trip(3, "KAU South", "Al Hamra", 15, 4, 15, 30, "Ali");
        trips[3] = new Trip(4, "KAU Western 1", "Al Rawdah", 18, 4, 18, 40, "Omar");
        trips[4] = new Trip(5, "KAU Eastern 1", "Al Aziziya", 20, 4, 20, 50, "Adam");

        Trip.viewSchedule("schedule.txt", trips2);
      
    
        /*
         List<Bus> busList;
        busList = new ArrayList<>();
        busList.add(new Bus(1, 50, "Main St", true));
        busList.add(new Bus(2, 50, "High St", false));
 
        
         try {
            Bus bus = busList.get(0);
            System.out.println("Bus ID: " + bus.getBusID() + " Location: " + bus.getCurrentLocation());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds.");
        }

*/
    }

    private static void handleSubscription() {
        System.out.println("1 - Make Subscription");
        System.out.println("2 - Cancel Subscription");
        System.out.println("Enter your choice: ");
        int subOption = scanner.nextInt();
        System.out.println("pleas enter youre name :  ");
            String Name = scanner.next();
            System.out.println("pleas enter the start day  ");
            int Day = scanner.nextInt();
            System.out.println("pleas enter the start month  ");
            int Month = scanner.nextInt();
            System.out.println("pleas enter the start year  ");
            int year = scanner.nextInt(); 
        if (subOption == 1){
            System.out.println("these is the packages ");
            System.out.println("1 - one month ");
            System.out.println("2 - two month ");
            System.out.println("3 - three month");
            System.out.println("Enter your choice: ");
            int packages  = scanner.nextInt();
          
            boolean makeSubscription = Student.makeSubscription(Name,Day,Month,year,packages,true);
            int cost = Student.calculateCost( packages );
            System.out.println("pleas enter ure cridet card number ");
            String card = scanner.next();
            if(paymentSystem.verifyPayment(card)){
            paymentSystem.generateReceipt(Month ,cost,Day );
            } 
           
        } else if (subOption == 2){
            System.out.println("Enter your packege number : ");
            int packages  = scanner.nextInt();
        Student.cancelSubscription(Name,Day,Month,year,packages);}
        else {
            System.out.println("Invalid option.");}
            
           }

    private static void handleReservation() {
        /*System.out.println("Enter the bus ID for the trip: ");
        int busID = scanner.nextInt();
        if (tripSystem.checkCapacity(busID)) {
            System.out.println("Enter the seat number to reserve: ");
            int seatNumber = scanner.nextInt();
            tripSystem.reserveTrip2(busID, seatNumber);
        } else {
            System.out.println("No seats available or invalid bus ID.");
        }*/
    }

    private static void handleTracking() {
         List<Bus> busList;
        busList = new ArrayList<>();
        busList.add(new Bus(1, 50, "Main St", true));
        busList.add(new Bus(2, 50, "High St", false));
        System.out.println("Enter the bus ID to track: ");
        int busID = scanner.nextInt();
       String location=Student.trackBus(busID);
        
        System.out.println("Current location of the bus: " + location);
    }

    private static void handleSchedule() {
       // driverSystem.viewSchedule();
    }
    
}