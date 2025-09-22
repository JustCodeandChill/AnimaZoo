package com.xxxx.ZooAnimal;

import com.xxxx.Food.CarnivoreFood.WormsMeat;
import com.xxxx.Food.Food;

public class Chicken extends Bird{
    public  Chicken(String name) {
        super("Chicken" + name);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof WormsMeat) {
            System.out.println("Inside Chicken eat method");
            System.out.println( "" + super.getName() + " is eating " + food.getName() + " of type " + food.getType() + " and price " + food.getPrice());
        } else {
            System.out.println("Chicken can only eat grass. It cant eat " + food.getName());
        }
    }
}
