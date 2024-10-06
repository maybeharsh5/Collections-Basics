package ReentrantLock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResourcelocks {
    ReentrantLock lock = new ReentrantLock();
    boolean isavailable = false;
    public void producer(){
        try {
            lock.lock();
            System.out.println("lock acquired by: "+Thread.currentThread().getName());
            isavailable=true;
            Thread.sleep(4000);
        } catch (Exception e) {
            //
        }
        finally{
            lock.unlock();
            System.out.println("Lock released by: "+Thread.currentThread().getName());
        }
    }
}
