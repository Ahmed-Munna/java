package java01;

public class fact {
    static int facto (int i) {

        if (i == 1) {
            return i;
        } else {
            return i * facto(i - 1);
        }
         
    }

    public static void main(String[] args) {
        System.out.println(facto(1));
    }
}
