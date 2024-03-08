package singletonClass;

import java.util.Scanner;

public class ABC {
    Scanner sc = new Scanner(System.in);
    private int x;
    private static ABC obj = new ABC();
    {
        System.out.println("Value of x : "+x);
    }
     ABC(){
        System.out.println("Enter value of x: ");
        x = sc.nextInt();
    }
    public void show(){
        System.out.println("Value of x : "+x);
    }
    public static ABC getInstance(){
        return obj;
    }
}
