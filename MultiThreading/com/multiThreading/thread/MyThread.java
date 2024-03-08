package com.multiThreading.thread;

public class MyThread extends Thread{
    @Override
    public void run(){
        try {
            for(int i=0;i<=10;i++){
                System.out.println("My Thread says: "+i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        System.out.println("My Thread ends here.");
    }
}