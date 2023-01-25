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
}
