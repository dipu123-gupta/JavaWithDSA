
import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Decimal Number:");
        int num = sc.nextInt();

        int ans=0;
        int mul=1;
        while (num>0) {
            // remender
            int rem=num%2;
            // Number dividesion
            num=num/2;
            ans=rem*mul+ans;
            mul=mul*10;
        }
        System.out.println(ans);
    }
}
