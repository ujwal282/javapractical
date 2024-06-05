package javaAssignment;
import java.util.Scanner;
public class SeriesDisplay {

        public static void displayOddSeries() {
            System.out.println("Series a: 1, 3, 5, 7, ..., 97, 99");
            for (int i = 1; i <= 99; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        public static void displayEvenSeries() {
            System.out.println("Series b: 2, 4, 6, 8, ..., 98, 100");
            for (int i = 2; i <= 100; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        public static void displaySeriesC() {
            System.out.println("Series c: 12, 22, 32, ..., 10 terms");
            int term = 12;
            for (int i = 0; i < 10; i++) {
                System.out.print(term + " ");
                term += 10;
            }
            System.out.println();
        }

        public static void displaySeriesD() {
            System.out.println("Series d: 11, 22, 33, ..., 10 terms");
            for (int i = 1; i <= 10; i++) {
                System.out.print((i * 11) + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a series to display:");
            System.out.println("a. 1, 3, 5, 7, ..., 97, 99");
            System.out.println("b. 2, 4, 6, 8, ..., 98, 100");
            System.out.println("c. 12, 22, 32, ..., 10 terms");
            System.out.println("d. 11, 22, 33, ..., 10 terms");
            System.out.print("Enter your choice (a/b/c/d): ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    displayOddSeries();
                    break;
                case 'b':
                    displayEvenSeries();
                    break;
                case 'c':
                    displaySeriesC();
                    break;
                case 'd':
                    displaySeriesD();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            scanner.close();
        }
    }

