package basicJava;

public class Method {
    
    public static void myMethod(String x, int y){
        System.out.println("My Name is: " + x + " and age is: " + y);
    }
    public static void myMethod(String x, String y){
        System.out.println("My Name is: " + x + y);
    }

    // recurtion

    public static int sum(int a){
        if(a > 0){
            return a + sum(a-2);
        }else{
            return 0;
        }
    }


    public static void main(String[] args) {
        myMethod("MunnaVau",20);
        myMethod("Munna", "Vau");

        // declear recursive method

        System.out.println(sum(10));

    }

}
