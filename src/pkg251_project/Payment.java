/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg251_project;

import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.concurrent.Flow.Subscription;
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
    
    public static boolean verifyPayment(int cardNumber) {
        String cardNumberStr = Integer.toString(cardNumber);
    for (int i = 0; i < cardNumberStr.length(); i++) {
        char digit = cardNumberStr.charAt(i);
        if (!Character.isDigit(digit)) {
            System.out.println("The card number is not true. Please try again.");
            return false;
        }
    }
    if (cardNumberStr.length() != 10) {
        System.out.println("The card number is not true. Please try again.");
        return false;
    }else System.out.println("The card number is  true");
    return true;
    }
    
    public static void generateReceipt(int monthNumber, double Cost, Date startDate, Date endDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Receipt:");
        System.out.println("Month Number: " + monthNumber);
        System.out.println("Cost: $" + Cost);
        System.out.println("Start Date: " + dateFormat.format(startDate));
        System.out.println("End Date: " + dateFormat.format(endDate));
    }
    
   // Method for making payment
   public void makePayment(String studentName, String cardNumber, double cost) {
    if (cardNumber.length() != 16) {
        System.out.println("Card number must be 16 numbers.");
        return;
    }

    if (cardNumber.isEmpty()) {
        System.out.println("Card number cannot be empty. Please enter the number.");
        return;
    }

    double totalCost = cost * 1.15;
    System.out.println("The payment is done successfully.");
}

}
 

