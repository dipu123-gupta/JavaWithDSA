import java.util.Scanner;

public class CheckPalindromNum {
    public static void main(String[] args) {
        // get user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();// ! Read an integer from the user input

        int originalNum = num;// ! Store the original number for later comparison
        int reversedNum = 0;// ! Initialize a variable to hold the reversed number
        while (num > 0) {
            int reverse = num % 10; // ! Get the last digit
            reversedNum = reversedNum * 10 + reverse; // ! Build the reversed number
            num /= 10; // ! Remove the last digit
        }
        if (originalNum == reversedNum) { // ! Check if the original number is equal to the reversed number
            System.out.println(originalNum + " is a palindrome.");
        } else {// ! If they are not equal, it's not a palindrome
            System.out.println(originalNum + " is not a palindrome.");
        }

    }
}
