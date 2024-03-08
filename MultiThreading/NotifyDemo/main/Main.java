package main;

import thread.Account;

public class Main {
    public static void main(String ar[]){
        Account acc = new Account();

        Thread t1 = new Thread(){
            @Override
            public void run(){
                acc.withdraw(20000);
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run(){
                acc.deposit(15000);
            }
        };

        t1.setName("Ram");
        t2.setName("Shyam");

        t1.start();
        t2.start();
    }
}
