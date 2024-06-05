package javaAssignment;
//Write a program to print an odd number in an array
public class OddNumberArray {


        public static void countAndPrintOdds(int[] arr) {
            int oddCount = 0;
            System.out.println("Odd numbers in the array:");

            for (int num : arr) {
                if (num % 2 != 0) {
                    System.out.println(num);
                    oddCount++;
                }
            }

            System.out.println("Total count of odd numbers: " + oddCount);
        }

        public static void main(String[] args) {
            int[] exampleArray = {3, -1, 4, -2, -5, 7, -3};
            countAndPrintOdds(exampleArray);
        }
    }


