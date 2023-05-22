package exception;

import java.util.Scanner;

public class Exception {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            //Scanner input = new Scanner(System.in);
            System.out.println("Please inter number one: ");
            int num1 = input.nextInt();
            System.out.println("Please inter number two: ");
            int num2 = input.nextInt();
            if (num2 <= 4) throw new  ArithmeticException("under four");
            int result = num1 / num2 ;
            
            System.out.println("Result: (" + num1 + " / " + num2 + ") = " + result);
            
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
    
}
