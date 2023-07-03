package Java.Lecture4_Loops;

import java.util.Scanner;

public class Lec4Hw_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if it is Prime or Not");
        int n = sc.nextInt();

        if (n%1 == 0){
            if(n%n == 0){
                System.out.println("Its a Prime Number");
            }

        }else {
            System.out.println("Not a Prime number");
        }


        






        
    }
}
