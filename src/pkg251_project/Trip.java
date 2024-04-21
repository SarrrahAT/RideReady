package pkg251_project;

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
    
     
}
