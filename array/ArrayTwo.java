package array;

import java.util.Scanner;

public class ArrayTwo {
    public static void main(String[] args) {
        // String[] names = {"Jamal", "Kamal", "Forid", "Hrittik"};

        // for (String x : names) {
        //     System.out.println(x);
        // }


        String[] weeks = {
            "Sat",
            "San",
            "Mon",
            "Thu",
            "Tha",
            "Wed",
            "Fri"
        };

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("type input from 1 to 7: ");
            int weekName = input.nextInt();

            switch (weekName) {
                case 1: System.out.println(weeks[0]); break;
                case 2: System.out.println(weeks[1]); break;
                case 3: System.out.println(weeks[2]); break;
                case 4: System.out.println(weeks[3]); break;
                case 5: System.out.println(weeks[4]); break;
                case 6: System.out.println(weeks[5]); break;
                case 7: System.out.println(weeks[6]); break;
            }
        }
    }
}
