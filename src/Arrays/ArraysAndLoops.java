package Arrays;

import java.util.Objects;
import java.util.Scanner;

public class ArraysAndLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kingdoms = {"Mercia", "Wessex", "Northumbria", "East Anglia"};

        for (int i = 0; i < kingdoms.length; i++) {
            System.out.println("index " + i + ": " + kingdoms[i]);
        }

        // Workbook 6.2
        String[] students = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " you will take seat " + i);
        }

        // Workbook 6.3
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        System.out.println("\nDo you sell coffee?");

        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i].equals("coffee")) {
                System.out.println("We have that in aisle: " + i + "\n");
            }
        }

        // Workbook 6.4
        boolean hasItem = false;

        System.out.println("""
                Welcome to Java Grocers!
                What can I help you find?""");
        String userInput = scanner.nextLine();

        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i].equals(userInput)) {
                System.out.println("We have that in aisle " + i);
                hasItem = true;
            }
        }

        if (!hasItem) {
            System.out.println("We dont have that item");
        }
    }
}
