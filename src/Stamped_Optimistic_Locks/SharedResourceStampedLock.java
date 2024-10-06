package Stamped_Optimistic_Locks;

import java.util.concurrent.locks.StampedLock;

public class SharedResourceStampedLock {
    int a = 10;
    StampedLock lock = new StampedLock();
    public void produce() {
        long stamp = lock.tryOptimisticRead();
        System.out.println("Taken optimistic Lock");
        a = 11;
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
        if (lock.validate(stamp)) {
            System.out.println("Updated a value successfully");
        } else {
            System.out.println("rollback");
            a = 10;
        }
    }

        public void consumer(){
            long stamp = lock.writeLock();
            System.out.println(Thread.currentThread());
            System.out.println("Doing work");
            a=9;
            lock.unlockWrite(stamp);
            System.out.println(Thread.currentThread());
            // it will change the state

        }
    }
