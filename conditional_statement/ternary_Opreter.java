package conditional_statement;
import java.util.Scanner;

public class ternary_Opreter {
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number to check number is odd or even");
        int number=sc.nextInt();


        String type=((number % 2==0)?"Even":"Odd");
        System.out.println(number+" is a "+type+" number");
    }
}
