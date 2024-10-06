package SemaphoreLocks;


public class Semaphore {
    public static void main(String[] args) {
        SempahoreSharedResource sr = new SempahoreSharedResource();
        Thread t1 = new Thread(() -> {
            sr.produce();
        });
        Thread t2  = new Thread(()->{
            sr.produce();
        });
        Thread t3  = new Thread(()->{
            sr.produce();
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
