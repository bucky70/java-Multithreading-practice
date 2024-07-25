package producer_consumer_problem;

public class Main {
    public static void main(String args[]){
        System.out.println("in main method with thread: "+Thread.currentThread().getName());
        SharedResource sharedBuffer=new SharedResource(3);
        
        Thread producerThread=new Thread(()->{
            try{
                for(int i=0;i<=6;i++){
                    sharedBuffer.produce(i);
                }
            }
            catch(Exception e){
                
            }
        });
        Thread consumerThread=new Thread(()->{
            try{
                for(int i=0;i<=6;i++){
                    sharedBuffer.consume();
                }
            }
            catch(Exception e){
                
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

