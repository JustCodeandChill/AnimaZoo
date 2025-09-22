package com.xxxx.Food.HerbivoreFood;

import com.xxxx.Food.Food;

public class HerbivoreFood extends Food {
    private String type = "herbivore";

    public HerbivoreFood(String name, double price) {
        super(name, price, "herbivore");
    }
}
