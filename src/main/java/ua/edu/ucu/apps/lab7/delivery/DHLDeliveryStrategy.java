package ua.edu.ucu.apps.lab7.delivery;

import java.util.ArrayList;
import ua.edu.ucu.apps.lab7.flower.Item;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public String deliver(ArrayList<Item> items) {
        return "DHL delivering";
    }
}
