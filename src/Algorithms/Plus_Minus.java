package Algorithms;
import java.util.ArrayList;

public class Plus_Minus {
    // Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

    // int arr[n]: an array of integers

    // Prints the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.


    public static void main(String[] args) {
        int n = 5;
        int[] myArray = new int[n];
        ArrayList<Integer> newArray = new ArrayList<>();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        myArray[0] = 0;
        myArray[1] = 2;
        myArray[2] = 4;
        myArray[3] = 6;
        myArray[4] = -8;

        for(int i = 0; i < myArray.length; i++) {
            if(myArray[i] > 0) {
                positiveCount++;
            }
            if (myArray[i] < 0) {
                negativeCount++;
            }
            if (myArray[i] == 0) {
                zeroCount++;
            }
        }
        newArray.add(positiveCount);
        newArray.add(negativeCount);
        newArray.add(zeroCount);

        double result1 = (double)newArray.get(0) / n;
        double result2 = (double)newArray.get(1) / n;
        double result3 = (double)newArray.get(2) / n;

        System.out.printf("%.6f \n",result1);
        System.out.printf("%.6f \n",result2);
        System.out.printf("%.6f \n",result3);
    }

}
