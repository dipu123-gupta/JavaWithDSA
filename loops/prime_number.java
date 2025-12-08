package loops;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to check prime or not");
        int num = sc.nextInt();
        if (num < 2) {
            System.out.println("number not prime");
            return;
        } else {
            for (int i = 2; i <= num; i++) {

                if (num % i == 0) {
                    System.out.println("number not prime");
                    return;
                } 
            }
            System.out.println("number is prime");
        }

    }

}
