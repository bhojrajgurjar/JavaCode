package com.multiThreading.main;

import com.multiThreading.thread.MyThread;

public class Main {
    public static void main(String ar[]){
        MyThread t1 = new MyThread();
        t1.start();

        try {
            for(int i=0;i<=100; i+=10){
                System.out.println("Main Thread says: "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("Main thread ends here.");
    }
}
