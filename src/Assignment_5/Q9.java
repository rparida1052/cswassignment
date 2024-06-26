9. Create a program that divides two numbers input by the user. Handle the possibility of 
division by zero using try-catch block to catch ArithmeticException.

//code
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the dividend: ");
            int a = sc.nextInt();

            System.out.println("Enter the divisor: ");
            int b = sc.nextInt();
            int result=a/b;
            System.out.println("Result of division : "+result);
        }
        catch(ArithmeticException e) {
            System.err.println("ArithmeticException occurred : "+e.getMessage());
        }
    }
}



/**
 * OUTPUT
 * Enter the dividend:
 * 56
 * Enter the divisor:
 * 2
 * Result of division : 28.0

    Enter the dividend: 
    2
    Enter the divisor: 
    0
    ArithmeticException occurred : / by zero
 */
