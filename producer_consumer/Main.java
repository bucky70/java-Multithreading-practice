package producer_consumer;

public class Main {
    public static void main(String args[]){
        System.out.println("in main method with thread: "+Thread.currentThread().getName());
        SharedResource sharedResource=new SharedResource();
        
        Thread producerThread=new Thread(new Producer(sharedResource));
        Thread consumerThread=new Thread(new Consumer(sharedResource));

        producerThread.start();
        consumerThread.start();
    }
}

