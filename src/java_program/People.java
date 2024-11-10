package java_program;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */

public class People {

    public static void main(String[] args) {
        // Create a HashMap called 'people' that stores String keys and Integer values
        HashMap<String, Integer> people = new HashMap<>();

        // Add some people (String keys) and their ages (Integer values)
        people.put("jalpa", 30);
        people.put("payal", 25);
        people.put("pinal", 24);
        people.put("manmeet", 40);

        // Iterate through the HashMap using a for-each loop
        System.out.println("People and their ages:");
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            String name = entry.getKey();  // Get the key (person's name)
            Integer age = entry.getValue();  // Get the value (person's age)

            // Print the entry (name and age)
            System.out.println(name + " is " + age + " years old.");
        }
    }
}
