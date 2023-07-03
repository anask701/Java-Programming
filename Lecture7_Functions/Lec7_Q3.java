package Java.Lecture7_Functions;

import java.util.Scanner;

public class Lec7_Q3 {

    public static void tableOfN(int n) {
        for(int i=1; i<=10; i++){
            System.out.println(n + " X " + i + " = " + i*n);
        }
        return;

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print the table : ");
        int n = sc.nextInt();
        tableOfN(n);

        
    }
}
