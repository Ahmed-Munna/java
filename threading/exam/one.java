// package threading.exam;

// class One extends Thread {
//     public void run() {
//         for (int i = 0 ; i < 10; i++) {
//             System.out.println(i);
//             try {
//                 sleep(1000);
//             } catch(InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

//  class Two extends Thread{
//     public void run() {
//         for (int i = 10; i < 20; i++) {
//             System.out.println(i);
//             try{
//                 sleep(1500);
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }
// class MainClass {
//     public static void main(String[] args) {
//         One obj1 = new One();
//         Two obj2 = new Two();

//         obj1.start();
//         obj2.start();
//     }
// }
