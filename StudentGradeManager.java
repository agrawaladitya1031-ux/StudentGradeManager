
import java.util.Scanner;

public class StudentGradeManager {

    static String calculateGrade(double percentage) {
        if (percentage >= 90) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 40) return "D";
        return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        double total = 0;
        int subjects = 5;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + " (0-100): ");
            double marks = sc.nextDouble();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Enter a value from 0 to 100.");
                sc.close();
                return;
            }

            total += marks;
        }

        double percentage = total / subjects;
        String grade = calculateGrade(percentage);

        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total + "/" + (subjects * 100));
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + (percentage >= 40 ? "PASS" : "FAIL"));

        sc.close();
    }
}
