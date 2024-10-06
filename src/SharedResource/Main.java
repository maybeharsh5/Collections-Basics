package SharedResource;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResourceObj = new SharedResource();

        Thread producerThread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }
            sharedResourceObj.addItem();
        });

        Thread consumerThread = new Thread(() -> {
            sharedResourceObj.consumeItem();
        });

        producerThread.start();
        consumerThread.start();
    }
}
