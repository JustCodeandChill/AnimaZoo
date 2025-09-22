package com.xxxx.ZooAnimal;

public class Bird extends Animal {
    public Bird(String name) {
        super(name, "bird" + name);
    }

    public Bird(String name, String type) {
        super(name, "bird");
    }
}
