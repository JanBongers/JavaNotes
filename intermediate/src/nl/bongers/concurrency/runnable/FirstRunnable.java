package nl.bongers.concurrency.runnable;

public class FirstRunnable {

    /**
     * Example code to demonstrate how to create and run a runnable in a thread.
     * Notice the difference between {@link Thread} start() and {@link Thread} run() method
     */
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Task running in thread " + Thread.currentThread().getName());

        Thread thread = new Thread(runnable);
        thread.setName("Marvelous Thread");

        //Runs in the thread as specified with Runnable
        thread.start();

        //Runs in the main thread
        thread.run();
    }
}
