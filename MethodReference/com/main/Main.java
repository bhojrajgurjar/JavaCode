package com.main;

import com.functionInterface.functionInterface;
import com.pojo.Stuff;

public class Main {
    public static void main(String ar[]){
        //static method referencng to abstract method of functional Interface
        functionInterface f = Stuff::doStuff;
        f.doTask();

        //Normal method referencing through class object to abstract method of functional Interface
        Stuff obj = new Stuff();
        functionInterface f1 = obj::createStuff;
        f1.doTask();


        //constructor of class referencng to abstract method of functional Interface

        functionInterface f3 = Stuff::new;
        f3.doTask();
    }
}
