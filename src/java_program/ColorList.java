package java_program;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class ColorList {

    public static void main(String[] args) {
        // Create a new ArrayList of String to hold colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the colors using a for-each loop
        System.out.println("Colors in the list:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
