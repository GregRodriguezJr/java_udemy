package Arrays;

import java.util.Arrays;

public class IntroToArrays {
    public static void main(String[] args) {
        String[] kingdoms = {"Mercia","Wessex","Northumbria","East Anglia" };

        for (String kingdom : kingdoms) {
            System.out.println(kingdom);
        }

        String kingdom1 = "Mercia";
        String kingdom2 = "Wessex";
        String kingdom3 = "Northumbria";
        String kingdom4 = "East Anglia";

        //workbook 6.1
        // Create an array called seats that stores five students.
        String[] seats = {"Harry", "Neville", "Ron", "Hermione", "Seamus"};

        // Replace each placeholder by indexing values from the array.
        for (int i = 0; i < seats.length; i++) {
            System.out.println(seats[i] + ", you will take seat " + i);
        }
    }
}