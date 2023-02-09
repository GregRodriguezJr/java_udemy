package linkedinLearning.DataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {

    public static void main(String[] args) {

        // Test linked list and methods
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");
        System.out.println(shoppingList);

        shoppingList.add(1, "mango");
        System.out.println(shoppingList);

        shoppingList.removeFirst();
        shoppingList.removeLast();
        System.out.println(shoppingList);

        shoppingList.add("apple");
        shoppingList.add("pear");

        // synchronized list to be thread safe
        List<String> syncShoppingList = Collections.synchronizedList(shoppingList);
        System.out.println(syncShoppingList);
    }
}
