package Java.Lecture7_Functions;

import java.util.Scanner;

public class Productoftwonumbers {
        public static int product(int a, int b) {
            return a*b;
            
        }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The product of two numbers is : " + product(a, b));
        
    }
}
