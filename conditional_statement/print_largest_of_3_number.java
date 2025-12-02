package conditional_statement;

public class print_largest_of_3_number {

    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 20;
        int num3 = 45;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Number 1 is the largest: " + num1);
        } else if (num2 >= num3) {
            System.out.println("Number 2 is the largest: " + num2);
        } else {
            System.out.println("Number 3 is the largest: " + num3);
        }
    }
}
