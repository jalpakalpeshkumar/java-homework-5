package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String continueCalculation;

        do {
            // Prompt user for input
            System.out.print("Enter first number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = scanner.nextInt();

            System.out.print("Please enter one of symbol +, -, *, /: ");
            char symbol = scanner.next().charAt(0); // Read symbol

            // Perform the calculation based on the symbol
            calculator.calculateResult(firstNumber, secondNumber, symbol);

            // Ask if the user wants to continue
            System.out.print("Would you like to do more calculation? Please enter 'Y' or 'N': ");
            continueCalculation = scanner.next().toUpperCase();  // Ensure uppercase for consistency
        } while (continueCalculation.equals("Y"));

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}
