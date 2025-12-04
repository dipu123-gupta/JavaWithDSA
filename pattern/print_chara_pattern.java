package pattern;
import java.util.Scanner;

public class print_chara_pattern {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int rows = sc.nextInt();

    char ch = 'A';

    for(int i=1;i<=rows;i++){

        for(int j=1;j<=i;j++){
            
            // System.out.print((char)(64+j+i-1)+" ");
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}

    
}
