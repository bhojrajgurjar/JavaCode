package com.pojo;

public class Stuff  {
    public Stuff(){
        System.out.println("Construcor referencing");
    }
    public static void doStuff(){
        System.out.println("Static method referencing");
    }
    public void createStuff(){
        System.out.println("Normal method of class referencing");
    }
}
