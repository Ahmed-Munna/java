package input;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("input Name: ");
            String numberOne = input.nextLine();

            System.out.println("input Secend Number: ");
            int numberTwo = input.nextInt();

            System.out.println(numberOne + numberTwo);
        }
    }
}
