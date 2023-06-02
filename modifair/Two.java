package modifair;

public class Two {
    public static void main(String[] args) {
        Student infoStudent = new Student();

        System.out.println(infoStudent.name);
        System.out.println(infoStudent.age);
        System.out.println(infoStudent.passingYear);
        infoStudent.study();
    }

    public void start() {
    }
}
