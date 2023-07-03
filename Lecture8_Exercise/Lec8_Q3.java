package Java.Lecture8_Exercise;

import java.util.Scanner;

public class Lec8_Q3 {
    public static int greater(int a, int b) {
        if(a > b){
            return a;
        }
        else if(a==b){
            System.out.println("They both are equal");
            return a;
        }else{
            return b;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(greater(a, b));

    }
}
