package Java.Lecture4_Loops;

import java.util.Scanner;

public class Lec4Hw_BonusQ {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not!");

        int n = sc.nextInt();
        int count = 0;

        if(n>0){
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
        }
        else{
            System.out.println("Enter a number more than 0!");
        }
    }
}
