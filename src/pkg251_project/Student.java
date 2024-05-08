/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg251_project;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
public  class Student {
   private String studentName;
    private String phoneNum;
    private String email;
    private String homeAddress;
    private String username;
    private String password;
     public Student(String studentName, String phoneNum, String email, String homeAddress, String username, String password) {
        this.studentName = studentName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.homeAddress = homeAddress;
        this.username = username;
        this.password = password;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    } 
   
     public static boolean makeSubscription(String studentName,int startDay, int startMonth, int startYear, int packageChoice, boolean isActive) {
        // Get the current date
        
        LocalDate currentDate = LocalDate.now();
        LocalDate startDate = LocalDate.of(startYear, startMonth, startDay);

        // Calculate cost based on package choice
        int calculatedCost = calculateCost(packageChoice);

        // Calculate end date based on the chosen package
        LocalDate endDate = startDate.plusMonths(packageChoice);

        // If start date is in the future, print the difference and when the subscription will become active
        if (startDate.isAfter(currentDate)) {
            long daysDiff = startDate.toEpochDay() - currentDate.toEpochDay();
            long monthsDiff = daysDiff / 30;
            System.out.println("Subscription for " + studentName + " will start in " + daysDiff + " days ");
        System.out.println("Subscription for " + studentName + " will become active in " + monthsDiff + " months");
    
        } else if (startDate.isEqual(currentDate)) {
             System.out.println("Subscription for " + studentName + " starts today!");
        } else {
            // Check if the end date is after the current date
            if (endDate.isAfter(currentDate)) {
                // Display subscription details
                String startDateString = startDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                String endDateString = endDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                System.out.println("Subscription details for " + studentName + ":");
                System.out.println("Start Date: " + startDateString);
                System.out.println("End Date: " + endDateString);
                System.out.println("Cost: " + calculatedCost);
                System.out.println("Active: " + isActive);
                return isActive;
            } else {
                System.out.println("Subscription for " + studentName + " has expired.");
                return false;
            }
        }

        // Subscription is not yet active
        return false;
    }

    public static int calculateCost(int packageChoice) {
        // Calculate cost based on package choice
        switch (packageChoice) {
            case 1: // Monthly subscription
                return 700;
            case 2: // 2-month subscription
                return 1400;
            case 3: // 3-month subscription
                return 2100;
            default:
                return -1; // Invalid package choice
        }
    }
    
    public static void cancelSubscription(String studentName,int startDay, int startMonth, int startYear, int packageChoice) {
         LocalDate currentDate = LocalDate.now();
         LocalDate startDate = LocalDate.of(startYear, startMonth, startDay);
         LocalDate endDate = startDate.plusMonths(packageChoice);
 
        // Check if subscription is expired
        if (endDate.isBefore(currentDate)) {
            // Subscription is expired
            System.out.println("Subscription for " + studentName + " has expired. You cannot cancel it.");
        }
            else 
             System.out.println("Subscription for " + studentName + " has been cancelled successfully.");
    
}
    
    
      public static  void reserveTrip2(Trip[]trips ){

          Scanner scanner = new Scanner(System.in);
      
 
        for (Trip trip : trips) {
            // Extract trip details
            int tripID = trip.getTripID();
            String destination = trip.getDestination();
            String source = trip.getSource();
            int tripHour = trip.getTripHour();
            int tripDay = trip.getTripDay();
            int tripMonth = trip.getTripMonth();

            System.out.println("Trip number " + tripID + ": from " + source + " to " + destination + " at " + tripHour + " AM on " + tripDay + "/" + tripMonth + "/2024");
        }

        boolean tripFound = false;
        int TripID;

        do {
            System.out.print("Enter trip number (or 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("No reservation confirmed. Exiting...");
                return; // Exit the program
            }

            try {
                TripID = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'exit'.");
                continue;
            }

            tripFound = false;
            for (Trip trip : trips) {
                if (trip.getTripID() == TripID) {
                    tripFound = true;
                    int availableSeats = trip.getAvailableSeats();
                    int reservedSeat = trip.getReservedSeats();
                    if (availableSeats > 0) {
                        // Reserve a seat
                        trip.setReservedSeats(reservedSeat + 1);
                        trip.setAvailableSeats(availableSeats - 1);
                        System.out.println("Trip with ID " + TripID + " successfully reserved.");

                        // Display trip details after reservation
                        System.out.println("Reserved trip details:");
                        System.out.println("Trip number: " + trip.getTripID());
                        System.out.println("From: " + trip.getSource() + " to " + trip.getDestination());
                        System.out.println("Time: " + trip.getTripHour() + " AM on " + trip.getTripDay() + "/" + trip.getTripMonth() + "/2024");
                        System.out.println("The Driver name is: " + trip.getDriverName());
                        System.out.println("Remaining available seats: " + trip.getAvailableSeats());
                    } else {
                        System.out.println("No available seats for trip with ID " + TripID + ".");
                    }
                    break;
                }
            }
            if (!tripFound) {
                System.out.println("There is no trip with this number. Please try again.");
            }
        } while (!tripFound);
    }
public static  String trackBus(int busID) {
        for (int i = 0; i < busList.size(); i++) {
            Bus bus = busList.get(i);
            if (bus.getBusID() == busID) {
                return bus.getCurrentLocation();
            }
        }
        return "Bus not found";
    }
}
