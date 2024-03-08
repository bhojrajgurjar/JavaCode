package ImplentingRunnable.main;

import ImplentingRunnable.thread.RunnableThread;

public class Main {
    public static void main(String ar[]){
        Thread t = new Thread(new RunnableThread());
       
        t.start();
        try{
            for(int i=0;i<=100;i+=10){
                System.out.println("Main thread says: "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main thread ends here.");

        if(t.isAlive()){
            System.out.println("Runnable thread is still alive");
        }
    }
}
