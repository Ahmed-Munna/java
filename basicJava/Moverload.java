package basicJava;
/*this is a basic method over loading system in java
 * there has two method named fmethod but there parameter or agrument
 * are not same.
 */
public class Moverload {

    public static void fmethod(String fname) {
        
        System.out.println("First Name: " + fname);

    }
    public static void fmethod(String lname, int age){

        System.out.println("Last Name: " + lname);
        System.out.println("Age: " + age);

    }

    public static void main(String[] args) {

        fmethod("Ahmed");
        fmethod("Munna", 21);

    }
}
