package linkedinLearning.DataStructures;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExamples {

    public static void main(String[] args) {

        // First element in the queue is the first element out
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Person one");
        queue.offer("Person two");
        queue.offer("Person three");
        System.out.println(queue);

        // Returns the first element
        System.out.println(queue.peek());

        // Removes first element
        queue.poll();
        System.out.println(queue);
    }
}
