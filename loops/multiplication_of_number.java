package loops;
import java.util.*;

public class multiplication_of_number {            //class name
    
    public static void main(String[]args){         //main method
        Scanner sc = new Scanner(System.in);       //scanner class object
        System.out.println("Enter a number to print its multiplication table:");//print statement
        int num = sc.nextInt();//input number

        for(int i=1;i<=10;i++){//for loop
            System.out.println(num + " x " + i + " = " + (num * i));//print multiplication table
        }
    }
}
