package java_program;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */

public class TestArrayListEmpty {

    public static void main(String[] args) {
        // Create an ArrayList of String type
        ArrayList<String> colors = new ArrayList<>();

        // Check if the ArrayList is empty
        if (colors.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        // Adding some elements to the ArrayList
        colors.add("Red");
        colors.add("Blue");

        // Check again if the ArrayList is empty
        if (colors.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
