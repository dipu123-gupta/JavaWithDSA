package loops;

import java.util.Scanner;

public class print_sum_of_first_n_natural_number {
    // This program calculates the sum of the first n natural numbers
    // using a while loop.
    // For example, if n = 5, the sum is 1 + 2 + 3 + 4 + 5 = 15.
    // The user is prompted to enter the value of n.
    // The program then outputs the calculated sum.
    // Time Complexity: O(n)
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number n
        System.out.print("Enter a number n: ");

        // Read the integer input
        int n = sc.nextInt();

        // Initialize sum to 0
        int sum = 0;

        // Initialize num to 1
        int num = 1;

        // Use a while loop to calculate the sum of the first n natural numbers
        while (num <= n) {

            // Add num to sum
            sum += num;
            
            // Increment num by 1
            num++;
        }
        // Print the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
