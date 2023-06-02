package threading.exam;

class Table {
    synchronized static void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try{
                Thread.sleep(1500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class One extends Thread{
    @Override
    public void run() {
        Table.printTable(5);
    }
}
class Two extends Thread{
    @Override
    public void run() {
        Table.printTable(100);
    }
}

public class myMainClass {
    public static void main(String[] args) {
        One obj1 = new One();
        Two obj2 = new Two();

        obj1.start();
        obj2.start();
    }
}
