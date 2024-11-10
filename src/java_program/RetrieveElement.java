package java_program;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list.
 */

public class RetrieveElement {

    public static void main(String[] args) {
        // Create a new ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Create a scanner object to take user input for index
        Scanner scanner = new Scanner(System.in);

        // Ask user for the index of the element they want to retrieve
        System.out.print("Enter the index of the color you want to retrieve (0 to " + (colors.size() - 1) + "): ");
        int index = scanner.nextInt();

        // Check if the index is valid
        if (index >= 0 && index < colors.size()) {
            // Retrieve and print the element at the specified index
            String color = colors.get(index);
            System.out.println("The color at index " + index + " is: " + color);
        } else {
            System.out.println("Invalid index. Please enter a valid index between 0 and " + (colors.size() - 1));
        }

        // Close the scanner
        scanner.close();
    }
}
