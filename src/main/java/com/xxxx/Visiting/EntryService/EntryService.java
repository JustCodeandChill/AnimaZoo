package com.xxxx.Visiting.EntryService;

import com.xxxx.Visiting.Visitor;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class EntryService {
    Queue<Visitor> visitors;

    public EntryService() {
        // The rule: children first, then adults, then elders
        visitors = new PriorityQueue<>(visitorComparator);
    }

    Comparator<Visitor> visitorComparator = (v1, v2) -> {
        // Children first, older child first
        if (v1.isChildren() && v2.isChildren()) return Integer.compare(v2.getAge(), v1.getAge());
        if (v1.isChildren()) return -1;       // v1 is child, v2 is not → v1 first
        if (v2.isChildren()) return 1;        // v2 is child → v2 first

        // Elders next, older elder first
        if (v1.isElder() && v2.isElder()) return Integer.compare(v2.getAge(), v1.getAge());
        if (v1.isElder()) return -1;          // v1 is elder, v2 is not → v1 first
        if (v2.isElder()) return 1;           // v2 is elder → v2 first

        // Adults: younger adult first
        return Integer.compare(v1.getAge(), v2.getAge());
    };

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void processEntry() {
        while (!visitors.isEmpty()) {
            Visitor visitor = visitors.poll();
            System.out.println("|| " + visitor.getName() + " is entering the zoo ||");
        }
    }


}
