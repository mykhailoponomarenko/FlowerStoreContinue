package ua.edu.ucu.apps.lab7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import ua.edu.ucu.apps.lab7.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.lab7.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.lab7.flower.Item;
import ua.edu.ucu.apps.lab7.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.lab7.payment.PayPalPaymentStrategy;
public class TestOrder {
    @Test
    void postDeliveryTest() {
        PostDeliveryStrategy strategy = new PostDeliveryStrategy();
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item());
        Assertions.assertEquals(strategy.deliver(list), "Nova poshta robe");
    }

    @Test
    void DHLDeliveryTest() {
        DHLDeliveryStrategy strategy = new DHLDeliveryStrategy();
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item());
        Assertions.assertEquals(strategy.deliver(list), "DHL delivering");
    }

    @Test
    void CardPaymentTest() {
        CreditCardPaymentStrategy strategy = new CreditCardPaymentStrategy();
        double price = 20;
        Assertions.assertEquals(strategy.pay(price), 30);
    }

    @Test
    void PayPalPaymentTest() {
        PayPalPaymentStrategy strategy = new PayPalPaymentStrategy();
        double price = 20;
        Assertions.assertEquals(strategy.pay(price), 10);
    }
    
}
