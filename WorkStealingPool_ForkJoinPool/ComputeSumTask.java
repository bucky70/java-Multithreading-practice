package WorkStealingPool_ForkJoinPool;

import java.util.concurrent.RecursiveTask;

public class ComputeSumTask extends RecursiveTask<Integer>{
    private int start;
    private int end;
    public ComputeSumTask(int start,int end){
        this.start=start;
        this.end=end;
    }
    @Override
    protected Integer compute(){
        int sum=0;
        if(end-start<=4){
            for(int i=start;i<=end;i++){
              sum+=i;
            }
            return sum;
        }
        else{
            int mid=(start+end)/2;
            RecursiveTask<Integer> left=new ComputeSumTask(start,mid);
            RecursiveTask<Integer> right=new ComputeSumTask(mid+1,end);
            left.fork(); //understand this again
            right.fork(); 

            int leftResult=left.join(); //understand this again
            int rightResult=right.join();
            return leftResult+rightResult;
        }
        
    }
}
