package conditional_statement;

import java.util.Scanner;

public class else_if_statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
        if (marks>90) {
            System.out.println("A+ grade");
        }
        else if (marks>80) {
            System.out.println("A grade");
        }
        else if (marks>70) {
            System.out.println("B+ grade");
        }
        else if (marks>60) {
            System.out.println("B grade");
        }
        else {
            System.out.println("Fail");
        }
    }
    
}
