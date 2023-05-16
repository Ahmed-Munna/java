package javaObj;

public class Method {
    
    static void fname()  {
        System.out.println("Munna");
    }
    public void lname() {
        System.out.println("Vau");
    }

    public static void main(String[] args) {
        
        Method myMet = new Method();

        fname();
        myMet.lname();

    }



}
