package com.demo.pojo;

public class Student{
    private int rollNo;
    private String name;
    private String address;

    public Student(){};

    public Student(int rollNo, String name, String address){
        this.rollNo=rollNo;
        this.name=name;
        this.address=address;
    }

    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public int getRollNo(){
        return this.rollNo;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }public void setAddress(String address){
        this.address=address;
    }
    public String address(){
        return this.address;
    }
    
    // @Override
    // public String toString(){
    //     return rollNo+" "+name;
    // }
    // @Override
    // public int hashCode(){
    //     int hash = 1;
    //     hash=4*hash+rollNo;
    //     return hash;
    // }
    // @Override
    // public boolean equals(Object obj){
    //     Student student = (Student) obj;   //DownCasting
    //     return (student.rollNo==this.rollNo);
    // }
}