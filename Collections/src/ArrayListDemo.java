

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    // 1. An ArrayList in Java is a resizable array implementation of the List interface.
    // 2. Unlike arrays, which have a fixed size, an ArrayList can dynamically grow or shrink as elements are added or removed.

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println(list);

        // To access the element use get() and print the result
        System.out.println("Element at index 2: " + list.get(2));

        // To modify the element using set() - index should be within list bounds
        list.set(2, "orange"); // Modifying the element at index 2 (last element)
        System.out.println("Modified List: " + list);
    }
}
