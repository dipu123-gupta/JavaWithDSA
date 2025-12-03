package loops;

public class do_while_loop {
    public static void main(String[] args) {
        // print hello world 1 to 100 using do while loop
        int num =1;
        // do while loop
        do { 
            System.out.println("hello world"+" "+num);
            // increment num
            num++;
        } while (num<=100);
    }
}
