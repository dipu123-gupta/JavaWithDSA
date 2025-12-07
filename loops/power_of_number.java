package loops;

import java.util.Scanner;

public class power_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = sc.nextInt();
        System.out.println("Enter your number of power");
        int pow = sc.nextInt();
        for (int i = 1; i < pow; i++) {
            n = n * pow;
        }
        System.out.println(n);

    }

}
