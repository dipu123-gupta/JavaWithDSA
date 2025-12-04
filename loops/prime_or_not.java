package loops;

import java.util.*;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not:");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num == 2) {
            System.out.println(num + " is a prime number");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % 2 == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }

        }
    }
}