package ua.edu.ucu.apps.lab.delivery;

import java.util.ArrayList;
import ua.edu.ucu.apps.lab.flower.Item;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public String deliver(ArrayList<Item> items) {
        return "DHL delivering";
    }
}
