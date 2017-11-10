package nl.bongers.concurrency.deadlock;

public class DeadLock {

    /**
     * Example code to demonstrate a deadlock. This example code will never finish
     * running because of the deadlock. The two threads are waiting on each other to release the key they
     * need in order to proceed.
     */
    public static void main(String[] args) throws InterruptedException {

        LockClass lock = new LockClass();

        Runnable runnable1 = lock::a;
        Runnable runnable2 = lock::b;

        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Thread thread2 = new Thread(runnable2);
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
