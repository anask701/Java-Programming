package Java.Lecture7_Functions;

import java.util.Scanner;

public class Lec7_Q1 {

    public static void primeOrNot(int n) {
        int count = 0;

        for(int i=1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
        System.out.print("The value of counter is : ");
        System.out.print(count);

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not : ");
        
        int n = sc.nextInt();
        primeOrNot(n);
        
        
    }
}
