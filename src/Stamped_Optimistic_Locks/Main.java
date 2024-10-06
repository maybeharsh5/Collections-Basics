package Stamped_Optimistic_Locks;

public class Main {
    public static void main(String[] args) {
        SharedResourceStampedLock sr = new SharedResourceStampedLock();
        Thread t1 = new Thread(() -> {
            sr.produce();
        });
        Thread t2  = new Thread(()->{
            sr.consumer();
        });
        t1.start();
        t2.start();
    }
}
