package array.exam;

import java.util.Scanner;

public class index {
    public static void main(String[] args) { 
        int[] myArray = {2,3,3,2,4,56,6,78,8,9,0};

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input: ");
            int inp = input.nextInt();
            for (int i = 0; i < myArray.length; i++) {
                if (i+1 == inp) {
                    System.out.println(inp +" No Length" + " and value is: " + myArray[i]);
                } 
            }
        }
    } 
}
