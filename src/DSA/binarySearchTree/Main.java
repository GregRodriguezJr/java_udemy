package DSA.binarySearchTree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

//        System.out.println("root = " + myBST.root);

//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(70);
//        myBST.insert(18);
//        myBST.insert(52);
//        myBST.insert(82);
//        myBST.insert(27);

//        // Test insert method
//        myBST.insert(27);
//        System.out.println(myBST.root.left.right.value);

//        // Test contains method
//        System.out.println(myBST.contains(27));
//        System.out.println(myBST.contains(17));

//        // Test recursive binary search tree
//        System.out.println("\nBST Contains 27:");
//        System.out.println(myBST.rContains(27));
//
//        System.out.println("\nBST Contains 17:");
//        System.out.println(myBST.rContains(17));

//        // Test recursive insert method
//        myBST.rInsert(2);
//        myBST.rInsert(1);
//        myBST.rInsert(3);
//
//        System.out.println("\nRoot: " + myBST.root.value);
//        System.out.println("\nRoot->Left: " + myBST.root.left.value);
//        System.out.println("\nRoot->Right: " + myBST.root.right.value);

        // Test delete node method
        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);

        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);
        myBST.deleteNode(2);

        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right);
    }
}
