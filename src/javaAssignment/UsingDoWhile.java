package javaAssignment;
//Sorting an array using dowhile loop
public class UsingDoWhile {
    public static void bubbleSortDoWhileLoop(int[] arr) {
        int n = arr.length;
        int i = 0;
        do {
            int j = 0;
            do {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                j++;
            } while (j < n - i - 1);
            i++;
        } while (i < n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSortDoWhileLoop(arr);
        System.out.println("Sorted array using do while loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
