package ua.edu.ucu.apps.lab.flower;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private FlowerBucket flowerBucket;
    
    public double getPrice() {
        return flowerBucket.getPrice();
    }

    public String getDescription() {
        return "Simple Item";
    }

    
}
