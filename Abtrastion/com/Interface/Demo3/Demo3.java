package com.Interface.Demo3;

interface Shape{
    double PI=3.14; //by default public, static, final 
    void area();    //by default public and abstract 
}
class Circle implements Shape{
    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    public void area(){
        System.out.println("Area of Circle = "+Shape.PI*radius*radius);
    }
}
public class Demo3 {
    public static void main(String ar[]){
        Circle circle = new Circle(2);
        circle.area();
    }
}
