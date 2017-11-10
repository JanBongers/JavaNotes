package nl.bongers.concurrency.deadlock;

class LockClass {

    private final Object key1 = new Object();
    private final Object key2 = new Object();

    void a() {
        synchronized (key1) {
            System.out.println(Thread.currentThread().getName() + " is in method a()");
            //Calling method b() will produce a deadlock if method b() is called by another thread at the same time
            b();
        }
    }

    void b() {
        synchronized (key2) {
            System.out.println(Thread.currentThread().getName() + " is in method b()");
            c();
        }
    }

    void c() {
        //Key1 can be hold by another thread that has called a() while this thread has called b(). Both threads will be
        //waiting on each other to release the key they need, and thus create a deadlock.
        synchronized (key1) {
            System.out.println(Thread.currentThread().getName() + " is in method c()");
        }
    }
}
