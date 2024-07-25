package producer_consumer;

public class Producer implements Runnable{
    private SharedResource sharedResource;
    public Producer(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
       System.out.println("inside producer class with thread: "+Thread.currentThread().getName());
       try {
        Thread.sleep(5000l);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
       sharedResource.addItem();
    }
    
}
