package linkedinLearning.DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExamples {

    public static void main(String[] args) {

        // First element you add is the last element to take out
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First request");
        stack.push("Second request");
        stack.push("Third request");
        System.out.println(stack);

        // Remove first element in the stack
        stack.pop();
        System.out.println(stack);
    }
}
