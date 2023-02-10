package linkedinLearning.DataStructures;

import java.util.*;

public class CollectionsExercise {

    static void addToEndOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.add(i);
    }

    static void addToStartOfLinkedList(LinkedList<Integer> numbers2, int i) {
        numbers2.addFirst(i);
    }

    static void removeItemFromTopOfStack(Deque<Integer> stack) {
        stack.pop();
    }

    static void removeItemFromFrontOfQueue(Queue<Integer> queue) {
        queue.remove();
    }

    void addItemToTreeSet(Set<String> set, String item) {

    }

    public static void main(String[] args) {

        // Test addToEndOfLinkedList
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Add to end method for LinkList\n");
        System.out.println("Before add(): " + numbers);
        addToEndOfLinkedList(numbers,4);
        System.out.println("After add(): " + numbers);

        System.out.println("\n------------------------\n");

        // Test addToStartOfLinkedList
        LinkedList<Integer> numbers2 = new LinkedList<>();
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        System.out.println("Add to beginning method for LinkedList\n");
        System.out.println("Before addFirst(): " + numbers2);
        addToStartOfLinkedList(numbers2,1);
        System.out.println("After addFirst(): " + numbers2);

        System.out.println("\n------------------------\n");

        // Test removing an item from the top of the stack
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack with ArrayDeque\n");
        System.out.println("Before pop(): " + stack);
        removeItemFromTopOfStack(stack);
        System.out.println("After pop(): " + stack);

        System.out.println("\n------------------------\n");

        // Test removing item from queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("Queue with LinkedList\n");
        System.out.println("Before remove(): " + queue);
        removeItemFromFrontOfQueue(queue);
        System.out.println("After remove(): " + queue);

        System.out.println("\n------------------------\n");
    }
}
