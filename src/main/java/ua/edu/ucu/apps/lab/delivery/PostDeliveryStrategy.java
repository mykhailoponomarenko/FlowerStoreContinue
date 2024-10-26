package ua.edu.ucu.apps.lab.delivery;

import ua.edu.ucu.apps.lab.flower.Item;
import java.util.ArrayList;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(ArrayList<Item> items) {
        return "Nova poshta robe";
    }
    
}
