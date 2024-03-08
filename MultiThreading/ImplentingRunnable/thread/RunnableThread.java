package ImplentingRunnable.thread;

public class  RunnableThread implements Runnable {
    @Override
    public void run(){
        try {
            for(int i = 0;i<=10;i++){
                System.out.println("Runnable thread says: "+i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("Runnable thread ends here.");
    }
}
