package DSA.linkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    //  Inner/nested class
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        // Test if LinkList is empty from starting point
        if (length == 0) return null;

        Node temp = head;
        Node pre = head;

        // Iterate through LinkedList to find pointer that points to next to last node
        while (temp.next != null) {
            // Walk through list until reaches the end
            pre = temp;
            temp = temp.next;
        }
        // Breaks out of loop and points tail to that node
        tail = pre;
        // Breaks off node from the end of the LinkedList
        tail.next = null;
        // Decrement by 1
        length--;

        // Edge case after while loop, if only 1 node after decrement head and tail still point to that node
        if (length == 0) {
            head = null;
            tail = null;
        }
        // return node
        return temp;
    }

    public void prepend(int value) {
        // Create new node
        Node newNode = new Node(value);
        // Empty LinkList point head and tail to new node
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            // Point new node to head
            newNode.next = head;
            // Move head to beginning
            head = newNode;
        }
        // increase length by 1
        length++;
    }

    public Node removeFirst() {
        // Empty LinkList head and tail are null
        if (length == 0) {
            return null;
        }
        // Point temp variable to head of list
        Node temp = head;
        // Point head to next node
        head = head.next;
        // Remove node by pointing next node to null
        temp.next = null;
        // Decrement list
        length--;
        // Edge case if only 1 node and try to remove first
        if (length ==0 ) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        // If index is out of LinkList range
        if (index < 0 || index >= length) {
            return null;
        }
        // Assign temp variable to head of LinkList
        Node temp = head;
        // Loop through list until index is found
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
