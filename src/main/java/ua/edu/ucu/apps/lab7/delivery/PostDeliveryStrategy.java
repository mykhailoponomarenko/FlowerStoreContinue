package ua.edu.ucu.apps.lab7.delivery;

import ua.edu.ucu.apps.lab7.flower.Item;
import java.util.ArrayList;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(ArrayList<Item> items) {
        return "Nova poshta robe";
    }
    
}
