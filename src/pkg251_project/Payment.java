/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg251_project;

import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author yaraa
 */
public class Payment {
      private double Cost;
    private Date paymentDate;
    private String paymentState;
    private String cardNumber;
    private Subscription subscription;

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(String paymentState) {
        this.paymentState = paymentState;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
    // Yara
    public static boolean verifyPayment(String cardNumber) {// cardNumber must be string to accept 16 digit
        //String cardNumberStr = Integer.toString(cardNumber);// no need for this line
    for (int i = 0; i < cardNumber.length(); i++) {
        char digit = cardNumber.charAt(i);
        if (!Character.isDigit(digit)) {
            System.out.println("The card number is not true. Please try again.");
            return false;
        }
    }
    if (cardNumber.length() != 16) {// the real card number is 16 digit
        System.out.println("The card number is not true. Please try again.");
        return false;
    }else System.out.println("The card number is  true");
    return true;
    }
    //public static void generateReceipt(int monthNumber, int Cost, Date startDate, Date endDate)
    public static void generateReceipt(int monthNumber, double  Cost, int startDate) {
        //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Receipt:");
        System.out.println("Month Number: " + monthNumber);
        System.out.println("Cost: $" + Cost);
        System.out.println("Start Date: " + startDate);
        
        //System.out.println("Start Date: " + dateFormat.format(startDate));
       // System.out.println("End Date: " + dateFormat.format(endDate));
    }
    //////////////////////////////////////////////////////
   // Method for making payment
     //writen by Sara Alrashdi
  public static void makePayment(String studentName, String cardNumber, int packageChoice) {

        Scanner scanner = new Scanner(System.in);

        // Check if card number is empty or less than 16 digits
        while ( cardNumber.length() != 16) {
           
                System.out.println("Invalid card number. Card number must be 16 digits.");
            
            // Ask user to enter card number again
            System.out.print("Please Enter card number again: ");
            cardNumber = scanner.nextLine();
        }

       double cost= Student.calculateCost(packageChoice);
        // Display total cost before tax
        System.out.println("Total cost before tax: " + cost);

        // Calculate total cost including taxes
        double totalCostWithTax = cost * 1.15;

        // Display total cost after tax
        System.out.println("Total cost after tax: " + totalCostWithTax);

        // Payment success message
        System.out.println("The payment is done successfully.");

        // Close scanner
        scanner.close();
    }
} 

 

