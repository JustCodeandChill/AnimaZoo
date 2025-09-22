package com.xxxx.ZooAnimal;

import com.xxxx.Food.Food;
import com.xxxx.Food.HerbivoreFood.Grass;

public class Camel extends Animal {
    public Camel(String name) {
        super("Camel");
    }

    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Inside Camel eat method");
            System.out.println( "" + super.getName() + " is eating " + food.getName() + " of type " + food.getType() + " and price " + food.getPrice());
        } else {
            System.out.println("Camel can only eat grass. It cant eat " + food.getName());
        }

    }
}
