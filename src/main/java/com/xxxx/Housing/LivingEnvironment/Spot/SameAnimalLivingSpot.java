package com.xxxx.Housing.LivingEnvironment.Spot;

import com.xxxx.ZooAnimal.Animal;

import java.util.ArrayList;
import java.util.List;

public class SameAnimalLivingSpot <T extends Animal> extends LivingSpot<T> implements iLivableForAnimalType {
    List<T> animals;
    private Class<? extends T> animalType;


    public SameAnimalLivingSpot(int id, String name) {
        super(id, name);
        this.animals = new ArrayList<>();
        this.animalType = null;
    }

    public Class<? extends T> getAnimalType() {
        return animalType;
    }

    public void setAnimalType(Class<? extends T> animalType) {
        this.animalType = animalType;
    }

    public List<T> getAnimals() {
        return animals;
    }

    public void setAnimals(List<T> animals) {
        this.animals = animals;
    }

    public void addAnimalToSpot(Animal animal) {
        if (animalType == null) {
            animalType = (Class<T>) animal.getClass();
            animals.add((T) animal);
            System.out.println(" Add " + animal + " to same spot");
            return;
        }
        if (canLiveWith(animal)) {
            animals.add((T) animal);
            System.out.println(" Add" + animal + " to same spot");
        } else {
            throw new IllegalArgumentException("Animal type does not match for same spot living");
        }
    }

    @Override
    public boolean canLiveWith(Animal animal) {
        if (this.animalType ==  null) return true;

        return animalType.isAssignableFrom(animal.getClass());
    }
}
