package javaAssignment;
//Write a program to print and count all negative number in an array
public class basic {

        public static void countAndPrintNegatives(int[] arr) {
            int negativeCount = 0;
            System.out.println("Negative numbers in the array:");

            for (int num : arr) {
                if (num < 0) {
                    System.out.println(num);
                    negativeCount++;
                }
            }

            System.out.println("Total count of negative numbers: " + negativeCount);
        }

        public static void main(String[] args) {
            int[] exampleArray = {3, -1, 4, -2, -5, 7, -3};
            countAndPrintNegatives(exampleArray);
        }
    }


