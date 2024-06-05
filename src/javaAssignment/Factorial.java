//Write a program to find the factorial of a given number
package javaAssignment;
import java.util.Scanner;
public class Factorial {
    public static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = factorial(number);
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
