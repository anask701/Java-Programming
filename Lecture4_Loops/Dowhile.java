package Java.Lecture4_Loops;
import java.util.*;
import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {


        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i = i + 1;

        // } while(i < 11);


        // the difference between while and do while loops
        // -> do while prints atleast once even if the condition is not true
        // -> for and while loops will print only if the condition is true.

        // int i = 0;
        // while(i < 11){
        //     System.out.println(i);
        //     i = i + 1;
        // }

        // int i = 11;

        // do{
        //     System.out.println(i);
        
        // } while (i < 11);


        // print the sum of first n natural numbers


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for(int i=0; i<=n; i++){
            sum = sum + i;
            
        }
        System.out.println(sum);





    }
}
