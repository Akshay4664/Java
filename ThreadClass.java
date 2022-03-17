class Thread1 extends Thread {
    public void run() {
        System.out.println("Thread1");
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        t.start();
    }
}
