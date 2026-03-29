package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 9, 3, 5, 10 }; // ! Create an array of integers and
        // initialize it with values 1 to 5
        int largest = arr[0]; // ! Initialize the largest variable with the first element of the array
        int secondLargest = arr[0]; // ! Initialize the second largest variable with the first element of the array

        for (int i = 1; i < arr.length; i++) { // ! Iterate through the array using a for loop
            if (arr[i] > largest) { // ! Check if the current element is greater than the current largest element
                secondLargest = largest; // ! Update the second largest element to the current largest element
                largest = arr[i]; // ! Update the largest element to the current element
            } else if (arr[i] > secondLargest) { // ! Check if the current element is greater than the current second
                                                 // largest element
                secondLargest = arr[i]; // ! Update the second largest element to the current element
            }
        }

        System.out.println("The second largest element in the array is: " + secondLargest);
    }
}
// sudo code:
// 1. Create an array of integers and initialize it with values 1 to 5
// 2. Initialize the largest variable with the first element of the array
// 3. Initialize the second largest variable with the first element of the array
// 4. Iterate through the array using a for loop
// 5. Check if the current element is greater than the current largest element
// 6. Check if the current element is greater than the current second largest
// element
// 7. Update the second largest element to the current element
// 8. Print the second largest element in the array
// logic:
// 1. We start by initializing the largest and second largest variables to the
// first element of the array.
// 2. We then iterate through the array starting from the second element (index
// 1).
// 3. For each element, we check if it is greater than the current largest
// element. If it is, we update the second largest to be the current largest,
// and then update the largest to be the current element.
// 4. If the current element is not greater than the largest but is greater than
// the second largest, we update the second largest to be the current element.
// 5. Finally, we print the second largest element in the array.

// hinglish:
// 1. Ek array of integers create karo aur usko values 1 se 5 tak initialize
// karo
// 2. Largest variable ko array ke first element se initialize karo
// 3. Second largest variable ko array ke first element se initialize karo
// 4. Array ke elements ko iterate karo using a for loop
// 5. Current element ko largest variable se compare karo
// 6. Current element ko second largest variable se compare karo
// 7. Second largest variable ko current element se update karo
// 8. Print the second largest element in the
