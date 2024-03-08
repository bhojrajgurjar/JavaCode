package com.copyFileDemo.main;

import java.util.Date;

import com.copyFileDemo.io.CopyFileDemo;

public class Main {
    public  static void main(String ar[]){
        CopyFileDemo obj  = new CopyFileDemo();
        Date d = new Date();
        System.out.println("File start copying at: "+d);
        obj.copyFile();
        Date d1 = new Date();
        System.out.println("File copied completely at: "+d1);
    }
}
