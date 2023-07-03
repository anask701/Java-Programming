package Java.Lecture5_Patterns;

import java.util.Scanner;

public class Halfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        // Half Pyramid
        // //outer loop
        // for(int i = 1; i <= n; i++){
            
        //     // inner loop
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        
        // }


        // // // inverted half pyramid
        // // //outer loop
        // for(int i = n; i >= 1; i--){
            
        //     // inner loop
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        
        // }

        // // Inverted Half Pyramid (Rotated by 180 degree)

        // // outer loop
        // for(int i=1; i<=n; i++){
        //     // inner loop -> space print
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     // inner loop -> star print
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Inverted Half Pyramid (Rotated by 180 degree) Flip

        // // outer loop
        // for(int i=n; i>=1; i--){
        //     // inner loop -> space print
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     // inner loop -> star print
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Number half Pyramid
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");

        //     }
        //     System.out.println();
        // }

        // // Inverted Half Pyramid with numbers
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // Floyd's Triangle
        //  int number = 1;
        
        // // Outer loop
        // for(int i=1; i<=n; i++){
        //     // inner loop
        //     for(int j=1; j<=i; j++){
        //         System.out.print(number + " ");
        //         number++; // number = number + 1
        //     }
        //     System.out.println();
        // }

        // 0-1 Triangle
        
        // Outer loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){ //Even
                    System.out.print("1 ");
                }
                else { // Odd
                    System.out.print("0 ");
                }
            }
            System.out.println();   
        }

    }
}
