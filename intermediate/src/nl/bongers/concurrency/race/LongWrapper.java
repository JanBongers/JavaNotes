package nl.bongers.concurrency.race;

class LongWrapper {

    //Hiding the synchronized key for good measure
    private final Object key = new Object();
    private long value;

    LongWrapper(long value) {
        this.value = value;
    }

    long getValue() {
        return value;
    }

    void incrementValue() {
        //Only executes the code inside the synchronized block if no other thread holds the key
        synchronized (key) {
            value = value + 1;
        }
    }
}