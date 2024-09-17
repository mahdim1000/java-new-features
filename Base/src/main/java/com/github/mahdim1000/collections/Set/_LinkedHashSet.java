package com.github.mahdim1000.collections.Set;

import java.util.LinkedHashSet;

/**
 * Use LinkedHashSet when you need to maintain insertion order.
 */
public class _LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple");  // Duplicate, will not be added

        // Display the LinkedHashSet (maintains insertion order)
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
