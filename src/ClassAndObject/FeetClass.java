package ClassAndObject;
//Creating a class named Feet with the required data members and member functions to adding two lengths given by user in feet and inches.
import java.util.Scanner;

class Feet {
    private int feet;
    private int inches;

    public void setData(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void addLengths(Feet f1, Feet f2) {
        this.inches = f1.inches + f2.inches;
        this.feet = f1.feet + f2.feet + (this.inches / 12);
        this.inches = this.inches % 12;
    }

    public void display() {
        System.out.println("Feet: " + feet + ", Inches: " + inches);
    }
}

public class FeetClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Feet f1 = new Feet();
        Feet f2 = new Feet();

        System.out.print("Enter feet for first length: ");
        int feet1 = scanner.nextInt();
        System.out.print("Enter inches for first length: ");
        int inches1 = scanner.nextInt();
        f1.setData(feet1, inches1);

        System.out.print("Enter feet for second length: ");
        int feet2 = scanner.nextInt();
        System.out.print("Enter inches for second length: ");
        int inches2 = scanner.nextInt();
        f2.setData(feet2, inches2);

        Feet result = new Feet();
        result.addLengths(f1, f2);
        System.out.print("The total length is: ");
        result.display();
    }
}

