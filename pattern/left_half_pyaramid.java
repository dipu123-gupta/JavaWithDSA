package pattern;

public class left_half_pyaramid {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your input:");
        // int n = sc.nextInt();
        // char ch = sc.next().charAt(0);

        // for (int row = 1; row <=n; row++) {
        // // print Space
        // for (int i = 1; i <=(n-row); i++) {
        // System.out.print(" ");
        // }
        // // print * 1 to row times
        // for(int j =1; j<=row;j++){
        // // System.out.print(row);
        // // System.out.print("*");
        // System.out.print( j);
        // }
        // System.out.println();
        // }

        // output
        // 1
        // 12
        // 123
        // 1234
        // 12345
        // 123456
        char ch='A';

        for (int i= 1; i <=5; i++) {
            // print Space
            for (int j = 1; i <=5-i; i++) {
                System.out.print(" ");
            }
            ch=(char)(ch+(i-1));
            for (int j = i; j <=ch; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }

    }

}
