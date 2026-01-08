public class butterfly {

    public static void butterfly(int num) {
        // outer loop
        for (int i = 1; i <= num; i++) {
            // print stare i times

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            // print Spaces 2*(num-1)

            for (int k = 0; k <= 2 * (num - i); k++) {
                System.out.print(" ");
            }
            // print stare i times
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = num; i>1; i--) {
            // print stare i times

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            // print Spaces 2*(num-1)

            for (int k = 0; k <= 2 * (num - i); k++) {
                System.out.print(" ");
            }
            // print stare i times
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        butterfly(4);

    }

}
