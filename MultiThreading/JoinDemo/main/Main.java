package JoinDemo.main;

import JoinDemo.thread.JoinDemo;

public class Main {
    public static void main(String ar[]){
        JoinDemo t1 = new JoinDemo();
        JoinDemo t2 = new JoinDemo();

        t1.setName("RamChandra");
        t2.setName("lakshman");

        try {
            t1.start();
            t1.join();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        t2.start();
    }
}
