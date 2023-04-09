package basicJava;

public class Product2 {
    
    public static void main(String[] args) {
        String hello = "Hello Java..! and ";
        String name = "Hello Munna Vau";
        int a = 5, b = 3, multi;
        float d = 4.3f;
        multi = a * b;
        System.out.println(hello + name + ", How are you?");
        System.out.println((float) multi * 4);
        System.out.println((float) d);
        System.out.println(name.indexOf("Vau"));

        String re = (a>b) ? "True" : "False";
        System.out.println(re);
    }

}
