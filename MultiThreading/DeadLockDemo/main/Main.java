package main;

import Thread.DeadlockDemo;

public class Main {
    public static void main(String ar[]){
        DeadlockDemo obj = new DeadlockDemo();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                obj.lock();
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run(){
                obj.lock2();
            }
        };

        t1.start();
        t2.start();
        
    } 
}
