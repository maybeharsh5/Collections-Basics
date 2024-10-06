package ReadWriteLock;

import ReentrantLock.SharedResourcelocks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        Thread t1 = new Thread(()->{
           resource.producer(lock);
        });

        Thread t2 = new Thread(()->{
           resource.producer(lock);
        });

        SharedResource s2 = new SharedResource();

        Thread t3 = new Thread(()->{
            resource.consume(lock);
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
