package function;

import java.util.Scanner;

public class function {

    public static void printHello() {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java programming.");
        System.out.println("Functions help organize code.");
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = calculateSum(num1, num2);
        System.out.println(sum);
        
        // printHello();
    }
}
