package MonitorLock;

public class SharedResource {
    boolean isAvailable=true;
    public synchronized void produce(){
       System.out.println("inside produce methoid with thread: "+Thread.currentThread().getName());
       try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
       isAvailable=false;
       System.out.println("completed produce method with thread"+Thread.currentThread().getName());
    }
    public synchronized void consume(){
        System.out.println("inside consume methoid with thread: "+Thread.currentThread().getName());
        try {
         Thread.sleep(5000);
     } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
     }
        isAvailable=false;
        System.out.println("completed consume method with thread"+Thread.currentThread().getName());
     }
    

}
