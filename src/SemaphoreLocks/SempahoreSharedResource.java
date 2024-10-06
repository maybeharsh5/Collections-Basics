package SemaphoreLocks;

import java.util.concurrent.Semaphore;

public class SempahoreSharedResource {
     private boolean isAvailble = false;
    Semaphore lock = new Semaphore(2);
    // 2 Thread Goes!!

    public void produce(){
        try{
            lock.acquire();
            System.out.println(Thread.currentThread());
            isAvailble = true;
            Thread.sleep(7000);
        } catch (Exception e){
            System.out.println("yo");
        }
        finally {
            lock.release();
            System.out.println("lock released by: "+ Thread.currentThread());
        }
    }
}
