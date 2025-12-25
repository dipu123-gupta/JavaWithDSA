package pattern;

import java.util.Scanner;

public class mediumPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        // for(int row=1;row<=num;row++){

        //     for (int col = 1; col <= num-row; col++) {
        //         System.out.print("   ");
        //     }
        //     for(int col=1;col<=row;col++){
        //         System.out.print("*  ");
        //     }
        //     System.out.println();
        // }

//                   *  
//                *  *
//             *  *  *
//          *  *  *  *
//       *  *  *  *  *
//    *  *  *  *  *  *
// *  *  *  *  *  *  *
//       for(int row=1;row<=num;row++){

             // print Spaces
//             for (int col = 1; col <= num-row; col++) {
//                 System.out.print("   ");
//             }
             // print number
//             for(int col=1;col<=row;col++){
//                 System.out.print(row+"  ");
//             }
//             System.out.println();
//         }
//                1  
//             2  2
//          3  3  3
//       4  4  4  4
//    5  5  5  5  5
// 6  6  6  6  6  6

    //    for(int row=1;row<=num;row++){
             // print Spaces
    //         for (int col = 1; col <= num-row; col++) {
    //             System.out.print("   ");
    //         }
             // print number
    //         for(int col=1;col<=row;col++){
    //             System.out.print(col+"  ");
    //         }
    //         System.out.println();
    //     }

//             1  
//          1  2
//       1  2  3
//    1  2  3  4
// 1  2  3  4  5

        // for(int row=1;row<=num;row++){
        //     // print Spaces
        //     for (int col = 1; col <= num-row; col++) {
        //         System.out.print("   ");
        //     }
        //     // print character
        //     for(char name='A';name<=('A'+(row-1));name++){
        //         System.out.print(name+"  ");
        //     }
        //     System.out.println();
        // }

//             A  
//          A  B
//       A  B  C
//    A  B  C  D
// A  B  C  D  E

   for(int row=1;row<=num;row++){
            // print Spaces
            for (int col = 1; col <= num-row; col++) {
                System.out.print("   ");
            }
            // print character
            for(int col=row;col>=1;col--){
                System.out.print(col+"  ");
            }
            System.out.println();
        }

//                1  
//             2  1
//          3  2  1
//       4  3  2  1
//    5  4  3  2  1
// 6  5  4  3  2  1 

    }
}
