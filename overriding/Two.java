package overriding;

public class Two extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("BB");
        }
    }
}
