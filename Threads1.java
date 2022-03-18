class MyThread extends Thread {
    public void run() {
        System.out.println("Hello All");
    }
}

class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        Thread t4 = new Thread();
        Thread t5 = new Thread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}