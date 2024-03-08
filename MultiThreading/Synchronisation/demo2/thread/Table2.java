package Synchronisation.demo2.thread;

public class Table2 {
    public void printTable(int num){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+" is inside printTable()");
        synchronized(this){
            try {
                for(int i =1;i<=10;i++){
                    System.out.println(num+"*"+i+"="+(num*i));
                    Thread.sleep(1500);
                }
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }    
}

