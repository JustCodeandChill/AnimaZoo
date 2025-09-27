package com.xxxx.ZooAnimal;

import com.xxxx.Feeding.Food.CarnivoreFood.FreshMeat;
import com.xxxx.Feeding.Food.CarnivoreFood.WormsMeat;
import com.xxxx.Feeding.Food.Food;
import com.xxxx.Feeding.Food.HerbivoreFood.Fruit;

public class Kangaroo extends Animal {
    public Kangaroo(String name) {
        super("Kangaroo");
    }

    public Kangaroo(String name, Food food) {
        super(name, food);
    }

    @Override
    public void eat() {
        Food food = this.getFood();
        if (this.getFood() instanceof FreshMeat) {
            System.out.println( "" +
                    this.getName() + " is eating " +
                    food.getName() + " of type " +
                    food.getType() + " and price " +
                    food.getPrice());
        } else {
            throw new IllegalArgumentException(this.getName() + "can only eat" + FreshMeat.class.getName() + ". It cant eat " + food.getName());
        }
    }
}
