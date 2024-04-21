/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg251_project;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class Student {
   private String studentName;
    private String phoneNum;
    private String email;
    private String homeAddress;
    private String username;
    private String password;

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

    private static int calculateCost(int packageChoice) {
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
    
    
     public static  int reserveTrip(int userTripHour, int userTripDay, int userTripMonth, String userSource, String userDestination) {
    // Define the array of Trip objects
    Trip[] trips = new Trip[5];

    trips[0] = new Trip(1, "Al Salamah", "KAU North 1", 10, 4, 9, 10, 5);
        trips[1] = new Trip(2, "Al Shati", "KAU North 3", 12, 4, 12, 20, 15);
        trips[2] = new Trip(3, "KAU South", "Al Hamra", 15, 4, 15, 30, 25);
        trips[3] = new Trip(4, "KAU Western 1", "Al Rawdah", 18, 4, 18, 40, 35);
        trips[4] = new Trip(5, "KAU Eastern 1", "Al Aziziya", 20, 4, 20, 50, 45);
        
    for (Trip trip : trips) {
        // Extract trip details
        int tripID = trip.getTripID();
        int tripHour = trip.getTripHour();
        int tripDay = trip.getTripDay();
        int tripMonth = trip.getTripMonth();
        int availableSeats = trip.getAvailableSeats();
        int reservedSeat = trip.getReservedSeats();
        String source = trip.getSource();
        String destination = trip.getDestination();

        // Check if the tripDate matches the provided day and month
        if (tripDay == userTripDay && tripMonth == userTripMonth) {
            // Check if the tripTime matches the provided TripHour
            if (tripHour == userTripHour) {
                // Check if source and destination match
                if (source.equalsIgnoreCase(userSource) && destination.equalsIgnoreCase(userDestination)) {
                    // Check if there are available seats
                    if (availableSeats > 0) {
                        // Reserve a seat
                        trip.setReservedSeats(reservedSeat + 1);
                        trip.setAvailableSeats(availableSeats - 1);

                        // Return the trip ID
                        return tripID;
                    } else {
                        System.out.println("No available seats for trip with ID " + tripID + ".");
                        return -1; // Return -1 indicating failure
                    }
                } else {
                    System.out.println("Trip with ID " + tripID + " does not match the specified source and destination.");
                    return -1; // Return -1 indicating failure
                }
            } else {
                System.out.println("Trip with ID " + tripID + " is not available at the specified time.");
                return -1; // Return -1 indicating failure
            }
        }
    }

    System.out.println("No trip available on the specified date.");
    return -1; // Return -1 indicating failure
}
}