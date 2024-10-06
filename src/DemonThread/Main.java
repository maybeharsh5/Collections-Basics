package DemonThread;
public class Main {
    public static void main(String[] args) {
        SharedResourceDemon resource = new SharedResourceDemon();
        System.out.println("Main Thread Started");
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 calling produce method");
            resource.produce();
        });
         t1.setDaemon(true);
        t1.start();
        System.out.println("Main Thread is finishing it's work");
    }
}
