package array;
import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> names = new ArrayList<>();

        numbers.add(32);
        numbers.add(52);
        numbers.add(44);
        numbers.add(45);
        numbers.add(20);

        System.out.println(numbers);
        numbers.remove(2);
        for (int x : numbers) {
            System.out.println(x);
        }


        names.add("Jamal");
        names.add("Kamal");
        names.add("Hashem");
        names.add("Babu");

        for (String y : names) {
            System.out.println(y);
        }



    }
}
