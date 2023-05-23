package overriding;

public class Student extends Person {
    
    @Override
    void displayInfo(String name, String dep) {
        // TODO Auto-generated method stub
        System.out.printf(name, dep);
        System.out.println(1030);
    }
}
