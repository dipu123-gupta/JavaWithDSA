package Array;

public class SearchElementInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 }; // ! Create an array of integers and
        // initialize it with values 1 to 5
        int target = 3; // ! Define the target element to search for
        boolean found = false; // ! Initialize a flag to indicate if the target is found

        for (int i = 0; i < arr.length; i++) { // ! Iterate through the array using a
            // for loop
            if (arr[i] == target) { // ! Check if the current element is equal to the target
                found = true; // ! Set the flag to true if the target is found
                break; // ! Exit the loop since we found the target
            }
        }

        if (found) { // ! Check if the target was found and print the result
            System.out.println(target + " is present in the array.");
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }

}
