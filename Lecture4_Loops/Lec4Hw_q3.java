package Java.Lecture4_Loops;

import java.util.Scanner;

public class Lec4Hw_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number 1 or 0");
        int num = sc.nextInt();

        do {


            if(num == 1){
                System.out.println("Please Enter the Marks out of 100: ");
                int mark = sc.nextInt();
                if (mark >= 90){
                    System.out.println("This is Good");
                }
                else if(mark >=60){
                    System.out.println("This is also Good");
                }
                else if(mark > 0){
                    System.out.println("This is Good as well");

                } else if(num == 0){
                    break;
                }
                
                else {
                    System.out.println("Please Enter the marks in the range of 0 to 100");
                }
                
            }
            
        } while(num == 1);



        

        

        

    }
}
