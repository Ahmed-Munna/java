package exception;

import java.util.Scanner;

public class Uexcept {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("input1: ");
            int value1 = input.nextInt();
            System.out.println("input2: ");
            int value2 = input.nextInt();
            if (value1 == 0 || value2 == 0) throw new ArithmeticException("Divided by zero");
            float result = value1 / value2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("e");
        }
    }
}
