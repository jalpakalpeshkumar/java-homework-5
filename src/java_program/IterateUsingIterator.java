package java_program;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

public class IterateUsingIterator {

    public static void main(String[] args) {
        // Create a new ArrayList and add some elements
        ArrayList<String> person = new ArrayList<>();
       person.add("jalpa");
        person.add("payal");
        person.add("pinal");
        person.add("jeeny");
       person.add("ishika");
       person.add("manmeet");

        // Create an Iterator to iterate through the ArrayList
        Iterator<String> iterator = person.iterator();

        // Iterate through the ArrayList using the Iterator
        System.out.println("person name list :");
        while (iterator.hasNext()) {
            // Print the current element
            System.out.println(iterator.next());
        }
    }
}
