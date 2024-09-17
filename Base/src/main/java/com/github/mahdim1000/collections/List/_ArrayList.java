package com.github.mahdim1000.collections.List;


/**
 * Use ArrayList when you need fast random access (getting elements by index)
 * and frequent read operations.
 */
public class _ArrayList {
    public static void main(String[] args) {
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");  // Allows duplicates
        System.out.println(list);  // Output: [Apple, Banana, Apple]
    }
}

