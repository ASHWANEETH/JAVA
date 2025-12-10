void main() {
    //------------------------------------------------------------------------
    // THREADS IN JAVA
    //------------------------------------------------------------------------

    /*
    Threads allow Java programs to perform multiple tasks simultaneously.
    They are lightweight processes managed by the JVM.

    Two main ways to create threads:
    1. Extending Thread class
    2. Implementing Runnable interface (recommended)
    */


    //------------------------------------------------------------------------
    // 1. CREATING THREAD BY EXTENDING THREAD CLASS
    //------------------------------------------------------------------------
    class MyThread extends Thread {
        @Override
        public void run() { // code executed in separate thread
            System.out.println("Thread is running (extends Thread)");
        }
    }

    // USAGE
    MyThread t1 = new MyThread();
    t1.start(); // start() → calls run() in new thread


    //------------------------------------------------------------------------
    // 2. CREATING THREAD BY IMPLEMENTING RUNNABLE (BEST PRACTICE)
    //------------------------------------------------------------------------
    class MyTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread is running (implements Runnable)");
        }
    }

    // USAGE
    Thread t2 = new Thread(new MyTask());
    t2.start();


    //------------------------------------------------------------------------
    // 3. USING LAMBDA WITH RUNNABLE (CLEANER)
    //------------------------------------------------------------------------
    Thread t3 = new Thread(() -> {
        System.out.println("Thread running using Lambda");
    });
    t3.start();


    //------------------------------------------------------------------------
    // THREAD STATES (LIFECYCLE)
    //------------------------------------------------------------------------
    /*
    NEW → created but not started
    RUNNABLE → start() called, ready to run
    RUNNING → executing run() method
    BLOCKED → waiting for monitor/lock
    WAITING → waiting indefinitely until notified
    TIMED_WAITING → waiting for specific time (sleep)
    TERMINATED → thread finished
    */

    //------------------------------------------------------------------------
    // IMPORTANT THREAD METHODS
    //------------------------------------------------------------------------
    /*
    sleep(ms) → pauses thread
    join() → waits for another thread to finish
    yield() → gives CPU to other threads
    interrupt() → signals thread to stop
    isAlive() → checks if running
    */

    // Example
    Thread t4 = new Thread(() -> {
        try {
            Thread.sleep(1000); // pause for 1s
            System.out.println("Woke up!");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    });
    t4.start();

    //------------------------------------------------------------------------
    // SYNCHRONIZATION (AVOIDING DATA RACES)
    //------------------------------------------------------------------------
    class Counter {
        private int count = 0;

        // synchronized → allows only one thread at a time
        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    Counter c = new Counter();

    Thread t5 = new Thread(c::increment);
    Thread t6 = new Thread(c::increment);

    t5.start();
    t6.start();


    // Both increment safely due to synchronization