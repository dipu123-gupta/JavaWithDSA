
// This program checks whether a given number is even or odd.
import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        // ! You can take input from the user or use a predefined number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt(); // Read an integer from the user input

        // ! Check if the number is even or odd and print the result
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}