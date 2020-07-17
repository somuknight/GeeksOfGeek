package Concurrency;

public class MyFirstThread {
    public static void main(String[] args) {
        Task task=new Task();
        Thread th=new Thread(task); //NEW STATE
        th.start();     //RUNABLE STATE
//        th.start();   IllegalThreadStateException

        System.out.println("Inside main...");
    }
}
class Task implements Runnable{
    @Override
    public void run() {
//        try{
//            Thread.sleep(3000);
//        }
//        catch (InterruptedException e){
//            e.printStackTrace();
//        }
        System.out.println("inside run...");
        go();

    }
    private void go(){
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("inside go...");
        more();
    }
    private void more(){
        System.out.println("inside more...");
    }
}
