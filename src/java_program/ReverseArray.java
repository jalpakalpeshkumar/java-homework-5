package java_program;

import java.util.Scanner;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Declare and initialize the array
        int[] array = new int[size];

        // Input elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Reverse the array
        reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        // Swap elements from the start and end of the array
        while (left < right) {
            // Swap array[left] and array[right]
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }
}
