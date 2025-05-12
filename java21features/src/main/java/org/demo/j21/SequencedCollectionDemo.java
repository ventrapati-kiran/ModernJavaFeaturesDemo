package org.demo.j21;

import java.util.ArrayList;
import java.util.SequencedCollection;

/**
 * Sequenced Collections
 * Sequenced collections provide a consistent API for collections with a defined encounter order.
 * 
 * Use Case:
 * Useful for collections where the order of elements matters, such as queues or deques.
 * 
 * How to Use:
 * Use methods like `addFirst`, `addLast`, `getFirst`, and `getLast` for sequenced collections.
 */
public class SequencedCollectionDemo {
    public static void main(String[] args) {
        SequencedCollection<String> names = new ArrayList<>();
        names.addFirst("Alice");
        names.addLast("Bob");

        System.out.println("First: " + names.getFirst());
        System.out.println("Last: " + names.getLast());
    }
}