package com.xxxx;

import com.xxxx.Food.CarnivoreFood.FreshMeat;
import com.xxxx.Food.Food;
import com.xxxx.Zoo.Zoo;
import com.xxxx.ZooAnimal.Animal;
import com.xxxx.ZooAnimal.Camel;
import com.xxxx.ZooAnimal.Chicken;
import com.xxxx.ZooAnimal.Eagle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Program generate an order for zoo based on the animal type and quantity to display the order for the zoo
        // add animal to the zoo
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Chicken("HouseRange"));
        zoo.addAnimal(new Eagle("American"));
        zoo.addAnimal(new Camel("Arabian"));

        // add food to the order
        List<Food> foods = new ArrayList<>();
        for (int i = 0; i < zoo.getAnimals().size(); i++) {
            foods.add(new FreshMeat());
        }

        Iterator<Animal> iterator1 = zoo.getAnimals().iterator();
        Iterator<Food> iterator2 = foods.iterator();

        while (iterator1.hasNext()) {
            Animal animal = iterator1.next();
            Food food = iterator2.next();

            animal.eat(food);
        }
    }
}