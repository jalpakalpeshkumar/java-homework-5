package java_program;

import java.util.*;

/**
 *  Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name
 */

public class LondonUndergroundLines {

    public static void main(String[] args) {
        // Create a HashMap to store stations and the lines passing through them
        Map<String, List<String>> stationLines = new HashMap<>();

        // Add stations and the lines passing through them (Zone 1)
        stationLines.put("Oxford Circus", Arrays.asList("Bakerloo", "Central", "Victoria"));
        stationLines.put("Piccadilly Circus", Arrays.asList("Bakerloo", "Piccadilly"));
        stationLines.put("Leicester Square", Arrays.asList("Bakerloo", "Northern", "Piccadilly"));
        stationLines.put("Covent Garden", Arrays.asList("Piccadilly"));
        stationLines.put("Holborn", Arrays.asList("Central", "Piccadilly"));
        stationLines.put("Regent's Park", Arrays.asList("Bakerloo"));
        stationLines.put("Tottenham Court Road", Arrays.asList("Central", "Northern"));
        stationLines.put("King's Cross St. Pancras", Arrays.asList("Circle", "Hammersmith & City", "Metropolitan", "Northern", "Piccadilly"));
        stationLines.put("Bank", Arrays.asList("Central", "Northern", "Waterloo & City"));
        stationLines.put("Liverpool Street", Arrays.asList("Central", "Circle", "Hammersmith & City", "Metropolitan"));

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask user to input the station name
        System.out.print("Enter the station name to find the lines that pass through it: ");
        String station = scanner.nextLine().trim();

        // Search for the station in the HashMap
        if (stationLines.containsKey(station)) {
            List<String> lines = stationLines.get(station);
            System.out.println("The following lines pass through " + station + ":");
            for (String line : lines) {
                System.out.println("- " + line);
            }
        } else {
            System.out.println("Station not found in Zone 1 or invalid station name.");
        }

        // Close the scanner
        scanner.close();
    }
}
