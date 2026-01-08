public class Inverted_half_pyramid {

    public static void Inverted_half_pyramid(int num) {
        // outer loop
        for (int i = 1; i <= num; i++) {

            // /inner loop
            for (int j = 1; j <=num-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Inverted_half_pyramid(6);
    }

}
