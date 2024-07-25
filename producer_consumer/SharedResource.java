package producer_consumer;

public class SharedResource{
   boolean itemAvailable=false;
   public synchronized void addItem(){
       itemAvailable=true;
       System.out.println("item added by "+Thread.currentThread().getName());
       notifyAll();
   }
   public synchronized void consumeItem(){
        System.out.println("consumeitem method invoked : " +Thread.currentThread().getName()+ " invoking all thread which are in wait() mode");
        while(!itemAvailable){
            try{
                System.out.println("current thread  : " +Thread.currentThread().getName()+ " is waiting now");
                wait();
            }
            catch(Exception e){

            }
        }
        System.out.println("conumeitem completed ");
        itemAvailable=false;
   }

} 