package com.xxxx.Food.CarnivoreFood;

import com.xxxx.Food.Food;

public abstract class CarnivoreFood extends Food {
    private String type = "carnivore";

    public CarnivoreFood(String name, double price) {
        super(name, price, "carnivore");
    }
}
