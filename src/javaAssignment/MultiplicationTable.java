package javaAssignment;
import java.util.Scanner;
//Write a program to display the multiplication table of the given number
public class MultiplicationTable {

    public static void displayTable(int number) {
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();
        scanner.close();
        displayTable(number);
    }
}
