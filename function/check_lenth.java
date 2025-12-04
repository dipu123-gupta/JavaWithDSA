package function;

import java.util.Scanner;

public class check_lenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int inputNumber = sc.nextInt();

        int length = 0;

        // int length = String.valueOf(inputNumber).length();
        while (inputNumber != 0) {
            inputNumber = inputNumber / 10;

            length++;

        }
        System.out.println("The length of the number is: " + length);

    }
}
