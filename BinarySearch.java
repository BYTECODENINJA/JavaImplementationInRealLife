import java.util.Arrays; // Import Arrays class for sorting
import java.util.Scanner;

class BinarySearch {
    public static void main(String args[]) {
        int c, first, last, middle, n, search;
        int array[]; // Declare the array

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.println("Enter number of elements:");
        n = in.nextInt();

        // Initialize the array with the specified size
        array = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter " + n + " integers:");
        for (c = 0; c < n; c++) {
            array[c] = in.nextInt(); // Read each integer into the array
        }

        // Sort the array to prepare for binary search
        Arrays.sort(array);

        // Prompt the user to enter the value to find
        System.out.println("Enter value to find:");
        search = in.nextInt();

        // Initialize the first and last indices for the search
        first = 0;
        last = n - 1;

        // Perform binary search
        boolean found = false; // Flag to indicate if the search value is found
        while (first <= last) {
            // Calculate the middle index
            middle = (first + last) / 2;

            // Check if the middle element is the search value
            if (array[middle] < search) {
                first = middle + 1; // Narrow the search to the right half
            } else if (array[middle] == search) {
                // If found, print the result and set found flag to true
                System.out.println(search + " found at location " + (middle + 1) + ".");
                found = true;
                break; // Exit the loop
            } else {
                last = middle - 1; // Narrow the search to the left half
            }
        }

        // If the value was not found, print a message
        if (!found) {
            System.out.println(search + " is not present in the list.");
        }

        // Close the scanner to prevent resource leak
        in.close();
    }
}
