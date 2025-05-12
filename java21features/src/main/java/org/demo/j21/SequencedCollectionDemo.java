package org.demo.j21;

import java.util.ArrayList;
import java.util.SequencedCollection;

/*8
 * Sequenced collections provide a consistent API for collections with a defined encounter order.
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