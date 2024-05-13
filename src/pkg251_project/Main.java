/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251_project;


import java.util.Scanner;



/**
 *
 * @author Sarah Ibrahim
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Payment paymentSystem = new Payment();
   

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
            System.out.println("4 - View Trip Schedule");
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
                
  
    }

    private static void handleSubscription() {
          // Example usage for makeSubscription and cancelSubscription made by Reham Alsulami
        System.out.println("1 - Make Subscription");
        System.out.println("2 - Cancel Subscription");
        System.out.println("Enter your choice: ");
        int subOption = scanner.nextInt();
       System.out.print("Please enter your name: ");
        String Name=scanner.next();
        System.out.print("Enter start day: ");
        int Day = scanner.nextInt();
        System.out.print("Enter start month: ");
        int Month = scanner.nextInt();
        System.out.print("Enter start year: ");
        int year = scanner.nextInt();
  
        if (subOption == 1){
            System.out.println("Choose subscription package:");
        System.out.println("1. Monthly subscription (700 RS)");
        System.out.println("2. 2-month subscription (1400 RS)");
        System.out.println("3. 3-month subscription (2100 RS)");
        System.out.print("Enter your choice: ");
            int packages  = scanner.nextInt();
          
            boolean makeSubscription = Student.makeSubscription(Name,Day,Month,year,packages,true);
            int cost = Student.calculateCost( packages );
            /// makePayment -sara Alrashdi
            System.out.println("pleas enter your cridet card number ");
            String card = scanner.next();
            if(paymentSystem.verifyPayment(card)){
            paymentSystem.generateReceipt(cost,Day ,Month,year);
            } 
           
        } else if (subOption == 2){
            System.out.println("Enter your packege number : ");
            int packages  = scanner.nextInt();
        Student.cancelSubscription(Name,Day,Month,year,packages);}
        else {
            System.out.println("Invalid option.");}
            
           }

    private static void handleReservation() {
         // Example usage for reserveTrip made by Reham Alsulami and Raghad Farghal 
        Trip[] trips = new Trip[5];

        trips[0] = new Trip(1, "Al Salamah", "KAU North 1", 10, 4, 9, 10, 5,"Ahmed");
        trips[1] = new Trip(2, "Al Shati", "KAU North 3", 12, 4, 12, 20, 15,"Mohammed");
        trips[2] = new Trip(3, "KAU South", "Al Hamra", 15, 4, 15, 30, 25,"Ali");
        trips[3] = new Trip(4, "KAU Western 1", "Al Rawdah", 18, 4, 18, 40, 35, "Omar");
        trips[4] = new Trip(5, "KAU Eastern 1", "Al Aziziya", 20, 4, 20, 50, 45,"Adam");


        // Attempt to reserve a trip
        Student.reserveTrip2(trips);
        
    }

    private static void handleTracking() {
        // the method trackBus made by yara 
         
        System.out.println("Enter the bus ID to track: ");
        int busID = scanner.nextInt();
       String location=Student.trackBus(busID);
        
        System.out.println("Current location of the bus: " + location);
    }

    private static void handleSchedule() {
               
         // Example usage for viewSchedule made by sara Alrashdi and Raghad Farghal and edit by Reahm Alsulami
     Trip[] trips = new Trip[5];

        trips[0] = new Trip(1, "Al Salamah", "KAU North 1", 10, 4, 9, 10, "Ahmed");
        trips[1] = new Trip(2, "Al Shati", "KAU North 3", 12, 4, 12, 20, "Mohammed");
        trips[2] = new Trip(3, "KAU South", "Al Hamra", 15, 4, 15, 30, "Ali");
        trips[3] = new Trip(4, "KAU Western 1", "Al Rawdah", 18, 4, 18, 40, "Omar");
        trips[4] = new Trip(5, "KAU Eastern 1", "Al Aziziya", 20, 4, 20, 50, "Adam");

        Trip.viewSchedule("schedule.txt", trips);
      
    
    }
    
}