package com.xxxx.Feeding;

import com.xxxx.ZooAnimal.Animal;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class FeedingTimeRecord {
    Date timeWasFed;
    Animal animal;

    public FeedingTimeRecord(Animal animal) {
        Random rand = new Random();
        int X = rand.nextInt(101);
        this.timeWasFed = generateFeedingTime_X_MinutesFromNow(X);
        this.animal = animal;
    }

    public FeedingTimeRecord() {
        this.timeWasFed = new Date();
        this.animal = null;
    }

    public Date getTimeWasFed() {
        return timeWasFed;
    }

    public void setTimeWasFed(Date timeWasFed) {
        this.timeWasFed = timeWasFed;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date generateFeedingTime_X_MinutesFromNow(int X) {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.MINUTE, X);      // add 30 minutes
        return cal.getTime();
    }
}
