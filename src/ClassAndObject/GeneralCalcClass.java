package ClassAndObject;

import java.util.Scanner;

class GeneralCalc {
    private int num1, num2;

    public void setData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first positive integer: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second positive integer: ");
        num2 = scanner.nextInt();
    }

    public int sum() {
        return num1 + num2;
    }

    public int difference() {
        return num1 - num2;
    }

    public int product() {
        return num1 * num2;
    }

    public void displayData() {
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Sum: " + sum());
        System.out.println("Difference: " + difference());
        System.out.println("Product: " + product());
    }
}

public class GeneralCalcClass {
    public static void main(String[] args) {
        GeneralCalc calc = new GeneralCalc();
        calc.setData();
        calc.displayData();
    }
}

