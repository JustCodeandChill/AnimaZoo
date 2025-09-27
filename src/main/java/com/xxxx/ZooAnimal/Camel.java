package com.xxxx.ZooAnimal;

import com.xxxx.Feeding.Food.Food;
import com.xxxx.Feeding.Food.HerbivoreFood.Grass;

public class Camel extends Animal {
    public Camel(String name) {
        super("Camel " + name, "camel");
    }

    public Camel() {
        super("Camel ", "camel");
    }

    public Camel(String name, Food food) {
        super(name, food);
    }

    @Override
    public void eat() {
        Food food = this.getFood();
        if (this.getFood() instanceof Grass) {
            System.out.println( "" +
                    this.getName() + " is eating " +
                    food.getName() + " of type " +
                    food.getType() + " and price " +
                    food.getPrice());
        } else {
            throw new IllegalArgumentException("Camel can only eat grass. It cant eat " + food.getName());
        }
    }
}
