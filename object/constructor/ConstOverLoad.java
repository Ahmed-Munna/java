package object.constructor;

public class ConstOverLoad {
    ConstOverLoad (String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    ConstOverLoad (int id, String dep) {
        System.out.println(dep);
        System.out.println(id);
    }
}
