package MonitorLock;
public class MonitorLock {

    public synchronized void task1() {
        System.out.println("Inside Task1");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
    }

        public void task2(){
            System.out.println("task2, but before synchronized");
            synchronized (this){
                System.out.println("task2,inside synchronized");
            }
        }

        public void task3(){
            System.out.println("task3");
        }

    }

