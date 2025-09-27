package com.xxxx.ZooAnimal;

import com.xxxx.Feeding.Food.Food;
import com.xxxx.Housing.LivingEnvironment.Habitat;

public abstract class Animal {
    private String name;
    private String type;
    private Habitat habitat;
    private Food food;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Animal(String name, Food food) {
        this.name = name;
        this.food = food;
    }

    public Animal(String name, String type, Habitat habitat) {
        this.name = name;
        this.type = type;
        this.habitat = habitat;
    }

    public Animal(String name, String type, Habitat habitat, Food food) {
        this.name = name;
        this.type = type;
        this.habitat = habitat;
        this.food = food;
    }

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", habitat=" + habitat +
                '}';
    }
}
