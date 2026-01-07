package functionandmethod;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Decimal number:");
        int Decimal=sc.nextInt();

        int pow=0,lastDigit=0,Binary=0;
        while (Decimal>0) {
            lastDigit=Decimal%2;
            Binary=Binary+lastDigit*(int)Math.pow(10,pow);
            Decimal=Decimal/2;
            pow++;

        }
        System.out.println(Binary);
    }
}


