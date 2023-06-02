package array.exam;

public class calculate {
    public static void main(String[] args) {
        int[] myArray = {3,3,6,7,8,500,7,2,4,};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        float avg = sum/myArray.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
