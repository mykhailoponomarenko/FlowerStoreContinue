package ua.edu.ucu.apps.lab7.flower;

import java.util.List;
import java.util.ArrayList;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks;


    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }


    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;

    }



}