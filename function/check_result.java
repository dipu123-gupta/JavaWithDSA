package function;

import java.util.Scanner;

public class check_result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;

        System.out.println("Enter your result:");
        int userResult = sc.nextInt();
        if (sum == userResult) {
            System.out.println("Correct! The sum is " + sum);
        } else {
            System.out.println("Incorrect. The correct sum is " + sum);
        }

    }

}
