package com.xxxx.ZooAnimal;

import com.xxxx.Food.CarnivoreFood.FreshMeat;
import com.xxxx.Food.Food;

public class Eagle extends Bird{
    public Eagle(String name) {
        super("Eagle" + name);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof FreshMeat) {
            System.out.println("Inside Eagle eat method");
            System.out.println( "" + super.getName() + " is eating " + food.getName() + " of type " + food.getType() + " and price " + food.getPrice());
        } else {
            System.out.println("Eagle can only eat worms. It cant eat " + food.getName());
        }
    }
}
