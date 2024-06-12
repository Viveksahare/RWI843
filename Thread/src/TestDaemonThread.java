public class TestDaemonThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread-1");
        Thread t2 = new Thread(new MyRunnable(), "Thread-2");

        // Set t2 as a daemon thread
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
