package javaAssignment;
//write a program to sort an array using while loop
public class SortUsingWhileLoop {

    public static void bubbleSortWhileLoop(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n - 1) {
            int j = 0;
            while (j < n - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                j++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSortWhileLoop(arr);
        System.out.println("Sorted array using while loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
