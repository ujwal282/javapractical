package javaAssignment;
import java.util.Scanner;

public class FibonicSeries {

    public static void printFibonacci(int limit) {
        int a = 0, b = 1;
        System.out.println("Fibonacci series up to " + limit + ":");

        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        scanner.close();

        printFibonacci(limit);
    }
}
