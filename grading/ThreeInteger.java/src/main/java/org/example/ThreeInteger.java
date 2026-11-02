
import java.util.Scanner;

public class ThreeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        int sum, difference, product, maximum;
        double average;

        // Prompt the user to enter three integers
        System.out.print("Enter the first integer: ");
        a = input.nextInt();

        System.out.print("Enter the second integer: ");
        b = input.nextInt();

        System.out.print("Enter the third integer: ");
        c = input.nextInt();

        // Perform calculations
        sum = a + b + c;
        difference = a - b - c;
        product = a * b * c;

        // Find the largest number
        maximum = Math.max(a, Math.max(b, c));

        // Calculate average
        average = sum / 3.0;

        // Print results
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Maximum = (" + maximum + ")");
        System.out.println("Largest number = " + maximum);
        System.out.println("Average = " + average);

        input.close();
    }
}



