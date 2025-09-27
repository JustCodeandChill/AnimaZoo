package com.xxxx.Feeding.Food.HerbivoreFood;

import com.xxxx.Feeding.Food.Food;

public class HerbivoreFood extends Food {
    private String type = "herbivore";

    public HerbivoreFood(String name, double price) {
        super(name, price, "herbivore");
    }
}
