package pkg251_project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yara
 */
public class Trip {
      private int tripID;
    private String StartLocation;
    private String destinationLocation;
    private int tripHour;
    private int tripDay;
    private int tripMonth;
    private int availableSeats;
    private int reservedSeats;
    
private Bus bus;
private Driver driver;
    // Constructor
    public Trip(int tripID, String source, String destination, int tripHour, int tripDay, int tripMonth, int availableSeats, int reservedSeats) {
        this.tripID = tripID;
        this.StartLocation = source;
        this.destinationLocation = destination;
        this.tripHour = tripHour;
        this.tripDay = tripDay;
        this.tripMonth = tripMonth;
        this.availableSeats = availableSeats;
        this.reservedSeats = reservedSeats;
    }

   // Getters and setters
    public int getTripID() {
        return tripID;
    }

    public String getSource() {
        return StartLocation;
    }

    public String getDestination() {
        return destinationLocation;
    }

    public int getTripHour() {
        return tripHour;
    }

    public int getTripDay() {
        return tripDay;
    }

    public int getTripMonth() {
        return tripMonth;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats = reservedSeats;
    }
   
    // Method to generate and write trips to a file as a table for every date of May
  
    
public static void viewSchedule(String fileName) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
        // Writing header
        writer.write("TripDay\tTripMonth\tTripID\tBusID\tDriverID\tStartLocation\tDestinationLocation\n");

        // Generating and writing trips for each date of May
        int tripIDCounter = 1;
        for (int day = 1; day <= 31; day++) { // Assuming May has 31 days
            int month = 5; // May is the 5th month

            // Generating trips data for the current date
            String[][] tripsData = new String[5][7]; // 5 trips per day, 7 fields per trip
            for (int i = 0; i < 5; i++) { // Generating 5 trips per day for example
                // For demonstration, let's assume some basic data for each trip
                tripsData[i][0] = String.valueOf(day); // Trip Day
                tripsData[i][1] = String.valueOf(month); // Trip Month
                tripsData[i][2] = String.valueOf(tripIDCounter++); // Trip ID
                tripsData[i][3] = String.valueOf(i + 101); // Bus ID
                tripsData[i][4] = String.valueOf(i + 201); // Driver ID
                tripsData[i][5] = "StartLocation" + i; // Start Location
                tripsData[i][6] = "DestinationLocation" + i; // Destination Location
            }

            // Writing trips data to file
            for (String[] tripData : tripsData) {
                writer.write(String.join("\t", tripData) + "\n");
            }
        }

        System.out.println("Trips have been written to " + fileName);
    } catch (IOException e) {
        System.err.println("Error writing trips to file: " + e.getMessage());
    }
}

    
    
    
    
    
    
    
     
}
