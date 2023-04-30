package basicJava;

public class Constractor {
    public Constractor() {
        System.out.println("Something");
    }
    public void name() {
        System.out.println("MunnaVau");
    }

    public static void main(String[] args) {
        Constractor cons = new Constractor();
        cons.name();
    }
}