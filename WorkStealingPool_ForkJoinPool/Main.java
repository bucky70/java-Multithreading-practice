package WorkStealingPool_ForkJoinPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;

public class Main {
   public static void main(String args[]) throws InterruptedException, ExecutionException{
       // ForkJoinPool pool=new ForkJoinPool();
       ForkJoinPool pool=ForkJoinPool.commonPool();
        ComputeSumTask task=new ComputeSumTask(0, 100);
        Future<Integer> result=pool.submit(task);
        System.out.println("waiting for result "+result.get());
   }
}
