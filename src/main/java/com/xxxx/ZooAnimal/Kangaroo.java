package com.xxxx.ZooAnimal;

import com.xxxx.Food.Food;
import com.xxxx.Food.HerbivoreFood.Fruit;

public class Kangaroo extends Animal {
    public Kangaroo(String name) {
        super("Kangaroo");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Fruit) {
            System.out.println("Inside Kangaroo eat method");
            System.out.println( "" + super.getName() + " is eating " + food.getName() + " of type " + food.getType() + " and price " + food.getPrice());
        } else {
            System.out.println("Kangaroo can only eat" + Fruit.class.getName() + ". It cant eat " + food.getName());
        }
    }
}
