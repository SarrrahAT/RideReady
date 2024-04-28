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
    private String driverName;
    
    private Bus bus;
    private Driver driver;
    private int busID;
    
    // Constructor
    public Trip(int tripID, String source, String destination, int tripHour, int tripDay, int tripMonth, int availableSeats, int reservedSeats, String driverName) {
        this.tripID = tripID;
        this.StartLocation = source;
        this.destinationLocation = destination;
        this.tripHour = tripHour;
        this.tripDay = tripDay;
        this.tripMonth = tripMonth;
        this.availableSeats = availableSeats;
        this.reservedSeats = reservedSeats;
        this.driverName = driverName;
    }

     // Constructor
    public Trip(int tripID, String destination, String source, int tripHour, int tripDay, int tripMonth, int  busID, String driverName) {
        this.tripID = tripID;
        this.destinationLocation = destination;
        this.StartLocation = source;
        this.tripHour = tripHour;
        this.tripDay = tripDay;
        this.tripMonth = tripMonth;
        this.busID = busID;
        this.driverName = driverName;
    }
        
    

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
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
   
    
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busId) {
        this.busID = busId;
    }
    
    
    // Method to view schedual for the driver to a file as a table for every date of May
  // writen by Raghad and Sara Alrashdi 
    // modified by Reham
 
 public static void viewSchedule(String fileName, Trip[] trips) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
           // Writing header
              writer.write(String.format("%-8s%-8s%-20s%-8s%-12s%-20s%-20s\n", "TripID", "BusID", "DriverName", "DTripDay", "TripMonth", "Start Location", "Destination Location"));

          // Writing
          for (Trip trip : trips) {
             writer.write(String.format("%-8s%-8s%-20s%-8s%-12s%-20s%-20s\n", trip.getTripID(), trip.getBusID(), trip.getDriverName(), trip.getTripDay(), trip.getTripMonth(), trip.getSource(), trip.getDestination()));
              }

            

            System.out.println("Trips have been written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing trips to file: " + e.getMessage());
        }
    }
}

    
    
    
    
    
    
    
     

