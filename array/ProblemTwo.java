package array;

public class ProblemTwo {
    public static void main(String[] args) {
        int[] number = new int[3];

        number[0] = 200;
        number[1] = 50;
        number[2] = 100;

        int len = number.length;
        double sum = 0, avg;
        for (int i = 0; i < len; i++) {
            sum += number[i];
        }
        avg = sum / len;
        System.out.println(avg);


        int max = number[0];

        for (int i = 1; i < len; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println(max);

    }
}
