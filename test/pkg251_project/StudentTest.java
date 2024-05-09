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
 * @author User
 */
public class StudentTest {
    
    public StudentTest() {
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
     * Test of getStudentName method, of class Student.
     
    @Test
    public void testGetStudentName() {
        System.out.println("getStudentName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getStudentName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 */
    /**
     * Test of setStudentName method, of class Student.
     
    @Test
    public void testSetStudentName() {
        System.out.println("setStudentName");
        String studentName = "";
        Student instance = new Student();
        instance.setStudentName(studentName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNum method, of class Student.
     
    @Test
    public void testGetPhoneNum() {
        System.out.println("getPhoneNum");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getPhoneNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNum method, of class Student.
     
    @Test
    public void testSetPhoneNum() {
        System.out.println("setPhoneNum");
        String phoneNum = "";
        Student instance = new Student();
        instance.setPhoneNum(phoneNum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Student.
     
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Student.
     
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Student instance = new Student();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHomeAddress method, of class Student.
     
    @Test
    public void testGetHomeAddress() {
        System.out.println("getHomeAddress");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getHomeAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
     * Test of setHomeAddress method, of class Student.
     
    @Test
    public void testSetHomeAddress() {
        System.out.println("setHomeAddress");
        String homeAddress = "";
        Student instance = new Student();
        instance.setHomeAddress(homeAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    * */
 /**
     * Test of makeSubscription method, of class sub.
     */
    @Test
    // Done by Yara Alghamdi - Rehame Alsulami 
    // this test method to test if the supscription is active 
    // case-1 if it's active 
    public void testMakeSubscription() {
        System.out.println("makeSubscription");
        String studentName = "reham";
        int startDay = 15;
        int startMonth = 4;
        int startYear = 2024;
        int packageChoice = 2;
        boolean isActive = true;
        
        boolean result = Student.makeSubscription(studentName, startDay, startMonth, startYear, packageChoice, isActive);
        assertTrue( result);
      
    }
    @Test
    // case-2 if it's not active yet
    public void testMakeSubscription2() {
        System.out.println("makeSubscription");
        String studentName = "Yara";
        int startDay = 1;
        int startMonth = 1;
        int startYear = 2025;
        int packageChoice = 1;
        boolean isActive = false;
        
        boolean result = Student.makeSubscription(studentName, startDay, startMonth, startYear, packageChoice, isActive);
        assertFalse( result);
      
    }

    /**
     * Test of cancelSubscription method, of class sub.
     */
    // Done by Yara Alghamdi - Rehame Alsulami 
    // this test method to test if the CancelSubscription is been done 
    // case 1 CancelSubscription is been done  
    @Test
    public void testCancelSubscription() {
        System.out.println("cancelSubscription");
        String studentName = "Reham";
        int startDay = 15;
        int startMonth = 4;
        int startYear = 2024;
        int packageChoice = 2;
        Student.cancelSubscription(studentName, startDay, startMonth, startYear, packageChoice);
        
       
    }
    // case 2 supsecription is expairs 
    @Test
    public void testCancelSubscription2() {
        System.out.println("cancelSubscription");
        String studentName = "Yara";
        int startDay = 1;
        int startMonth = 1;
        int startYear = 2024;
        int packageChoice = 1;
        Student.cancelSubscription(studentName, startDay, startMonth, startYear, packageChoice);
        
       
    }

    /**
     * Test of reserveTrip2 method, of class sub.
     */
    @Test
    public void testReserveTrip2() {
        System.out.println("reserveTrip2");
        Trip[] trips = new Trip[5];

        trips[0] = new Trip(1, "Al Salamah", "KAU North 1", 10, 4, 9, 10, 5,"Ahmed");
        trips[1] = new Trip(2, "Al Shati", "KAU North 3", 12, 4, 12, 20, 15,"Mohammed");
        trips[2] = new Trip(3, "KAU South", "Al Hamra", 15, 4, 15, 30, 25,"Ali");
        trips[3] = new Trip(4, "KAU Western 1", "Al Rawdah", 18, 4, 18, 40, 35, "Omar");
        trips[4] = new Trip(5, "KAU Eastern 1", "Al Aziziya", 20, 4, 20, 50, 45,"Adam");
        Student.reserveTrip2(trips);
        
    }
}
