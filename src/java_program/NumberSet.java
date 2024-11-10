package java_program;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class NumberSet {

    public static void main(String[] args) {
        // Create a HashSet to store Integer objects
        HashSet<Integer> numberSet = new HashSet<>();

        // Add numbers 4, 7, and 8 to the set
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        // Check which numbers between 1 and 10 are in the set
        System.out.println("Numbers between 1 and 10 that are in the set:");
        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }


}
