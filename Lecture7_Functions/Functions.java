package Java.Lecture7_Functions;

import java.util.Scanner;

public class Functions {
    //writing a function to print name.
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printMyName(name); // calling the function.




    }
}
