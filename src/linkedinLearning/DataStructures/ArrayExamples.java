package linkedinLearning.DataStructures;

import java.util.Arrays;

public class ArrayExamples {

    public static void incrementArray(int[] array) {
        for ( int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }

    public static void main(String[] args) {

        // Test adding values to array
        String[] weekdays = new String[7];
        System.out.println(Arrays.toString(weekdays));

        weekdays[0] = "Monday";
        System.out.println(Arrays.toString(weekdays));

        weekdays = new String[]{"Mon", "Tues", "Weds", "Thurs", "Fri", "Sat", "Sun"};
        System.out.println(Arrays.toString(weekdays));

        for (String day : weekdays) {
            System.out.println(day);
        }

        for (int i = 0; i < weekdays.length; i++) {
            weekdays[i] = weekdays[i].toUpperCase();
        }
        System.out.println(Arrays.toString(weekdays));

        // Test incrementArray method
        int[] intArr = {2,4,6,8};
        System.out.println(Arrays.toString(intArr));

        incrementArray(intArr);
        System.out.println(Arrays.toString(intArr));
    }

}
