package Array;

import java.util.*;

import loops.for_loop;

public class finboNaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array element");
        int n = sc.nextInt();
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n - 1; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println(fib[n - 1]);
        ;
    }

}
