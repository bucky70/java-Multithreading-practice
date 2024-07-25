package producer_consumer;

public class Consumer implements Runnable{
    private SharedResource sharedResource;
    public Consumer(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
       System.out.println("inside consumer class");
       sharedResource.consumeItem();
    }
    
}
