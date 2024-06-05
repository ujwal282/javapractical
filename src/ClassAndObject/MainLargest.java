package ClassAndObject;
//Create a class Largest with the method setdata() and display() with required data to find largest number among three number inputted by user.
import java.util.Scanner;

class Largest {
    private int num1, num2, num3;

    public void setData(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void display() {
        int largest = num1;
        if(num2 > largest) {
            largest = num2;
        }
        if(num3 > largest) {
            largest = num3;
        }
        System.out.println("The largest number is: " + largest);
    }
}

public class MainLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        Largest largest = new Largest();
        largest.setData(num1, num2, num3);
        largest.display();
    }
}
