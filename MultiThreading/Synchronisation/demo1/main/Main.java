package Synchronisation.demo1.main;

import Synchronisation.demo1.thread.table;

public class Main {
    public static void main(String ar[]){
        table obj = new table();
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

        t1.start();
        t2.start();
    }
}
