package DSA.doublyLinkedList;


public class Main {
    public static void main(String[] args) {

//        // Test constructor for DDL
//        DoublyLinkedList myDLL = new DoublyLinkedList(7);
//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//        myDLL.printList();

//        // Test append method
//        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.append(2);
//        myDLL.printList();

//        // Test remove last method
//        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.append(2);
//        // 2 Items - Returns 2 node
//        System.out.println(myDLL.removeLast().value);
//        // 1 Items - Returns  node
//        System.out.println(myDLL.removeLast().value);
//        // 0 Items - Returns null
//        System.out.println(myDLL.removeLast());

//        // Test prepend method
//        DoublyLinkedList myDLL = new DoublyLinkedList(2);
//        myDLL.append(3);
//        myDLL.prepend(1);
//        myDLL.printList();

//        // Test Remove first method
//        DoublyLinkedList myDLL = new DoublyLinkedList(2);
//        myDLL.append(1);
//        // 2 Items - Returns 2 node
//        System.out.println(myDLL.removeFirst().value);
//        // 1 Items - Returns 1 node
//        System.out.println(myDLL.removeFirst().value);
//        // 0 Items - Returns null
//        System.out.println(myDLL.removeFirst());

//        // Test get method
//        DoublyLinkedList myDLL = new DoublyLinkedList(0);
//        myDLL.append(1);
//        myDLL.append(2);
//        myDLL.append(3);
//        System.out.println(myDLL.get(1).value);
//        System.out.println(myDLL.get(2).value + "\n");
//        myDLL.printList();

        // Test set method
        DoublyLinkedList myDLL = new DoublyLinkedList(11);
        myDLL.append(3);
        myDLL.append(23);
        myDLL.append(7);
        myDLL.printList();
        System.out.println("-----");
        myDLL.set(1, 4);
        myDLL.printList();
    }
}
