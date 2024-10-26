package ua.edu.ucu.apps.lab.flower;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.lab.payment.Payment;

@Getter
@Setter
public class Order {
    private List<Item> items;
    private Payment payment;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateFinal() {
        double sum = items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
        return payment.pay(sum);
    }

}
