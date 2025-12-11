package pattern;

public class square_pattern {
    public static void main(String[] args) {
        // for (char i = 'a'; i <='e'; i++) {
        // for (int j = 0; j <=5; j++) {
        // System.out.print(i);
        // }
        // System.out.println();
        // }

        int num = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                num++;
                System.out.print(num+" ");
            }
            System.out.println();

        }
    }
}
