package com.xxxx.Visiting.TicketService;

import com.xxxx.ZooAnimal.Animal;

import java.util.List;
import java.util.stream.Stream;

public class TicketToFeedAnimal extends  Ticket {
    private List<Animal> animalsToFeed;
    private double basePrice = 10.0;

    public TicketToFeedAnimal() {
        super("Ticket to feed Animal");
        this.setPrice(basePrice);
    }

    public TicketToFeedAnimal(List<Animal> animalsToFeed) {
        this();
        this.animalsToFeed = animalsToFeed;
    }

    public List<Animal> getAnimalsToFeed() {
        return animalsToFeed;
    }

    public void setAnimalsToFeed(List<Animal> animalsToFeed) {
        this.animalsToFeed = animalsToFeed;
    }


    @Override
    public double calculateTotalPrice() {
        double finalPrice = animalsToFeed.stream()
                .mapToDouble(animal -> animal.getFood().getPrice())
                .sum();
        return finalPrice;
    }
}
