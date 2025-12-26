
import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Binary number:");
        int num = sc.nextInt();

        int rem, mul=1,ans=0;
        while (num>0) {
            // Remender
            rem = num%10;
            // number ko divide karna
            num=num/10;
            // ans
            ans=rem*mul+ans;
            // mul
            mul=mul*2;
        }
        System.out.println(ans);
    }
}
