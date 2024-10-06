package MonitorLock;

public class Main {
    public static void main(String[] args) {
        MonitorLock obj = new MonitorLock();
        MonitorThread1 runnableobjyo = new MonitorThread1(obj);
        Thread t1 = new Thread(runnableobjyo);
        Thread t2 = new Thread(() -> {
            obj.task2();
        });
        Thread t3 = new Thread(() -> {
            obj.task3();
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
