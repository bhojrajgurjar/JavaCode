package Thread;

public class DeadlockDemo{
    private String name1="Ram";
    private String name2="Shyam";

    public void lock(){
        System.out.println("T1 going to acquire lock on "+name1);
        synchronized (name1){
            System.out.println("T1 acquire lock on "+name1);
            System.out.println("Now T1 wants to acquire lock on "+name2);

            synchronized(name2){
                System.out.println("T1 acquire on "+name2);
            }
        }
    }

    public void lock2(){
        System.out.println("T2 going to acquire lock on "+name2);
        synchronized (name2){
            System.out.println("T2 acquire lock on "+name2);
            System.out.println("Now T2 wants to acquire lock on "+name1);

            synchronized(name1){
                System.out.println("T2 acquire on "+name1);
            }
        }
    }
}