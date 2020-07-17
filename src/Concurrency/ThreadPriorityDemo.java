package Concurrency;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());     //Thread[main,5,main]   [name,priority,group]
        Thread th1=new Thread(new EmailCampaign());
        Thread th2=new Thread(new DataAggregator());

        th1.setName("EmailCampaign");
        th2.setName("DataAggregator");

        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);

        th1.start();
        th2.start();

        try {
            th2.join(100);     //current thread is suspended until the 2nd thread dies or completes its
                            //execution
                            //join() also can take parameter as integer millisecond
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("inside main...");
    }

}
class EmailCampaign implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getId()+" "+Thread.currentThread().getName());
            if(i==5){
                //hint to scheduler that thread is willing to
                //yield its current use of CPU
                Thread.currentThread().yield();
            }
        }
    }
}
class DataAggregator implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());

        }
    }
}
