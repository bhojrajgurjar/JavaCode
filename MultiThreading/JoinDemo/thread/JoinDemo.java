package JoinDemo.thread;

public class JoinDemo extends Thread {
    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        try {
            System.out.println(name + " says hi...");
            Thread.sleep(5500);
            System.out.println(name + " says hello...");
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
