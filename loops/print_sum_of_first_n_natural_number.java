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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;
        while (num <= n) {
            sum += num;
            num++;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
