package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 9, 3, 5, 10 }; // ! Create an array of integers and
        // initialize it with values 1 to 5
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) { // ! Iterate through the array using a for loop and print each element
            System.out.print(arr[i] + " "); // ! Print the current element followed by a space
        }
        int left = 0; // ! Initialize a pointer for the left end of the array
        int right = arr.length - 1; // ! Initialize a pointer for the right end of the array

        while (left < right) { // ! Loop until the left pointer is less than the right pointer
            int temp = arr[left]; // ! Store the value at the left pointer in a temporary variable
            arr[left] = arr[right]; // ! Assign the value at the right pointer to the left pointer
            arr[right] = temp; // ! Assign the value from the temporary variable to the right pointer
            left++; // ! Move the left pointer one step to the right
            right--; // ! Move the right pointer one step to the left
        }

        System.out.println("\nReversed array:");
        for (int i = 0; i < arr.length; i++) { // ! Iterate through the reversed array and print each element
            System.out.print(arr[i] + " "); // ! Print the current element followed by a space
        }
    }
}

// Output will be:
// Original array: 1 4 9 3 5 10
// Reversed array: 10 5 3 9 4 1

// Time Complexity: O(n)
// Space Complexity: O(1)
