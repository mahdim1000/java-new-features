package com.github.mahdim1000.collections.List;

import java.util.Vector;

/**
 * Vector is synchronized (thread-safe), which makes it slower than ArrayList in single-threaded applications.
 * equivalent with Collections.synchronizedList()
 */
public class _Vector {
    public static void main(String[] args) {
        // Creating a Vector of integers
        Vector<Integer> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Adding an element at a specific index
        vector.add(1, 15);  // Inserts 15 at index 1

        // Display the Vector
        System.out.println("Vector: " + vector);  // Output: [10, 15, 20, 30]

        // Removing an element at index 2
        vector.remove(2);

        // Display the Vector after removal
        System.out.println("After removal: " + vector);  // Output: [10, 15, 30]

        // Accessing elements
        System.out.println("Element at index 1: " + vector.get(1));  // Output: 15

        // Checking the size of the Vector
        System.out.println("Size of Vector: " + vector.size());  // Output: 3
    }
}
