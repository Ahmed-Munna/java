package array;

public class arrayOne {
    public static void main(String[] args) {
        int[] number = new int[3];

        number[0] = 5;
        number[1] = 10;
        number[2] = 50;

        int len = number.length;
        int sum = 0;
        
        for (int i = 0; i < len; i++) {
            
            sum += number[i];
            
        }
        System.out.println(sum);
    }
}
