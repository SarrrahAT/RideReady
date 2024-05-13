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

/**
 *
 * @author saraa
 */
public class BusTest {
    
    
    public BusTest() {
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
     * Test of getBusID method, of class Bus.
     */
    /*
    @Test
    public void testGetBusID() {
        System.out.println("getBusID");
        Bus instance = null;
        int expResult = 0;
        int result = instance.getBusID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBusID method, of class Bus.
     
    @Test
    public void testSetBusID() {
        System.out.println("setBusID");
        int busID = 0;
        Bus instance = null;
        instance.setBusID(busID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class Bus.
     
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Bus instance = null;
        int expResult = 0;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class Bus.
     
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 0;
        Bus instance = null;
        instance.setCapacity(capacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentLocation method, of class Bus.
     
    @Test
    public void testGetCurrentLocation() {
        System.out.println("getCurrentLocation");
        Bus instance = null;
        String expResult = "";
        String result = instance.getCurrentLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentLocation method, of class Bus.
     
    @Test
    public void testSetCurrentLocation() {
        System.out.println("setCurrentLocation");
        String currentLocation = "";
        Bus instance = null;
        instance.setCurrentLocation(currentLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsAvailable method, of class Bus.
     
    @Test
    public void testIsIsAvailable() {
        System.out.println("isIsAvailable");
        Bus instance = null;
        boolean expResult = false;
        boolean result = instance.isIsAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsAvailable method, of class Bus.
     
    @Test
    public void testSetIsAvailable() {
        System.out.println("setIsAvailable");
        boolean isAvailable = false;
        Bus instance = null;
        instance.setIsAvailable(isAvailable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
//////////////////////////////////////////////////////////////////////////////////////
    /**
     * Test of checkCapacity method, of class Bus
     * by Sara Alrashdi.
     */
    
    // Test case 1: When there are available seats
@Test
public void testCheckCapacityWhenSeatsAvailable() {
    // Testing Data
    int capacity = 30;
    int reservedSeats = 20;

    // Expected result based on the given testing data
    int expectedResult = 10;

    // Setup
    Bus bus = new Bus();

    // Calling the method under test
    int result = bus.checkCapacity(capacity, reservedSeats);

    // Comparing the expected value with the actual result
    assertEquals(expectedResult, result);
}

// Test case 2: When the bus is full
@Test
public void testCheckCapacityWhenBusFull() {
    // Testing Data
    int capacity = 40;
    int reservedSeats = 40;

    // Setup
    Bus bus = new Bus();
 int expectedResult = -1;
    // Calling the method under test
    int result = bus.checkCapacity(capacity, reservedSeats);

    // Comparing the expected value with the actual result
    assertEquals( expectedResult, result);
}

    
}
    

