package com.xxxx;

import com.xxxx.Feeding.FeedingService;
import com.xxxx.Feeding.Food.CarnivoreFood.FreshMeat;
import com.xxxx.Feeding.Food.CarnivoreFood.WormsMeat;
import com.xxxx.Housing.HousingService;
import com.xxxx.Housing.LivingEnvironment.Spot.DifferentAnimalLivingSpot;
import com.xxxx.Housing.LivingEnvironment.Spot.LivingSpot;
import com.xxxx.Housing.LivingEnvironment.Spot.SameAnimalLivingSpot;
import com.xxxx.Visiting.EntryService.EntryService;
import com.xxxx.Visiting.TicketService.NormalTicket;
import com.xxxx.Visiting.TicketService.TicketService;
import com.xxxx.Visiting.TicketService.TicketToFeedAnimal;
import com.xxxx.Visiting.Visitor;
import com.xxxx.ZooAnimal.*;

import java.util.Arrays;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        testHousingService();
        testFeedingService();
        testEntryService();
        testTicketService();

    }

    public static void testTicketService() {
        Animal c1 = new Chicken("House Range");
        c1.setFood(new WormsMeat());
        Animal c2 = new Eagle("American Eagle");
        c2.setFood(new FreshMeat());
        Animal k1 = new Kangaroo("Kangaroo");
        k1.setFood(new FreshMeat());
        TicketService ticketService = new TicketService();
        ticketService.addTicketToVisitor(new TicketToFeedAnimal(Arrays.asList(c1, c2, k1)), new Visitor("John", 87));
        ticketService.addTicketToVisitor(new NormalTicket(), new Visitor("Keith", 89));

        ticketService.getTicketTotalPrice();
    }

    public static void testEntryService() {
        EntryService entryService = new EntryService();
        Visitor v1 = new Visitor("John", 87);
        Visitor v2 = new Visitor("Keith", 89);
        Visitor v3 = new Visitor("Lenna", 10);
        Visitor v4 = new Visitor("Xaz", 24);
        Visitor v5 = new Visitor("Lisa", 30);
        entryService.addVisitor(v1);
        entryService.addVisitor(v2);
        entryService.addVisitor(v3);
        entryService.addVisitor(v4);
        entryService.addVisitor(v5);
        entryService.processEntry();
    }

    public static void testHousingService() {
        System.out.println("Test Housing Service");
        HousingService hs = new HousingService();
        // Spot for same type animals
        LivingSpot<Animal> chickenSpot = new SameAnimalLivingSpot<Animal>(1, "Spot 1 For chicken only");
        hs.addSpot(chickenSpot);

        // Spot for different type animals
        LivingSpot<Animal> differentAnimalSpot = new DifferentAnimalLivingSpot<Animal>(2, "Spot 2 For different animal");
        hs.addSpot(differentAnimalSpot);

        // Animals to test whether can live with each other or not in a spot
        Animal c1 = new Chicken("HouseRange");
        Animal c2 = new Chicken("Farm");
        Animal k1 = new Kangaroo("Kangaroo");
        hs.assignAnimalToSpot(c1, chickenSpot);
        hs.assignAnimalToSpot(c2, chickenSpot);
        hs.assignAnimalToSpot(c1, differentAnimalSpot);
        hs.assignAnimalToSpot(k1, differentAnimalSpot);
        System.out.println("--------------------------------");
    }

    public static void testFeedingService() {
        System.out.println("Test Feeding Service");
        FeedingService feedingService = new FeedingService();
        Animal c1 = new Chicken("House Range");
        c1.setFood(new WormsMeat());
        Animal c2 = new Eagle("American Eagle");
        c2.setFood(new FreshMeat());
        Animal k1 = new Kangaroo("Kangaroo");
        k1.setFood(new FreshMeat());

        feedingService.addAnimalToFeed(c1);
        feedingService.addAnimalToFeed(c2);
        feedingService.addAnimalToFeed(k1);
        feedingService.feedAnimals();
        System.out.println("--------------------------------");
    }
}