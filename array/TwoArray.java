package array;

import java.util.Scanner;

public class TwoArray {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Row: ");
            int row = input.nextInt();
            System.out.print("Collumn: ");
            int col = input.nextInt();

            int[][] number = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.println(i + "Rows " + j + "Col Input: ");
                    number[i][j] = input.nextInt();
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.println(number[i][j]);
                }
            }
        }
    }
}
