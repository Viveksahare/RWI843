public class MyRunnable implements Runnable{
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println(Thread.currentThread().getName() + " is a daemon thread.");
        } else {
            System.out.println(Thread.currentThread().getName() + " is a user thread.");
        }
    }
}
