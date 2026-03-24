import java.util.Scanner;

public class numEvenOrOddBite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt(); // Read an integer from the user input
        int evenCount = 0; // Initialize a counter for even digits
        int oddCount = 0; // Initialize a counter for odd digits
        int index = 0; // Initialize an index to track the position of digits

        while (num > 0) {
            int bit = num % 2; // Get the last digit (bit) of the number
            if (bit == 1) {
                if (index % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            num /= 2; // Remove the last digit (bit)w
            index++;
        }
        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }
}