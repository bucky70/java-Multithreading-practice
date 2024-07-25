package producer_consumer_problem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int size;
    public SharedResource(int size){
       sharedBuffer=new LinkedList<>();
       this.size=size;
    }
    public synchronized void produce(int item) throws Exception{
        while(sharedBuffer.size()==size){
            System.out.println("buffer is full, producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("produced: "+item);
        notify();
    }
    public synchronized int consume() throws Exception{
        while(sharedBuffer.size()==0){
            System.out.println("waiting for producer to produce");
            wait();
        }
        int item=sharedBuffer.poll();
        System.out.println("consumed item: "+item);
        notify();
        return item;
    }
}
