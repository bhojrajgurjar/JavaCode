package com.serializableDemo.bean;
//bean is class like pojo but it implements Serializable interface

import java.io.Serializable;

public class Student implements Serializable {
    private int rollNo;
    private String name;

    public Student(){};

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name=name;
    }

    public int getRollN(){
        return this.rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return rollNo +"  "+name;
    }

}