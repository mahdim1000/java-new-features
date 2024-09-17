package com.github.mahdim1000.collections.Set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Use TreeSet when you need a sorted set.
 */
public class _TreeSet {
    public static void main(String[] args) {
//        defaultSort();
//        preserveSort();
        customSort();
    }

    public static void defaultSort() {
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Apple");  // Duplicate, will not be added

        // Display the TreeSet (sorted in natural order)
        System.out.println("TreeSet: " + treeSet);  // Output: [Apple, Banana, Cherry]
    }

    public static void preserveSort() {
        TreeSet<String> treeSet = new TreeSet<>(Comparator.reverseOrder());

        // Adding elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Mango");

        // Display the TreeSet (in reverse alphabetical order)
        System.out.println("TreeSet with reverse order: " + treeSet);  // Output: [Mango, Cherry, Banana, Apple]
    }

    public static void customSort() {
        // Creating a TreeSet with a custom comparator that sorts by string length
        TreeSet<String> treeSet = new TreeSet<>(Comparator.comparingInt(String::length));

        // Adding elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Kiwi");
        treeSet.add("Cherry");

        // Display the TreeSet (sorted by string length)
        System.out.println("TreeSet sorted by length: " + treeSet);  // Output: [Kiwi, Apple, Banana, Cherry]
    }

}
