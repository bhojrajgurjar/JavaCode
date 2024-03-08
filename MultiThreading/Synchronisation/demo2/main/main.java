package Synchronisation.demo2.main;

import Synchronisation.demo2.thread.Table2;

public class main {
    public static void main(String ar[]){
        Table2 obj = new Table2();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                obj.printTable(13);
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                obj.printTable(19);
            }
        };

        t1.setName("RamChandra");
        t2.setName("Lakshman");
        
        t1.start();
        t2.start();
    }
}

