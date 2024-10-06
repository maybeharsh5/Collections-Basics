package SharedResourcedl;

public class SharedResourcedl {
    boolean isAvailable = false;

    public synchronized void produce(){
        System.out.println("Lock Acquired");
        isAvailable = true;
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
        System.out.println("Lock Release");
    }

}
