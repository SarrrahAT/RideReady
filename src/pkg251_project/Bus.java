/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251_project;

/**
 *
 * @author Sarah Ibrahim
 */
public class Bus {
     private  int busID;
    private int capacity;
    private String currentLocation;
    private boolean isAvailable;
public Bus(int busID, int capacity, String currentLocation, boolean isAvailable) {
        this.busID = busID;
        this.capacity = capacity;
        this.currentLocation = currentLocation;
        this.isAvailable = isAvailable;
    }

    Bus() {
  
    }
    // getters and setters for each attribute
    public   int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
   
    
    // Method to check if the bus is full based on its capacity and reserved seats
   //methods  checkCapacity
    // writen by Sara Alrashdi and Sarah Altalhi
public static int checkCapacity(int capacity, int reservedSeats) {
    // Calculate the number of remaining seats
    int remainingSeats = capacity - reservedSeats;
    
    // Check if there are still empty seats available
    if (remainingSeats > 0) {
        // If there are empty seats, return the number of remaining seats
        return remainingSeats;
    } else {
        // If the bus is full, return a message to indicate that
        return -1;
    }
}
}
