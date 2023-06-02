package threading;

public class One extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
public class Two extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class MainMathod {
    public static void main(String[] args) {
        One obj1 = new One();
        Two obj2 = new Two();

        obj1.start();
        obj2.start();
    }
}

