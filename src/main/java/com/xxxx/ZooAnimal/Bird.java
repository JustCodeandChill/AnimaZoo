package com.xxxx.ZooAnimal;

import com.xxxx.Feeding.Food.Food;
import com.xxxx.Housing.LivingEnvironment.Habitat;

public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name, "bird");
    }

    public Bird(String name, Food food) {
        super(name, food);
    }

    public Bird(String name, String type) {
        super(name, "bird");
    }

    public Bird(String name, String type, Habitat habitat) {
        super(name, type, habitat);
    }

    public Bird(String name, String type, Habitat habitat, Food food) {
        super(name, type, habitat, food);
    }

}
