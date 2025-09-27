package com.xxxx.Feeding;

import com.xxxx.Main;
import com.xxxx.ZooAnimal.Animal;

import java.util.*;
import java.util.logging.Logger;

public class FeedingService {
    FeedingTimeDAO feedingTimeDAO;

    public FeedingService() {
        feedingTimeDAO = new FeedingTimeDAO();
    }

    public void addAnimalToFeed(Animal animal) {
        feedingTimeDAO.add(animal);
    }

    public void feedAnimals() {
        // Get the queue sorted by feeding time
        Queue<FeedingTimeRecord> feedingQueue = feedingTimeDAO.getFeedingQueue();

        // call feed method for each animal in the queue
        while (!feedingQueue.isEmpty()) {
            FeedingTimeRecord row = feedingQueue.poll();
            System.out.println("|| Feeding " + row.getAnimal().getName() + "first; because it was last fed at " + row.getTimeWasFed() + " ||");
            Animal animal = row.getAnimal();
            animal.eat();
        }
    }
}
