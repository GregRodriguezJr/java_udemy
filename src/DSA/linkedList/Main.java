package DSA.linkedList;

public class Main {
    public static void main(String[] args) {

//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//
////        myLinkedList.getHead();
////        myLinkedList.getTail();
////        myLinkedList.getLength();
////        myLinkedList.printList();
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeLast().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeLast().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeLast());

        // Test prepend
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
        myLinkedList.prepend(1);
        myLinkedList.printList();
    }
}
