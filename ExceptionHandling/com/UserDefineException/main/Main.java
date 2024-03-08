package com.UserDefineException.main;

import com.UserDefineException.Exception.AgeException;
import com.UserDefineException.pojo.Voter;

public class Main {
    public static void main(String ar[]) {
        Voter v1 = new Voter("Bhojraj",18);
        Voter v2 = new Voter("Rituraj",17);

        try{
            v1.checkAge();
            v2.checkAge();
        }catch(AgeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("hello");

    }
}
