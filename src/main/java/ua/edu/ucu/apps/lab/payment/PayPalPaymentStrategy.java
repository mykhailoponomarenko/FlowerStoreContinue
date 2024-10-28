package ua.edu.ucu.apps.lab.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        System.out.println("PayPal payment");
        final int NUM = 10;
        return price - NUM;
    }
    
}
