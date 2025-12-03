package loops;

import java.util.Scanner;

public class multiples_of_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a number to check if it is multiple of 10 or not: ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            } else {
                System.out.println(num + " is not a multiple of 10");
            }
        } while (true);
    }

}
