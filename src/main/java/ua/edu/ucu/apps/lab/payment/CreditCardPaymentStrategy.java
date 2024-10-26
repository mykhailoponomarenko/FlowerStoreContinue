package ua.edu.ucu.apps.lab.payment;


public class CreditCardPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        System.out.println("Credit card payment");
        return price + 10;
    }

    
}
