package com.github.mahdim1000.collections.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * Use HashSet for fast lookups and when order does not matter.
 */
public class _HashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");  // Duplicate, won't be added
        System.out.println(set);  // Output: [Apple, Banana]
    }
}
