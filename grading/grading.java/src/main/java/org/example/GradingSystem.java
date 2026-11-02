import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student marks: ");
        double marks = input.nextDouble();

        String grade;
        String comment;
        double points;

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Enter marks from 0 to 100.");
        } else {
            if (marks >= 80) {
                grade = "A";
                comment = "Excellent";
                points = 5.0;
            } else if (marks >= 70) {
                grade = "B";
                comment = "Very Good";
                points = 4.0;
            } else if (marks >= 60) {
                grade = "C";
                comment = "Good";
                points = 3.0;
            } else if (marks >= 50) {
                grade = "D";
                comment = "Pass";
                points = 2.0;
            } else {
                grade = "F";
                comment = "Fail";
                points = 0.0;
            }

            System.out.println("\n--- STUDENT RESULTS ---");
            System.out.println("Student Name: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade);
            System.out.println("Comment: " + comment);
            System.out.println("Points: " + points);
        }

        input.close();
    }
}
