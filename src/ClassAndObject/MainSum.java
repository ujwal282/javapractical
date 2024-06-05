package ClassAndObject;
import java.util.Scanner;

class Sum {
    public Sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}

public class MainSum {
    public static void main(String[] args) {
        new Sum();
    }
}
