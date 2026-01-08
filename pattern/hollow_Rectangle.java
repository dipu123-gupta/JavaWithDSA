public class hollow_Rectangle {

    public static void hollow_Rectangle(int totalRow, int totalCol) {
        // outer loop
        for (int i = 1; i <= totalRow; i++) {
            // inner loop
            for (int j = 1; j <= totalCol; j++) {
                if (i == 1 || i == totalRow || j == 1 || j == totalCol) {
                    System.out.print("*");
                }else{
                     System.out.print(" ");
                }
               
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_Rectangle(6, 6);

    }

}
