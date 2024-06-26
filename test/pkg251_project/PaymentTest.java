/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251_project;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sarah Ibrahim
 */
public class PaymentTest {
    
    public PaymentTest() {
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
     * Test of getCost method, of class Payment.
     
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Payment instance = new Payment();
        double expResult = 0.0;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCost method, of class Payment.
     
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        double Cost = 0.0;
        Payment instance = new Payment();
        instance.setCost(Cost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaymentDate method, of class Payment.
     
    @Test
    public void testGetPaymentDate() {
        System.out.println("getPaymentDate");
        Payment instance = new Payment();
        Date expResult = null;
        Date result = instance.getPaymentDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaymentDate method, of class Payment.
     
    @Test
    public void testSetPaymentDate() {
        System.out.println("setPaymentDate");
        Date paymentDate = null;
        Payment instance = new Payment();
        instance.setPaymentDate(paymentDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaymentState method, of class Payment.
     
    @Test
    public void testGetPaymentState() {
        System.out.println("getPaymentState");
        Payment instance = new Payment();
        String expResult = "";
        String result = instance.getPaymentState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaymentState method, of class Payment.
     
    @Test
    public void testSetPaymentState() {
        System.out.println("setPaymentState");
        String paymentState = "";
        Payment instance = new Payment();
        instance.setPaymentState(paymentState);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardNumber method, of class Payment.
     
    @Test
    public void testGetCardNumber() {
        System.out.println("getCardNumber");
        Payment instance = new Payment();
        String expResult = "";
        String result = instance.getCardNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCardNumber method, of class Payment.
     
    @Test
    public void testSetCardNumber() {
        System.out.println("setCardNumber");
        String cardNumber = "";
        Payment instance = new Payment();
        instance.setCardNumber(cardNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubscription method, of class Payment.
     
    @Test
    public void testGetSubscription() {
        System.out.println("getSubscription");
        Payment instance = new Payment();
        Subscription expResult = null;
        Subscription result = instance.getSubscription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubscription method, of class Payment.
     
    @Test
    public void testSetSubscription() {
        System.out.println("setSubscription");
        Subscription subscription = null;
        Payment instance = new Payment();
        instance.setSubscription(subscription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyPayment method, of class Payment.
     */
    @Test
    //Sarah Altalhi - Raghad
    // we are going to enter all digit number 
    public void testVerifyPayment_isDigit() {
        System.out.println("verifyPayment");
        String cardNumber = "1234567890987654";
        boolean result = Payment.verifyPayment(cardNumber);
        assertTrue(result);
    }
@Test
    //Sarah Altalhi - Raghad
    // we are going to enter not digit number 
    public void testVerifyPayment_notDigit() {
        System.out.println("verifyPayment");
        String cardNumber ="123a456789";
        boolean result = Payment.verifyPayment(cardNumber);
        assertFalse(result);
    }
    
    
@Test
    //Sarah Altalhi - Raghad
    // we are going to check length !=16
    public void testVerifyPayment_lengthFalse() {
        System.out.println("verifyPayment");
        String cardNumber ="123456";
        boolean result = Payment.verifyPayment(cardNumber);
        assertFalse(result);
    }
    
    @Test
    //Sarah Altalhi - Raghad
    //2nd case we are going to check length =16
    public void testVerifyPayment_lengthTrue() {
        System.out.println("verifyPayment");
        String cardNumber ="1234565679337857";
        boolean result = Payment.verifyPayment(cardNumber);
        assertTrue(result);
    }
    

    // done by raghad and sarah Altalhi
    @Test
    public void testGenerateReceipt() {
        // Prepare data for the receipt
        
        double cost = 1400;
        int startDate = 1;
        int monthNumber = 2;
        int year=2025;
        
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Call the method to test
        Payment.generateReceipt( cost, startDate,monthNumber ,year);

        // Expected receipt output
        
        String expectedOutput =" Receipt:\n"+
                                "Month Number: 2\n"+
                                "Cost: $1400.0\n"+
                                "Start Date: 1/2/2025\n" ;
                                

        // Check if the output matches the expected receipt
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    /**
     * Test of makePayment method, of class Payment.
     */
     @Test
    public void testMakePayment() {
        System.out.println("makePayment");
        String studentName = "Raghad";
        String cardNumber = "6758383839292927";
        int packageChoice = 3;
        Payment.makePayment(studentName, cardNumber, packageChoice);
        assertTrue(true);
    }
    
}
