package com.xxxx.Feeding;

import com.xxxx.ZooAnimal.Animal;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 
 * This is a DAO that keep track of an animal and the time it was last fed.
 * It uses a priority queue to sort the animals in order of their last fed time.
 *
 */
public class FeedingTimeDAO {
    Queue<FeedingTimeRecord> feedingQueue;

    public FeedingTimeDAO() {
        // add rule to compare by last fed time
        Comparator<FeedingTimeRecord> comparator =
                (FeedingTimeRecord r1, FeedingTimeRecord r2) -> {return r1.getTimeWasFed().compareTo(r2.getTimeWasFed());};

        feedingQueue = new PriorityQueue<>(comparator);
    }

    public void add(Animal animal) {
        FeedingTimeRecord record = new FeedingTimeRecord(animal);
        feedingQueue.add(record);
    }

    public Queue<FeedingTimeRecord> getFeedingQueue() {
        return feedingQueue;
    }

    public void setFeedingQueue(Queue<FeedingTimeRecord> feedingQueue) {
        this.feedingQueue = feedingQueue;
    }
}
