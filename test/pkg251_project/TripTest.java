/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251_project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author saraa
 */
public class TripTest {
    
    public TripTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDriver method, of class Trip.
     */
    @Test
    public void testGetDriver() {
        System.out.println("getDriver");
        Trip instance = null;
        Driver expResult = null;
        Driver result = instance.getDriver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDriver method, of class Trip.
     */
    @Test
    public void testSetDriver() {
        System.out.println("setDriver");
        Driver driver = null;
        Trip instance = null;
        instance.setDriver(driver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTripID method, of class Trip.
     */
    @Test
    public void testGetTripID() {
        System.out.println("getTripID");
        Trip instance = null;
        int expResult = 0;
        int result = instance.getTripID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSource method, of class Trip.
     */
    @Test
    public void testGetSource() {
        System.out.println("getSource");
        Trip instance = null;
        String expResult = "";
        String result = instance.getSource();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDestination method, of class Trip.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Trip instance = null;
        String expResult = "";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTripHour method, of class Trip.
     */
    @Test
    public void testGetTripHour() {
        System.out.println("getTripHour");
        Trip instance = null;
        int expResult = 0;
        int result = instance.getTripHour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTripDay method, of class Trip.
     */
    @Test
    public void testGetTripDay() {
        System.out.println("getTripDay");
        Trip instance = null;
        int expResult = 0;
        int result = instance.getTripDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTripMonth method, of class Trip.
     */
    @Test
    public void testGetTripMonth() {
        System.out.println("getTripMonth");
        Trip instance = null;
        int expResult = 0;
        int result = instance.getTripMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvailableSeats method, of class Trip.
     */
    @Test
    public void testGetAvailableSeats() {
        System.out.println("getAvailableSeats");
        Trip instance = null;
        int expResult = 0;
        int result = instance.getAvailableSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvailableSeats method, of class Trip.
     */
    @Test
    public void testSetAvailableSeats() {
        System.out.println("setAvailableSeats");
        int availableSeats = 0;
        Trip instance = null;
        instance.setAvailableSeats(availableSeats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReservedSeats method, of class Trip.
     */
    @Test
    public void testGetReservedSeats() {
        System.out.println("getReservedSeats");
        Trip instance = null;
        int expResult = 0;
        int result = instance.getReservedSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReservedSeats method, of class Trip.
     */
    @Test
    public void testSetReservedSeats() {
        System.out.println("setReservedSeats");
        int reservedSeats = 0;
        Trip instance = null;
        instance.setReservedSeats(reservedSeats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDriverName method, of class Trip.
     */
    @Test
    public void testGetDriverName() {
        System.out.println("getDriverName");
        Trip instance = null;
        String expResult = "";
        String result = instance.getDriverName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDriverName method, of class Trip.
     */
    @Test
    public void testSetDriverName() {
        System.out.println("setDriverName");
        String driverName = "";
        Trip instance = null;
        instance.setDriverName(driverName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBusID method, of class Trip.
     */
    @Test
    public void testGetBusID() {
        System.out.println("getBusID");
        Trip instance = null;
        int expResult = 0;
        int result = instance.getBusID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBusID method, of class Trip.
     */
    @Test
    public void testSetBusID() {
        System.out.println("setBusID");
        int busId = 0;
        Trip instance = null;
        instance.setBusID(busId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
/////////////////////////////////////////////////////////////////
    
     // Test of viewSchedule method, of class Trip.
     // by Sara Alrashdi 
  
   
    @Test
    public void testViewSchedule() {
        // Prepare sample trips
        Trip[] trips = {
            new Trip(1, "City A", "City B", 12, 15, 5, 20, 5, "John Doe"),
            new Trip(2, "City C", "City D", 10, 10, 5, 15, 3, "Jane Smith")
        };

        // Call the method being tested
        Trip.viewSchedule("test_schedule.txt", trips);

        // Verify the content of the file
        try (BufferedReader reader = new BufferedReader(new FileReader("test_schedule.txt"))) {
            // Check header
            String header = reader.readLine();
            String expectedHeader = String.format("%-8s%-8s%-20s%-8s%-12s%-20s%-20s",
                                                  "TripID", "BusID", "DriverName", "DTripDay", "TripMonth", "Start Location", "Destination Location");
            assertEquals(expectedHeader, header);

            // Check data
            String line;
            while ((line = reader.readLine()) != null) {
                // Assert each line contains trip data
                assertTrue(line.contains("1") || line.contains("2")); // Assuming Trip IDs are present in the file
            }
        } catch (IOException e) {
            fail("Error reading file: " + e.getMessage());
        }
    }
}












 


