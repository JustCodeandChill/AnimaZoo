package com.xxxx.ZooAnimal;

import com.xxxx.Food.Food;

public abstract class Animal {
    private String name;
    private String type;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void eat(Food food) {
        System.out.println( "" +
                this.name + " is eating " +
                food.getName() + " of type " +
                food.getType() + " and price " +
                food.getPrice());
    }

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
}
