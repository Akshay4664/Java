public class Threads2 implements Runnable {
    public void run() {
        System.out.println("Hello India");
    }
}

class Test1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Threads2());
        Thread t2 = new Thread(new Threads2());
        Thread t3 = new Thread(new Threads2());
        Thread t4 = new Thread(new Threads2());
        Thread t5 = new Thread(new Threads2());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}