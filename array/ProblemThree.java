package array;

import java.util.ArrayList;
import java.util.Collections;

public class ProblemThree {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        names.add("Jamal");
        names.add("kamal");
        names.add("Atik");
        names.add("Babu");
        names.add("pk");


        numbers.add(20);
        numbers.add(10);
        numbers.add(50);
        numbers.add(30);
        numbers.add(40);

        Collections.sort(names);

        for (String n : names) {
            System.out.println(n);
        }

        Collections.sort(names, Collections.reverseOrder());

        for (String n : names) {
            System.out.println(n);
        }


        Collections.sort(numbers);
        
        for (Integer a : numbers) {
            System.out.println(a);
        }

        Collections.sort(numbers, Collections.reverseOrder());

        for (Integer a : numbers) {
            System.out.println(a);
        }


        

    }
}
