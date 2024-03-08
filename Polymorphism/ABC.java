//package com.methodOveriding;

class ABC{
    public  void show(){
        System.out.println("ABC's show() called..");
    }

}

class PQR extends ABC{
    @Override
    public  void show(){
        System.out.println("PQR's show() called... ");

    }
    public void get(){
        System.out.println("PQR's get() method called..");
    }
}

class Demo{
    public static void main(String ar[]){
        ABC obj = new PQR();
        obj.show();
        //obj.get();

    }
}