package functionandmethod;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Binary number:");
        int bin=sc.nextInt();

        int pow=0,lastDigit=0,decimal=0;
        while(bin>0) {
            lastDigit=bin%10;
             decimal=decimal+lastDigit*(int)Math.pow(2, pow);
             bin/=10; 
             pow++;
        }

        System.out.println(decimal);
    }
}
