package com.xxxx.Housing.LivingEnvironment.Spot;

import com.xxxx.ZooAnimal.Animal;

public abstract class LivingSpot<T extends Animal> implements iLivableForAnimalType {
    int id;
    String name;

    public LivingSpot(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void addAnimalToSpot(T animal);
}
