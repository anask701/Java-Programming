package Java.Lecture8_Exercise;

import java.util.Scanner;

public class Lec8_Q1 {

    public static int calculateAvg(int a, int b, int c) {
        int avg = (a+b+c)/2;
        return avg;
        
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers you want the average of : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        
        System.out.println("The Average of three numbers is " + calculateAvg(a, b, c));
    
        
    }
}
