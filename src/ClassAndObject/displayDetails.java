package ClassAndObject;
import java.util.Scanner;

 class Student {
    private int rollNumber;
    private String name;
    private int age;

    public void setDetails(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void displayDetails(int rollNumber, String name, int age) {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class displayDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        student.setDetails(rollNumber, name, age);
        student.displayDetails();

        System.out.println("\nUsing overloaded method:");
        student.displayDetails(rollNumber, name, age);

        scanner.close();
    }
}
