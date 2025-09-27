package com.xxxx.Housing.LivingEnvironment.Spot;

import com.xxxx.ZooAnimal.Animal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferentAnimalLivingSpot<T extends Animal> extends LivingSpot<T> implements iLivableForAnimalType {
    List<T> animals;
    private Set<Class<? extends T>> animalTypes;

    public DifferentAnimalLivingSpot(int id, String name) {
        super(id, name);
        this.animals = new ArrayList<>();
        this.animalTypes = new HashSet<>();
    }

    public Set<Class<? extends T>> getAnimalTypes() {
        return animalTypes;
    }

    public void setAnimalTypes(Set<Class<? extends T>> animalTypes) {
        this.animalTypes = animalTypes;
    }

    public List<T> getAnimals() {
        return animals;
    }

    public void setAnimals(List<T> animals) {
        this.animals = animals;
    }

    public void addAnimalToSpot(Animal animal) {
        // add whether the animal type is sublass or not animalType.isAssignableFrom(animal.getClass())
        if (canLiveWith(animal) ) {
            animalTypes.add((Class<? extends T>) animal.getClass());
            animals.add((T) animal);
            System.out.println(" Add " + animal + " to a spot with different animal types");
        } else {
            throw new IllegalArgumentException("Animal type does not match for same spot living");
        }
    }

    @Override
    public boolean canLiveWith(Animal animal) {
        return !animalTypes.contains(animal.getClass()) ;
    }
}
