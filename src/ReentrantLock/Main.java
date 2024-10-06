package ReentrantLock;

import SharedResourcedl.SharedResourcedl;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        //ReentrantLock lock = new ReentrantLock();
        SharedResourcelocks resourcelock = new SharedResourcelocks();
        Thread th1 = new Thread(()->{
            resourcelock.producer();//(lock);
        });
        SharedResourcelocks resource2 = new SharedResourcelocks();
        Thread th2 = new Thread(()->{
            resource2.producer();//(lock);
        });

        th1.start();
        th2.start();
    }
}
