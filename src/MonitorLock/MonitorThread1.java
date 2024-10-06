package MonitorLock;

public class MonitorThread1 implements Runnable {
    MonitorLock monitorLock;

    MonitorThread1(MonitorLock monitorLock){
        this.monitorLock = monitorLock;
    }
     public void run(){
        monitorLock.task1();
    }
}
/*
 Consumer Thread inside consumeItem method
Consumer thread is waiting
Producer calling notify
Item consumedThread-1
*/
