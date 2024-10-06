package ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable = false;
    void producer(ReadWriteLock lock){
        try {
            lock.readLock().lock();;
            System.out.println("Read Lock acquired");
            isAvailable=true;
            Thread.sleep(8000);
        } catch (InterruptedException e) {
          //  throw new RuntimeException(e);
        }
        finally {
            lock.readLock().unlock();
            System.out.println("Read Lock released");
        }

    }
    public  void consume(ReadWriteLock lock){
        lock.writeLock().lock();
        System.out.println("Write Lock acquired");
        isAvailable = false;
        System.out.println("Write Lock Released");
    }
}
