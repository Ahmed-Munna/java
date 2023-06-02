package array.exam;

public class element {
    public static void main(String[] args) {

        int[] myArray = {1,5,2,3,4,5,6,7,8,9,0,0,9,8,7,6,5,4,3,2,1};

        int l = myArray.length;
        int pos = 0;
        int neg = 0;
        int z = 0;

        for (int i = l-1; i >= 0; i--) {
            System.out.print(myArray[i]);

            if (myArray[i] % 2 == 0 && myArray[i] != 0) {
                pos += 1;
            } else if(myArray[i] % 2 == 1) {
                neg += 1;
            } else {
                z += 1;
            }
        }
        System.out.println("possitive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zero: " + z);

    }
}
