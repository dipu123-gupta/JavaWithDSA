package pattern;

import java.util.Scanner;

public class right_half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();

        // for (int i = 1; i <= num; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }
        // output
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * * * *

        // for (int i = 0; i <=num; i++) {
        // for (int j = 0; j <i; j++) {
        // System.out.print(i+" ");
        // }
        // System.out.println();

        // }
        // output
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5

        // for (int i = 1; i <= num; i++) {
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // output
        // 1
        // 2 1
        // 3 2 1
        // 4 3 2 1
        // 5 4 3 2 1

        // for (int i = 1; i <= num; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // output
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // char ch = 'a';
        // for (int i = 1; i <= num; i++) {
        // // ch++;
        // ch = (char) ('a' + (i - 1));
        // for (int j = 1; j <= i; j++) {

        // System.out.print(ch + " ");
        // }
        // System.out.println();
        // }

        // output
        // a
        // b b
        // c c c
        // d d d d
        // e e e e e

        // for (int i = 1; i <= num; i++) {
        // for (int j = i; j <= num; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <=num; i++) {
        // for (int j = 1; j <=num-(i-1); j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // output
        // * * * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // */

        for (int i = 1; i <= num; i++) {
            for (int j = num; j < num + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // output
        // 5
        // 5 6
        // 5 6 7
        // 5 6 7 8
        // 5 6 7 8 9
    }
}
