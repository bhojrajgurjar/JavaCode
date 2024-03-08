package com.demo.main;

import com.demo.pojo.*;

public class Main {
    public static void main(String ar[]){
        Student s1 = new Student( 1,"Ram","Indore");
        Student s2 = new Student( 1,"Ram","Indore");

        if(s1.equals(s2)){
            System.out.println("Same entry");
        }
        else{
            System.out.println("Not same");
        }
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
