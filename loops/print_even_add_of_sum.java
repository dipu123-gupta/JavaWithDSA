package loops;

import java.util.*;

public class print_even_add_of_sum {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.print("Enter the number ");
            number=sc.nextInt();
            if(number%2==0) {
                evenSum+=number;
                System.err.println("Even number added"+evenSum);
            }else{
                oddSum+=number;
                System.err.println("Odd number added"+oddSum);
            }
            System.out.print("Do you want to continue? Press 1 foryes or 0for no");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);
    }
}

