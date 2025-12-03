package loops;

public class print_revers_of_number {
    public static void main(String[] args) {
        // print revers of a number
        int num =25789;
        while(num>0){
            // extract last digit
            int lastDigit = num %10;
            System.out.print(lastDigit);
            // remove last digit
            num=num/10;
        }
        System.out.println(" ");
    }
}
