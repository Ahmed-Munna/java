package overriding;

import threading.One;
import threading.Two;

public class MainMathod {
    public static void main(String[] args) {
        One obj1 = new One();
        Two obj2 = new Two();

        obj1.start();
        obj2.start();
    }
}
