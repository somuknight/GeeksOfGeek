package Concurrency;

public class RaceConditionDemo {
    public static void main(String[] args) {
        BankAccount task=new BankAccount();
        task.setBalance(100);

        Thread John=new Thread(task);
        Thread Anita=new Thread(task);

        John.setName("John");
        Anita.setName("Anita");

        John.start();
        Anita.start();
    }
}
class BankAccount implements Runnable{
    private  int balance;
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public synchronized int getBalance(){
        return balance;
    }
    @Override
    public void run() {
        makeWithdrawal(75);
        if(balance<0){
            System.out.println("money overdrawn!!!");
        }

    }

    private synchronized void makeWithdrawal(int amount){
        if(balance>=amount) {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw...");
            balance-=amount;
            System.out.println(Thread.currentThread().getName() + " has withdrawn "+ amount +" -->amount left "+getBalance());
        }else {
            System.out.println("Sorry, not enough balance for "+Thread.currentThread().getName());
        }
    }
}

