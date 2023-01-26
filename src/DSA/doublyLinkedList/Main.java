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

        // Test remove last method
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        // 2 Items - Returns 2 node
        System.out.println(myDLL.removeLast().value);
        // 1 Items - Returns  node
        System.out.println(myDLL.removeLast().value);
        // 0 Items - Returns null
        System.out.println(myDLL.removeLast());
    }
}
