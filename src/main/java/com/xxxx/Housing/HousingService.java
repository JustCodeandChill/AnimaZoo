package com.xxxx.Housing;

import com.xxxx.Housing.LivingEnvironment.Spot.LivingSpot;
import com.xxxx.ZooAnimal.Animal;

import java.util.HashSet;
import java.util.Set;

public class HousingService {
    Set<LivingSpot<Animal>> spots;

    public HousingService(Set<LivingSpot<Animal>> spots) {
        this.spots = spots;
    }

    public HousingService() {
        this.spots = new HashSet<>();
    }

    public Set<LivingSpot<Animal>> getSpots() {
        return spots;
    }

    public void setSpots(Set<LivingSpot<Animal>> spots) {
        this.spots = spots;
    }

    public void assignAnimalToSpot(Animal animal, LivingSpot<Animal> spot) {
        if (!spots.contains(spot)) {
            throw new IllegalArgumentException("Spot does not exist");
        }
        if (!spot.canLiveWith(animal)) {
            throw new IllegalArgumentException("Animal type does not match for spot");
        }
        spot.addAnimalToSpot(animal);
    }

    public void addSpot(LivingSpot<Animal> spot) {
        spots.add(spot);
    }
}
