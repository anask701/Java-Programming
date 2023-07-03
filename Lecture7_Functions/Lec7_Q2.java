package Java.Lecture7_Functions;

import java.util.Scanner;

public class Lec7_Q2 {

    public static void evenOrnot(int n) {
        if(n<=0){
            System.out.println("Please enter a number Greater than 0!");
            
        }
        else if(n%2 == 0){
            System.out.println("The given number is a even number!");

        }
        else{
            System.out.println("It is not an Odd number!");
        }
        return;
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check : ");
        int n = sc.nextInt();
        evenOrnot(n);
        
    }
}
