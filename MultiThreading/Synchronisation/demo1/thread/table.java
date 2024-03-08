package Synchronisation.demo1.thread;

public class table {
    public synchronized void printTable(int num){
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
