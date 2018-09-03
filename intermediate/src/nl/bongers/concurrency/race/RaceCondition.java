package nl.bongers.concurrency.race;

public class RaceCondition {

    /**
     * Example code to demonstrate the effects of synchronized. This example code will show the
     * so called 'Race condition' if the synchronized block in {@link LongWrapper} is not present.
     * With a race condition, the result of getValue() in {@link LongWrapper} will vary each time this code runs.
     */
    public static void main(String[] args) throws InterruptedException {
        raceConditionIncrement();
        synchronizedIncrement();
    }

    private static void raceConditionIncrement() throws InterruptedException {
        final LongWrapper wrapper = new LongWrapper(0L);
        final Runnable runnable = wrapper::incrementValue;
        runThreads(runnable, wrapper);
    }

    private static void synchronizedIncrement() throws InterruptedException {
        final LongWrapper wrapper = new LongWrapper(0L);
        final Runnable runnable = wrapper::incrementValueSynchronized;
        runThreads(runnable, wrapper);
    }

    private static void runThreads(Runnable runnable, LongWrapper wrapper) throws InterruptedException {
        final Thread[] threads = new Thread[1_000];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnable);
            threads[i].start();
        }

        //Wait for the threads to be executed before printing the result
        for (Thread thread : threads) {
            thread.join();
        }

        //The result will vary each time this code runs if the 'incrementValue' method in LongWrapper is used
        //When the 'incrementValueSynchronized' method is used, which IS synchronized, the result will always be 1_000
        System.out.println("Value = " + wrapper.getValue());
    }
}
