package array.exam;

import java.util.Scanner;

public class twoDemo {
    public static void main(String[] args) {
         int[][] myArray = new int[4][4];
         try (Scanner input = new Scanner(System.in)) {
            System.out.println("input value: ");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    myArray[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(myArray[i][j] + " ");
                }
                System.out.println();
            }
         }
    }
}
