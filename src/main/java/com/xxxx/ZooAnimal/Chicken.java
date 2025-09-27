package com.xxxx.ZooAnimal;

import com.xxxx.Feeding.Food.CarnivoreFood.WormsMeat;
import com.xxxx.Feeding.Food.Food;
import com.xxxx.Feeding.Food.HerbivoreFood.Grass;

public class Chicken extends Bird{
    public  Chicken(String name) {
        super("Chicken" + name);
    }

    @Override
    public void eat() {
        Food food = this.getFood();
        if (this.getFood() instanceof WormsMeat) {
            System.out.println( "" +
                    this.getName() + " is eating " +
                    food.getName() + " of type " +
                    food.getType() + " and price " +
                    food.getPrice());
        } else {
            throw new IllegalArgumentException(this.getName() + "can only eat" + WormsMeat.class.getName() + ". It cant eat " + food.getName());
        }
    }
}
