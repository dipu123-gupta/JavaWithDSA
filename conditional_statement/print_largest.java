package conditional_statement;

import java.util.Scanner;

public class print_largest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("number 1 is largest: " + num1);

        } else {
            System.out.println("number 2 is largest: " + num2);
        }

    }

}
