class Thread1 implements Runnable {
    public void run() {
        System.out.println("Thread1");
    }
}

public class ThreadUsingRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Thread1());
        t.start();
    }
}
