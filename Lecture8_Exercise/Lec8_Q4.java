package Java.Lecture8_Exercise;

import java.util.Scanner;

public class Lec8_Q4 {

    public static double circumferance(double r) {
        double cir = 2.0*r*3.14;
        return cir;

        
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        double r = sc.nextDouble();

        double cir = circumferance(r);
        System.out.println("The circumferance of the circle is : " + cir);
    }
}
