package com.github.mahdim1000.collections.List;

import java.util.LinkedList;

/**
 * LinkedList is a doubly linked list implementation of the List and Deque interfaces.
 * It allows for fast insertions and deletions because nodes are linked to one another.
 * However, random access (getting elements by index) is slower compared to ArrayList
 */
public class _LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Adding an element at the first and last position
        linkedList.addFirst("First Element");
        linkedList.addLast("Last Element");

        // Display the LinkedList
        System.out.println("LinkedList: " + linkedList);  // Output: [First Element, Apple, Banana, Cherry, Last Element]

        // Removing the first and last elements
        linkedList.removeFirst();
        linkedList.removeLast();

        // Display the LinkedList after removal
        System.out.println("After removal: " + linkedList);  // Output: [Apple, Banana, Cherry]

        // Accessing elements
        System.out.println("First element: " + linkedList.getFirst());  // Output: Apple
        System.out.println("Last element: " + linkedList.getLast());    // Output: Cherry
    }

}
