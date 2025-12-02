package conditional_statement;
import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: ");

        int income =scanner.nextInt();
        if(income<=250000){
            System.out.println("No tax");
        }
        else if(income<=500000){
            System.out.println("Tax is 5%");
        }
        else if(income<=1000000){
            System.out.println("Tax is 20%");
        }
        else{
            System.out.println("Tax is 30%");
        }
        
    }
    
}
