package java_program;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 *  * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 *  * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 *  * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 *  * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 *  * _______________________________
 *  * | |
 *  * | Mark Sheet |
 *  * |_______________________________|
 *  * | Name : Jay |
 *  * | Roll No: 08 |
 *  * |_______________________________|
 *  * | Subjects : Marks |
 *  * |_______________________________|
 *  * | Math : 98 |
 *  * | Science : 90 |
 *  * | English : 85 |
 *  * |_______________________________|
 *  * | Total : 273 |
 *  * |_______________________________|
 *  * | Percentage : 91.0 |
 *  * | Result : Pass |
 *  * | Grade : A+ |
 *  * |_______________________________|
 *
 */


public class StudentMarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();

        // Initialize marks variables
        int mathMarks = -1, scienceMarks = -1, englishMarks = -1;

        // Input marks and validate range
        while (mathMarks < 0 || mathMarks > 100) {
            System.out.print("Enter Math marks (0-100): ");
            mathMarks = scanner.nextInt();
            if (mathMarks < 0 || mathMarks > 100) {
                System.out.println("Invalid input, marks should be between 0 and 100.");
            }
        }

        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.print("Enter Science marks (0-100): ");
            scienceMarks = scanner.nextInt();
            if (scienceMarks < 0 || scienceMarks > 100) {
                System.out.println("Invalid input, marks should be between 0 and 100.");
            }
        }

        while (englishMarks < 0 || englishMarks > 100) {
            System.out.print("Enter English marks (0-100): ");
            englishMarks = scanner.nextInt();
            if (englishMarks < 0 || englishMarks > 100) {
                System.out.println("Invalid input, marks should be between 0 and 100.");
            }
        }

        // Calculate total, percentage, and result
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 3.0);

        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade = "";

        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        }

        // Output the Mark Sheet in the specified format
        System.out.println("\n_______________________________");
        System.out.println("|                             |");
        System.out.println("|          Mark Sheet          |");
        System.out.println("|_____________________________|");
        System.out.println("| Name       : " + studentName);
        System.out.println("| Roll No    : " + rollNo);
        System.out.println("|_____________________________|");
        System.out.println("| Subjects   : Marks           |");
        System.out.println("|_____________________________|");
        System.out.println("| Math       : " + mathMarks);
        System.out.println("| Science    : " + scienceMarks);
        System.out.println("| English    : " + englishMarks);
        System.out.println("|_____________________________|");
        System.out.println("| Total      : " + totalMarks);
        System.out.println("|_____________________________|");
        System.out.println("| Percentage : " + String.format("%.1f", percentage));
        System.out.println("| Result     : " + result);
        System.out.println("| Grade      : " + grade);
        System.out.println("|_____________________________|");

        // Close the scanner
        scanner.close();
    }
}
