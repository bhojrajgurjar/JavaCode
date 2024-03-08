package thread;

public class Account{
    private int balance = 8000;

    public synchronized void withdraw(int amount){
        String name = Thread.currentThread().getName();
        System.out.println(name+" is going to withdraw \n Checking for sufficient balance..");

        try {
            Thread.sleep(4500);
            if(balance<amount){
                System.out.println(name+"  Insufficient balance\n "+name+" is waiting for Deposit..");
                wait();
            }
            System.out.println(name+ " Updating balance.. ");
            Thread.sleep(2500);
            balance = balance-amount;
            System.out.println(name+ "\s Withdrawal succesfully completed");
        } catch (InterruptedException e) {
            // TODO: handle 
            e.printStackTrace();
        }
    }

    public synchronized void deposit(int amount){
        String name = Thread.currentThread().getName();
        System.out.println(name+" Going to deposit..");
        System.out.println(name+" Updating the balance..");

        try {
            Thread.sleep(4000);
            balance = balance+amount;
            System.out.println(name+" Balance updated....");
            System.out.println(name+" Deposit sucessful completed");
            notifyAll();
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}