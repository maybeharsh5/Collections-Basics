package SharedResource;
public class SharedResource {
    boolean isItem = false;

    public synchronized void addItem(){
        isItem = true;
        System.out.println("Producer calling notify");
        notifyAll();
        // monitor lock is released
    }

    public synchronized void consumeItem(){
        System.out.println("Consumer Thread inside consumeItem method");
        while (!isItem){
            try {
                System.out.println("Consumer thread is waiting");
                wait();
                // release monitor lock
            } catch (InterruptedException e) {
                // throw new RuntimeException(e);
            }
        }
        System.out.println("Item consumed"+ Thread.currentThread().getName());
        isItem = false;
    }
}
