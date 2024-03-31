import java.util.Random;

public class teste {
    public static void main(String[] args) {
        int n = 20; // You can change this as per your requirement.

        // Create a new int array with the length of 'n'.
        int[] arr = new int[n];

        // Generate random numbers for the given array using java's in-built Random
        // class.
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt(100); // This will generate a number between 0 and 99.
        }
        for (int i = 0; i < arr.length - 1; i++) {
            // Traverse through all elements of array and compare each element with its next
            // element.
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Swap if the current element is greater than the next element.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int num: arr) {
            System.out.println(num);
        }
    }

}