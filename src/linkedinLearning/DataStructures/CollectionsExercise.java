package linkedinLearning.DataStructures;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CollectionsExercise {

    static void addToEndOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.add(i);
    }

    static void addToStartOfLinkedList(LinkedList<Integer> numbers2, int i) {
        numbers2.addFirst(i);
    }

    void removeItemFromTopOfStack(Deque<Integer> stack) {

    }

    void removeItemFromFrontOfQueue(Queue<Integer> queue) {

    }

    void addItemToTreeSet(Set<String> set, String item) {

    }

    public static void main(String[] args) {

        // Test addToEndOfLinkedList
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Before add: " + numbers);
        addToEndOfLinkedList(numbers,4);
        System.out.println("After add: " + numbers);
        System.out.println("\n------------------------\n");

        // Test addToStartOfLinkedList
        LinkedList<Integer> numbers2 = new LinkedList<>();
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        System.out.println("Before addFirst: " + numbers2);
        addToStartOfLinkedList(numbers2,1);
        System.out.println("After addFirst: " + numbers2);
    }
}
