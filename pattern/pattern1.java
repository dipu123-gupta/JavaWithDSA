package pattern;

public class pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            // Spaces
            for (int j = 1; j < 5 - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
