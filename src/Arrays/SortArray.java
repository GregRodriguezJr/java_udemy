package Arrays;

import java.util.Scanner;
import java.util.Arrays;   

// Create a program using arrays that sorts a list of integers in descending order.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

public class SortArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] myArr = getIntegers(5);
        System.out.println("Your array you entered: ");
        printArray(myArr);
        int [] newSortedArr = sortIntegers(myArr);
        System.out.println("Sorted array: ");
        printArray(newSortedArr);
    }


    public static int[] getIntegers(int size) {
        System.out.println("Enter " + size + " integer values.\r");
        int [] arrayValues = new int [size];
        for(int i = 0; i < arrayValues.length; i++) {
            arrayValues[i] = scanner.nextInt();
        }
        return arrayValues;
    }

    public static void printArray(int [] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + " value is " + array[i]);
        }
    }

    public static int [] sortIntegers(int [] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
