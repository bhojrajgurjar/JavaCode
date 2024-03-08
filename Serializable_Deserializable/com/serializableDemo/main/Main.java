package com.serializableDemo.main;

import com.serializableDemo.bean.Student;
import com.serializableDemo.io.SerialDeserDemo;

public class Main{
    public static void main(String ar[]) {
        SerialDeserDemo obj = new SerialDeserDemo();

        //obj.writeData();
        obj.readData();
    }
}
