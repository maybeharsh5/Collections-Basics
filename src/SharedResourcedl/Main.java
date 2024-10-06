package SharedResourcedl;

public class Main {
    public static void main(String[] args) {
        SharedResourcedl resource = new SharedResourcedl();
        System.out.println("Main Thread Started");
        Thread t1 = new Thread(()->{
            System.out.println("Thread 1 calling produce method");
            resource.produce();
        });
        Thread th2 = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }
            System.out.println("Thread 2 calling produce method");
            resource.produce();
        }); 
        t1.start();
        try {
            System.out.println("will wait for thread 1 to finish");
            t1.join();
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
        th2.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
        System.out.println("Thread is suspended");
        t1.suspend();
        System.out.println("Main Thread is finished");
    }
}
