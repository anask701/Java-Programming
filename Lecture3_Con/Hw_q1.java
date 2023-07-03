import java.util.Scanner;

public class Hw_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first Number a: ");
        int a = sc.nextInt();

        System.out.println("Enter the second Number b: ");
        int b = sc.nextInt();

        System.out.println("Enter the operator number \n 1: Addition \n 2: Substraction \n 3: Multiplication \n 4: Division \n 5: Modulo or Remainder");
        int operator = sc.nextInt();

        switch(operator){
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : System.out.println(a/b);
            break;
            case 5 : System.out.println(a%b);
            break;
            default : System.out.println("Enter the correct Operator number from above list!");
        }

        

    }
}
