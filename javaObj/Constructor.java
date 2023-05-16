package javaObj;

public class Constructor {
    
    int a, b;

    public Constructor(int i, int j) {
        a = i;
        b = j;
    }

    public static void main(String[] args) {
        Constructor myObj = new Constructor(5, 10);

        System.out.println(myObj.b + myObj.a);
    }




}
