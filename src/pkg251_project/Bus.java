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
     private int busID;
    private int capacity;
    private String currentLocation;
    private boolean isAvailable;

    // getters and setters for each attribute
    public int getBusID() {
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
    
    //methods 
    
    // Method to check if the bus is full based on its capacity and reserved seats
    public static boolean isBusFull(int capacity, int reservedSeats) {
        // Check if reserved seats are equal to or more than the capacity of the bus
        if (reservedSeats >= capacity) {
            // Print a message indicating the bus is full
            System.out.println("Bus is full. Select another bus.");
            // Return true to indicate the bus is full
            return true;
        } else {
            // Return false to indicate there are still places available
            return false;
        }
    
    
}
}
