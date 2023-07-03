package Java.Lecture8_Exercise;

import java.util.Scanner;

public class Lec8_Q5 {
    public static void voteOrNot(int age) {
        if (age > 18){
            System.out.println("you can vote");
        } else if(age <= 0){
            System.out.println("Enter the correct age");
        } else{
            System.out.println("Sorry you are not eligible to vote");
        }
        return;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age to check if you are eligible to vote : ");
        int age = sc.nextInt();
        
        voteOrNot(age);
    }
}
