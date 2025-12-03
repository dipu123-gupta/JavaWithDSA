package loops;

import java.util.Scanner;

public class print_num_from_1_to_n {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num++;
        }
    }

}
