package com.UserDefineException.pojo;

import com.UserDefineException.Exception.AgeException;

//import com.UserDefineException.Exception.*;

public class Voter {
    private String name;
    private int age;

    public Voter(){}

    public Voter(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name=name;
    } 
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public void checkAge() throws AgeException{
        if(age<18){
            throw  new AgeException(name+" is not eligible for voting as age must be 18 or greater than 18");
        }
        else{
            System.out.println(name+" is eligible for voting.");
        }
    }
}
