package loops;

public class reverse_the_given_num {
    public static void main(String[] args) {
        int rev=0;
        // given number
        int num=98987;

        while(num>0){
            // extract last digit
            int lastDigit =num%10;
            // build reverse number
            rev=rev*10+lastDigit;
            // remove last digit
            num =num/10;
        }
        System.out.println("Reversed Number is: "+rev);
    }
}
