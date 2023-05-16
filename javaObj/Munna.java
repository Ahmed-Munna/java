package javaObj;

public class Munna{

    int[] someName = {2,3,5,7};

    public static void main(String[] args) {
        
        Munna myObj = new Munna();

        int a = myObj.someName.length;

        for(int i = 0; i < a; i++) {
            System.out.println(myObj.someName[i]);
        }

    }


}