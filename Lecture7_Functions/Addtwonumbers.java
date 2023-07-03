package Java.Lecture7_Functions;

import java.util.Scanner;

public class Addtwonumbers {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("The sum of two numbers is : " + sum);

        
        
    }
}
