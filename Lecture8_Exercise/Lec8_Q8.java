package Java.Lecture8_Exercise;

import java.util.Scanner;

public class Lec8_Q8 {

    public static double powerFunc(Double x, Double n) {
        
        double power = Math.pow(x, n);
        return power;

        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number : ");
        double x = sc.nextDouble();
        double n = sc.nextDouble();

        
        System.out.println("The result is : " + powerFunc(x,n));

        
    }
}
