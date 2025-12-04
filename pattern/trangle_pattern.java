package pattern;

import java.util.Scanner;

public class trangle_pattern {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int n = sc.nextInt();

        // Outer loop for number of rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                
                // Print star followed by a space
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
