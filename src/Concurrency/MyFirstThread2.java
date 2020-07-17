package Concurrency;

import java.util.concurrent.TimeUnit;

public class MyFirstThread2 extends Thread{
    public void run(){
        System.out.println("inside run...");
        go();
    }
    private void go(){
        System.out.println("inside go...");
        more();
    }
    private void more(){
        System.out.println("inside more...");
    }

    public static void main(String[] args) {
        Thread th=new MyFirstThread2();
        th.start();
        try{
//            Thread.sleep(3000);
            TimeUnit.SECONDS.sleep(10);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("inside main...");
    }
}
