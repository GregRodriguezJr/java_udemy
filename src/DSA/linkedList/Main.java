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
//        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.append(3);
//        myLinkedList.prepend(1);
//        myLinkedList.printList();

//        // Test removeFirst
//        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.append(1);
//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeFirst());

//        // Test get method
//        LinkedList myLinkList = new LinkedList(0);
//        myLinkList.append(1);
//        myLinkList.append(2);
//        myLinkList.append(3);
//        System.out.println(myLinkList.get(2).value + "\n");
//        myLinkList.printList();

//        // Test set method
//        LinkedList myLinkedList = new LinkedList(11);
//        myLinkedList.append(3);
//        myLinkedList.append(23);
//        myLinkedList.append(7);
//        myLinkedList.printList();
//        System.out.println("After set method");
//        myLinkedList.set(1, 4);
//        myLinkedList.printList();

        // Test insert method
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(2);
        myLinkedList.insert(1,1);
        myLinkedList.printList();
    }
}
