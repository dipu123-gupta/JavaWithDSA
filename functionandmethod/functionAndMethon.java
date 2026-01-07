package functionandmethod;

import java.util.Scanner;

public class functionAndMethon {
    // ! Define a method named myMethod
    public static void myMethod() {
        System.out.println("I just got executed!");
        System.out.println("Hello World");
        System.out.println("Welcome to Java Programming");
    }

    // ! method with parameters
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int a, int b) { // parameters or formal parameters
        int sum = a + b;
        return sum;
    }

    // ! Swap method (not used in main)
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap method: a = " + a + ", b = " + b);
    }

    // ! find product of two numbers
    public static void product(int a, int b) {
        int prod = a * b;
        System.out.println("Product: " + prod);
    }

    // ! factorial of a number
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    // ! Binomial Coefficient
    public static int binomialCoefficient(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n - r);
        int binom = fact_n / (fact_r * fact_n_r);
        return binom;
    }

    // ! function overloading
    // multiple methods with same name but different parameters
    // ! calculate sum of two numbwrs
    public static int sum(int a, int b) {
        return a + b;
    }

    // ! calculate Sum of three numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // ! function overloading using different data types
    // calculate sum of two double numbers
    public static double sum(double a, double b) {
        return a + b;
    }

    // calculate sum of two float numbers
    public static float sum(float a, float b) {
        return a + b;
    }

    // ! check if a number if prime or not
    public static boolean PrimeNumber(int n) {
//    cornner cases
        if (n==2) {
            return  true;
        }

        boolean isPrime = true;

        for (int i = 2; i <=Math.sqrt(n); i++) {

            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void  primeInRange(int n){
        for (int i = 2; i <=n; i++) {
            if (PrimeNumber(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    // ! main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to add:");
       primeInRange(100);
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        // myMethod();
        // int result = add(a, b); // arguments or actual parameters
        // System.out.println("Sum: " + result);

        // ! swap - value exchange
        // swap(a,b);

        // ! product of two numbers
        // product(a, b);

        // ! factorial of a number
        // factorial(a);
        // System.out.println("Factorial of " + a + " is: " + factorial(a));

        // ! Binomial Coefficient
        // System.out.println("Enter n and r for Binomial Coefficient (nCr):");
        // int n = scanner.nextInt();
        // int r = scanner.nextInt();
        // int binom = binomialCoefficient(n, r);
        // System.out.println("Binomial Coefficient C(" + n + ", " + r + ") is: " +
        // binom);

        // ! function overloading
        // System.out.println("Sum of 2 and 3: " + sum(2, 3));
        // System.out.println("Sum of 2, 3 and 4: " + sum(2, 3, 4));
        // System.out.println("Sum of 2.5 and 3.5: " + sum(2.5, 3.5));
        // System.out.println("Sum of 2.5f and 3.5f: " + sum(2.5f, 3.5f));

    //    System.out.println(PrimeNumber(7));
    }

    // ! Output:
    // I just got executed!
    // Hello World
    // Welcome to Java Programming

    // ! method is a block of code which is used to perform a specific task.
    // ! Methods are used to reuse code: define the code once, and use it many
    // times.
    // ! user-defined methods vs built-in methods

    // ! function overloading
    // multiple methods with same name but different parameters

}
